package Practice.GentritsTasks.Task2;

public class ArraysMaxAndMin {
    public static int ArrayMax(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    public static int ArrayMin(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }


    public static void main(String[] args) {
        int [] numbers = {10, 9, 8, 7};
        System.out.println("ArrayMax(numbers) = " + ArrayMax(numbers));
        System.out.println("ArrayMin(numbers) = " + ArrayMin(numbers));

    }
}
