package archive.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chandra Shekhar Paatni on 6/5/19
 */
public class CustomMapTest {

    @Test
    public void readWriteSimpleValue() {
        CustomMap<Integer, Integer> customMap = new CustomMap<>();
        customMap.put(10, 10);
        Assert.assertEquals(10, customMap.get(10).intValue());
    }

    @Test
    public void overWriteValue() {

        CustomMap<Integer, Integer> customMap = new CustomMap<>();
        customMap.put(10, 10);
        Assert.assertEquals(10, customMap.get(10).intValue());
        customMap.put(10, 20);
        Assert.assertEquals(20, customMap.get(10).intValue());
    }
}
