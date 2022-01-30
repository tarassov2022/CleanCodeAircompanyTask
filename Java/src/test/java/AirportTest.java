
import models.ClassificationLevel;
import models.ExperimentalTypes;
import models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.Test;
import planes.ExperimentalPlane;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.Arrays;
import java.util.List;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
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
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET));

    private static List<Plane> PlanesSortedByMaxLoadCapacity = Arrays.asList(
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT));


    private static List<Plane> transportMilitaryPlanes = Arrays.asList(
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT));

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    private static List<MilitaryPlane> bomberMilitaryPlanes=Arrays.asList(
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER)

    );
    private static List<ExperimentalPlane> experimentalPlanes=Arrays.asList(
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET)
    );
    private static List<Plane> PlanesSortedByMaxFlightDistance = Arrays.asList(
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER)
    );
    private static List<Plane> PlanesSortedByMaxSpeed = Arrays.asList(
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER)
    );
    private static List<PassengerPlane> passengerPlanes=Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196)
    );
    private static List<MilitaryPlane> militaryPlanes=Arrays.asList(
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)

    );


    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        Assert.assertTrue(transportMilitaryPlanes.equals(airport.getTransportMilitaryPlanes()));
    }





    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(planes);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }

    @Test
    public void testSortByMaxLoadCapacity() {
       Airport airport = new Airport(planes);
       Assert.assertTrue(airport.sortByMaxLoadCapacity().equals(PlanesSortedByMaxLoadCapacity));
        }



    @Test
    public void testGetBomberMilitaryPlanes() {
        Airport airport = new Airport(planes);
        Assert.assertTrue(bomberMilitaryPlanes.equals(airport.getBomberMilitaryPlanes()));
    }

    @Test
    public void testGetExperimentalPlanes(){
        Airport airport = new Airport(planes);
        Assert.assertTrue(experimentalPlanes.equals(airport.getExperimentalPlanes()));

    }

    @Test
    public void testSortByMaxFlightDistance() {
        Airport airport = new Airport(planes);
        Assert.assertTrue(airport.sortByMaxFlightDistance().equals(PlanesSortedByMaxFlightDistance));}

    @Test
    public void testSortByMaxSpeed() {
        Airport airport = new Airport(planes);
        Assert.assertTrue(airport.sortByMaxSpeed().equals(PlanesSortedByMaxSpeed));}

    @Test
    public void testGetPassengerPlanes() {
        Airport airport = new Airport(planes);
        Assert.assertTrue(passengerPlanes.equals(airport.getPassengerPlanes()));
    }

    @Test
    public void testGetMilitaryPlanes() {
        Airport airport = new Airport(planes);
        Assert.assertTrue(militaryPlanes.equals(airport.getMilitaryPlanes()));
    }
}
