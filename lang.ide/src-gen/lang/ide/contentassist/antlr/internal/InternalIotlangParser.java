package lang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lang.services.IotlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotlangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'send'", "'receive'", "'=>'", "'<=>'", "'<='", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'port'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "':'", "'.'", "'domain'", "'instanceThing'", "'['", "']'", "'instanceChannel'", "'over'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "','"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ANNOTATION_ID=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIotlangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotlangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotlangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIotlang.g"; }


    	private IotlangGrammarAccess grammarAccess;

    	public void setGrammarAccess(IotlangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleIoTLangModel"
    // InternalIotlang.g:53:1: entryRuleIoTLangModel : ruleIoTLangModel EOF ;
    public final void entryRuleIoTLangModel() throws RecognitionException {
        try {
            // InternalIotlang.g:54:1: ( ruleIoTLangModel EOF )
            // InternalIotlang.g:55:1: ruleIoTLangModel EOF
            {
             before(grammarAccess.getIoTLangModelRule()); 
            pushFollow(FOLLOW_1);
            ruleIoTLangModel();

            state._fsp--;

             after(grammarAccess.getIoTLangModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIoTLangModel"


    // $ANTLR start "ruleIoTLangModel"
    // InternalIotlang.g:62:1: ruleIoTLangModel : ( ( rule__IoTLangModel__Alternatives )* ) ;
    public final void ruleIoTLangModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:66:2: ( ( ( rule__IoTLangModel__Alternatives )* ) )
            // InternalIotlang.g:67:2: ( ( rule__IoTLangModel__Alternatives )* )
            {
            // InternalIotlang.g:67:2: ( ( rule__IoTLangModel__Alternatives )* )
            // InternalIotlang.g:68:3: ( rule__IoTLangModel__Alternatives )*
            {
             before(grammarAccess.getIoTLangModelAccess().getAlternatives()); 
            // InternalIotlang.g:69:3: ( rule__IoTLangModel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||(LA1_0>=23 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=28)||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIotlang.g:69:4: rule__IoTLangModel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IoTLangModel__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getIoTLangModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIoTLangModel"


    // $ANTLR start "entryRulePlatformAnnotation"
    // InternalIotlang.g:78:1: entryRulePlatformAnnotation : rulePlatformAnnotation EOF ;
    public final void entryRulePlatformAnnotation() throws RecognitionException {
        try {
            // InternalIotlang.g:79:1: ( rulePlatformAnnotation EOF )
            // InternalIotlang.g:80:1: rulePlatformAnnotation EOF
            {
             before(grammarAccess.getPlatformAnnotationRule()); 
            pushFollow(FOLLOW_1);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getPlatformAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlatformAnnotation"


    // $ANTLR start "rulePlatformAnnotation"
    // InternalIotlang.g:87:1: rulePlatformAnnotation : ( ( rule__PlatformAnnotation__Group__0 ) ) ;
    public final void rulePlatformAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:91:2: ( ( ( rule__PlatformAnnotation__Group__0 ) ) )
            // InternalIotlang.g:92:2: ( ( rule__PlatformAnnotation__Group__0 ) )
            {
            // InternalIotlang.g:92:2: ( ( rule__PlatformAnnotation__Group__0 ) )
            // InternalIotlang.g:93:3: ( rule__PlatformAnnotation__Group__0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getGroup()); 
            // InternalIotlang.g:94:3: ( rule__PlatformAnnotation__Group__0 )
            // InternalIotlang.g:94:4: rule__PlatformAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformAnnotation"


    // $ANTLR start "entryRuleThing"
    // InternalIotlang.g:103:1: entryRuleThing : ruleThing EOF ;
    public final void entryRuleThing() throws RecognitionException {
        try {
            // InternalIotlang.g:104:1: ( ruleThing EOF )
            // InternalIotlang.g:105:1: ruleThing EOF
            {
             before(grammarAccess.getThingRule()); 
            pushFollow(FOLLOW_1);
            ruleThing();

            state._fsp--;

             after(grammarAccess.getThingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThing"


    // $ANTLR start "ruleThing"
    // InternalIotlang.g:112:1: ruleThing : ( ( rule__Thing__Group__0 ) ) ;
    public final void ruleThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:116:2: ( ( ( rule__Thing__Group__0 ) ) )
            // InternalIotlang.g:117:2: ( ( rule__Thing__Group__0 ) )
            {
            // InternalIotlang.g:117:2: ( ( rule__Thing__Group__0 ) )
            // InternalIotlang.g:118:3: ( rule__Thing__Group__0 )
            {
             before(grammarAccess.getThingAccess().getGroup()); 
            // InternalIotlang.g:119:3: ( rule__Thing__Group__0 )
            // InternalIotlang.g:119:4: rule__Thing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Thing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThing"


    // $ANTLR start "entryRuleChannel"
    // InternalIotlang.g:128:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalIotlang.g:129:1: ( ruleChannel EOF )
            // InternalIotlang.g:130:1: ruleChannel EOF
            {
             before(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalIotlang.g:137:1: ruleChannel : ( ( rule__Channel__Alternatives ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:141:2: ( ( ( rule__Channel__Alternatives ) ) )
            // InternalIotlang.g:142:2: ( ( rule__Channel__Alternatives ) )
            {
            // InternalIotlang.g:142:2: ( ( rule__Channel__Alternatives ) )
            // InternalIotlang.g:143:3: ( rule__Channel__Alternatives )
            {
             before(grammarAccess.getChannelAccess().getAlternatives()); 
            // InternalIotlang.g:144:3: ( rule__Channel__Alternatives )
            // InternalIotlang.g:144:4: rule__Channel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRulePubSub"
    // InternalIotlang.g:153:1: entryRulePubSub : rulePubSub EOF ;
    public final void entryRulePubSub() throws RecognitionException {
        try {
            // InternalIotlang.g:154:1: ( rulePubSub EOF )
            // InternalIotlang.g:155:1: rulePubSub EOF
            {
             before(grammarAccess.getPubSubRule()); 
            pushFollow(FOLLOW_1);
            rulePubSub();

            state._fsp--;

             after(grammarAccess.getPubSubRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePubSub"


    // $ANTLR start "rulePubSub"
    // InternalIotlang.g:162:1: rulePubSub : ( ( rule__PubSub__Group__0 ) ) ;
    public final void rulePubSub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:166:2: ( ( ( rule__PubSub__Group__0 ) ) )
            // InternalIotlang.g:167:2: ( ( rule__PubSub__Group__0 ) )
            {
            // InternalIotlang.g:167:2: ( ( rule__PubSub__Group__0 ) )
            // InternalIotlang.g:168:3: ( rule__PubSub__Group__0 )
            {
             before(grammarAccess.getPubSubAccess().getGroup()); 
            // InternalIotlang.g:169:3: ( rule__PubSub__Group__0 )
            // InternalIotlang.g:169:4: rule__PubSub__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PubSub__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPubSubAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePubSub"


    // $ANTLR start "entryRulePointToPoint"
    // InternalIotlang.g:178:1: entryRulePointToPoint : rulePointToPoint EOF ;
    public final void entryRulePointToPoint() throws RecognitionException {
        try {
            // InternalIotlang.g:179:1: ( rulePointToPoint EOF )
            // InternalIotlang.g:180:1: rulePointToPoint EOF
            {
             before(grammarAccess.getPointToPointRule()); 
            pushFollow(FOLLOW_1);
            rulePointToPoint();

            state._fsp--;

             after(grammarAccess.getPointToPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePointToPoint"


    // $ANTLR start "rulePointToPoint"
    // InternalIotlang.g:187:1: rulePointToPoint : ( ( rule__PointToPoint__Group__0 ) ) ;
    public final void rulePointToPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:191:2: ( ( ( rule__PointToPoint__Group__0 ) ) )
            // InternalIotlang.g:192:2: ( ( rule__PointToPoint__Group__0 ) )
            {
            // InternalIotlang.g:192:2: ( ( rule__PointToPoint__Group__0 ) )
            // InternalIotlang.g:193:3: ( rule__PointToPoint__Group__0 )
            {
             before(grammarAccess.getPointToPointAccess().getGroup()); 
            // InternalIotlang.g:194:3: ( rule__PointToPoint__Group__0 )
            // InternalIotlang.g:194:4: rule__PointToPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointToPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointToPoint"


    // $ANTLR start "entryRulePolicy"
    // InternalIotlang.g:203:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:204:1: ( rulePolicy EOF )
            // InternalIotlang.g:205:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalIotlang.g:212:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:216:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalIotlang.g:217:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalIotlang.g:217:2: ( ( rule__Policy__Group__0 ) )
            // InternalIotlang.g:218:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalIotlang.g:219:3: ( rule__Policy__Group__0 )
            // InternalIotlang.g:219:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRulePort"
    // InternalIotlang.g:228:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalIotlang.g:229:1: ( rulePort EOF )
            // InternalIotlang.g:230:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalIotlang.g:237:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:241:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalIotlang.g:242:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalIotlang.g:242:2: ( ( rule__Port__Group__0 ) )
            // InternalIotlang.g:243:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalIotlang.g:244:3: ( rule__Port__Group__0 )
            // InternalIotlang.g:244:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProtocol"
    // InternalIotlang.g:253:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalIotlang.g:254:1: ( ruleProtocol EOF )
            // InternalIotlang.g:255:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalIotlang.g:262:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:266:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalIotlang.g:267:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalIotlang.g:267:2: ( ( rule__Protocol__Group__0 ) )
            // InternalIotlang.g:268:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalIotlang.g:269:3: ( rule__Protocol__Group__0 )
            // InternalIotlang.g:269:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleMessage"
    // InternalIotlang.g:278:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalIotlang.g:279:1: ( ruleMessage EOF )
            // InternalIotlang.g:280:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalIotlang.g:287:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:291:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalIotlang.g:292:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalIotlang.g:292:2: ( ( rule__Message__Group__0 ) )
            // InternalIotlang.g:293:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalIotlang.g:294:3: ( rule__Message__Group__0 )
            // InternalIotlang.g:294:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleTopic"
    // InternalIotlang.g:303:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalIotlang.g:304:1: ( ruleTopic EOF )
            // InternalIotlang.g:305:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalIotlang.g:312:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:316:2: ( ( ( rule__Topic__Group__0 ) ) )
            // InternalIotlang.g:317:2: ( ( rule__Topic__Group__0 ) )
            {
            // InternalIotlang.g:317:2: ( ( rule__Topic__Group__0 ) )
            // InternalIotlang.g:318:3: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // InternalIotlang.g:319:3: ( rule__Topic__Group__0 )
            // InternalIotlang.g:319:4: rule__Topic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleRule"
    // InternalIotlang.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalIotlang.g:329:1: ( ruleRule EOF )
            // InternalIotlang.g:330:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalIotlang.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalIotlang.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalIotlang.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalIotlang.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalIotlang.g:344:3: ( rule__Rule__Group__0 )
            // InternalIotlang.g:344:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDomain"
    // InternalIotlang.g:353:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalIotlang.g:354:1: ( ruleDomain EOF )
            // InternalIotlang.g:355:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalIotlang.g:362:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:366:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalIotlang.g:367:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalIotlang.g:367:2: ( ( rule__Domain__Group__0 ) )
            // InternalIotlang.g:368:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalIotlang.g:369:3: ( rule__Domain__Group__0 )
            // InternalIotlang.g:369:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleInstanceThing"
    // InternalIotlang.g:378:1: entryRuleInstanceThing : ruleInstanceThing EOF ;
    public final void entryRuleInstanceThing() throws RecognitionException {
        try {
            // InternalIotlang.g:379:1: ( ruleInstanceThing EOF )
            // InternalIotlang.g:380:1: ruleInstanceThing EOF
            {
             before(grammarAccess.getInstanceThingRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceThing();

            state._fsp--;

             after(grammarAccess.getInstanceThingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceThing"


    // $ANTLR start "ruleInstanceThing"
    // InternalIotlang.g:387:1: ruleInstanceThing : ( ( rule__InstanceThing__Group__0 ) ) ;
    public final void ruleInstanceThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:391:2: ( ( ( rule__InstanceThing__Group__0 ) ) )
            // InternalIotlang.g:392:2: ( ( rule__InstanceThing__Group__0 ) )
            {
            // InternalIotlang.g:392:2: ( ( rule__InstanceThing__Group__0 ) )
            // InternalIotlang.g:393:3: ( rule__InstanceThing__Group__0 )
            {
             before(grammarAccess.getInstanceThingAccess().getGroup()); 
            // InternalIotlang.g:394:3: ( rule__InstanceThing__Group__0 )
            // InternalIotlang.g:394:4: rule__InstanceThing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceThing"


    // $ANTLR start "entryRuleInstanceChannel"
    // InternalIotlang.g:403:1: entryRuleInstanceChannel : ruleInstanceChannel EOF ;
    public final void entryRuleInstanceChannel() throws RecognitionException {
        try {
            // InternalIotlang.g:404:1: ( ruleInstanceChannel EOF )
            // InternalIotlang.g:405:1: ruleInstanceChannel EOF
            {
             before(grammarAccess.getInstanceChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceChannel();

            state._fsp--;

             after(grammarAccess.getInstanceChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceChannel"


    // $ANTLR start "ruleInstanceChannel"
    // InternalIotlang.g:412:1: ruleInstanceChannel : ( ( rule__InstanceChannel__Group__0 ) ) ;
    public final void ruleInstanceChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:416:2: ( ( ( rule__InstanceChannel__Group__0 ) ) )
            // InternalIotlang.g:417:2: ( ( rule__InstanceChannel__Group__0 ) )
            {
            // InternalIotlang.g:417:2: ( ( rule__InstanceChannel__Group__0 ) )
            // InternalIotlang.g:418:3: ( rule__InstanceChannel__Group__0 )
            {
             before(grammarAccess.getInstanceChannelAccess().getGroup()); 
            // InternalIotlang.g:419:3: ( rule__InstanceChannel__Group__0 )
            // InternalIotlang.g:419:4: rule__InstanceChannel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceChannel"


    // $ANTLR start "entryRuleInstancePolicy"
    // InternalIotlang.g:428:1: entryRuleInstancePolicy : ruleInstancePolicy EOF ;
    public final void entryRuleInstancePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:429:1: ( ruleInstancePolicy EOF )
            // InternalIotlang.g:430:1: ruleInstancePolicy EOF
            {
             before(grammarAccess.getInstancePolicyRule()); 
            pushFollow(FOLLOW_1);
            ruleInstancePolicy();

            state._fsp--;

             after(grammarAccess.getInstancePolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstancePolicy"


    // $ANTLR start "ruleInstancePolicy"
    // InternalIotlang.g:437:1: ruleInstancePolicy : ( ( rule__InstancePolicy__Group__0 ) ) ;
    public final void ruleInstancePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:441:2: ( ( ( rule__InstancePolicy__Group__0 ) ) )
            // InternalIotlang.g:442:2: ( ( rule__InstancePolicy__Group__0 ) )
            {
            // InternalIotlang.g:442:2: ( ( rule__InstancePolicy__Group__0 ) )
            // InternalIotlang.g:443:3: ( rule__InstancePolicy__Group__0 )
            {
             before(grammarAccess.getInstancePolicyAccess().getGroup()); 
            // InternalIotlang.g:444:3: ( rule__InstancePolicy__Group__0 )
            // InternalIotlang.g:444:4: rule__InstancePolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstancePolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstancePolicy"


    // $ANTLR start "entryRuleNetworkConfiguration"
    // InternalIotlang.g:453:1: entryRuleNetworkConfiguration : ruleNetworkConfiguration EOF ;
    public final void entryRuleNetworkConfiguration() throws RecognitionException {
        try {
            // InternalIotlang.g:454:1: ( ruleNetworkConfiguration EOF )
            // InternalIotlang.g:455:1: ruleNetworkConfiguration EOF
            {
             before(grammarAccess.getNetworkConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkConfiguration();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetworkConfiguration"


    // $ANTLR start "ruleNetworkConfiguration"
    // InternalIotlang.g:462:1: ruleNetworkConfiguration : ( ( rule__NetworkConfiguration__Group__0 ) ) ;
    public final void ruleNetworkConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:466:2: ( ( ( rule__NetworkConfiguration__Group__0 ) ) )
            // InternalIotlang.g:467:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            {
            // InternalIotlang.g:467:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            // InternalIotlang.g:468:3: ( rule__NetworkConfiguration__Group__0 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            // InternalIotlang.g:469:3: ( rule__NetworkConfiguration__Group__0 )
            // InternalIotlang.g:469:4: rule__NetworkConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkConfiguration"


    // $ANTLR start "entryRuleBind"
    // InternalIotlang.g:478:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalIotlang.g:479:1: ( ruleBind EOF )
            // InternalIotlang.g:480:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalIotlang.g:487:1: ruleBind : ( ( rule__Bind__Group__0 ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:491:2: ( ( ( rule__Bind__Group__0 ) ) )
            // InternalIotlang.g:492:2: ( ( rule__Bind__Group__0 ) )
            {
            // InternalIotlang.g:492:2: ( ( rule__Bind__Group__0 ) )
            // InternalIotlang.g:493:3: ( rule__Bind__Group__0 )
            {
             before(grammarAccess.getBindAccess().getGroup()); 
            // InternalIotlang.g:494:3: ( rule__Bind__Group__0 )
            // InternalIotlang.g:494:4: rule__Bind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "rule__IoTLangModel__Alternatives"
    // InternalIotlang.g:502:1: rule__IoTLangModel__Alternatives : ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) );
    public final void rule__IoTLangModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:506:1: ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 23:
            case 24:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 42:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIotlang.g:507:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    {
                    // InternalIotlang.g:507:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    // InternalIotlang.g:508:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 
                    // InternalIotlang.g:509:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    // InternalIotlang.g:509:4: rule__IoTLangModel__ThingsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ThingsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:513:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    {
                    // InternalIotlang.g:513:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    // InternalIotlang.g:514:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 
                    // InternalIotlang.g:515:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    // InternalIotlang.g:515:4: rule__IoTLangModel__PoliciesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__PoliciesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:519:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    {
                    // InternalIotlang.g:519:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    // InternalIotlang.g:520:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 
                    // InternalIotlang.g:521:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    // InternalIotlang.g:521:4: rule__IoTLangModel__MessagesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__MessagesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:525:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    {
                    // InternalIotlang.g:525:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    // InternalIotlang.g:526:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 
                    // InternalIotlang.g:527:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    // InternalIotlang.g:527:4: rule__IoTLangModel__ChannelsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ChannelsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIotlang.g:531:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    {
                    // InternalIotlang.g:531:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    // InternalIotlang.g:532:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 
                    // InternalIotlang.g:533:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    // InternalIotlang.g:533:4: rule__IoTLangModel__ProtocolsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ProtocolsAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIotlang.g:537:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    {
                    // InternalIotlang.g:537:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    // InternalIotlang.g:538:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 
                    // InternalIotlang.g:539:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    // InternalIotlang.g:539:4: rule__IoTLangModel__ConfigsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ConfigsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__Alternatives"


    // $ANTLR start "rule__Channel__Alternatives"
    // InternalIotlang.g:547:1: rule__Channel__Alternatives : ( ( rulePubSub ) | ( rulePointToPoint ) );
    public final void rule__Channel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:551:1: ( ( rulePubSub ) | ( rulePointToPoint ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIotlang.g:552:2: ( rulePubSub )
                    {
                    // InternalIotlang.g:552:2: ( rulePubSub )
                    // InternalIotlang.g:553:3: rulePubSub
                    {
                     before(grammarAccess.getChannelAccess().getPubSubParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePubSub();

                    state._fsp--;

                     after(grammarAccess.getChannelAccess().getPubSubParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:558:2: ( rulePointToPoint )
                    {
                    // InternalIotlang.g:558:2: ( rulePointToPoint )
                    // InternalIotlang.g:559:3: rulePointToPoint
                    {
                     before(grammarAccess.getChannelAccess().getPointToPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePointToPoint();

                    state._fsp--;

                     after(grammarAccess.getChannelAccess().getPointToPointParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Alternatives"


    // $ANTLR start "rule__Rule__PermissionAlternatives_3_0"
    // InternalIotlang.g:568:1: rule__Rule__PermissionAlternatives_3_0 : ( ( 'allow' ) | ( 'deny' ) );
    public final void rule__Rule__PermissionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:572:1: ( ( 'allow' ) | ( 'deny' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIotlang.g:573:2: ( 'allow' )
                    {
                    // InternalIotlang.g:573:2: ( 'allow' )
                    // InternalIotlang.g:574:3: 'allow'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:579:2: ( 'deny' )
                    {
                    // InternalIotlang.g:579:2: ( 'deny' )
                    // InternalIotlang.g:580:3: 'deny'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PermissionAlternatives_3_0"


    // $ANTLR start "rule__Rule__ActionAlternatives_5_0"
    // InternalIotlang.g:589:1: rule__Rule__ActionAlternatives_5_0 : ( ( 'send' ) | ( 'receive' ) );
    public final void rule__Rule__ActionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:593:1: ( ( 'send' ) | ( 'receive' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIotlang.g:594:2: ( 'send' )
                    {
                    // InternalIotlang.g:594:2: ( 'send' )
                    // InternalIotlang.g:595:3: 'send'
                    {
                     before(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:600:2: ( 'receive' )
                    {
                    // InternalIotlang.g:600:2: ( 'receive' )
                    // InternalIotlang.g:601:3: 'receive'
                    {
                     before(grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAlternatives_5_0"


    // $ANTLR start "rule__NetworkConfiguration__Alternatives_4"
    // InternalIotlang.g:610:1: rule__NetworkConfiguration__Alternatives_4 : ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) );
    public final void rule__NetworkConfiguration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:614:1: ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 39:
                {
                alt6=4;
                }
                break;
            case 43:
                {
                alt6=5;
                }
                break;
            case 41:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIotlang.g:615:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    {
                    // InternalIotlang.g:615:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    // InternalIotlang.g:616:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 
                    // InternalIotlang.g:617:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    // InternalIotlang.g:617:4: rule__NetworkConfiguration__DomainAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__DomainAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:621:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    {
                    // InternalIotlang.g:621:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    // InternalIotlang.g:622:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 
                    // InternalIotlang.g:623:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    // InternalIotlang.g:623:4: rule__NetworkConfiguration__BindsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__BindsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:627:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    {
                    // InternalIotlang.g:627:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    // InternalIotlang.g:628:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2()); 
                    // InternalIotlang.g:629:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    // InternalIotlang.g:629:4: rule__NetworkConfiguration__ThingInstancesAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ThingInstancesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:633:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    {
                    // InternalIotlang.g:633:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    // InternalIotlang.g:634:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3()); 
                    // InternalIotlang.g:635:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    // InternalIotlang.g:635:4: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ChannelInstancesAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIotlang.g:639:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    {
                    // InternalIotlang.g:639:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    // InternalIotlang.g:640:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 
                    // InternalIotlang.g:641:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    // InternalIotlang.g:641:4: rule__NetworkConfiguration__Group_4_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__Group_4_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIotlang.g:645:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    {
                    // InternalIotlang.g:645:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    // InternalIotlang.g:646:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5()); 
                    // InternalIotlang.g:647:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    // InternalIotlang.g:647:4: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__InstancePoliciyAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Alternatives_4"


    // $ANTLR start "rule__Bind__DirectionAlternatives_3_0"
    // InternalIotlang.g:655:1: rule__Bind__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Bind__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:659:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:660:2: ( '=>' )
                    {
                    // InternalIotlang.g:660:2: ( '=>' )
                    // InternalIotlang.g:661:3: '=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:666:2: ( '<=>' )
                    {
                    // InternalIotlang.g:666:2: ( '<=>' )
                    // InternalIotlang.g:667:3: '<=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:672:2: ( '<=' )
                    {
                    // InternalIotlang.g:672:2: ( '<=' )
                    // InternalIotlang.g:673:3: '<='
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__DirectionAlternatives_3_0"


    // $ANTLR start "rule__PlatformAnnotation__Group__0"
    // InternalIotlang.g:682:1: rule__PlatformAnnotation__Group__0 : rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 ;
    public final void rule__PlatformAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:686:1: ( rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 )
            // InternalIotlang.g:687:2: rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PlatformAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__0"


    // $ANTLR start "rule__PlatformAnnotation__Group__0__Impl"
    // InternalIotlang.g:694:1: rule__PlatformAnnotation__Group__0__Impl : ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) ;
    public final void rule__PlatformAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:698:1: ( ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) )
            // InternalIotlang.g:699:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            {
            // InternalIotlang.g:699:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            // InternalIotlang.g:700:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 
            // InternalIotlang.g:701:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            // InternalIotlang.g:701:3: rule__PlatformAnnotation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PlatformAnnotation__Group__1"
    // InternalIotlang.g:709:1: rule__PlatformAnnotation__Group__1 : rule__PlatformAnnotation__Group__1__Impl ;
    public final void rule__PlatformAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:713:1: ( rule__PlatformAnnotation__Group__1__Impl )
            // InternalIotlang.g:714:2: rule__PlatformAnnotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__1"


    // $ANTLR start "rule__PlatformAnnotation__Group__1__Impl"
    // InternalIotlang.g:720:1: rule__PlatformAnnotation__Group__1__Impl : ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PlatformAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:724:1: ( ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) )
            // InternalIotlang.g:725:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            {
            // InternalIotlang.g:725:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            // InternalIotlang.g:726:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 
            // InternalIotlang.g:727:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            // InternalIotlang.g:727:3: rule__PlatformAnnotation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__1__Impl"


    // $ANTLR start "rule__Thing__Group__0"
    // InternalIotlang.g:736:1: rule__Thing__Group__0 : rule__Thing__Group__0__Impl rule__Thing__Group__1 ;
    public final void rule__Thing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:740:1: ( rule__Thing__Group__0__Impl rule__Thing__Group__1 )
            // InternalIotlang.g:741:2: rule__Thing__Group__0__Impl rule__Thing__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Thing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__0"


    // $ANTLR start "rule__Thing__Group__0__Impl"
    // InternalIotlang.g:748:1: rule__Thing__Group__0__Impl : ( 'thing' ) ;
    public final void rule__Thing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:752:1: ( ( 'thing' ) )
            // InternalIotlang.g:753:1: ( 'thing' )
            {
            // InternalIotlang.g:753:1: ( 'thing' )
            // InternalIotlang.g:754:2: 'thing'
            {
             before(grammarAccess.getThingAccess().getThingKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getThingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__0__Impl"


    // $ANTLR start "rule__Thing__Group__1"
    // InternalIotlang.g:763:1: rule__Thing__Group__1 : rule__Thing__Group__1__Impl rule__Thing__Group__2 ;
    public final void rule__Thing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:767:1: ( rule__Thing__Group__1__Impl rule__Thing__Group__2 )
            // InternalIotlang.g:768:2: rule__Thing__Group__1__Impl rule__Thing__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Thing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__1"


    // $ANTLR start "rule__Thing__Group__1__Impl"
    // InternalIotlang.g:775:1: rule__Thing__Group__1__Impl : ( ( rule__Thing__NameAssignment_1 ) ) ;
    public final void rule__Thing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:779:1: ( ( ( rule__Thing__NameAssignment_1 ) ) )
            // InternalIotlang.g:780:1: ( ( rule__Thing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:780:1: ( ( rule__Thing__NameAssignment_1 ) )
            // InternalIotlang.g:781:2: ( rule__Thing__NameAssignment_1 )
            {
             before(grammarAccess.getThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:782:2: ( rule__Thing__NameAssignment_1 )
            // InternalIotlang.g:782:3: rule__Thing__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Thing__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__1__Impl"


    // $ANTLR start "rule__Thing__Group__2"
    // InternalIotlang.g:790:1: rule__Thing__Group__2 : rule__Thing__Group__2__Impl rule__Thing__Group__3 ;
    public final void rule__Thing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:794:1: ( rule__Thing__Group__2__Impl rule__Thing__Group__3 )
            // InternalIotlang.g:795:2: rule__Thing__Group__2__Impl rule__Thing__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Thing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__2"


    // $ANTLR start "rule__Thing__Group__2__Impl"
    // InternalIotlang.g:802:1: rule__Thing__Group__2__Impl : ( ( rule__Thing__AnnotationsAssignment_2 )* ) ;
    public final void rule__Thing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:806:1: ( ( ( rule__Thing__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:807:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:807:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:808:2: ( rule__Thing__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:809:2: ( rule__Thing__AnnotationsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ANNOTATION_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIotlang.g:809:3: rule__Thing__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Thing__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__2__Impl"


    // $ANTLR start "rule__Thing__Group__3"
    // InternalIotlang.g:817:1: rule__Thing__Group__3 : rule__Thing__Group__3__Impl rule__Thing__Group__4 ;
    public final void rule__Thing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:821:1: ( rule__Thing__Group__3__Impl rule__Thing__Group__4 )
            // InternalIotlang.g:822:2: rule__Thing__Group__3__Impl rule__Thing__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Thing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__3"


    // $ANTLR start "rule__Thing__Group__3__Impl"
    // InternalIotlang.g:829:1: rule__Thing__Group__3__Impl : ( '{' ) ;
    public final void rule__Thing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:833:1: ( ( '{' ) )
            // InternalIotlang.g:834:1: ( '{' )
            {
            // InternalIotlang.g:834:1: ( '{' )
            // InternalIotlang.g:835:2: '{'
            {
             before(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__3__Impl"


    // $ANTLR start "rule__Thing__Group__4"
    // InternalIotlang.g:844:1: rule__Thing__Group__4 : rule__Thing__Group__4__Impl rule__Thing__Group__5 ;
    public final void rule__Thing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:848:1: ( rule__Thing__Group__4__Impl rule__Thing__Group__5 )
            // InternalIotlang.g:849:2: rule__Thing__Group__4__Impl rule__Thing__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Thing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__4"


    // $ANTLR start "rule__Thing__Group__4__Impl"
    // InternalIotlang.g:856:1: rule__Thing__Group__4__Impl : ( ( rule__Thing__PortsAssignment_4 ) ) ;
    public final void rule__Thing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:860:1: ( ( ( rule__Thing__PortsAssignment_4 ) ) )
            // InternalIotlang.g:861:1: ( ( rule__Thing__PortsAssignment_4 ) )
            {
            // InternalIotlang.g:861:1: ( ( rule__Thing__PortsAssignment_4 ) )
            // InternalIotlang.g:862:2: ( rule__Thing__PortsAssignment_4 )
            {
             before(grammarAccess.getThingAccess().getPortsAssignment_4()); 
            // InternalIotlang.g:863:2: ( rule__Thing__PortsAssignment_4 )
            // InternalIotlang.g:863:3: rule__Thing__PortsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Thing__PortsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getThingAccess().getPortsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__4__Impl"


    // $ANTLR start "rule__Thing__Group__5"
    // InternalIotlang.g:871:1: rule__Thing__Group__5 : rule__Thing__Group__5__Impl ;
    public final void rule__Thing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:875:1: ( rule__Thing__Group__5__Impl )
            // InternalIotlang.g:876:2: rule__Thing__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Thing__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__5"


    // $ANTLR start "rule__Thing__Group__5__Impl"
    // InternalIotlang.g:882:1: rule__Thing__Group__5__Impl : ( '}' ) ;
    public final void rule__Thing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:886:1: ( ( '}' ) )
            // InternalIotlang.g:887:1: ( '}' )
            {
            // InternalIotlang.g:887:1: ( '}' )
            // InternalIotlang.g:888:2: '}'
            {
             before(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__5__Impl"


    // $ANTLR start "rule__PubSub__Group__0"
    // InternalIotlang.g:898:1: rule__PubSub__Group__0 : rule__PubSub__Group__0__Impl rule__PubSub__Group__1 ;
    public final void rule__PubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:902:1: ( rule__PubSub__Group__0__Impl rule__PubSub__Group__1 )
            // InternalIotlang.g:903:2: rule__PubSub__Group__0__Impl rule__PubSub__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PubSub__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__0"


    // $ANTLR start "rule__PubSub__Group__0__Impl"
    // InternalIotlang.g:910:1: rule__PubSub__Group__0__Impl : ( 'channel:pubsub' ) ;
    public final void rule__PubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:914:1: ( ( 'channel:pubsub' ) )
            // InternalIotlang.g:915:1: ( 'channel:pubsub' )
            {
            // InternalIotlang.g:915:1: ( 'channel:pubsub' )
            // InternalIotlang.g:916:2: 'channel:pubsub'
            {
             before(grammarAccess.getPubSubAccess().getChannelPubsubKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getChannelPubsubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__0__Impl"


    // $ANTLR start "rule__PubSub__Group__1"
    // InternalIotlang.g:925:1: rule__PubSub__Group__1 : rule__PubSub__Group__1__Impl rule__PubSub__Group__2 ;
    public final void rule__PubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:929:1: ( rule__PubSub__Group__1__Impl rule__PubSub__Group__2 )
            // InternalIotlang.g:930:2: rule__PubSub__Group__1__Impl rule__PubSub__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PubSub__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__1"


    // $ANTLR start "rule__PubSub__Group__1__Impl"
    // InternalIotlang.g:937:1: rule__PubSub__Group__1__Impl : ( ( rule__PubSub__NameAssignment_1 ) ) ;
    public final void rule__PubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:941:1: ( ( ( rule__PubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:942:1: ( ( rule__PubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:942:1: ( ( rule__PubSub__NameAssignment_1 ) )
            // InternalIotlang.g:943:2: ( rule__PubSub__NameAssignment_1 )
            {
             before(grammarAccess.getPubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:944:2: ( rule__PubSub__NameAssignment_1 )
            // InternalIotlang.g:944:3: rule__PubSub__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PubSub__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPubSubAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__1__Impl"


    // $ANTLR start "rule__PubSub__Group__2"
    // InternalIotlang.g:952:1: rule__PubSub__Group__2 : rule__PubSub__Group__2__Impl rule__PubSub__Group__3 ;
    public final void rule__PubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:956:1: ( rule__PubSub__Group__2__Impl rule__PubSub__Group__3 )
            // InternalIotlang.g:957:2: rule__PubSub__Group__2__Impl rule__PubSub__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__PubSub__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__2"


    // $ANTLR start "rule__PubSub__Group__2__Impl"
    // InternalIotlang.g:964:1: rule__PubSub__Group__2__Impl : ( '{' ) ;
    public final void rule__PubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:968:1: ( ( '{' ) )
            // InternalIotlang.g:969:1: ( '{' )
            {
            // InternalIotlang.g:969:1: ( '{' )
            // InternalIotlang.g:970:2: '{'
            {
             before(grammarAccess.getPubSubAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__2__Impl"


    // $ANTLR start "rule__PubSub__Group__3"
    // InternalIotlang.g:979:1: rule__PubSub__Group__3 : rule__PubSub__Group__3__Impl rule__PubSub__Group__4 ;
    public final void rule__PubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:983:1: ( rule__PubSub__Group__3__Impl rule__PubSub__Group__4 )
            // InternalIotlang.g:984:2: rule__PubSub__Group__3__Impl rule__PubSub__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__PubSub__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__3"


    // $ANTLR start "rule__PubSub__Group__3__Impl"
    // InternalIotlang.g:991:1: rule__PubSub__Group__3__Impl : ( ( rule__PubSub__HasTopicsAssignment_3 )* ) ;
    public final void rule__PubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:995:1: ( ( ( rule__PubSub__HasTopicsAssignment_3 )* ) )
            // InternalIotlang.g:996:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            {
            // InternalIotlang.g:996:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            // InternalIotlang.g:997:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 
            // InternalIotlang.g:998:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIotlang.g:998:3: rule__PubSub__HasTopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PubSub__HasTopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__3__Impl"


    // $ANTLR start "rule__PubSub__Group__4"
    // InternalIotlang.g:1006:1: rule__PubSub__Group__4 : rule__PubSub__Group__4__Impl ;
    public final void rule__PubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1010:1: ( rule__PubSub__Group__4__Impl )
            // InternalIotlang.g:1011:2: rule__PubSub__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PubSub__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__4"


    // $ANTLR start "rule__PubSub__Group__4__Impl"
    // InternalIotlang.g:1017:1: rule__PubSub__Group__4__Impl : ( '}' ) ;
    public final void rule__PubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1021:1: ( ( '}' ) )
            // InternalIotlang.g:1022:1: ( '}' )
            {
            // InternalIotlang.g:1022:1: ( '}' )
            // InternalIotlang.g:1023:2: '}'
            {
             before(grammarAccess.getPubSubAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__4__Impl"


    // $ANTLR start "rule__PointToPoint__Group__0"
    // InternalIotlang.g:1033:1: rule__PointToPoint__Group__0 : rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 ;
    public final void rule__PointToPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1037:1: ( rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 )
            // InternalIotlang.g:1038:2: rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PointToPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__0"


    // $ANTLR start "rule__PointToPoint__Group__0__Impl"
    // InternalIotlang.g:1045:1: rule__PointToPoint__Group__0__Impl : ( 'channel:ptp' ) ;
    public final void rule__PointToPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1049:1: ( ( 'channel:ptp' ) )
            // InternalIotlang.g:1050:1: ( 'channel:ptp' )
            {
            // InternalIotlang.g:1050:1: ( 'channel:ptp' )
            // InternalIotlang.g:1051:2: 'channel:ptp'
            {
             before(grammarAccess.getPointToPointAccess().getChannelPtpKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getChannelPtpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__0__Impl"


    // $ANTLR start "rule__PointToPoint__Group__1"
    // InternalIotlang.g:1060:1: rule__PointToPoint__Group__1 : rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 ;
    public final void rule__PointToPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1064:1: ( rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 )
            // InternalIotlang.g:1065:2: rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PointToPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__1"


    // $ANTLR start "rule__PointToPoint__Group__1__Impl"
    // InternalIotlang.g:1072:1: rule__PointToPoint__Group__1__Impl : ( ( rule__PointToPoint__NameAssignment_1 ) ) ;
    public final void rule__PointToPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1076:1: ( ( ( rule__PointToPoint__NameAssignment_1 ) ) )
            // InternalIotlang.g:1077:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1077:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            // InternalIotlang.g:1078:2: ( rule__PointToPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1079:2: ( rule__PointToPoint__NameAssignment_1 )
            // InternalIotlang.g:1079:3: rule__PointToPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__1__Impl"


    // $ANTLR start "rule__PointToPoint__Group__2"
    // InternalIotlang.g:1087:1: rule__PointToPoint__Group__2 : rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 ;
    public final void rule__PointToPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1091:1: ( rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 )
            // InternalIotlang.g:1092:2: rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PointToPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__2"


    // $ANTLR start "rule__PointToPoint__Group__2__Impl"
    // InternalIotlang.g:1099:1: rule__PointToPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PointToPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1103:1: ( ( '{' ) )
            // InternalIotlang.g:1104:1: ( '{' )
            {
            // InternalIotlang.g:1104:1: ( '{' )
            // InternalIotlang.g:1105:2: '{'
            {
             before(grammarAccess.getPointToPointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__2__Impl"


    // $ANTLR start "rule__PointToPoint__Group__3"
    // InternalIotlang.g:1114:1: rule__PointToPoint__Group__3 : rule__PointToPoint__Group__3__Impl ;
    public final void rule__PointToPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1118:1: ( rule__PointToPoint__Group__3__Impl )
            // InternalIotlang.g:1119:2: rule__PointToPoint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__3"


    // $ANTLR start "rule__PointToPoint__Group__3__Impl"
    // InternalIotlang.g:1125:1: rule__PointToPoint__Group__3__Impl : ( '}' ) ;
    public final void rule__PointToPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1129:1: ( ( '}' ) )
            // InternalIotlang.g:1130:1: ( '}' )
            {
            // InternalIotlang.g:1130:1: ( '}' )
            // InternalIotlang.g:1131:2: '}'
            {
             before(grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalIotlang.g:1141:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1145:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalIotlang.g:1146:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalIotlang.g:1153:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1157:1: ( ( 'policy' ) )
            // InternalIotlang.g:1158:1: ( 'policy' )
            {
            // InternalIotlang.g:1158:1: ( 'policy' )
            // InternalIotlang.g:1159:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalIotlang.g:1168:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1172:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalIotlang.g:1173:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalIotlang.g:1180:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1184:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalIotlang.g:1185:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1185:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalIotlang.g:1186:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1187:2: ( rule__Policy__NameAssignment_1 )
            // InternalIotlang.g:1187:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalIotlang.g:1195:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1199:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalIotlang.g:1200:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalIotlang.g:1207:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1211:1: ( ( '{' ) )
            // InternalIotlang.g:1212:1: ( '{' )
            {
            // InternalIotlang.g:1212:1: ( '{' )
            // InternalIotlang.g:1213:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalIotlang.g:1222:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1226:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalIotlang.g:1227:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalIotlang.g:1234:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__HasRulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1238:1: ( ( ( rule__Policy__HasRulesAssignment_3 )* ) )
            // InternalIotlang.g:1239:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            {
            // InternalIotlang.g:1239:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            // InternalIotlang.g:1240:2: ( rule__Policy__HasRulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 
            // InternalIotlang.g:1241:2: ( rule__Policy__HasRulesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:1241:3: rule__Policy__HasRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Policy__HasRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalIotlang.g:1249:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1253:1: ( rule__Policy__Group__4__Impl )
            // InternalIotlang.g:1254:2: rule__Policy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalIotlang.g:1260:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1264:1: ( ( '}' ) )
            // InternalIotlang.g:1265:1: ( '}' )
            {
            // InternalIotlang.g:1265:1: ( '}' )
            // InternalIotlang.g:1266:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalIotlang.g:1276:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1280:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalIotlang.g:1281:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalIotlang.g:1288:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1292:1: ( ( 'port' ) )
            // InternalIotlang.g:1293:1: ( 'port' )
            {
            // InternalIotlang.g:1293:1: ( 'port' )
            // InternalIotlang.g:1294:2: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalIotlang.g:1303:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1307:1: ( rule__Port__Group__1__Impl )
            // InternalIotlang.g:1308:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalIotlang.g:1314:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1318:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalIotlang.g:1319:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1319:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalIotlang.g:1320:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1321:2: ( rule__Port__NameAssignment_1 )
            // InternalIotlang.g:1321:3: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalIotlang.g:1330:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1334:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalIotlang.g:1335:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalIotlang.g:1342:1: rule__Protocol__Group__0__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1346:1: ( ( 'protocol' ) )
            // InternalIotlang.g:1347:1: ( 'protocol' )
            {
            // InternalIotlang.g:1347:1: ( 'protocol' )
            // InternalIotlang.g:1348:2: 'protocol'
            {
             before(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalIotlang.g:1357:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1361:1: ( rule__Protocol__Group__1__Impl )
            // InternalIotlang.g:1362:2: rule__Protocol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalIotlang.g:1368:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1372:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // InternalIotlang.g:1373:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1373:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // InternalIotlang.g:1374:2: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1375:2: ( rule__Protocol__NameAssignment_1 )
            // InternalIotlang.g:1375:3: rule__Protocol__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalIotlang.g:1384:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1388:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalIotlang.g:1389:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalIotlang.g:1396:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1400:1: ( ( 'message' ) )
            // InternalIotlang.g:1401:1: ( 'message' )
            {
            // InternalIotlang.g:1401:1: ( 'message' )
            // InternalIotlang.g:1402:2: 'message'
            {
             before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalIotlang.g:1411:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1415:1: ( rule__Message__Group__1__Impl )
            // InternalIotlang.g:1416:2: rule__Message__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalIotlang.g:1422:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1426:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalIotlang.g:1427:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1427:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalIotlang.g:1428:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1429:2: ( rule__Message__NameAssignment_1 )
            // InternalIotlang.g:1429:3: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Topic__Group__0"
    // InternalIotlang.g:1438:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1442:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalIotlang.g:1443:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0"


    // $ANTLR start "rule__Topic__Group__0__Impl"
    // InternalIotlang.g:1450:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1454:1: ( ( 'topic' ) )
            // InternalIotlang.g:1455:1: ( 'topic' )
            {
            // InternalIotlang.g:1455:1: ( 'topic' )
            // InternalIotlang.g:1456:2: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTopicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0__Impl"


    // $ANTLR start "rule__Topic__Group__1"
    // InternalIotlang.g:1465:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1469:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalIotlang.g:1470:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1"


    // $ANTLR start "rule__Topic__Group__1__Impl"
    // InternalIotlang.g:1477:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1481:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalIotlang.g:1482:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1482:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalIotlang.g:1483:2: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1484:2: ( rule__Topic__NameAssignment_1 )
            // InternalIotlang.g:1484:3: rule__Topic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Topic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1__Impl"


    // $ANTLR start "rule__Topic__Group__2"
    // InternalIotlang.g:1492:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1496:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalIotlang.g:1497:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2"


    // $ANTLR start "rule__Topic__Group__2__Impl"
    // InternalIotlang.g:1504:1: rule__Topic__Group__2__Impl : ( '(' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1508:1: ( ( '(' ) )
            // InternalIotlang.g:1509:1: ( '(' )
            {
            // InternalIotlang.g:1509:1: ( '(' )
            // InternalIotlang.g:1510:2: '('
            {
             before(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2__Impl"


    // $ANTLR start "rule__Topic__Group__3"
    // InternalIotlang.g:1519:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1523:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalIotlang.g:1524:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3"


    // $ANTLR start "rule__Topic__Group__3__Impl"
    // InternalIotlang.g:1531:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1535:1: ( ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) )
            // InternalIotlang.g:1536:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            {
            // InternalIotlang.g:1536:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            // InternalIotlang.g:1537:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 
            // InternalIotlang.g:1538:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            // InternalIotlang.g:1538:3: rule__Topic__AcceptedMessagesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Topic__AcceptedMessagesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3__Impl"


    // $ANTLR start "rule__Topic__Group__4"
    // InternalIotlang.g:1546:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1550:1: ( rule__Topic__Group__4__Impl )
            // InternalIotlang.g:1551:2: rule__Topic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4"


    // $ANTLR start "rule__Topic__Group__4__Impl"
    // InternalIotlang.g:1557:1: rule__Topic__Group__4__Impl : ( ')' ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1561:1: ( ( ')' ) )
            // InternalIotlang.g:1562:1: ( ')' )
            {
            // InternalIotlang.g:1562:1: ( ')' )
            // InternalIotlang.g:1563:2: ')'
            {
             before(grammarAccess.getTopicAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalIotlang.g:1573:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1577:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIotlang.g:1578:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalIotlang.g:1585:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1589:1: ( ( 'rule' ) )
            // InternalIotlang.g:1590:1: ( 'rule' )
            {
            // InternalIotlang.g:1590:1: ( 'rule' )
            // InternalIotlang.g:1591:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalIotlang.g:1600:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1604:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIotlang.g:1605:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalIotlang.g:1612:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1616:1: ( ( ( rule__Rule__NameAssignment_1 )? ) )
            // InternalIotlang.g:1617:1: ( ( rule__Rule__NameAssignment_1 )? )
            {
            // InternalIotlang.g:1617:1: ( ( rule__Rule__NameAssignment_1 )? )
            // InternalIotlang.g:1618:2: ( rule__Rule__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1619:2: ( rule__Rule__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalIotlang.g:1619:3: rule__Rule__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalIotlang.g:1627:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1631:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIotlang.g:1632:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalIotlang.g:1639:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__SubjectAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1643:1: ( ( ( rule__Rule__SubjectAssignment_2 ) ) )
            // InternalIotlang.g:1644:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            {
            // InternalIotlang.g:1644:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            // InternalIotlang.g:1645:2: ( rule__Rule__SubjectAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 
            // InternalIotlang.g:1646:2: ( rule__Rule__SubjectAssignment_2 )
            // InternalIotlang.g:1646:3: rule__Rule__SubjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SubjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalIotlang.g:1654:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1658:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIotlang.g:1659:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalIotlang.g:1666:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PermissionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1670:1: ( ( ( rule__Rule__PermissionAssignment_3 ) ) )
            // InternalIotlang.g:1671:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            {
            // InternalIotlang.g:1671:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            // InternalIotlang.g:1672:2: ( rule__Rule__PermissionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 
            // InternalIotlang.g:1673:2: ( rule__Rule__PermissionAssignment_3 )
            // InternalIotlang.g:1673:3: rule__Rule__PermissionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PermissionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalIotlang.g:1681:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1685:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIotlang.g:1686:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalIotlang.g:1693:1: rule__Rule__Group__4__Impl : ( ':' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1697:1: ( ( ':' ) )
            // InternalIotlang.g:1698:1: ( ':' )
            {
            // InternalIotlang.g:1698:1: ( ':' )
            // InternalIotlang.g:1699:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalIotlang.g:1708:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1712:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIotlang.g:1713:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalIotlang.g:1720:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1724:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalIotlang.g:1725:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalIotlang.g:1725:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalIotlang.g:1726:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalIotlang.g:1727:2: ( rule__Rule__ActionAssignment_5 )
            // InternalIotlang.g:1727:3: rule__Rule__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalIotlang.g:1735:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1739:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalIotlang.g:1740:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalIotlang.g:1747:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ObjectAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1751:1: ( ( ( rule__Rule__ObjectAssignment_6 ) ) )
            // InternalIotlang.g:1752:1: ( ( rule__Rule__ObjectAssignment_6 ) )
            {
            // InternalIotlang.g:1752:1: ( ( rule__Rule__ObjectAssignment_6 ) )
            // InternalIotlang.g:1753:2: ( rule__Rule__ObjectAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getObjectAssignment_6()); 
            // InternalIotlang.g:1754:2: ( rule__Rule__ObjectAssignment_6 )
            // InternalIotlang.g:1754:3: rule__Rule__ObjectAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalIotlang.g:1762:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1766:1: ( rule__Rule__Group__7__Impl )
            // InternalIotlang.g:1767:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalIotlang.g:1773:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )* ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1777:1: ( ( ( rule__Rule__Group_7__0 )* ) )
            // InternalIotlang.g:1778:1: ( ( rule__Rule__Group_7__0 )* )
            {
            // InternalIotlang.g:1778:1: ( ( rule__Rule__Group_7__0 )* )
            // InternalIotlang.g:1779:2: ( rule__Rule__Group_7__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_7()); 
            // InternalIotlang.g:1780:2: ( rule__Rule__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:1780:3: rule__Rule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Rule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_7__0"
    // InternalIotlang.g:1789:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1793:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalIotlang.g:1794:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0"


    // $ANTLR start "rule__Rule__Group_7__0__Impl"
    // InternalIotlang.g:1801:1: rule__Rule__Group_7__0__Impl : ( '.' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1805:1: ( ( '.' ) )
            // InternalIotlang.g:1806:1: ( '.' )
            {
            // InternalIotlang.g:1806:1: ( '.' )
            // InternalIotlang.g:1807:2: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0__Impl"


    // $ANTLR start "rule__Rule__Group_7__1"
    // InternalIotlang.g:1816:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1820:1: ( rule__Rule__Group_7__1__Impl )
            // InternalIotlang.g:1821:2: rule__Rule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1"


    // $ANTLR start "rule__Rule__Group_7__1__Impl"
    // InternalIotlang.g:1827:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__PortsAssignment_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1831:1: ( ( ( rule__Rule__PortsAssignment_7_1 ) ) )
            // InternalIotlang.g:1832:1: ( ( rule__Rule__PortsAssignment_7_1 ) )
            {
            // InternalIotlang.g:1832:1: ( ( rule__Rule__PortsAssignment_7_1 ) )
            // InternalIotlang.g:1833:2: ( rule__Rule__PortsAssignment_7_1 )
            {
             before(grammarAccess.getRuleAccess().getPortsAssignment_7_1()); 
            // InternalIotlang.g:1834:2: ( rule__Rule__PortsAssignment_7_1 )
            // InternalIotlang.g:1834:3: rule__Rule__PortsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PortsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPortsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalIotlang.g:1843:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1847:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalIotlang.g:1848:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalIotlang.g:1855:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1859:1: ( ( 'domain' ) )
            // InternalIotlang.g:1860:1: ( 'domain' )
            {
            // InternalIotlang.g:1860:1: ( 'domain' )
            // InternalIotlang.g:1861:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalIotlang.g:1870:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1874:1: ( rule__Domain__Group__1__Impl )
            // InternalIotlang.g:1875:2: rule__Domain__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalIotlang.g:1881:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1885:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalIotlang.g:1886:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1886:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalIotlang.g:1887:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1888:2: ( rule__Domain__NameAssignment_1 )
            // InternalIotlang.g:1888:3: rule__Domain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__InstanceThing__Group__0"
    // InternalIotlang.g:1897:1: rule__InstanceThing__Group__0 : rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 ;
    public final void rule__InstanceThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1901:1: ( rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 )
            // InternalIotlang.g:1902:2: rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstanceThing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__0"


    // $ANTLR start "rule__InstanceThing__Group__0__Impl"
    // InternalIotlang.g:1909:1: rule__InstanceThing__Group__0__Impl : ( 'instanceThing' ) ;
    public final void rule__InstanceThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1913:1: ( ( 'instanceThing' ) )
            // InternalIotlang.g:1914:1: ( 'instanceThing' )
            {
            // InternalIotlang.g:1914:1: ( 'instanceThing' )
            // InternalIotlang.g:1915:2: 'instanceThing'
            {
             before(grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__0__Impl"


    // $ANTLR start "rule__InstanceThing__Group__1"
    // InternalIotlang.g:1924:1: rule__InstanceThing__Group__1 : rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 ;
    public final void rule__InstanceThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1928:1: ( rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 )
            // InternalIotlang.g:1929:2: rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__InstanceThing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__1"


    // $ANTLR start "rule__InstanceThing__Group__1__Impl"
    // InternalIotlang.g:1936:1: rule__InstanceThing__Group__1__Impl : ( ( rule__InstanceThing__NameAssignment_1 ) ) ;
    public final void rule__InstanceThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1940:1: ( ( ( rule__InstanceThing__NameAssignment_1 ) ) )
            // InternalIotlang.g:1941:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1941:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            // InternalIotlang.g:1942:2: ( rule__InstanceThing__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1943:2: ( rule__InstanceThing__NameAssignment_1 )
            // InternalIotlang.g:1943:3: rule__InstanceThing__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__1__Impl"


    // $ANTLR start "rule__InstanceThing__Group__2"
    // InternalIotlang.g:1951:1: rule__InstanceThing__Group__2 : rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 ;
    public final void rule__InstanceThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1955:1: ( rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 )
            // InternalIotlang.g:1956:2: rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__InstanceThing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__2"


    // $ANTLR start "rule__InstanceThing__Group__2__Impl"
    // InternalIotlang.g:1963:1: rule__InstanceThing__Group__2__Impl : ( ( rule__InstanceThing__Group_2__0 )* ) ;
    public final void rule__InstanceThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1967:1: ( ( ( rule__InstanceThing__Group_2__0 )* ) )
            // InternalIotlang.g:1968:1: ( ( rule__InstanceThing__Group_2__0 )* )
            {
            // InternalIotlang.g:1968:1: ( ( rule__InstanceThing__Group_2__0 )* )
            // InternalIotlang.g:1969:2: ( rule__InstanceThing__Group_2__0 )*
            {
             before(grammarAccess.getInstanceThingAccess().getGroup_2()); 
            // InternalIotlang.g:1970:2: ( rule__InstanceThing__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1970:3: rule__InstanceThing__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__InstanceThing__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInstanceThingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__2__Impl"


    // $ANTLR start "rule__InstanceThing__Group__3"
    // InternalIotlang.g:1978:1: rule__InstanceThing__Group__3 : rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 ;
    public final void rule__InstanceThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1982:1: ( rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 )
            // InternalIotlang.g:1983:2: rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstanceThing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__3"


    // $ANTLR start "rule__InstanceThing__Group__3__Impl"
    // InternalIotlang.g:1990:1: rule__InstanceThing__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1994:1: ( ( ':' ) )
            // InternalIotlang.g:1995:1: ( ':' )
            {
            // InternalIotlang.g:1995:1: ( ':' )
            // InternalIotlang.g:1996:2: ':'
            {
             before(grammarAccess.getInstanceThingAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__3__Impl"


    // $ANTLR start "rule__InstanceThing__Group__4"
    // InternalIotlang.g:2005:1: rule__InstanceThing__Group__4 : rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 ;
    public final void rule__InstanceThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2009:1: ( rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 )
            // InternalIotlang.g:2010:2: rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__InstanceThing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__4"


    // $ANTLR start "rule__InstanceThing__Group__4__Impl"
    // InternalIotlang.g:2017:1: rule__InstanceThing__Group__4__Impl : ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) ;
    public final void rule__InstanceThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2021:1: ( ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) )
            // InternalIotlang.g:2022:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            {
            // InternalIotlang.g:2022:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            // InternalIotlang.g:2023:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 
            // InternalIotlang.g:2024:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            // InternalIotlang.g:2024:3: rule__InstanceThing__TypeThingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__TypeThingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__4__Impl"


    // $ANTLR start "rule__InstanceThing__Group__5"
    // InternalIotlang.g:2032:1: rule__InstanceThing__Group__5 : rule__InstanceThing__Group__5__Impl ;
    public final void rule__InstanceThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2036:1: ( rule__InstanceThing__Group__5__Impl )
            // InternalIotlang.g:2037:2: rule__InstanceThing__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__5"


    // $ANTLR start "rule__InstanceThing__Group__5__Impl"
    // InternalIotlang.g:2043:1: rule__InstanceThing__Group__5__Impl : ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) ;
    public final void rule__InstanceThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2047:1: ( ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:2048:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:2048:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:2049:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:2050:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANNOTATION_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:2050:3: rule__InstanceThing__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceThing__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__5__Impl"


    // $ANTLR start "rule__InstanceThing__Group_2__0"
    // InternalIotlang.g:2059:1: rule__InstanceThing__Group_2__0 : rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 ;
    public final void rule__InstanceThing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2063:1: ( rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 )
            // InternalIotlang.g:2064:2: rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__InstanceThing__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__0"


    // $ANTLR start "rule__InstanceThing__Group_2__0__Impl"
    // InternalIotlang.g:2071:1: rule__InstanceThing__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceThing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2075:1: ( ( '[' ) )
            // InternalIotlang.g:2076:1: ( '[' )
            {
            // InternalIotlang.g:2076:1: ( '[' )
            // InternalIotlang.g:2077:2: '['
            {
             before(grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__0__Impl"


    // $ANTLR start "rule__InstanceThing__Group_2__1"
    // InternalIotlang.g:2086:1: rule__InstanceThing__Group_2__1 : rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 ;
    public final void rule__InstanceThing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2090:1: ( rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 )
            // InternalIotlang.g:2091:2: rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__InstanceThing__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__1"


    // $ANTLR start "rule__InstanceThing__Group_2__1__Impl"
    // InternalIotlang.g:2098:1: rule__InstanceThing__Group_2__1__Impl : ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceThing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2102:1: ( ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2103:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2103:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2104:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2105:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            // InternalIotlang.g:2105:3: rule__InstanceThing__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__1__Impl"


    // $ANTLR start "rule__InstanceThing__Group_2__2"
    // InternalIotlang.g:2113:1: rule__InstanceThing__Group_2__2 : rule__InstanceThing__Group_2__2__Impl ;
    public final void rule__InstanceThing__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2117:1: ( rule__InstanceThing__Group_2__2__Impl )
            // InternalIotlang.g:2118:2: rule__InstanceThing__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__2"


    // $ANTLR start "rule__InstanceThing__Group_2__2__Impl"
    // InternalIotlang.g:2124:1: rule__InstanceThing__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceThing__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2128:1: ( ( ']' ) )
            // InternalIotlang.g:2129:1: ( ']' )
            {
            // InternalIotlang.g:2129:1: ( ']' )
            // InternalIotlang.g:2130:2: ']'
            {
             before(grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__2__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__0"
    // InternalIotlang.g:2140:1: rule__InstanceChannel__Group__0 : rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1 ;
    public final void rule__InstanceChannel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2144:1: ( rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1 )
            // InternalIotlang.g:2145:2: rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstanceChannel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__0"


    // $ANTLR start "rule__InstanceChannel__Group__0__Impl"
    // InternalIotlang.g:2152:1: rule__InstanceChannel__Group__0__Impl : ( 'instanceChannel' ) ;
    public final void rule__InstanceChannel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2156:1: ( ( 'instanceChannel' ) )
            // InternalIotlang.g:2157:1: ( 'instanceChannel' )
            {
            // InternalIotlang.g:2157:1: ( 'instanceChannel' )
            // InternalIotlang.g:2158:2: 'instanceChannel'
            {
             before(grammarAccess.getInstanceChannelAccess().getInstanceChannelKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getInstanceChannelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__0__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__1"
    // InternalIotlang.g:2167:1: rule__InstanceChannel__Group__1 : rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2 ;
    public final void rule__InstanceChannel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2171:1: ( rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2 )
            // InternalIotlang.g:2172:2: rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__InstanceChannel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__1"


    // $ANTLR start "rule__InstanceChannel__Group__1__Impl"
    // InternalIotlang.g:2179:1: rule__InstanceChannel__Group__1__Impl : ( ( rule__InstanceChannel__NameAssignment_1 ) ) ;
    public final void rule__InstanceChannel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2183:1: ( ( ( rule__InstanceChannel__NameAssignment_1 ) ) )
            // InternalIotlang.g:2184:1: ( ( rule__InstanceChannel__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2184:1: ( ( rule__InstanceChannel__NameAssignment_1 ) )
            // InternalIotlang.g:2185:2: ( rule__InstanceChannel__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceChannelAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2186:2: ( rule__InstanceChannel__NameAssignment_1 )
            // InternalIotlang.g:2186:3: rule__InstanceChannel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__1__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__2"
    // InternalIotlang.g:2194:1: rule__InstanceChannel__Group__2 : rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3 ;
    public final void rule__InstanceChannel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2198:1: ( rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3 )
            // InternalIotlang.g:2199:2: rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__InstanceChannel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__2"


    // $ANTLR start "rule__InstanceChannel__Group__2__Impl"
    // InternalIotlang.g:2206:1: rule__InstanceChannel__Group__2__Impl : ( ( rule__InstanceChannel__Group_2__0 )* ) ;
    public final void rule__InstanceChannel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2210:1: ( ( ( rule__InstanceChannel__Group_2__0 )* ) )
            // InternalIotlang.g:2211:1: ( ( rule__InstanceChannel__Group_2__0 )* )
            {
            // InternalIotlang.g:2211:1: ( ( rule__InstanceChannel__Group_2__0 )* )
            // InternalIotlang.g:2212:2: ( rule__InstanceChannel__Group_2__0 )*
            {
             before(grammarAccess.getInstanceChannelAccess().getGroup_2()); 
            // InternalIotlang.g:2213:2: ( rule__InstanceChannel__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:2213:3: rule__InstanceChannel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__InstanceChannel__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInstanceChannelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__2__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__3"
    // InternalIotlang.g:2221:1: rule__InstanceChannel__Group__3 : rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4 ;
    public final void rule__InstanceChannel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2225:1: ( rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4 )
            // InternalIotlang.g:2226:2: rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstanceChannel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__3"


    // $ANTLR start "rule__InstanceChannel__Group__3__Impl"
    // InternalIotlang.g:2233:1: rule__InstanceChannel__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceChannel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2237:1: ( ( ':' ) )
            // InternalIotlang.g:2238:1: ( ':' )
            {
            // InternalIotlang.g:2238:1: ( ':' )
            // InternalIotlang.g:2239:2: ':'
            {
             before(grammarAccess.getInstanceChannelAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__3__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__4"
    // InternalIotlang.g:2248:1: rule__InstanceChannel__Group__4 : rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5 ;
    public final void rule__InstanceChannel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2252:1: ( rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5 )
            // InternalIotlang.g:2253:2: rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__InstanceChannel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__4"


    // $ANTLR start "rule__InstanceChannel__Group__4__Impl"
    // InternalIotlang.g:2260:1: rule__InstanceChannel__Group__4__Impl : ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstanceChannel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2264:1: ( ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2265:1: ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2265:1: ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2266:2: ( rule__InstanceChannel__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2267:2: ( rule__InstanceChannel__TypeChannelAssignment_4 )
            // InternalIotlang.g:2267:3: rule__InstanceChannel__TypeChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__TypeChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getTypeChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__4__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__5"
    // InternalIotlang.g:2275:1: rule__InstanceChannel__Group__5 : rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6 ;
    public final void rule__InstanceChannel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2279:1: ( rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6 )
            // InternalIotlang.g:2280:2: rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__InstanceChannel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__5"


    // $ANTLR start "rule__InstanceChannel__Group__5__Impl"
    // InternalIotlang.g:2287:1: rule__InstanceChannel__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstanceChannel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2291:1: ( ( 'over' ) )
            // InternalIotlang.g:2292:1: ( 'over' )
            {
            // InternalIotlang.g:2292:1: ( 'over' )
            // InternalIotlang.g:2293:2: 'over'
            {
             before(grammarAccess.getInstanceChannelAccess().getOverKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getOverKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__5__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__6"
    // InternalIotlang.g:2302:1: rule__InstanceChannel__Group__6 : rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7 ;
    public final void rule__InstanceChannel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2306:1: ( rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7 )
            // InternalIotlang.g:2307:2: rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__InstanceChannel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__6"


    // $ANTLR start "rule__InstanceChannel__Group__6__Impl"
    // InternalIotlang.g:2314:1: rule__InstanceChannel__Group__6__Impl : ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstanceChannel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2318:1: ( ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2319:1: ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2319:1: ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2320:2: ( rule__InstanceChannel__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2321:2: ( rule__InstanceChannel__OverProtocolAssignment_6 )
            // InternalIotlang.g:2321:3: rule__InstanceChannel__OverProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__OverProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getOverProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__6__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__7"
    // InternalIotlang.g:2329:1: rule__InstanceChannel__Group__7 : rule__InstanceChannel__Group__7__Impl ;
    public final void rule__InstanceChannel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2333:1: ( rule__InstanceChannel__Group__7__Impl )
            // InternalIotlang.g:2334:2: rule__InstanceChannel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__7"


    // $ANTLR start "rule__InstanceChannel__Group__7__Impl"
    // InternalIotlang.g:2340:1: rule__InstanceChannel__Group__7__Impl : ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstanceChannel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2344:1: ( ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2345:1: ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2345:1: ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2346:2: ( rule__InstanceChannel__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstanceChannelAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2347:2: ( rule__InstanceChannel__AnnotationsAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANNOTATION_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:2347:3: rule__InstanceChannel__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceChannel__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInstanceChannelAccess().getAnnotationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__7__Impl"


    // $ANTLR start "rule__InstanceChannel__Group_2__0"
    // InternalIotlang.g:2356:1: rule__InstanceChannel__Group_2__0 : rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1 ;
    public final void rule__InstanceChannel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2360:1: ( rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1 )
            // InternalIotlang.g:2361:2: rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__InstanceChannel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__0"


    // $ANTLR start "rule__InstanceChannel__Group_2__0__Impl"
    // InternalIotlang.g:2368:1: rule__InstanceChannel__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceChannel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2372:1: ( ( '[' ) )
            // InternalIotlang.g:2373:1: ( '[' )
            {
            // InternalIotlang.g:2373:1: ( '[' )
            // InternalIotlang.g:2374:2: '['
            {
             before(grammarAccess.getInstanceChannelAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__0__Impl"


    // $ANTLR start "rule__InstanceChannel__Group_2__1"
    // InternalIotlang.g:2383:1: rule__InstanceChannel__Group_2__1 : rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2 ;
    public final void rule__InstanceChannel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2387:1: ( rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2 )
            // InternalIotlang.g:2388:2: rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__InstanceChannel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__1"


    // $ANTLR start "rule__InstanceChannel__Group_2__1__Impl"
    // InternalIotlang.g:2395:1: rule__InstanceChannel__Group_2__1__Impl : ( ( rule__InstanceChannel__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceChannel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2399:1: ( ( ( rule__InstanceChannel__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2400:1: ( ( rule__InstanceChannel__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2400:1: ( ( rule__InstanceChannel__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2401:2: ( rule__InstanceChannel__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceChannelAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2402:2: ( rule__InstanceChannel__NumberAssignment_2_1 )
            // InternalIotlang.g:2402:3: rule__InstanceChannel__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__1__Impl"


    // $ANTLR start "rule__InstanceChannel__Group_2__2"
    // InternalIotlang.g:2410:1: rule__InstanceChannel__Group_2__2 : rule__InstanceChannel__Group_2__2__Impl ;
    public final void rule__InstanceChannel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2414:1: ( rule__InstanceChannel__Group_2__2__Impl )
            // InternalIotlang.g:2415:2: rule__InstanceChannel__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__2"


    // $ANTLR start "rule__InstanceChannel__Group_2__2__Impl"
    // InternalIotlang.g:2421:1: rule__InstanceChannel__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceChannel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2425:1: ( ( ']' ) )
            // InternalIotlang.g:2426:1: ( ']' )
            {
            // InternalIotlang.g:2426:1: ( ']' )
            // InternalIotlang.g:2427:2: ']'
            {
             before(grammarAccess.getInstanceChannelAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__2__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__0"
    // InternalIotlang.g:2437:1: rule__InstancePolicy__Group__0 : rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 ;
    public final void rule__InstancePolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2441:1: ( rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 )
            // InternalIotlang.g:2442:2: rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstancePolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__0"


    // $ANTLR start "rule__InstancePolicy__Group__0__Impl"
    // InternalIotlang.g:2449:1: rule__InstancePolicy__Group__0__Impl : ( 'instancePolicy' ) ;
    public final void rule__InstancePolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2453:1: ( ( 'instancePolicy' ) )
            // InternalIotlang.g:2454:1: ( 'instancePolicy' )
            {
            // InternalIotlang.g:2454:1: ( 'instancePolicy' )
            // InternalIotlang.g:2455:2: 'instancePolicy'
            {
             before(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__0__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__1"
    // InternalIotlang.g:2464:1: rule__InstancePolicy__Group__1 : rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 ;
    public final void rule__InstancePolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2468:1: ( rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 )
            // InternalIotlang.g:2469:2: rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InstancePolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__1"


    // $ANTLR start "rule__InstancePolicy__Group__1__Impl"
    // InternalIotlang.g:2476:1: rule__InstancePolicy__Group__1__Impl : ( ( rule__InstancePolicy__NameAssignment_1 ) ) ;
    public final void rule__InstancePolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2480:1: ( ( ( rule__InstancePolicy__NameAssignment_1 ) ) )
            // InternalIotlang.g:2481:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2481:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            // InternalIotlang.g:2482:2: ( rule__InstancePolicy__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2483:2: ( rule__InstancePolicy__NameAssignment_1 )
            // InternalIotlang.g:2483:3: rule__InstancePolicy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__1__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__2"
    // InternalIotlang.g:2491:1: rule__InstancePolicy__Group__2 : rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 ;
    public final void rule__InstancePolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2495:1: ( rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 )
            // InternalIotlang.g:2496:2: rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InstancePolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__2"


    // $ANTLR start "rule__InstancePolicy__Group__2__Impl"
    // InternalIotlang.g:2503:1: rule__InstancePolicy__Group__2__Impl : ( ':' ) ;
    public final void rule__InstancePolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2507:1: ( ( ':' ) )
            // InternalIotlang.g:2508:1: ( ':' )
            {
            // InternalIotlang.g:2508:1: ( ':' )
            // InternalIotlang.g:2509:2: ':'
            {
             before(grammarAccess.getInstancePolicyAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__2__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__3"
    // InternalIotlang.g:2518:1: rule__InstancePolicy__Group__3 : rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 ;
    public final void rule__InstancePolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2522:1: ( rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 )
            // InternalIotlang.g:2523:2: rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__InstancePolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__3"


    // $ANTLR start "rule__InstancePolicy__Group__3__Impl"
    // InternalIotlang.g:2530:1: rule__InstancePolicy__Group__3__Impl : ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) ;
    public final void rule__InstancePolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2534:1: ( ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) )
            // InternalIotlang.g:2535:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            {
            // InternalIotlang.g:2535:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            // InternalIotlang.g:2536:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 
            // InternalIotlang.g:2537:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            // InternalIotlang.g:2537:3: rule__InstancePolicy__TypePolicyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__TypePolicyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__3__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__4"
    // InternalIotlang.g:2545:1: rule__InstancePolicy__Group__4 : rule__InstancePolicy__Group__4__Impl ;
    public final void rule__InstancePolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2549:1: ( rule__InstancePolicy__Group__4__Impl )
            // InternalIotlang.g:2550:2: rule__InstancePolicy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__4"


    // $ANTLR start "rule__InstancePolicy__Group__4__Impl"
    // InternalIotlang.g:2556:1: rule__InstancePolicy__Group__4__Impl : ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) ;
    public final void rule__InstancePolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2560:1: ( ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) )
            // InternalIotlang.g:2561:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            {
            // InternalIotlang.g:2561:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            // InternalIotlang.g:2562:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 
            // InternalIotlang.g:2563:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ANNOTATION_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:2563:3: rule__InstancePolicy__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePolicy__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__4__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__0"
    // InternalIotlang.g:2572:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2576:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIotlang.g:2577:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__0"


    // $ANTLR start "rule__NetworkConfiguration__Group__0__Impl"
    // InternalIotlang.g:2584:1: rule__NetworkConfiguration__Group__0__Impl : ( 'networkConfiguration' ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2588:1: ( ( 'networkConfiguration' ) )
            // InternalIotlang.g:2589:1: ( 'networkConfiguration' )
            {
            // InternalIotlang.g:2589:1: ( 'networkConfiguration' )
            // InternalIotlang.g:2590:2: 'networkConfiguration'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__0__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__1"
    // InternalIotlang.g:2599:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2603:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIotlang.g:2604:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NetworkConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__1"


    // $ANTLR start "rule__NetworkConfiguration__Group__1__Impl"
    // InternalIotlang.g:2611:1: rule__NetworkConfiguration__Group__1__Impl : ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2615:1: ( ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) )
            // InternalIotlang.g:2616:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2616:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            // InternalIotlang.g:2617:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2618:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            // InternalIotlang.g:2618:3: rule__NetworkConfiguration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__1__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__2"
    // InternalIotlang.g:2626:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2630:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIotlang.g:2631:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__NetworkConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__2"


    // $ANTLR start "rule__NetworkConfiguration__Group__2__Impl"
    // InternalIotlang.g:2638:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2642:1: ( ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:2643:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:2643:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:2644:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:2645:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANNOTATION_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:2645:3: rule__NetworkConfiguration__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NetworkConfiguration__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__2__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__3"
    // InternalIotlang.g:2653:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2657:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIotlang.g:2658:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__NetworkConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__3"


    // $ANTLR start "rule__NetworkConfiguration__Group__3__Impl"
    // InternalIotlang.g:2665:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2669:1: ( ( '{' ) )
            // InternalIotlang.g:2670:1: ( '{' )
            {
            // InternalIotlang.g:2670:1: ( '{' )
            // InternalIotlang.g:2671:2: '{'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__3__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__4"
    // InternalIotlang.g:2680:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2684:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIotlang.g:2685:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__NetworkConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__4"


    // $ANTLR start "rule__NetworkConfiguration__Group__4__Impl"
    // InternalIotlang.g:2692:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__Alternatives_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2696:1: ( ( ( rule__NetworkConfiguration__Alternatives_4 )* ) )
            // InternalIotlang.g:2697:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            {
            // InternalIotlang.g:2697:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            // InternalIotlang.g:2698:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 
            // InternalIotlang.g:2699:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=35 && LA19_0<=36)||LA19_0==39||LA19_0==41||(LA19_0>=43 && LA19_0<=44)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:2699:3: rule__NetworkConfiguration__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__NetworkConfiguration__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__4__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__5"
    // InternalIotlang.g:2707:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2711:1: ( rule__NetworkConfiguration__Group__5__Impl )
            // InternalIotlang.g:2712:2: rule__NetworkConfiguration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__5"


    // $ANTLR start "rule__NetworkConfiguration__Group__5__Impl"
    // InternalIotlang.g:2718:1: rule__NetworkConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2722:1: ( ( '}' ) )
            // InternalIotlang.g:2723:1: ( '}' )
            {
            // InternalIotlang.g:2723:1: ( '}' )
            // InternalIotlang.g:2724:2: '}'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__5__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__0"
    // InternalIotlang.g:2734:1: rule__NetworkConfiguration__Group_4_4__0 : rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 ;
    public final void rule__NetworkConfiguration__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2738:1: ( rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 )
            // InternalIotlang.g:2739:2: rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkConfiguration__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__0"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__0__Impl"
    // InternalIotlang.g:2746:1: rule__NetworkConfiguration__Group_4_4__0__Impl : ( 'enforce' ) ;
    public final void rule__NetworkConfiguration__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2750:1: ( ( 'enforce' ) )
            // InternalIotlang.g:2751:1: ( 'enforce' )
            {
            // InternalIotlang.g:2751:1: ( 'enforce' )
            // InternalIotlang.g:2752:2: 'enforce'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__0__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__1"
    // InternalIotlang.g:2761:1: rule__NetworkConfiguration__Group_4_4__1 : rule__NetworkConfiguration__Group_4_4__1__Impl ;
    public final void rule__NetworkConfiguration__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2765:1: ( rule__NetworkConfiguration__Group_4_4__1__Impl )
            // InternalIotlang.g:2766:2: rule__NetworkConfiguration__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group_4_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__1"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__1__Impl"
    // InternalIotlang.g:2772:1: rule__NetworkConfiguration__Group_4_4__1__Impl : ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) ;
    public final void rule__NetworkConfiguration__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2776:1: ( ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) )
            // InternalIotlang.g:2777:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            {
            // InternalIotlang.g:2777:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            // InternalIotlang.g:2778:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 
            // InternalIotlang.g:2779:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            // InternalIotlang.g:2779:3: rule__NetworkConfiguration__EnforcesAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__EnforcesAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__1__Impl"


    // $ANTLR start "rule__Bind__Group__0"
    // InternalIotlang.g:2788:1: rule__Bind__Group__0 : rule__Bind__Group__0__Impl rule__Bind__Group__1 ;
    public final void rule__Bind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2792:1: ( rule__Bind__Group__0__Impl rule__Bind__Group__1 )
            // InternalIotlang.g:2793:2: rule__Bind__Group__0__Impl rule__Bind__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__0"


    // $ANTLR start "rule__Bind__Group__0__Impl"
    // InternalIotlang.g:2800:1: rule__Bind__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Bind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2804:1: ( ( 'bind' ) )
            // InternalIotlang.g:2805:1: ( 'bind' )
            {
            // InternalIotlang.g:2805:1: ( 'bind' )
            // InternalIotlang.g:2806:2: 'bind'
            {
             before(grammarAccess.getBindAccess().getBindKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getBindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__0__Impl"


    // $ANTLR start "rule__Bind__Group__1"
    // InternalIotlang.g:2815:1: rule__Bind__Group__1 : rule__Bind__Group__1__Impl rule__Bind__Group__2 ;
    public final void rule__Bind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2819:1: ( rule__Bind__Group__1__Impl rule__Bind__Group__2 )
            // InternalIotlang.g:2820:2: rule__Bind__Group__1__Impl rule__Bind__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__1"


    // $ANTLR start "rule__Bind__Group__1__Impl"
    // InternalIotlang.g:2827:1: rule__Bind__Group__1__Impl : ( ( rule__Bind__NameAssignment_1 )? ) ;
    public final void rule__Bind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2831:1: ( ( ( rule__Bind__NameAssignment_1 )? ) )
            // InternalIotlang.g:2832:1: ( ( rule__Bind__NameAssignment_1 )? )
            {
            // InternalIotlang.g:2832:1: ( ( rule__Bind__NameAssignment_1 )? )
            // InternalIotlang.g:2833:2: ( rule__Bind__NameAssignment_1 )?
            {
             before(grammarAccess.getBindAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2834:2: ( rule__Bind__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalIotlang.g:2834:3: rule__Bind__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__1__Impl"


    // $ANTLR start "rule__Bind__Group__2"
    // InternalIotlang.g:2842:1: rule__Bind__Group__2 : rule__Bind__Group__2__Impl rule__Bind__Group__3 ;
    public final void rule__Bind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2846:1: ( rule__Bind__Group__2__Impl rule__Bind__Group__3 )
            // InternalIotlang.g:2847:2: rule__Bind__Group__2__Impl rule__Bind__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Bind__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__2"


    // $ANTLR start "rule__Bind__Group__2__Impl"
    // InternalIotlang.g:2854:1: rule__Bind__Group__2__Impl : ( ( rule__Bind__ThingInstanceAssignment_2 ) ) ;
    public final void rule__Bind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2858:1: ( ( ( rule__Bind__ThingInstanceAssignment_2 ) ) )
            // InternalIotlang.g:2859:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            {
            // InternalIotlang.g:2859:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            // InternalIotlang.g:2860:2: ( rule__Bind__ThingInstanceAssignment_2 )
            {
             before(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 
            // InternalIotlang.g:2861:2: ( rule__Bind__ThingInstanceAssignment_2 )
            // InternalIotlang.g:2861:3: rule__Bind__ThingInstanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ThingInstanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__2__Impl"


    // $ANTLR start "rule__Bind__Group__3"
    // InternalIotlang.g:2869:1: rule__Bind__Group__3 : rule__Bind__Group__3__Impl rule__Bind__Group__4 ;
    public final void rule__Bind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2873:1: ( rule__Bind__Group__3__Impl rule__Bind__Group__4 )
            // InternalIotlang.g:2874:2: rule__Bind__Group__3__Impl rule__Bind__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__3"


    // $ANTLR start "rule__Bind__Group__3__Impl"
    // InternalIotlang.g:2881:1: rule__Bind__Group__3__Impl : ( ( rule__Bind__DirectionAssignment_3 ) ) ;
    public final void rule__Bind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2885:1: ( ( ( rule__Bind__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:2886:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:2886:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            // InternalIotlang.g:2887:2: ( rule__Bind__DirectionAssignment_3 )
            {
             before(grammarAccess.getBindAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:2888:2: ( rule__Bind__DirectionAssignment_3 )
            // InternalIotlang.g:2888:3: rule__Bind__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bind__DirectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getDirectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__3__Impl"


    // $ANTLR start "rule__Bind__Group__4"
    // InternalIotlang.g:2896:1: rule__Bind__Group__4 : rule__Bind__Group__4__Impl rule__Bind__Group__5 ;
    public final void rule__Bind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2900:1: ( rule__Bind__Group__4__Impl rule__Bind__Group__5 )
            // InternalIotlang.g:2901:2: rule__Bind__Group__4__Impl rule__Bind__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Bind__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__4"


    // $ANTLR start "rule__Bind__Group__4__Impl"
    // InternalIotlang.g:2908:1: rule__Bind__Group__4__Impl : ( ( rule__Bind__ChannelInstanceAssignment_4 ) ) ;
    public final void rule__Bind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2912:1: ( ( ( rule__Bind__ChannelInstanceAssignment_4 ) ) )
            // InternalIotlang.g:2913:1: ( ( rule__Bind__ChannelInstanceAssignment_4 ) )
            {
            // InternalIotlang.g:2913:1: ( ( rule__Bind__ChannelInstanceAssignment_4 ) )
            // InternalIotlang.g:2914:2: ( rule__Bind__ChannelInstanceAssignment_4 )
            {
             before(grammarAccess.getBindAccess().getChannelInstanceAssignment_4()); 
            // InternalIotlang.g:2915:2: ( rule__Bind__ChannelInstanceAssignment_4 )
            // InternalIotlang.g:2915:3: rule__Bind__ChannelInstanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ChannelInstanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getChannelInstanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__4__Impl"


    // $ANTLR start "rule__Bind__Group__5"
    // InternalIotlang.g:2923:1: rule__Bind__Group__5 : rule__Bind__Group__5__Impl rule__Bind__Group__6 ;
    public final void rule__Bind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2927:1: ( rule__Bind__Group__5__Impl rule__Bind__Group__6 )
            // InternalIotlang.g:2928:2: rule__Bind__Group__5__Impl rule__Bind__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__5"


    // $ANTLR start "rule__Bind__Group__5__Impl"
    // InternalIotlang.g:2935:1: rule__Bind__Group__5__Impl : ( '{' ) ;
    public final void rule__Bind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2939:1: ( ( '{' ) )
            // InternalIotlang.g:2940:1: ( '{' )
            {
            // InternalIotlang.g:2940:1: ( '{' )
            // InternalIotlang.g:2941:2: '{'
            {
             before(grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__5__Impl"


    // $ANTLR start "rule__Bind__Group__6"
    // InternalIotlang.g:2950:1: rule__Bind__Group__6 : rule__Bind__Group__6__Impl rule__Bind__Group__7 ;
    public final void rule__Bind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2954:1: ( rule__Bind__Group__6__Impl rule__Bind__Group__7 )
            // InternalIotlang.g:2955:2: rule__Bind__Group__6__Impl rule__Bind__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Bind__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__6"


    // $ANTLR start "rule__Bind__Group__6__Impl"
    // InternalIotlang.g:2962:1: rule__Bind__Group__6__Impl : ( ( rule__Bind__TopicsAssignment_6 ) ) ;
    public final void rule__Bind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2966:1: ( ( ( rule__Bind__TopicsAssignment_6 ) ) )
            // InternalIotlang.g:2967:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            {
            // InternalIotlang.g:2967:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            // InternalIotlang.g:2968:2: ( rule__Bind__TopicsAssignment_6 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_6()); 
            // InternalIotlang.g:2969:2: ( rule__Bind__TopicsAssignment_6 )
            // InternalIotlang.g:2969:3: rule__Bind__TopicsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Bind__TopicsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getTopicsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__6__Impl"


    // $ANTLR start "rule__Bind__Group__7"
    // InternalIotlang.g:2977:1: rule__Bind__Group__7 : rule__Bind__Group__7__Impl rule__Bind__Group__8 ;
    public final void rule__Bind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2981:1: ( rule__Bind__Group__7__Impl rule__Bind__Group__8 )
            // InternalIotlang.g:2982:2: rule__Bind__Group__7__Impl rule__Bind__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Bind__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__7"


    // $ANTLR start "rule__Bind__Group__7__Impl"
    // InternalIotlang.g:2989:1: rule__Bind__Group__7__Impl : ( ( rule__Bind__Group_7__0 )* ) ;
    public final void rule__Bind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2993:1: ( ( ( rule__Bind__Group_7__0 )* ) )
            // InternalIotlang.g:2994:1: ( ( rule__Bind__Group_7__0 )* )
            {
            // InternalIotlang.g:2994:1: ( ( rule__Bind__Group_7__0 )* )
            // InternalIotlang.g:2995:2: ( rule__Bind__Group_7__0 )*
            {
             before(grammarAccess.getBindAccess().getGroup_7()); 
            // InternalIotlang.g:2996:2: ( rule__Bind__Group_7__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotlang.g:2996:3: rule__Bind__Group_7__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Bind__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBindAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__7__Impl"


    // $ANTLR start "rule__Bind__Group__8"
    // InternalIotlang.g:3004:1: rule__Bind__Group__8 : rule__Bind__Group__8__Impl rule__Bind__Group__9 ;
    public final void rule__Bind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3008:1: ( rule__Bind__Group__8__Impl rule__Bind__Group__9 )
            // InternalIotlang.g:3009:2: rule__Bind__Group__8__Impl rule__Bind__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Bind__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__8"


    // $ANTLR start "rule__Bind__Group__8__Impl"
    // InternalIotlang.g:3016:1: rule__Bind__Group__8__Impl : ( '}' ) ;
    public final void rule__Bind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3020:1: ( ( '}' ) )
            // InternalIotlang.g:3021:1: ( '}' )
            {
            // InternalIotlang.g:3021:1: ( '}' )
            // InternalIotlang.g:3022:2: '}'
            {
             before(grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__8__Impl"


    // $ANTLR start "rule__Bind__Group__9"
    // InternalIotlang.g:3031:1: rule__Bind__Group__9 : rule__Bind__Group__9__Impl ;
    public final void rule__Bind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3035:1: ( rule__Bind__Group__9__Impl )
            // InternalIotlang.g:3036:2: rule__Bind__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__9"


    // $ANTLR start "rule__Bind__Group__9__Impl"
    // InternalIotlang.g:3042:1: rule__Bind__Group__9__Impl : ( ( rule__Bind__AnnotationsAssignment_9 )* ) ;
    public final void rule__Bind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3046:1: ( ( ( rule__Bind__AnnotationsAssignment_9 )* ) )
            // InternalIotlang.g:3047:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            {
            // InternalIotlang.g:3047:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            // InternalIotlang.g:3048:2: ( rule__Bind__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 
            // InternalIotlang.g:3049:2: ( rule__Bind__AnnotationsAssignment_9 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIotlang.g:3049:3: rule__Bind__AnnotationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bind__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__9__Impl"


    // $ANTLR start "rule__Bind__Group_7__0"
    // InternalIotlang.g:3058:1: rule__Bind__Group_7__0 : rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 ;
    public final void rule__Bind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3062:1: ( rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 )
            // InternalIotlang.g:3063:2: rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__0"


    // $ANTLR start "rule__Bind__Group_7__0__Impl"
    // InternalIotlang.g:3070:1: rule__Bind__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3074:1: ( ( ',' ) )
            // InternalIotlang.g:3075:1: ( ',' )
            {
            // InternalIotlang.g:3075:1: ( ',' )
            // InternalIotlang.g:3076:2: ','
            {
             before(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__0__Impl"


    // $ANTLR start "rule__Bind__Group_7__1"
    // InternalIotlang.g:3085:1: rule__Bind__Group_7__1 : rule__Bind__Group_7__1__Impl ;
    public final void rule__Bind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3089:1: ( rule__Bind__Group_7__1__Impl )
            // InternalIotlang.g:3090:2: rule__Bind__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__1"


    // $ANTLR start "rule__Bind__Group_7__1__Impl"
    // InternalIotlang.g:3096:1: rule__Bind__Group_7__1__Impl : ( ( rule__Bind__TopicsAssignment_7_1 ) ) ;
    public final void rule__Bind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3100:1: ( ( ( rule__Bind__TopicsAssignment_7_1 ) ) )
            // InternalIotlang.g:3101:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            {
            // InternalIotlang.g:3101:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            // InternalIotlang.g:3102:2: ( rule__Bind__TopicsAssignment_7_1 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 
            // InternalIotlang.g:3103:2: ( rule__Bind__TopicsAssignment_7_1 )
            // InternalIotlang.g:3103:3: rule__Bind__TopicsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Bind__TopicsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__1__Impl"


    // $ANTLR start "rule__IoTLangModel__ThingsAssignment_0"
    // InternalIotlang.g:3112:1: rule__IoTLangModel__ThingsAssignment_0 : ( ruleThing ) ;
    public final void rule__IoTLangModel__ThingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3116:1: ( ( ruleThing ) )
            // InternalIotlang.g:3117:2: ( ruleThing )
            {
            // InternalIotlang.g:3117:2: ( ruleThing )
            // InternalIotlang.g:3118:3: ruleThing
            {
             before(grammarAccess.getIoTLangModelAccess().getThingsThingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleThing();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getThingsThingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ThingsAssignment_0"


    // $ANTLR start "rule__IoTLangModel__PoliciesAssignment_1"
    // InternalIotlang.g:3127:1: rule__IoTLangModel__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__IoTLangModel__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3131:1: ( ( rulePolicy ) )
            // InternalIotlang.g:3132:2: ( rulePolicy )
            {
            // InternalIotlang.g:3132:2: ( rulePolicy )
            // InternalIotlang.g:3133:3: rulePolicy
            {
             before(grammarAccess.getIoTLangModelAccess().getPoliciesPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getPoliciesPolicyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__PoliciesAssignment_1"


    // $ANTLR start "rule__IoTLangModel__MessagesAssignment_2"
    // InternalIotlang.g:3142:1: rule__IoTLangModel__MessagesAssignment_2 : ( ruleMessage ) ;
    public final void rule__IoTLangModel__MessagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3146:1: ( ( ruleMessage ) )
            // InternalIotlang.g:3147:2: ( ruleMessage )
            {
            // InternalIotlang.g:3147:2: ( ruleMessage )
            // InternalIotlang.g:3148:3: ruleMessage
            {
             before(grammarAccess.getIoTLangModelAccess().getMessagesMessageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getMessagesMessageParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__MessagesAssignment_2"


    // $ANTLR start "rule__IoTLangModel__ChannelsAssignment_3"
    // InternalIotlang.g:3157:1: rule__IoTLangModel__ChannelsAssignment_3 : ( ruleChannel ) ;
    public final void rule__IoTLangModel__ChannelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3161:1: ( ( ruleChannel ) )
            // InternalIotlang.g:3162:2: ( ruleChannel )
            {
            // InternalIotlang.g:3162:2: ( ruleChannel )
            // InternalIotlang.g:3163:3: ruleChannel
            {
             before(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ChannelsAssignment_3"


    // $ANTLR start "rule__IoTLangModel__ProtocolsAssignment_4"
    // InternalIotlang.g:3172:1: rule__IoTLangModel__ProtocolsAssignment_4 : ( ruleProtocol ) ;
    public final void rule__IoTLangModel__ProtocolsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3176:1: ( ( ruleProtocol ) )
            // InternalIotlang.g:3177:2: ( ruleProtocol )
            {
            // InternalIotlang.g:3177:2: ( ruleProtocol )
            // InternalIotlang.g:3178:3: ruleProtocol
            {
             before(grammarAccess.getIoTLangModelAccess().getProtocolsProtocolParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getProtocolsProtocolParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ProtocolsAssignment_4"


    // $ANTLR start "rule__IoTLangModel__ConfigsAssignment_5"
    // InternalIotlang.g:3187:1: rule__IoTLangModel__ConfigsAssignment_5 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTLangModel__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3191:1: ( ( ruleNetworkConfiguration ) )
            // InternalIotlang.g:3192:2: ( ruleNetworkConfiguration )
            {
            // InternalIotlang.g:3192:2: ( ruleNetworkConfiguration )
            // InternalIotlang.g:3193:3: ruleNetworkConfiguration
            {
             before(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkConfiguration();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ConfigsAssignment_5"


    // $ANTLR start "rule__PlatformAnnotation__NameAssignment_0"
    // InternalIotlang.g:3202:1: rule__PlatformAnnotation__NameAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__PlatformAnnotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3206:1: ( ( RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:3207:2: ( RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:3207:2: ( RULE_ANNOTATION_ID )
            // InternalIotlang.g:3208:3: RULE_ANNOTATION_ID
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0()); 
            match(input,RULE_ANNOTATION_ID,FOLLOW_2); 
             after(grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__NameAssignment_0"


    // $ANTLR start "rule__PlatformAnnotation__ValueAssignment_1"
    // InternalIotlang.g:3217:1: rule__PlatformAnnotation__ValueAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__PlatformAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3221:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3222:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3222:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3223:3: RULE_STRING_LIT
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueSTRING_LITTerminalRuleCall_1_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_2); 
             after(grammarAccess.getPlatformAnnotationAccess().getValueSTRING_LITTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__ValueAssignment_1"


    // $ANTLR start "rule__Thing__NameAssignment_1"
    // InternalIotlang.g:3232:1: rule__Thing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Thing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3236:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3237:2: ( RULE_ID )
            {
            // InternalIotlang.g:3237:2: ( RULE_ID )
            // InternalIotlang.g:3238:3: RULE_ID
            {
             before(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__NameAssignment_1"


    // $ANTLR start "rule__Thing__AnnotationsAssignment_2"
    // InternalIotlang.g:3247:1: rule__Thing__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__Thing__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3251:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3252:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3252:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3253:3: rulePlatformAnnotation
            {
             before(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__AnnotationsAssignment_2"


    // $ANTLR start "rule__Thing__PortsAssignment_4"
    // InternalIotlang.g:3262:1: rule__Thing__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Thing__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3266:1: ( ( rulePort ) )
            // InternalIotlang.g:3267:2: ( rulePort )
            {
            // InternalIotlang.g:3267:2: ( rulePort )
            // InternalIotlang.g:3268:3: rulePort
            {
             before(grammarAccess.getThingAccess().getPortsPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getThingAccess().getPortsPortParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__PortsAssignment_4"


    // $ANTLR start "rule__PubSub__NameAssignment_1"
    // InternalIotlang.g:3277:1: rule__PubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3281:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3282:2: ( RULE_ID )
            {
            // InternalIotlang.g:3282:2: ( RULE_ID )
            // InternalIotlang.g:3283:3: RULE_ID
            {
             before(grammarAccess.getPubSubAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__NameAssignment_1"


    // $ANTLR start "rule__PubSub__HasTopicsAssignment_3"
    // InternalIotlang.g:3292:1: rule__PubSub__HasTopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__PubSub__HasTopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3296:1: ( ( ruleTopic ) )
            // InternalIotlang.g:3297:2: ( ruleTopic )
            {
            // InternalIotlang.g:3297:2: ( ruleTopic )
            // InternalIotlang.g:3298:3: ruleTopic
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getPubSubAccess().getHasTopicsTopicParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__HasTopicsAssignment_3"


    // $ANTLR start "rule__PointToPoint__NameAssignment_1"
    // InternalIotlang.g:3307:1: rule__PointToPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PointToPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3311:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3312:2: ( RULE_ID )
            {
            // InternalIotlang.g:3312:2: ( RULE_ID )
            // InternalIotlang.g:3313:3: RULE_ID
            {
             before(grammarAccess.getPointToPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__NameAssignment_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalIotlang.g:3322:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3326:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3327:2: ( RULE_ID )
            {
            // InternalIotlang.g:3327:2: ( RULE_ID )
            // InternalIotlang.g:3328:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__HasRulesAssignment_3"
    // InternalIotlang.g:3337:1: rule__Policy__HasRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__HasRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3341:1: ( ( ruleRule ) )
            // InternalIotlang.g:3342:2: ( ruleRule )
            {
            // InternalIotlang.g:3342:2: ( ruleRule )
            // InternalIotlang.g:3343:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getHasRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getHasRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__HasRulesAssignment_3"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // InternalIotlang.g:3352:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3356:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3357:2: ( RULE_ID )
            {
            // InternalIotlang.g:3357:2: ( RULE_ID )
            // InternalIotlang.g:3358:3: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Protocol__NameAssignment_1"
    // InternalIotlang.g:3367:1: rule__Protocol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3371:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3372:2: ( RULE_ID )
            {
            // InternalIotlang.g:3372:2: ( RULE_ID )
            // InternalIotlang.g:3373:3: RULE_ID
            {
             before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_1"


    // $ANTLR start "rule__Message__NameAssignment_1"
    // InternalIotlang.g:3382:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3386:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3387:2: ( RULE_ID )
            {
            // InternalIotlang.g:3387:2: ( RULE_ID )
            // InternalIotlang.g:3388:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_1"


    // $ANTLR start "rule__Topic__NameAssignment_1"
    // InternalIotlang.g:3397:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3401:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3402:2: ( RULE_ID )
            {
            // InternalIotlang.g:3402:2: ( RULE_ID )
            // InternalIotlang.g:3403:3: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__NameAssignment_1"


    // $ANTLR start "rule__Topic__AcceptedMessagesAssignment_3"
    // InternalIotlang.g:3412:1: rule__Topic__AcceptedMessagesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Topic__AcceptedMessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3416:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3417:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3417:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3418:3: ( RULE_ID )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 
            // InternalIotlang.g:3419:3: ( RULE_ID )
            // InternalIotlang.g:3420:4: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getAcceptedMessagesMessageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__AcceptedMessagesAssignment_3"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalIotlang.g:3431:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3435:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3436:2: ( RULE_ID )
            {
            // InternalIotlang.g:3436:2: ( RULE_ID )
            // InternalIotlang.g:3437:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__SubjectAssignment_2"
    // InternalIotlang.g:3446:1: rule__Rule__SubjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3450:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3451:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3451:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3452:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 
            // InternalIotlang.g:3453:3: ( RULE_ID )
            // InternalIotlang.g:3454:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getSubjectThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSubjectThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SubjectAssignment_2"


    // $ANTLR start "rule__Rule__PermissionAssignment_3"
    // InternalIotlang.g:3465:1: rule__Rule__PermissionAssignment_3 : ( ( rule__Rule__PermissionAlternatives_3_0 ) ) ;
    public final void rule__Rule__PermissionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3469:1: ( ( ( rule__Rule__PermissionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3470:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3470:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            // InternalIotlang.g:3471:3: ( rule__Rule__PermissionAlternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 
            // InternalIotlang.g:3472:3: ( rule__Rule__PermissionAlternatives_3_0 )
            // InternalIotlang.g:3472:4: rule__Rule__PermissionAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PermissionAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PermissionAssignment_3"


    // $ANTLR start "rule__Rule__ActionAssignment_5"
    // InternalIotlang.g:3480:1: rule__Rule__ActionAssignment_5 : ( ( rule__Rule__ActionAlternatives_5_0 ) ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3484:1: ( ( ( rule__Rule__ActionAlternatives_5_0 ) ) )
            // InternalIotlang.g:3485:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            {
            // InternalIotlang.g:3485:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            // InternalIotlang.g:3486:3: ( rule__Rule__ActionAlternatives_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 
            // InternalIotlang.g:3487:3: ( rule__Rule__ActionAlternatives_5_0 )
            // InternalIotlang.g:3487:4: rule__Rule__ActionAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_5"


    // $ANTLR start "rule__Rule__ObjectAssignment_6"
    // InternalIotlang.g:3495:1: rule__Rule__ObjectAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3499:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3500:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3500:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3501:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0()); 
            // InternalIotlang.g:3502:3: ( RULE_ID )
            // InternalIotlang.g:3503:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getObjectThingIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getObjectThingIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ObjectAssignment_6"


    // $ANTLR start "rule__Rule__PortsAssignment_7_1"
    // InternalIotlang.g:3514:1: rule__Rule__PortsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__PortsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3518:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3519:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3519:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3520:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getPortsPortCrossReference_7_1_0()); 
            // InternalIotlang.g:3521:3: ( RULE_ID )
            // InternalIotlang.g:3522:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getPortsPortIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPortsPortIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPortsPortCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PortsAssignment_7_1"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalIotlang.g:3533:1: rule__Domain__NameAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3537:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3538:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3538:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3539:3: RULE_STRING_LIT
            {
             before(grammarAccess.getDomainAccess().getNameSTRING_LITTerminalRuleCall_1_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameSTRING_LITTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__InstanceThing__NameAssignment_1"
    // InternalIotlang.g:3548:1: rule__InstanceThing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceThing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3552:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3553:2: ( RULE_ID )
            {
            // InternalIotlang.g:3553:2: ( RULE_ID )
            // InternalIotlang.g:3554:3: RULE_ID
            {
             before(grammarAccess.getInstanceThingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__NameAssignment_1"


    // $ANTLR start "rule__InstanceThing__NumberAssignment_2_1"
    // InternalIotlang.g:3563:1: rule__InstanceThing__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceThing__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3567:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3568:2: ( RULE_INT )
            {
            // InternalIotlang.g:3568:2: ( RULE_INT )
            // InternalIotlang.g:3569:3: RULE_INT
            {
             before(grammarAccess.getInstanceThingAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__NumberAssignment_2_1"


    // $ANTLR start "rule__InstanceThing__TypeThingAssignment_4"
    // InternalIotlang.g:3578:1: rule__InstanceThing__TypeThingAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceThing__TypeThingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3582:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3583:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3583:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3584:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 
            // InternalIotlang.g:3585:3: ( RULE_ID )
            // InternalIotlang.g:3586:4: RULE_ID
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getTypeThingThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__TypeThingAssignment_4"


    // $ANTLR start "rule__InstanceThing__AnnotationsAssignment_5"
    // InternalIotlang.g:3597:1: rule__InstanceThing__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceThing__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3601:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3602:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3602:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3603:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__AnnotationsAssignment_5"


    // $ANTLR start "rule__InstanceChannel__NameAssignment_1"
    // InternalIotlang.g:3612:1: rule__InstanceChannel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceChannel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3616:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3617:2: ( RULE_ID )
            {
            // InternalIotlang.g:3617:2: ( RULE_ID )
            // InternalIotlang.g:3618:3: RULE_ID
            {
             before(grammarAccess.getInstanceChannelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__NameAssignment_1"


    // $ANTLR start "rule__InstanceChannel__NumberAssignment_2_1"
    // InternalIotlang.g:3627:1: rule__InstanceChannel__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceChannel__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3631:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3632:2: ( RULE_INT )
            {
            // InternalIotlang.g:3632:2: ( RULE_INT )
            // InternalIotlang.g:3633:3: RULE_INT
            {
             before(grammarAccess.getInstanceChannelAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__NumberAssignment_2_1"


    // $ANTLR start "rule__InstanceChannel__TypeChannelAssignment_4"
    // InternalIotlang.g:3642:1: rule__InstanceChannel__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceChannel__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3646:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3647:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3647:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3648:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelCrossReference_4_0()); 
            // InternalIotlang.g:3649:3: ( RULE_ID )
            // InternalIotlang.g:3650:4: RULE_ID
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__TypeChannelAssignment_4"


    // $ANTLR start "rule__InstanceChannel__OverProtocolAssignment_6"
    // InternalIotlang.g:3661:1: rule__InstanceChannel__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceChannel__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3665:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3666:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3666:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3667:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:3668:3: ( RULE_ID )
            // InternalIotlang.g:3669:4: RULE_ID
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__OverProtocolAssignment_6"


    // $ANTLR start "rule__InstanceChannel__AnnotationsAssignment_7"
    // InternalIotlang.g:3680:1: rule__InstanceChannel__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceChannel__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3684:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3685:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3685:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3686:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstanceChannelAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstanceChannelAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__AnnotationsAssignment_7"


    // $ANTLR start "rule__InstancePolicy__NameAssignment_1"
    // InternalIotlang.g:3695:1: rule__InstancePolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3699:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3700:2: ( RULE_ID )
            {
            // InternalIotlang.g:3700:2: ( RULE_ID )
            // InternalIotlang.g:3701:3: RULE_ID
            {
             before(grammarAccess.getInstancePolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__NameAssignment_1"


    // $ANTLR start "rule__InstancePolicy__TypePolicyAssignment_3"
    // InternalIotlang.g:3710:1: rule__InstancePolicy__TypePolicyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePolicy__TypePolicyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3714:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3715:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3715:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3716:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 
            // InternalIotlang.g:3717:3: ( RULE_ID )
            // InternalIotlang.g:3718:4: RULE_ID
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__TypePolicyAssignment_3"


    // $ANTLR start "rule__InstancePolicy__AnnotationsAssignment_4"
    // InternalIotlang.g:3729:1: rule__InstancePolicy__AnnotationsAssignment_4 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePolicy__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3733:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3734:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3734:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3735:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__AnnotationsAssignment_4"


    // $ANTLR start "rule__NetworkConfiguration__NameAssignment_1"
    // InternalIotlang.g:3744:1: rule__NetworkConfiguration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3748:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3749:2: ( RULE_ID )
            {
            // InternalIotlang.g:3749:2: ( RULE_ID )
            // InternalIotlang.g:3750:3: RULE_ID
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__NameAssignment_1"


    // $ANTLR start "rule__NetworkConfiguration__AnnotationsAssignment_2"
    // InternalIotlang.g:3759:1: rule__NetworkConfiguration__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__NetworkConfiguration__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3763:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3764:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3764:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3765:3: rulePlatformAnnotation
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__AnnotationsAssignment_2"


    // $ANTLR start "rule__NetworkConfiguration__DomainAssignment_4_0"
    // InternalIotlang.g:3774:1: rule__NetworkConfiguration__DomainAssignment_4_0 : ( ruleDomain ) ;
    public final void rule__NetworkConfiguration__DomainAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3778:1: ( ( ruleDomain ) )
            // InternalIotlang.g:3779:2: ( ruleDomain )
            {
            // InternalIotlang.g:3779:2: ( ruleDomain )
            // InternalIotlang.g:3780:3: ruleDomain
            {
             before(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__DomainAssignment_4_0"


    // $ANTLR start "rule__NetworkConfiguration__BindsAssignment_4_1"
    // InternalIotlang.g:3789:1: rule__NetworkConfiguration__BindsAssignment_4_1 : ( ruleBind ) ;
    public final void rule__NetworkConfiguration__BindsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3793:1: ( ( ruleBind ) )
            // InternalIotlang.g:3794:2: ( ruleBind )
            {
            // InternalIotlang.g:3794:2: ( ruleBind )
            // InternalIotlang.g:3795:3: ruleBind
            {
             before(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__BindsAssignment_4_1"


    // $ANTLR start "rule__NetworkConfiguration__ThingInstancesAssignment_4_2"
    // InternalIotlang.g:3804:1: rule__NetworkConfiguration__ThingInstancesAssignment_4_2 : ( ruleInstanceThing ) ;
    public final void rule__NetworkConfiguration__ThingInstancesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3808:1: ( ( ruleInstanceThing ) )
            // InternalIotlang.g:3809:2: ( ruleInstanceThing )
            {
            // InternalIotlang.g:3809:2: ( ruleInstanceThing )
            // InternalIotlang.g:3810:3: ruleInstanceThing
            {
             before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceThing();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__ThingInstancesAssignment_4_2"


    // $ANTLR start "rule__NetworkConfiguration__ChannelInstancesAssignment_4_3"
    // InternalIotlang.g:3819:1: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 : ( ruleInstanceChannel ) ;
    public final void rule__NetworkConfiguration__ChannelInstancesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3823:1: ( ( ruleInstanceChannel ) )
            // InternalIotlang.g:3824:2: ( ruleInstanceChannel )
            {
            // InternalIotlang.g:3824:2: ( ruleInstanceChannel )
            // InternalIotlang.g:3825:3: ruleInstanceChannel
            {
             before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceChannel();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__ChannelInstancesAssignment_4_3"


    // $ANTLR start "rule__NetworkConfiguration__EnforcesAssignment_4_4_1"
    // InternalIotlang.g:3834:1: rule__NetworkConfiguration__EnforcesAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkConfiguration__EnforcesAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3838:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3839:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3839:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3840:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 
            // InternalIotlang.g:3841:3: ( RULE_ID )
            // InternalIotlang.g:3842:4: RULE_ID
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyIDTerminalRuleCall_4_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyIDTerminalRuleCall_4_4_1_0_1()); 

            }

             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__EnforcesAssignment_4_4_1"


    // $ANTLR start "rule__NetworkConfiguration__InstancePoliciyAssignment_4_5"
    // InternalIotlang.g:3853:1: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 : ( ruleInstancePolicy ) ;
    public final void rule__NetworkConfiguration__InstancePoliciyAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3857:1: ( ( ruleInstancePolicy ) )
            // InternalIotlang.g:3858:2: ( ruleInstancePolicy )
            {
            // InternalIotlang.g:3858:2: ( ruleInstancePolicy )
            // InternalIotlang.g:3859:3: ruleInstancePolicy
            {
             before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInstancePolicy();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__InstancePoliciyAssignment_4_5"


    // $ANTLR start "rule__Bind__NameAssignment_1"
    // InternalIotlang.g:3868:1: rule__Bind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3872:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3873:2: ( RULE_ID )
            {
            // InternalIotlang.g:3873:2: ( RULE_ID )
            // InternalIotlang.g:3874:3: RULE_ID
            {
             before(grammarAccess.getBindAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__NameAssignment_1"


    // $ANTLR start "rule__Bind__ThingInstanceAssignment_2"
    // InternalIotlang.g:3883:1: rule__Bind__ThingInstanceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ThingInstanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3887:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3888:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3888:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3889:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:3890:3: ( RULE_ID )
            // InternalIotlang.g:3891:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getThingInstanceInstanceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ThingInstanceAssignment_2"


    // $ANTLR start "rule__Bind__DirectionAssignment_3"
    // InternalIotlang.g:3902:1: rule__Bind__DirectionAssignment_3 : ( ( rule__Bind__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Bind__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3906:1: ( ( ( rule__Bind__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3907:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3907:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:3908:3: ( rule__Bind__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:3909:3: ( rule__Bind__DirectionAlternatives_3_0 )
            // InternalIotlang.g:3909:4: rule__Bind__DirectionAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Bind__DirectionAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__DirectionAssignment_3"


    // $ANTLR start "rule__Bind__ChannelInstanceAssignment_4"
    // InternalIotlang.g:3917:1: rule__Bind__ChannelInstanceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ChannelInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3921:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3922:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3922:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3923:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelCrossReference_4_0()); 
            // InternalIotlang.g:3924:3: ( RULE_ID )
            // InternalIotlang.g:3925:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ChannelInstanceAssignment_4"


    // $ANTLR start "rule__Bind__TopicsAssignment_6"
    // InternalIotlang.g:3936:1: rule__Bind__TopicsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3940:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3941:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3941:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3942:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 
            // InternalIotlang.g:3943:3: ( RULE_ID )
            // InternalIotlang.g:3944:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__TopicsAssignment_6"


    // $ANTLR start "rule__Bind__TopicsAssignment_7_1"
    // InternalIotlang.g:3955:1: rule__Bind__TopicsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3959:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3960:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3960:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3961:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 
            // InternalIotlang.g:3962:3: ( RULE_ID )
            // InternalIotlang.g:3963:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__TopicsAssignment_7_1"


    // $ANTLR start "rule__Bind__AnnotationsAssignment_9"
    // InternalIotlang.g:3974:1: rule__Bind__AnnotationsAssignment_9 : ( rulePlatformAnnotation ) ;
    public final void rule__Bind__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3978:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3979:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3979:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3980:3: rulePlatformAnnotation
            {
             before(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__AnnotationsAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000004001B900002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001A9800400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001A9800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000002L});

}