package org.prog;

public class Main {
    public static void main(String[] args) {
        Plane[] airpoptPlanes = new Plane [4];
        airpoptPlanes [0] = new Plane ("FLIGHT1", 2);
        airpoptPlanes [1] = new Plane ("FLIGHT2", 3);
        airpoptPlanes [2] = new Plane ("FLIGHT3", 3);
        airpoptPlanes [3] = new Plane ("FLIGHT4", 3);

        FlightControl airport = new FlightControl(airpoptPlanes);
        airport.setPlaneDestination("FLIGHT1", "Atlanta");
        airport.setPlaneDestination("FLIGHT2", "NY");
        airport.setPlaneDestination("FLIGHT3", "Zhytomyr");
        airport.setPlaneDestination("FLIGHT4", "Atlanta");

        createPassengers(airport);

        for (int i = 0; i < airport.passengerNames.length; i++) {
            airport.boardPassenger(i);
        }
    }
    public static void createPassengers(FlightControl airport) {
        airport.registerPassenger(0, "Alice", 0, "FLIGHT1");
        airport.registerPassenger(1, "Bob", 1, "FLIGHT1");

        airport.registerPassenger(2, "Joe", 0, "FLIGHT2");
        airport.registerPassenger(3, "Jane", 1, "FLIGHT2");
        airport.registerPassenger(4, "Alice", 2, "FLIGHT2");

        airport.registerPassenger(5, "Sarah", 0, "FLIGHT3");
        airport.registerPassenger(6, "Arnie", 1, "FLIGHT3");
        airport.registerPassenger(7, "Kyle", 10, "FLIGHT3");

        airport.registerPassenger(8, "Lena", 1, "FLIGHT1");
    }
}

//2.11.52