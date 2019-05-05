/*
 * generated by Xtext 2.14.0
 */
package org.atlanmod.cypriot.validation

import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.InstanceThing
import org.atlanmod.cypriot.cyprIoT.Network
import org.eclipse.xtext.validation.Check
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.Thing
import org.atlanmod.cypriot.cyprIoT.PubSub

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CypriotValidator extends AbstractCypriotValidator {
	
	public static val INSTANCETHING_UNIQUENESS= "InstanceThing-Uniqueness"
	public static val NETWORK_UNIQUENESS= "Network-Uniqueness"
	public static val THING_UNIQUENESS= "Thing-Uniqueness"
	public static val PUBSUB_UNIQUENESS= "PubSub-Uniqueness"
	public static val PTP_UNIQUENESS= "PTP-Uniqueness"
	
	@Check(FAST)
	def checkInstanceThingUniqueness(InstanceThing instanceThing) {
		val network = instanceThing.eContainer as Network		
		val allinstanceThings = network.instantiate.filter(k | k instanceof InstanceThing && (k as InstanceThing).name == instanceThing.name)
		
		if (allinstanceThings.size() > 1) {
			val msg = "The instance '" + instanceThing.getName() + "' is already declared.";
			error(msg, network, CyprIoTPackage.eINSTANCE.network_Instantiate, network.instantiate.indexOf(instanceThing),
				INSTANCETHING_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkNetworkUniqueness(Network network) {
		val cypriotModel = network.eContainer as CyprIoTModel		
		val allNetworks = cypriotModel.specifyNetworks.filter(k | k.name == network.name)
		
		if (allNetworks.size() > 1) {
			val msg = "The network '" + network.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_SpecifyNetworks, cypriotModel.specifyNetworks.indexOf(network),
				NETWORK_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkThingUniqueness(Thing thing) {
		val cypriotModel = thing.eContainer as CyprIoTModel		
		val allThings = cypriotModel.declareThings.filter(k | k.name == thing.name)
		
		if (allThings.size() > 1) {
			val msg = "The thing '" + thing.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_DeclareThings, cypriotModel.declareThings.indexOf(thing),
				THING_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkPubSubUniqueness(PubSub pubsub) {
		val cypriotModel = pubsub.eContainer as CyprIoTModel		
		val allPubSubs = cypriotModel.declareChannels.filter(k | k instanceof PubSub && (k as PubSub).name == pubsub.name)
		
		if (allPubSubs.size() > 1) {
			val msg = "The channel PubSub '" + pubsub.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_DeclareChannels, cypriotModel.declareChannels.indexOf(pubsub),
				PUBSUB_UNIQUENESS)
		}
	}

}
