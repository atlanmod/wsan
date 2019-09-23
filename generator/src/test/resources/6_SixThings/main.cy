thing device1 import "device1.thingml"
thing device2 import "device2.thingml"
thing device3 import "device3.thingml"
thing device4 import "device4.thingml"
thing device5 import "device5.thingml"
thing device6 import "device5.thingml"


user myuser1

channel:pubsub pubsub1 {
	topic topic1(m:JSON)
}

network helloNetwork {
	domain org.hello
	instance mydevice1:device1 platform POSIX owner myuser1
	instance mydevice2:device2 platform POSIX owner myuser1
	instance mydevice3:device3 platform POSIX owner myuser1
	instance mydevice4:device4 platform POSIX owner myuser1
	instance mydevice5:device5 platform POSIX owner myuser1
	instance mydevice6:device6 platform POSIX owner myuser1
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice1.temperaturePort => myPubsub1{topic1}
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice3.myport <= myPubsub1{topic1}
	bind mydevice4.myport <= myPubsub1{topic1}
	bind mydevice5.myport => myPubsub1{topic1}
	bind mydevice6.myport => myPubsub1{topic1}
}