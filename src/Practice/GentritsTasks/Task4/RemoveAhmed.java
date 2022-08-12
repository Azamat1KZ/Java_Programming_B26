package Practice.GentritsTasks.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
public static ArrayList<String> removeAhmed (ArrayList<String> names){
    names.removeIf(name -> name.contains("Ahmed"));
    return names;
}

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAhmed(name));
    }
}
