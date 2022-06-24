package Practice.GentritsTasks.Task1;

public class FindUnique {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String checked = "";
        for (int i = 0; i < str.length(); i++){ //A
            if(checked.contains("" + str.charAt(i))){
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(str.charAt(i));
            }
            checked+= str.charAt(i);
        }
    }
}
