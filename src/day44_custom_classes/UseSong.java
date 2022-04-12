package day44_custom_classes;

public class UseSong {

    public static void main(String[] args) {
        Song song1 = new Song("Waka waka");
        System.out.println(song1);

        Song song2 = new Song("vivala vida", 3.5);
        System.out.println(song2);

        Song song3 = new Song("Halo", 4, "Beyonce", "Pop");
        System.out.println(song3);
    }
}
