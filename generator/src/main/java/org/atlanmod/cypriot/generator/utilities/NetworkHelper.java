package org.atlanmod.cypriot.generator.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.BindAction;
import org.atlanmod.cypriot.cyprIoT.ChannelToBind;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Policy;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.Type;

public final class NetworkHelper {

	public enum TopicTypes {
		PUBTOPIC, SUBTOPIC
	}

	public enum GeneratorPlatform {
		CPOSIX, JAVA, ARDUINO, JAVASCRIPT
	}

	public enum CommunicationPlatform {
		MQTT, COAP, HTTP
	}

	private NetworkHelper() {
	}

	/**
	 * Return EObject of a given type contained by a given EObject
	 * 
	 * @param networkModel
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> allEObjectContainedIn(EObject supertype, Class<T> type) {

		EList<EObject> allChildrenTypes = supertype.eContents();
		ArrayList<T> instanceThings = new ArrayList<T>();
		for (EObject eObject : allChildrenTypes) {
			if (type.isInstance(eObject)) {
				instanceThings.add((T) eObject);
			}
		}
		return instanceThings;
	}

	/**
	 * @param thingmlModel
	 * @throws RuntimeException
	 */
	public static void saveAsThingML(ThingMLModel thingmlModel, String location) {
		try {
			ThingMLCompiler.saveAsXMI(ThingMLCompiler.flattenModel(thingmlModel), location);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Show the version of Cypriot in the console
	 */
	public static void showProjectVersioInConsole() {
		System.out.println("CyprIoT v" + getProjectVersionFromMaven());
	}

	/**
	 * Get the project version as defined in maven pom.xml
	 * 
	 * @return
	 */
	public static String getProjectVersionFromMaven() {
		try {
			MavenXpp3Reader reader = new MavenXpp3Reader();
			Model model;
			model = reader.read(new FileReader("../pom.xml"));
			return model.getVersion();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Append EObject names separated by a given separator ("," or ";"..etc)
	 * 
	 * @param list
	 * @param separator
	 * @return
	 */
	public static String appendStrings(EList<? extends EObject> list, String separator) {
		String currentSeparator = "";
		StringBuilder builder = new StringBuilder();
		for (EObject eObject : list) {
			builder.append(currentSeparator);
			if (eObject instanceof NamedElement) {
				String name = ((NamedElement) eObject).getName();
				builder.append(name);

			}
			currentSeparator = separator;
		}
		return builder.toString();
	}

	/**
	 * Get the ID name of any EObject
	 * 
	 * @param instance
	 * @return The ID name
	 */
	public static String getIdNameOfEobject(EObject eObject) {
		String name = null;
		if (eObject instanceof NamedElement) {
			name = ((NamedElement) eObject).getName();
		}
		return name;
	}

	/**
	 * Check whether there is only one Thing type
	 * 
	 * @param thingmlModel
	 * @return True if there is only one Thing type, False if not.
	 */
	public static boolean isThingOne(ThingMLModel thingModel) {
		List<Thing> things = new ArrayList<Thing>();
		List<Type> alltypes = thingModel.getTypes();
		for (Type type : alltypes) {
			if (type instanceof Thing) {
				things.add((Thing) type);
			}
		}
		return things.size() == 1;
	}

	/**
	 * Check whether there is only one external connector in the imported ThingML
	 * file
	 * 
	 * @param thingmlModel
	 * @return True if there is only one connector, False if not.
	 */
	public static boolean isConnectorOne(Configuration configuration) {
		int connnectorsCount = configuration.getConnectors().size();
		return connnectorsCount == 1;
	}

	/**
	 * Check whether there is only one configuration in the imported ThingML file
	 * 
	 * @param thingmlModel
	 * @return True if there is only one configuration, False if not.
	 */
	public static boolean isConfigOne(ThingMLModel thingmlModel) {
		int configCount = thingmlModel.getConfigs().size();
		return configCount == 1;
	}

	/**
	 * Get the assigned roles to the thing corresponding to the instanceThing
	 * 
	 * @param instance
	 * @return The roles assigned to the instanceThing
	 */
	public static EList<Role> getAssignedRolesToThing(InstanceThing instance) {
		return instance.getTypeThing().getThingToInstantiate().getAssignedRoles();
	}

	/**
	 * @param bindPubSubs
	 * @return
	 */
	public static List<Topic> getAllTopicsOfType(List<Bind> bindPubSubs, BindAction bindAction) {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		for (Bind bind : bindPubSubs) {
			if (bind.getBindAction() == bindAction) {
				EList<Topic> allTopics = ((ToBindPubSub) bind.getChannelToBind()).getTopics();
				for (Topic topic : allTopics) {
					topics.add(topic);
				}
			}
		}

		return topics;
	}

	/**
	 * Find the PubSub binds using ThingInstance as subject
	 * 
	 * @param instanceThing
	 * @param network
	 * @return
	 */
	public static List<Bind> pubSubBindsContainingThingInstances(InstanceThing instanceThing, Network network) {
		ArrayList<Bind> binds = new ArrayList<Bind>();
		for (Bind bind : network.getHasBinds()) {
			ChannelToBind channelToBind = bind.getChannelToBind();
			if (isChannelToBindPubSub(channelToBind) && isInstanceThingInBind(instanceThing, bind)) {
				binds.add(bind);
			}
		}
		return binds;
	}

	/**
	 * @param channelToBind
	 * @return
	 */
	public static boolean isChannelToBindPubSub(ChannelToBind channelToBind) {
		return channelToBind instanceof ToBindPubSub;
	}

	/**
	 * @param instanceThing
	 * @param bind
	 * @return
	 */
	public static boolean isInstanceThingInBind(InstanceThing instanceThing, Bind bind) {
		return bind.getBindsInstanceThing().equals(instanceThing);
	}

	/**
	 * @param network
	 */
	public static List<InstanceThing> getAllInstanceThingBehaviorInNetwork(Network network) {
		List<InstanceThing> allModelsInNetwork = new ArrayList<InstanceThing>();
		for (InstanceThing instanceThing : allEObjectContainedIn(network, InstanceThing.class)) {
			allModelsInNetwork.add(instanceThing);
		}
		return allModelsInNetwork;
	}

	/**
	 * @param networkModel
	 * @return
	 */
	public static EList<Network> getAllNetworksInModel(CyprIoTModel networkModel) {
		return networkModel.getSpecifyNetworks();
	}

	/**
	 * @param networkModel
	 * @return
	 */
	public static boolean isPolicyEnforced(Network network) {
		return network.getHasPolicyEnforcement() != null;
	}

	public static EList<Policy> getEnforcedPolicies(Network network) {
		EList<Policy> policies = null;
		if (NetworkHelper.isPolicyEnforced(network)) {
			policies = network.getHasPolicyEnforcement().getPolicyName();
		}
		return policies;
	}

	/**
	 * @param thingModel
	 * @return
	 */
	public static EList<State> getAllStateInThingMLModel(ThingMLModel thingModel) {
		Thing thing = (Thing) thingModel.getTypes().get(0);
		CompositeState statechart = (CompositeState) thing.getBehaviour();
		EList<State> allStates = statechart.getSubstate();
		return allStates;
	}

}