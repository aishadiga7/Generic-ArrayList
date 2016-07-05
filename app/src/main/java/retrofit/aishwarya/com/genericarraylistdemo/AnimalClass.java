package retrofit.aishwarya.com.genericarraylistdemo;

/**
 * Created by aishwarya on 4/7/16.
 */
abstract public class AnimalClass {
    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int LION = 2;
    public static final int TIGER = 3;

    public String getMainType() {
        return "Animal";
    }


    public abstract int getItemType();
}
