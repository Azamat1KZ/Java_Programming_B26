package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors = "";
        while (colorsPicked < 3){
            System.out.println("Pick color: ");
            String color = input.nextLine().toLowerCase();
            if(uniqueColors.contains(color)){
                System.out.println("You have this color");
            }else{
                // if we are here, it means that the color is unique
                uniqueColors += color + " ";
                colorsPicked++;
            }
        }
        System.out.println(uniqueColors);
    }
}
