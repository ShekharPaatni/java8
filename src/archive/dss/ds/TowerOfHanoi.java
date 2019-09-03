package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class TowerOfHanoi {
    public static void towerOfHanoi (int numberOfDisk, int initialRod, int middleRod, int finalRod) {
        if (numberOfDisk > 0) {
            towerOfHanoi(numberOfDisk-1, initialRod, finalRod, middleRod);
            System.out.println("step 1 "+ initialRod +" to "+ finalRod);
            towerOfHanoi(numberOfDisk-1, middleRod, initialRod, finalRod);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 1, 2,3);
    }
}
