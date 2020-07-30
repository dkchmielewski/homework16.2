import java.util.Arrays;

public enum CardDeck {
    KIER("serce", "heart", CardType.figurePolish(), CardType.figureEnglish()),
    KARO("dzwon", "diamond", CardType.figurePolish(), CardType.figureEnglish()),
    TREFL("zoladz", "club", CardType.figurePolish(), CardType.figureEnglish()),
    PIK("wino", "spade", CardType.figurePolish(), CardType.figureEnglish());

    private String typePolish;
    private String typeEnglish;
    private String[] figurePolish;
    private String[] figureEnglish;

    CardDeck(String typePolish, String typeEnglish, String[] figurePolish, String[] figureEnglish) {
        this.typePolish = typePolish;
        this.typeEnglish = typeEnglish;
        this.figurePolish = figurePolish;
        this.figureEnglish = figureEnglish;
    }

    public String getTypePolish() {
        return typePolish;
    }

    public String getTypeEnglish() {
        return typeEnglish;
    }

    public void printPolish() {
        for (String polish : figurePolish) {
            System.out.println(polish + " " + getTypePolish());
        }
    }

    public void printEnglish() {
        for (String english : figureEnglish) {
            System.out.println(english + " " + getTypeEnglish());
        }
    }
}
