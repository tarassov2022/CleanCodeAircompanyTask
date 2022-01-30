import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;
import java.util.Arrays;
import java.util.List;


public class Main {


    static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
    );

    public static void main(String[] args) {
        Airport airport = new Airport(planes);
        Airport passengerAirport = new Airport(airport.getPassengerPlanes());
        System.out.println("\nAll planes list:");
        airport.printPlane(planes);
        System.out.println("\nBomber Military planes:");
        airport.printPlane(airport.getBomberMilitaryPlanes());
        System.out.println("\nTransport Military  planes:");
        airport.printPlane(airport.getTransportMilitaryPlanes());
        System.out.println("\nExperimental planes:");
        airport.printPlane(airport.getExperimentalPlanes());
        System.out.println("\nPlanes sorted by max load capacity: ");
        airport.printPlane(airport.sortByMaxLoadCapacity());
        System.out.println("\nMilitary planes sorted by max  flight distance: ");
        airport.printPlane(airport.sortByMaxFlightDistance());
        System.out.println("\nPassenger planes sorted by max speed: ");
        airport.printPlane(airport.sortByMaxSpeed());
        System.out.println("\nPassenger plane with max passenger capacity: ");
        System.out.println(passengerAirport.getPassengerPlaneWithMaxPassengersCapacity());

    }
}
