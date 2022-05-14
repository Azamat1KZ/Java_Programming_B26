package Quiz4;

public class Phone {
    public Phone(){
    System.out.print(1);
}
public Phone(int num){
    this();
    System.out.print(2);
}
public Phone (String str){
    this(str.length());
    System.out.println(3);
}
}