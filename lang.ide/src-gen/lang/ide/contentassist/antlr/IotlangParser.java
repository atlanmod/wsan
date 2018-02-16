/*
 * generated by Xtext 2.13.0
 */
package lang.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import lang.ide.contentassist.antlr.internal.InternalIotlangParser;
import lang.services.IotlangGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class IotlangParser extends AbstractContentAssistParser {

	@Inject
	private IotlangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalIotlangParser createParser() {
		InternalIotlangParser result = new InternalIotlangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getIoTLangModelAccess().getAlternatives(), "rule__IoTLangModel__Alternatives");
					put(grammarAccess.getChannelAccess().getAlternatives(), "rule__Channel__Alternatives");
					put(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0(), "rule__Rule__PermissionAlternatives_3_0");
					put(grammarAccess.getRuleAccess().getActionAlternatives_5_0(), "rule__Rule__ActionAlternatives_5_0");
					put(grammarAccess.getRuleAccess().getAlternatives_6(), "rule__Rule__Alternatives_6");
					put(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4(), "rule__NetworkConfiguration__Alternatives_4");
					put(grammarAccess.getBindAccess().getDirectionAlternatives_3_0(), "rule__Bind__DirectionAlternatives_3_0");
					put(grammarAccess.getPlatformAnnotationAccess().getGroup(), "rule__PlatformAnnotation__Group__0");
					put(grammarAccess.getThingAccess().getGroup(), "rule__Thing__Group__0");
					put(grammarAccess.getPubSubAccess().getGroup(), "rule__PubSub__Group__0");
					put(grammarAccess.getPointToPointAccess().getGroup(), "rule__PointToPoint__Group__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getProtocolAccess().getGroup(), "rule__Protocol__Group__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_6_0(), "rule__Rule__Group_6_0__0");
					put(grammarAccess.getRuleAccess().getGroup_6_0_1(), "rule__Rule__Group_6_0_1__0");
					put(grammarAccess.getRuleAccess().getGroup_6_1(), "rule__Rule__Group_6_1__0");
					put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
					put(grammarAccess.getInstanceThingAccess().getGroup(), "rule__InstanceThing__Group__0");
					put(grammarAccess.getInstanceThingAccess().getGroup_2(), "rule__InstanceThing__Group_2__0");
					put(grammarAccess.getInstanceChannelAccess().getGroup(), "rule__InstanceChannel__Group__0");
					put(grammarAccess.getInstanceChannelAccess().getGroup_2(), "rule__InstanceChannel__Group_2__0");
					put(grammarAccess.getInstancePolicyAccess().getGroup(), "rule__InstancePolicy__Group__0");
					put(grammarAccess.getNetworkConfigurationAccess().getGroup(), "rule__NetworkConfiguration__Group__0");
					put(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4(), "rule__NetworkConfiguration__Group_4_4__0");
					put(grammarAccess.getBindAccess().getGroup(), "rule__Bind__Group__0");
					put(grammarAccess.getBindAccess().getGroup_7(), "rule__Bind__Group_7__0");
					put(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0(), "rule__IoTLangModel__ThingsAssignment_0");
					put(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1(), "rule__IoTLangModel__PoliciesAssignment_1");
					put(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2(), "rule__IoTLangModel__MessagesAssignment_2");
					put(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3(), "rule__IoTLangModel__ChannelsAssignment_3");
					put(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4(), "rule__IoTLangModel__ProtocolsAssignment_4");
					put(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5(), "rule__IoTLangModel__ConfigsAssignment_5");
					put(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0(), "rule__PlatformAnnotation__NameAssignment_0");
					put(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1(), "rule__PlatformAnnotation__ValueAssignment_1");
					put(grammarAccess.getThingAccess().getNameAssignment_1(), "rule__Thing__NameAssignment_1");
					put(grammarAccess.getThingAccess().getAnnotationsAssignment_2(), "rule__Thing__AnnotationsAssignment_2");
					put(grammarAccess.getThingAccess().getPortsAssignment_4(), "rule__Thing__PortsAssignment_4");
					put(grammarAccess.getPubSubAccess().getNameAssignment_1(), "rule__PubSub__NameAssignment_1");
					put(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3(), "rule__PubSub__HasTopicsAssignment_3");
					put(grammarAccess.getPointToPointAccess().getNameAssignment_1(), "rule__PointToPoint__NameAssignment_1");
					put(grammarAccess.getPolicyAccess().getNameAssignment_1(), "rule__Policy__NameAssignment_1");
					put(grammarAccess.getPolicyAccess().getHasRulesAssignment_3(), "rule__Policy__HasRulesAssignment_3");
					put(grammarAccess.getPortAccess().getNameAssignment_1(), "rule__Port__NameAssignment_1");
					put(grammarAccess.getProtocolAccess().getNameAssignment_1(), "rule__Protocol__NameAssignment_1");
					put(grammarAccess.getMessageAccess().getNameAssignment_1(), "rule__Message__NameAssignment_1");
					put(grammarAccess.getTopicAccess().getNameAssignment_1(), "rule__Topic__NameAssignment_1");
					put(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3(), "rule__Topic__AcceptedMessagesAssignment_3");
					put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
					put(grammarAccess.getRuleAccess().getSubjectAssignment_2(), "rule__Rule__SubjectAssignment_2");
					put(grammarAccess.getRuleAccess().getPermissionAssignment_3(), "rule__Rule__PermissionAssignment_3");
					put(grammarAccess.getRuleAccess().getActionAssignment_5(), "rule__Rule__ActionAssignment_5");
					put(grammarAccess.getRuleAccess().getObjectAssignment_6_0_0(), "rule__Rule__ObjectAssignment_6_0_0");
					put(grammarAccess.getRuleAccess().getPortsAssignment_6_0_1_1(), "rule__Rule__PortsAssignment_6_0_1_1");
					put(grammarAccess.getRuleAccess().getObjectMessageAssignment_6_1_1(), "rule__Rule__ObjectMessageAssignment_6_1_1");
					put(grammarAccess.getDomainAccess().getNameAssignment_1(), "rule__Domain__NameAssignment_1");
					put(grammarAccess.getInstanceThingAccess().getNameAssignment_1(), "rule__InstanceThing__NameAssignment_1");
					put(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1(), "rule__InstanceThing__NumberAssignment_2_1");
					put(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4(), "rule__InstanceThing__TypeThingAssignment_4");
					put(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5(), "rule__InstanceThing__AnnotationsAssignment_5");
					put(grammarAccess.getInstanceChannelAccess().getNameAssignment_1(), "rule__InstanceChannel__NameAssignment_1");
					put(grammarAccess.getInstanceChannelAccess().getNumberAssignment_2_1(), "rule__InstanceChannel__NumberAssignment_2_1");
					put(grammarAccess.getInstanceChannelAccess().getTypeChannelAssignment_4(), "rule__InstanceChannel__TypeChannelAssignment_4");
					put(grammarAccess.getInstanceChannelAccess().getOverProtocolAssignment_6(), "rule__InstanceChannel__OverProtocolAssignment_6");
					put(grammarAccess.getInstanceChannelAccess().getAnnotationsAssignment_7(), "rule__InstanceChannel__AnnotationsAssignment_7");
					put(grammarAccess.getInstancePolicyAccess().getNameAssignment_1(), "rule__InstancePolicy__NameAssignment_1");
					put(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3(), "rule__InstancePolicy__TypePolicyAssignment_3");
					put(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4(), "rule__InstancePolicy__AnnotationsAssignment_4");
					put(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1(), "rule__NetworkConfiguration__NameAssignment_1");
					put(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2(), "rule__NetworkConfiguration__AnnotationsAssignment_2");
					put(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0(), "rule__NetworkConfiguration__DomainAssignment_4_0");
					put(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1(), "rule__NetworkConfiguration__BindsAssignment_4_1");
					put(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2(), "rule__NetworkConfiguration__ThingInstancesAssignment_4_2");
					put(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3(), "rule__NetworkConfiguration__ChannelInstancesAssignment_4_3");
					put(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1(), "rule__NetworkConfiguration__EnforcesAssignment_4_4_1");
					put(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5(), "rule__NetworkConfiguration__InstancePoliciyAssignment_4_5");
					put(grammarAccess.getBindAccess().getNameAssignment_1(), "rule__Bind__NameAssignment_1");
					put(grammarAccess.getBindAccess().getThingInstanceAssignment_2(), "rule__Bind__ThingInstanceAssignment_2");
					put(grammarAccess.getBindAccess().getDirectionAssignment_3(), "rule__Bind__DirectionAssignment_3");
					put(grammarAccess.getBindAccess().getChannelInstanceAssignment_4(), "rule__Bind__ChannelInstanceAssignment_4");
					put(grammarAccess.getBindAccess().getTopicsAssignment_6(), "rule__Bind__TopicsAssignment_6");
					put(grammarAccess.getBindAccess().getTopicsAssignment_7_1(), "rule__Bind__TopicsAssignment_7_1");
					put(grammarAccess.getBindAccess().getAnnotationsAssignment_9(), "rule__Bind__AnnotationsAssignment_9");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IotlangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IotlangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
