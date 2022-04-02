package day31_array;

public class AWS {
    public static void main(String[] args) {
        // app and we want to deploy on multiple zones
        String app = "etsy";
        String zones = "us-east,us-west1,us-west2,us-west3";
        String[] allZones = zones.split(",");
        for (String eachZone : allZones) {
            System.out.println(app + " is deploying on " + eachZone);
        }
        for (int i = 0; i < allZones.length; i++) {
            System.out.println(app + " is deploying on " + allZones[i]);
            //        for(int i = 0; i < allZones.length; i++){
//            System.out.println(app + " is deploying on " + allZones[i]);
        }
    }
}
