import org.testng.Assert;
import org.testng.annotations.Test;
import planes.PassengerPlane;

public class AirportTest {
    TestLists testLists = new TestLists();

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(testLists.getTransportMilitaryPlanes().equals(airport.getTransportMilitaryPlanes()));
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(testLists.getPlanes());
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(testLists.getPlaneWithMaxPassengerCapacity()));
    }

    @Test
    public void testSortByMaxLoadCapacity() {
       Airport airport = new Airport(testLists.getPlanes());
       Assert.assertTrue(airport.sortByMaxLoadCapacity().equals(testLists.getPlanesSortedByMaxLoadCapacity()));
    }

    @Test
    public void testGetBomberMilitaryPlanes() {
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(testLists.getBomberMilitaryPlanes().equals(airport.getBomberMilitaryPlanes()));
    }

    @Test
    public void testGetExperimentalPlanes(){
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(testLists.getExperimentalPlanes().equals(airport.getExperimentalPlanes()));
    }

    @Test
    public void testSortByMaxFlightDistance() {
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(airport.sortByMaxFlightDistance().equals(testLists.getPlanesSortedByMaxFlightDistance()));
    }

    @Test
    public void testSortByMaxSpeed() {
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(airport.sortByMaxSpeed().equals(testLists.getPlanesSortedByMaxSpeed()));
    }

    @Test
    public void testGetPassengerPlanes() {
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(testLists.getPassengerPlanes().equals(airport.getPassengerPlanes()));
    }

    @Test
    public void testGetMilitaryPlanes() {
        Airport airport = new Airport(testLists.getPlanes());
        Assert.assertTrue(testLists.getMilitaryPlanes().equals(airport.getMilitaryPlanes()));
    }
}
