package day14_nested_if;

public class MovieCost {
    /*The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99
     */
    public static void main(String[] args) {
        double duration = 3;
        if (duration <= 0){
            System.out.println("Movies cannot be less than 0 minutes");
        }else if (duration >= 4){
            System.out.println("Movies cannot be more than 4 hours");
        }else{
            if (duration == 1){
                System.out.println("Price: $8.99");
            }else if (duration == 1.5){
                System.out.println("Price: $10.5");
            }else if (duration == 2.0){
                System.out.println("Price is: $12.99");
            }else if (duration == 2.5){
                System.out.println("Price is: $14.50");
            }else if (duration >= 3 && duration < 4){
                System.out.println("Price is: $ 15.99");
            }
        }
    }

}
