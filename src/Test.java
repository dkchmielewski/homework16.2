import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Card> deck = CardDeckGenerator.generate();
        System.out.println(deck.size());
        Language language = getLanguage();
        printDeck(deck, language);
    }

    private static Language getLanguage() {
        Language[] langs = Language.values();
        for (Language lang : langs) {
            System.out.println(lang);
        }
        Language resultLanguage = null;
        do {
            System.out.println("Wybierz jezyk:");
            Scanner scanner = new Scanner(System.in);
            String lang = scanner.nextLine();
            try {
                resultLanguage = Language.valueOf(lang);
            } catch (IllegalArgumentException e) {
                System.out.println("Bledny kod jezyka");
            }
        }
        while (resultLanguage == null);
        return resultLanguage;
    }

    private static void printDeck(List<Card> deck, Language language) {
        for (Card card : deck) {
            switch (language) {
                case PL -> System.out.println(card.plTranslation());
                case EN -> System.out.println(card.engTranslation());
            }
        }
    }
}