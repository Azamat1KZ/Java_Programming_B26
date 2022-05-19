package Practice.Donjeta;

public class Don1 {
    public static void main(String[] args) {
        int a = 1; // a = 1 -> 0 -> 1 -> 0 -> -1
        a = -a-- + a++ / -a-- * --a;
        //  -1   + 0   / -1   *  -1
        //  -1         / -1
        //  -1
        System.out.println(a);
    }
}
