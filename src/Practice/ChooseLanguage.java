package Practice;

public class ChooseLanguage {
    /*
    create a class ChooseLanguage

ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French

based on the number they picked print a message:

	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
     */
    public static void main(String[] args) {
        int laguage = 4;
        if (laguage ==1){
            System.out.println("hello, thank for your call");
        }else if (laguage == 2){
            System.out.println("hola, gracias para llamar");
        }else if(laguage == 3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if(laguage == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if(laguage == 5){
            System.out.println("Bonjour, merci pour votre appel");
        }
    }
}
