package Practice.GentritsTasks.Task2;

public class Addition1 {

        public static int sumOfDigits(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    String tmp = str.substring(i, i + 1);
                    sum += Integer.parseInt(tmp);
                }
            }
            return sum;
        }


        public static void main(String[] args) {
            Addition1 m = new Addition1();
            String str1 = "fhthtn25h54";
            System.out.println("The given string is: " + str1);
            System.out.println("The sum of the digits in the string is: " + m.sumOfDigits(str1));


        }
    }


