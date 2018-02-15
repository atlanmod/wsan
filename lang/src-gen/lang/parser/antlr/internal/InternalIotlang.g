/*
 * generated by Xtext 2.13.0
 */
grammar InternalIotlang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lang.services.IotlangGrammarAccess;

}

@parser::members {

 	private IotlangGrammarAccess grammarAccess;

    public InternalIotlangParser(TokenStream input, IotlangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "IoTLangModel";
   	}

   	@Override
   	protected IotlangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleIoTLangModel
entryRuleIoTLangModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIoTLangModelRule()); }
	iv_ruleIoTLangModel=ruleIoTLangModel
	{ $current=$iv_ruleIoTLangModel.current; }
	EOF;

// Rule IoTLangModel
ruleIoTLangModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getIoTLangModelAccess().getThingsThingParserRuleCall_0_0());
				}
				lv_things_0_0=ruleThing
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
					}
					add(
						$current,
						"things",
						lv_things_0_0,
						"lang.Iotlang.Thing");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getIoTLangModelAccess().getPoliciesPolicyParserRuleCall_1_0());
				}
				lv_policies_1_0=rulePolicy
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
					}
					add(
						$current,
						"policies",
						lv_policies_1_0,
						"lang.Iotlang.Policy");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_2_0());
				}
				lv_channels_2_0=ruleChannel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
					}
					add(
						$current,
						"channels",
						lv_channels_2_0,
						"lang.Iotlang.Channel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_3_0());
				}
				lv_configs_3_0=ruleNetworkConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
					}
					add(
						$current,
						"configs",
						lv_configs_3_0,
						"lang.Iotlang.NetworkConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRulePlatformAnnotation
entryRulePlatformAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlatformAnnotationRule()); }
	iv_rulePlatformAnnotation=rulePlatformAnnotation
	{ $current=$iv_rulePlatformAnnotation.current; }
	EOF;

// Rule PlatformAnnotation
rulePlatformAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ANNOTATION_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"lang.Iotlang.ANNOTATION_ID");
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_STRING_LIT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getPlatformAnnotationAccess().getValueSTRING_LITTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"lang.Iotlang.STRING_LIT");
				}
			)
		)
	)
;

// Entry rule entryRuleThing
entryRuleThing returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThingRule()); }
	iv_ruleThing=ruleThing
	{ $current=$iv_ruleThing.current; }
	EOF;

// Rule Thing
ruleThing returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='thing'
		{
			newLeafNode(otherlv_0, grammarAccess.getThingAccess().getThingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getThingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getThingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"lang.Iotlang.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getThingAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleChannel
entryRuleChannel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChannelRule()); }
	iv_ruleChannel=ruleChannel
	{ $current=$iv_ruleChannel.current; }
	EOF;

// Rule Channel
ruleChannel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='channel'
		{
			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChannelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChannelAccess().getTopicsTopicParserRuleCall_3_0());
				}
				lv_topics_3_0=ruleTopic
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChannelRule());
					}
					add(
						$current,
						"topics",
						lv_topics_3_0,
						"lang.Iotlang.Topic");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePolicy
entryRulePolicy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPolicyRule()); }
	iv_rulePolicy=rulePolicy
	{ $current=$iv_rulePolicy.current; }
	EOF;

// Rule Policy
rulePolicy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='policy'
		{
			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPolicyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0());
				}
				lv_rules_3_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPolicyRule());
					}
					add(
						$current,
						"rules",
						lv_rules_3_0,
						"lang.Iotlang.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTopic
entryRuleTopic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTopicRule()); }
	iv_ruleTopic=ruleTopic
	{ $current=$iv_ruleTopic.current; }
	EOF;

// Rule Topic
ruleTopic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='topic'
		{
			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTopicRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					lv_type_2_1='?'
					{
						newLeafNode(lv_type_2_1, grammarAccess.getTopicAccess().getTypeQuestionMarkKeyword_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTopicRule());
						}
						setWithLastConsumed($current, "type", lv_type_2_1, null);
					}
					    |
					lv_type_2_2='!'
					{
						newLeafNode(lv_type_2_2, grammarAccess.getTopicAccess().getTypeExclamationMarkKeyword_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTopicRule());
						}
						setWithLastConsumed($current, "type", lv_type_2_2, null);
					}
				)
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTopicRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getMessagesMessageCrossReference_4_0());
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getTopicAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rule'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThingsThingCrossReference_2_0());
				}
			)
		)
		(
			(
				(
					lv_permission_3_1='allow'
					{
						newLeafNode(lv_permission_3_1, grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleRule());
						}
						setWithLastConsumed($current, "permission", lv_permission_3_1, null);
					}
					    |
					lv_permission_3_2='deny'
					{
						newLeafNode(lv_permission_3_2, grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleRule());
						}
						setWithLastConsumed($current, "permission", lv_permission_3_2, null);
					}
				)
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getColonKeyword_4());
		}
		(
			(
				(
					lv_action_5_1='send'
					{
						newLeafNode(lv_action_5_1, grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleRule());
						}
						setWithLastConsumed($current, "action", lv_action_5_1, null);
					}
					    |
					lv_action_5_2='receive'
					{
						newLeafNode(lv_action_5_2, grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleRule());
						}
						setWithLastConsumed($current, "action", lv_action_5_2, null);
					}
				)
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getResThingCrossReference_6_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDomain
entryRuleDomain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainRule()); }
	iv_ruleDomain=ruleDomain
	{ $current=$iv_ruleDomain.current; }
	EOF;

// Rule Domain
ruleDomain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='domain'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING_LIT
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameSTRING_LITTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDomainRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"lang.Iotlang.STRING_LIT");
				}
			)
		)
	)
;

