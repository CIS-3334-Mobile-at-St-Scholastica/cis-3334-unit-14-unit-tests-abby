package css.cis3334.fishtracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishDataSourceTest {

    @Test
    public void deleteFish() throws Exception {

        // Arrange
        Context appContext = InstrumentationRegistry.getTargetContext();
        FishDataSource fishDataSource = new FishDataSource(appContext);
        fishDataSource.open();
        List<Fish> origFistList =  fishDataSource.getAllFish();
        Fish fish = fishDataSource.createFish("Walleye", "1 lb, 3 oz", "April 12");

        // Act
        fishDataSource.deleteFish(fish);

        // Assert
        List<Fish> modFistList =  fishDataSource.getAllFish();
        assertEquals(origFistList.size(),modFistList.size() );
    }
    @Test
    public void deleteFish() throws Exception {

        // Arrange
        Context appContext = InstrumentationRegistry.getTargetContext();
        FishDataSource fishDataSource = new FishDataSource(appContext);
        fishDataSource.open();
        List<Fish> origFistList =  fishDataSource.getAllFish();
        Fish fish = fishDataSource.createFish("Walleye", "3 lb, 6 oz", "April 1");

        // Act
        fishDataSource.deleteFish(fish);

        // Assert
        List<Fish> modFistList =  fishDataSource.getAllFish();
        assertEquals(origFistList.size(),modFistList.size() );
    }
    view raw;

    @Test
    public void getAllFish() {
//Arrange
    }
}