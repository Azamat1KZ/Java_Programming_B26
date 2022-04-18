package day47_encapsulation;

import day43_custom_classes.TrafficLight;

public class Road {
    public static void main(String[] args) {
        TrafficLights lights = new TrafficLights("grey");
//        System.out.println(lights.color);
//
//        lights.color = "pink";

        TrafficLights lights2 = new TrafficLights("red");
        System.out.println(lights2.getColor());
        lights2.setColor("grey");

        System.out.println(lights2.getColor());
        TrafficLights lights3 = new TrafficLights("Black");
        System.out.println(lights3.getColor());
    }


}
