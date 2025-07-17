package org.example.advaned.leejinwoo.unitThree;

public class SmartDevice {

    public static void main(String[] args) {
        SmartLightDevice smartLightDevice = new SmartLightDevice();
        SmartAirConditionerDevice smartAirConditionerDevice = new SmartAirConditionerDevice();
        SmartSpeakerDevice smartSpeakerDevice = new SmartSpeakerDevice();

        smartLightDevice.turnOn();
        smartLightDevice.turnOff();

        smartAirConditionerDevice.turnOn();
        smartAirConditionerDevice.TemperatureUp();
        smartAirConditionerDevice.turnOff();

        smartSpeakerDevice.turnOn();
        smartSpeakerDevice.musicStart();
        smartSpeakerDevice.musicStop();
        smartSpeakerDevice.turnOff();
        //test
    }
}
