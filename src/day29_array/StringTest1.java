package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
//        String s = "the game was tied at 2-2";
//        String s2 = s.substring(5);
//
//        int index1 = s.indexOf("game");
//        int index2 = s2.indexOf("game");
//
//        if (index1 == index2){
//            System.out.println(index1);
//        }else {
//            System.out.println(index2);
//        }
//        String z = "popcorn";
//        z = z.substring(1,8);
//        if (z.equals("opcor")){
//            System.out.println(z.length());
//        }else {
//            System.out.println(z.replace("o,", "a"));
//        }

//        String a = "today I will go to the beach";
//        boolean b = a.contains("i");
//        boolean c = a.substring(12).startsWith("go");
//
//        String result = b && c ? "go" : "don't go";
//        System.out.println(result);
//            System.out.println(i);
 //       }
//        int number = 5;
//        while (number < 100){
//            number += number;
//
//        }
//        System.out.println(number);

//     String word = "java";
////     int a = 0;
////     do {
////         System.out.println(word.charAt(a));
////         a++;
////     }while (a > word.length());

//        String str = "The whole time it was raining.";
//        do {
//            System.out.println(str.charAt(0));
//            str = str.substring(3);
//        }while (!str.isEmpty());
//
//        String input = "today";
//        int n = 0;
//        while (n < input.length()){
//            n++;
//            if(n%2 == 1){
//                continue;
//            }
//            System.out.println(input.charAt(n));
//        }

//        int num1 = 2;
//        int num2 = 6;
//            int iterate = 5;
//            int total = 0;
//        for (int i = 0; i < 5; i++) {
//            if(i % 3 ==0) continue;
//            total += num1 + num2;
//        }
//        System.out.println(total);


//        int count = 0;
////        for (int a = 0; a < 3; a++) {
////            for (int b = a +1; b < 4; b++) {
////                count++;
////            }
////        }
////        System.out.println(count);

//        double [] doub = new double[4];
//        doub[0] = 1.0;
//        doub[2] = 42.1;
//        doub = new double[4];
//        doub[1] = 17.2;
//        doub[3] = doub.length;
//        System.out.println(Arrays.toString(doub));

//        String[] strs = {"display", "population", "meeting", "copy", "franchise"};
//
//        int a = strs.length;
//        int b = strs[5].length();
//        System.out.println(a + " " + b);
//
//        int [] b ={1,2,3};
//        for (int j = 0; j < b.length; j++) {
//            b[j] = (b[j] * 2);
//
//        }
//        System.out.println(Arrays.toString(b));

//        String [] words = {"one", "two", "three", "four"};
//        String [] other = new String[words.length];
//
//        for (int i = 0; i < words.length; i++) {
//            other[i] = words[i] + words[i].length();
//        }
//        System.out.println(Arrays.toString(other));

//        int [] nums = {14,1,84,97,1243,46};
//        int total = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] % 2 != 0){
//                total += 5;
//            }else{
//                total += 10;
//            }
//        }
//        System.out.println(total);


        String [] things = {"house", "shed", "slide", "zebra", "park", "garden"};

        for(String s : things){
            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);
            }
        }
 }
}
