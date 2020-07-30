import java.util.Scanner;

public class UserInfo {
    static void getUserInfo() {
        System.out.println("Podaj nazwe jezyka");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equals("PL")) {
            CardDeck.KARO.printPolish();
            CardDeck.TREFL.printPolish();
            CardDeck.KIER.printPolish();
            CardDeck.PIK.printPolish();
        } else if (userInput.equals("EN")) {
            CardDeck.KARO.printEnglish();
            CardDeck.TREFL.printEnglish();
            CardDeck.KIER.printEnglish();
            CardDeck.PIK.printEnglish();
        } else System.out.println("Wrong input");
    }
}

//test
