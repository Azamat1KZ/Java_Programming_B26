package day29_array;

public class ArraysTest5 {
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x + " " + y);

        String result = 3425 > (9* 1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);

        String str = "the fox ran under the bridge";
        str = str.substring(4,17);
        str.toUpperCase();
        System.out.println(str + "ground");


    }
}
