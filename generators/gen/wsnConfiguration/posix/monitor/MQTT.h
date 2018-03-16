#ifndef MQTT_PosixMQTT_Client_h
#define  MQTT_PosixMQTT_Client_h

#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <ctype.h>
#include <stdint.h>
#include <math.h>
#include <time.h>
#include <mosquitto.h>

#include "Monitor.h"


struct MQTT_Instance {
    uint16_t listener_id;
    /*INSTANCE_INFORMATION*/
};

void MQTT_setup(struct MQTT_Instance *_instance);

void MQTT_start_receiver_thread();
void MQTT_loop_poll();

// Forwarding of messages MQTT::Monitor::inout::sendTemp
void forward_MQTT_Monitor_send_inout_sendTemp(struct Monitor_Instance *_instance);


#endif
