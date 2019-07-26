package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.utilities.Util;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.ThingMLModel;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(ThingMLInjectorProvider.class)
public class TransformationsTests {
	static final Logger log = LogManager.getLogger(App.class.getName());

	@Inject
	ParseHelper<ThingMLModel> parseHelper;
	@Inject
	ValidationTestHelper validator;
	@Inject
	ClassLoader classLoader;
	@Inject
	Util help;
	
	@Test
	public void test0_HelloWorld() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("0_HelloWorld/main.cy").getFile());
		File device1 = new File(classLoader.getResource("0_HelloWorld/device1.thingml").getFile());
		
		
		String outputFile = cyprIoTfile.getParent()+File.separator+"network-gen"+File.separator+"output.thingml";
		Resource res = help.transform(outputFile, cyprIoTfile, device1);
		
		ThingMLModel parseDevice1 = Helpers.getModelFromResource(res, ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
	}
	
	@Test
	public void test0_HelloWorld2() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("0_HelloWorld2/main.cy").getFile());
		File device1 = new File(classLoader.getResource("0_HelloWorld2/device1.thingml").getFile());
		
		
		String outputFile = cyprIoTfile.getParent()+File.separator+"network-gen"+File.separator+"output.thingml";
		Resource res = help.transform(outputFile, cyprIoTfile, device1);
		
		ThingMLModel parseDevice1 = Helpers.getModelFromResource(res, ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
	}
	
	@Test
	public void test1_TwoThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("1_TwoThings/main.cy").getFile());
		File device1 = new File(classLoader.getResource("1_TwoThings/device1.thingml").getFile());
		File device2 = new File(classLoader.getResource("1_TwoThings/device1.thingml").getFile());
		
	}
	
	@Test
	public void test2_TwoWayBind() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("2_TwoWayBind/main.cy").getFile());
		File device1 = new File(classLoader.getResource("2_TwoWayBind/device1.thingml").getFile());
		File device2 = new File(classLoader.getResource("2_TwoWayBind/device2.thingml").getFile());
		
	}
	
	@Test
	public void test3_ThreeThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("3_ThreeThings/main.cy").getFile());
		File device1 = new File(classLoader.getResource("3_ThreeThings/device1.thingml").getFile());
		File device2 = new File(classLoader.getResource("3_ThreeThings/device2.thingml").getFile());
		File device3 = new File(classLoader.getResource("3_ThreeThings/device3.thingml").getFile());
		

	}
	
	@Test
	public void test4_FourThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("4_FourThings/main.cy").getFile());
		File device1 = new File(classLoader.getResource("4_FourThings/device1.thingml").getFile());
		File device2 = new File(classLoader.getResource("4_FourThings/device2.thingml").getFile());
		File device3 = new File(classLoader.getResource("4_FourThings/device3.thingml").getFile());
		File device4 = new File(classLoader.getResource("4_FourThings/device4.thingml").getFile());
	}
}