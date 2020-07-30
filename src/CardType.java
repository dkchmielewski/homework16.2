public class CardType {

    static String[] figurePolish() {
        String[] figure = new String[13];
        figure[9] = "walet";
        figure[10] = "dama";
        figure[11] = "krol";
        figure[12] = "as";
        for (int i = 0; i < 9; i++) {
            figure[i] = String.valueOf(i + 2);
        }
        return figure;
    }

    static String[] figureEnglish() {
        String[] figure = new String[13];
        figure[9] = "jack";
        figure[10] = "queen";
        figure[11] = "king";
        figure[12] = "ace";
        for (int i = 0; i < 9; i++) {
            figure[i] = String.valueOf(i + 2);
        }
        return figure;
    }
}

//test