// Entry rule entryRuleInstanceThing
entryRuleInstanceThing returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceThingRule()); }
	iv_ruleInstanceThing=ruleInstanceThing
	{ $current=$iv_ruleInstanceThing.current; }
	EOF;

// Rule InstanceThing
ruleInstanceThing returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='instanceThing'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceThingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceThingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0());
			}
			(
				(
					lv_number_3_0=RULE_INT
					{
						newLeafNode(lv_number_3_0, grammarAccess.getInstanceThingAccess().getNumberINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInstanceThingRule());
						}
						addWithLastConsumed(
							$current,
							"number",
							lv_number_3_0,
							"lang.Iotlang.INT");
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2());
			}
		)*
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getInstanceThingAccess().getColonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceThingRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getInstanceThingAccess().getTypeThingCrossReference_4_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceThingRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"lang.Iotlang.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInstanceBus
entryRuleInstanceBus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceBusRule()); }
	iv_ruleInstanceBus=ruleInstanceBus
	{ $current=$iv_ruleInstanceBus.current; }
	EOF;

// Rule InstanceBus
ruleInstanceBus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='instanceBus'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstanceBusAccess().getInstanceBusKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceBusAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceBusRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getInstanceBusAccess().getLeftSquareBracketKeyword_2_0());
			}
			(
				(
					lv_number_3_0=RULE_INT
					{
						newLeafNode(lv_number_3_0, grammarAccess.getInstanceBusAccess().getNumberINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInstanceBusRule());
						}
						addWithLastConsumed(
							$current,
							"number",
							lv_number_3_0,
							"lang.Iotlang.INT");
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getInstanceBusAccess().getRightSquareBracketKeyword_2_2());
			}
		)*
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getInstanceBusAccess().getColonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceBusRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getInstanceBusAccess().getTypeChannelChannelCrossReference_4_0());
				}
			)
		)
		otherlv_7='over'
		{
			newLeafNode(otherlv_7, grammarAccess.getInstanceBusAccess().getOverKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceBusRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getInstanceBusAccess().getProtocolProtocolCrossReference_6_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceBusAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_9_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceBusRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_9_0,
						"lang.Iotlang.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInstancePolicy
entryRuleInstancePolicy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstancePolicyRule()); }
	iv_ruleInstancePolicy=ruleInstancePolicy
	{ $current=$iv_ruleInstancePolicy.current; }
	EOF;

// Rule InstancePolicy
ruleInstancePolicy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='instancePolicy'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstancePolicyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstancePolicyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstancePolicyAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstancePolicyRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstancePolicyRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"lang.Iotlang.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleNetworkConfiguration
entryRuleNetworkConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNetworkConfigurationRule()); }
	iv_ruleNetworkConfiguration=ruleNetworkConfiguration
	{ $current=$iv_ruleNetworkConfiguration.current; }
	EOF;

// Rule NetworkConfiguration
ruleNetworkConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='networkConfiguration'
		{
			newLeafNode(otherlv_0, grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNetworkConfigurationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNetworkConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"lang.Iotlang.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0());
					}
					lv_domain_4_0=ruleDomain
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
						}
						add(
							$current,
							"domain",
							lv_domain_4_0,
							"lang.Iotlang.Domain");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0());
					}
					lv_binds_5_0=ruleBind
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
						}
						add(
							$current,
							"binds",
							lv_binds_5_0,
							"lang.Iotlang.Bind");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstancesInstanceThingParserRuleCall_4_2_0());
					}
					lv_instances_6_0=ruleInstanceThing
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
						}
						add(
							$current,
							"instances",
							lv_instances_6_0,
							"lang.Iotlang.InstanceThing");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstancesBusInstanceBusParserRuleCall_4_3_0());
					}
					lv_instancesBus_7_0=ruleInstanceBus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
						}
						add(
							$current,
							"instancesBus",
							lv_instancesBus_7_0,
							"lang.Iotlang.InstanceBus");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_8='enforce'
				{
					newLeafNode(otherlv_8, grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNetworkConfigurationRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0());
						}
					)
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstPoliciesInstancePolicyParserRuleCall_4_5_0());
					}
					lv_instPolicies_10_0=ruleInstancePolicy
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
						}
						add(
							$current,
							"instPolicies",
							lv_instPolicies_10_0,
							"lang.Iotlang.InstancePolicy");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleBind
entryRuleBind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindRule()); }
	iv_ruleBind=ruleBind
	{ $current=$iv_ruleBind.current; }
	EOF;

// Rule Bind
ruleBind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bind'
		{
			newLeafNode(otherlv_0, grammarAccess.getBindAccess().getBindKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBindAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getBindAccess().getThinginstInstanceThingCrossReference_2_0());
				}
			)
		)
		(
			(
				(
					lv_direction_3_1='=>'
					{
						newLeafNode(lv_direction_3_1, grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBindRule());
						}
						setWithLastConsumed($current, "direction", lv_direction_3_1, null);
					}
					    |
					lv_direction_3_2='<=>'
					{
						newLeafNode(lv_direction_3_2, grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBindRule());
						}
						setWithLastConsumed($current, "direction", lv_direction_3_2, null);
					}
					    |
					lv_direction_3_3='<='
					{
						newLeafNode(lv_direction_3_3, grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBindRule());
						}
						setWithLastConsumed($current, "direction", lv_direction_3_3, null);
					}
				)
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getBindAccess().getBusInstInstanceBusCrossReference_4_0());
				}
			)
		)
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getBindAccess().getChannelsTopicCrossReference_6_0());
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getBindAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBindRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getBindAccess().getChannelsTopicCrossReference_7_1_0());
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
				}
				lv_annotations_10_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_10_0,
						"lang.Iotlang.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

RULE_INT : ('0'..'9')+;

RULE_STRING_LIT : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_ANNOTATION_ID : '@' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
