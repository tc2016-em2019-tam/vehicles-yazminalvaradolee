package com.Yasmin;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep" ,4);
        myArray[1] = new Jeep("Frank's Jeep",4 );
        myArray[2] = new Hovercraft("Sue's Hover-craft", 8,0.0);
        myArray[3] = new Frigate("Money Waster" ,0.0);
        myArray[4] = new PoliceCar("Kitt Knight Rider",3 ,300,4);

        LinkedList<Vehicle> myVehiclesList = new LinkedList<Vehicle>();
        myVehiclesList.add(new Jeep("Fred's Jeep", 4));
        myVehiclesList.add(new Jeep("Frank's Jeep", 4));
        myVehiclesList.add(new Hovercraft("Sue's Hover-craft",4,0.0));
        myVehiclesList.add(new Frigate("Money Waster", 0.0));
        myVehiclesList.add(new PoliceCar("Kitt Knight Rider", 2, 250, 4));

        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle)myArray[i];
                lv.drive();
            }
            if (myArray[i] instanceof SeaVessel) {
                SeaVessel sv = (SeaVessel) myArray[i];
                sv.launch();
            }
            if (myArray[i] instanceof Emergency) {
                Emergency ie = (Emergency) myArray[i];
                ie.soundSiren();
            }

        }

        System.out.println("--------------------");
        System.out.println("List of Vehicles");

        for (int i = 0; i < myVehiclesList.size(); i++) {

            System.out.println(myVehiclesList.get(i).getName());

            if (myVehiclesList.get(i) instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myVehiclesList.get(i);
                lv.drive();
            }
            if (myArray[i] instanceof SeaVessel) {
                SeaVessel sv = (SeaVessel) myVehiclesList.get(i);
                sv.launch();
            }
            if (myVehiclesList.get(i) instanceof Emergency) {
                Emergency ie = (Emergency) myVehiclesList.get(i);
                ie.soundSiren();
            }
        }


    }
}