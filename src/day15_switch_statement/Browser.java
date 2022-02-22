package day15_switch_statement;

public class Browser {
    public static void main(String[] args) {

        String browser = "Chrome";
        String url = "www.google.com";

        switch (browser){
            case "Chrome":
                System.out.println("Opening " + url + " in the Chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in the Safari browser");
                System.out.println("Loading...");
                break;
            case "Opera":
                System.out.println("Opening " + url + " in the Opera browser");
                System.out.println("Loading...");
                break;
            default:
                System.out.println(browser + " is not valid browser");
        }
    }
}
