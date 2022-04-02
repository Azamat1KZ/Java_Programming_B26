package day32_array;

import java.util.Arrays;
import java.util.SortedMap;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = new String[4][3]; //  4 inner arrays 3 elements each
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 2");

        String [] groupTwo = {"Barci", "Demet", "Shina", "Ismail"};
        cydeo [1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 3");
        cydeo[2] = new String[]{"Mustafa", "Lima"}; // syntax to create an array without a reference
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();
        for (String [] innerArray : cydeo){ // loops through the 2d array, cydeo
            for (String eachWord : innerArray){ // loops through every String element in each 1d inner array
                System.out.println(eachWord);
            }
        }

    }
}
