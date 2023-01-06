package org.prog;

public class FlightControl {
    public Plane [] planes;
    public String [] passengerNames = new String [9];
    public int [] passengerSits = new int [9];
    public String [] passengerFlights = new String [9];
    public String[] destinations;
    public FlightControl(Plane[] airportPlanes) {
        planes = airportPlanes;
        destinations = new String[] {"Atlanta", "Maldives"};

    }
    public void setPlaneDestination (String flightID, String destination) {
        Plane plane  = getPlaneByFlightId(flightID);
        plane.setFlightDestination(destination);
    }
    public void boardPassenger (int passengerId) {
        String passengerName = passengerNames [passengerId];
        int passengerSit = passengerSits [passengerId];
        String flightId = passengerFlights [passengerId];
        Plane plane = getPlaneByFlightId(flightId);
        String destination = destinations [Integer.parseInt(flightId)];
        boolean isBoardingOk = plane.boardPassenger (passengerName, passengerSit);
        if (!isBoardingOk) { getAnotherPlaneWithSameDest(flightId, destination);

        }

    }
    public Plane getPlaneByFlightId (String flightId)    {
        for (int i = 0; i < planes.length; i++) {
            if (planes [i].flightID.equals(flightId)) {
                return planes[i];
            }
        }
        return null;

    }
    public void registerPassenger (int passengerId, String passengerName,
                                   int passengerSit, String flightId) {
        passengerNames [passengerId] = passengerName;
        passengerSits [passengerId] = passengerSit;
        passengerFlights [passengerId] = flightId;
    }
    public Plane getAnotherPlaneWithSameDest (String flightId, String destinations)    {
        for (int i = 0; i < planes.length; i++) {
            if (!planes [i].flightID.equals(flightId) && planes[i].flightDestination.equals(destinations)) {
                return planes[i];
            }
        }
        return null;

} }