package Replit;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 0;
        int growth = 0;
        int treeSize = 0;

        for (int i = 0; i < 10; i++) {
            if (year < 3) {
                year++;
                growth = 1;
                treeSize++;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + " cm");
            } else {
                year++;
                growth = 2;
                treeSize += 2;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + " cm");
            }
        }
    }
}