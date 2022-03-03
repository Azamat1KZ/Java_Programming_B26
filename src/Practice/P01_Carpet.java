package Practice;

import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class P01_Carpet {
    public static void main(String[] args) {
        /*
         - Ask the user which room do they need carpet? (String)
                            			List of Rooms
                            				Bedroom
                            				Kitchen

                            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

                            		- Ask the user roomType dimensions (as meter and double)
                            			Kitchen is circle.Take radius from user
                            			Bedroom is square or Rectangle.Take lenght and width from user

                            			- Ask the user to delivery address (String, multiple words)
                            			- unitPriceForCarpet = 3.92
                            			- totalcost = area*unitPriceForCarpet;

                            - Print in the following format:
                            		Ex:
                            			inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

                            			"TotalCost for your carpet is 47.04 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"
                                     */
        Scanner input = new Scanner(System.in);
        System.out.println("Which room do you need carpet?:\n\t1) Bedroom\n\t2) Kitchen ");
        String roomType = input.nextLine().toLowerCase();
        boolean isValid = roomType.equals("bedroom") || roomType.equals("kitchen");
        double unitPrice = 3.92;
        double area = 0;

        if (isValid) {
            System.out.println("Calculating....");
            switch (roomType) {
                case "bedroom":
                    System.out.println("please enter your " + roomType + " dimensions ");
                    double width = input.nextDouble();
                    double length = input.nextDouble();
                    area = width * length;
                    break;
                case "kitchen":
                    System.out.println("please enter your " + roomType + " dimensions ");
                    double radius = input.nextDouble();
                    area = radius * radius * 3.14;
                    break;
            }

            double totalCost = unitPrice * area;
            input.nextLine();
            System.out.println("Please enter your address");
            String address = input.nextLine();
            System.out.println("TotalCost for your carpet is " + totalCost + " and it will be delivery " + address + " in one week");
        } else {
            System.out.println("Invalid");
        }

    }
}