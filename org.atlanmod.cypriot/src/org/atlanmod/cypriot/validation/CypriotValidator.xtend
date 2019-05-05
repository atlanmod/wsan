package org.atlanmod.cypriot.validation

import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.InstanceThing
import org.atlanmod.cypriot.cyprIoT.Network
import org.eclipse.xtext.validation.Check
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.Thing
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.PointToPoint
import org.atlanmod.cypriot.cyprIoT.Role
import org.atlanmod.cypriot.cyprIoT.Policy
import org.atlanmod.cypriot.cyprIoT.InstancePubSub
import org.atlanmod.cypriot.cyprIoT.InstancePTP
import org.atlanmod.cypriot.cyprIoT.User
import org.atlanmod.cypriot.cyprIoT.Topic
import org.atlanmod.cypriot.cyprIoT.ConnectionPoint

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CypriotValidator extends AbstractCypriotValidator {
	
	
	public static val ROLE_UNIQUENESS= "Role-Uniqueness"
	public static val USER_UNIQUENESS= "User-Uniqueness"
	public static val INSTANCETHING_UNIQUENESS= "InstanceThing-Uniqueness"
	public static val INSTANCEPUBSUB_UNIQUENESS= "InstancePubSub-Uniqueness"
	public static val INSTANCEPTP_UNIQUENESS= "InstancePTP-Uniqueness"
	public static val NETWORK_UNIQUENESS= "Network-Uniqueness"
	public static val THING_UNIQUENESS= "Thing-Uniqueness"
	public static val PUBSUB_UNIQUENESS= "PubSub-Uniqueness"
	public static val PTP_UNIQUENESS= "PTP-Uniqueness"
	public static val POLICY_UNIQUENESS= "Policy-Uniqueness"
	public static val TOPIC_UNIQUENESS= "Topic-Uniqueness"
	public static val CONNECTIONPOINT_UNIQUENESS= "ConnectionPoint-Uniqueness"
	
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
	def checkInstancePubSubUniqueness(InstancePubSub instancePubSub) {
		val network = instancePubSub.eContainer as Network		
		val allinstancePubSub = network.instantiate.filter(k | k instanceof InstancePubSub && (k as InstancePubSub).name == instancePubSub.name)
		
		if (allinstancePubSub.size() > 1) {
			val msg = "The instance '" + instancePubSub.getName() + "' is already declared.";
			error(msg, network, CyprIoTPackage.eINSTANCE.network_Instantiate, network.instantiate.indexOf(instancePubSub),
				INSTANCEPUBSUB_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkInstancePTPUniqueness(InstancePTP instancePTP) {
		val network = instancePTP.eContainer as Network		
		val allinstancePTP = network.instantiate.filter(k | k instanceof InstancePTP && (k as InstancePTP).name == instancePTP.name)
		
		if (allinstancePTP.size() > 1) {
			val msg = "The instance '" + instancePTP.getName() + "' is already declared.";
			error(msg, network, CyprIoTPackage.eINSTANCE.network_Instantiate, network.instantiate.indexOf(instancePTP),
				INSTANCEPTP_UNIQUENESS)
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
	def checkRoleUniqueness(Role role) {
		val cypriotModel = role.eContainer as CyprIoTModel		
		val allroles = cypriotModel.declareRoles.filter(k | k.name == role.name)
		
		if (allroles.size() > 1) {
			val msg = "The role '" + role.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_DeclareRoles, cypriotModel.declareRoles.indexOf(role),
				ROLE_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkUserUniqueness(User user) {
		val cypriotModel = user.eContainer as CyprIoTModel		
		val allUsers = cypriotModel.declareUsers.filter(k | k.name == user.name)
		
		if (allUsers.size() > 1) {
			val msg = "The user '" + user.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_DeclareUsers, cypriotModel.declareUsers.indexOf(user),
				USER_UNIQUENESS)
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
	
	@Check(FAST)
	def checkInstanceTopicUniqueness(Topic topic) {
		val pubsub = topic.eContainer as PubSub		
		val allTopics = pubsub.hasTopics.filter(k | k.name == topic.name)
		
		if (allTopics.size() > 1) {
			val msg = "The topic '" + topic.getName() + "' is already declared.";
			error(msg, pubsub, CyprIoTPackage.eINSTANCE.pubSub_HasTopics, pubsub.hasTopics.indexOf(topic),
				TOPIC_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkPTPUniqueness(PointToPoint ptp) {
		val cypriotModel = ptp.eContainer as CyprIoTModel		
		val allPTPs = cypriotModel.declareChannels.filter(k | k instanceof PointToPoint && (k as PointToPoint).name == ptp.name)
		
		if (allPTPs.size() > 1) {
			val msg = "The channel Point-To-Point '" + ptp.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_DeclareChannels, cypriotModel.declareChannels.indexOf(ptp),
				PTP_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkInstanceConnectionPointUniqueness(ConnectionPoint connectionPoint) {
		val ptp = connectionPoint.eContainer as PointToPoint		
		val allTopics = ptp.hasConnectionPoints.filter(k | k.name == connectionPoint.name)
		
		if (allTopics.size() > 1) {
			val msg = "The connection point '" + connectionPoint.getName() + "' is already declared.";
			error(msg, ptp, CyprIoTPackage.eINSTANCE.pointToPoint_HasConnectionPoints, ptp.hasConnectionPoints.indexOf(connectionPoint),
				CONNECTIONPOINT_UNIQUENESS)
		}
	}
	
	@Check(FAST)
	def checkPolicyUniqueness(Policy policy) {
		val cypriotModel = policy.eContainer as CyprIoTModel		
		val allPolicies = cypriotModel.specifyPolicies.filter(k | k.name == policy.name)
		
		if (allPolicies.size() > 1) {
			val msg = "The policy '" + policy.getName() + "' is already declared.";
			error(msg, cypriotModel, CyprIoTPackage.eINSTANCE.cyprIoTModel_SpecifyPolicies, cypriotModel.specifyPolicies.indexOf(policy),
				POLICY_UNIQUENESS)
		}
	}

}
