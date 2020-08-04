public enum CardColor {
    CLUBS("zoladz", "clubs"),
    DIAMONDS("dzwonek", "damonds"),
    HEARTS("kier", "hearts"),
    SPADES("pik", "spades");

    private final String plName;
    private final String engName;

    CardColor(String plName, String engName) {
        this.plName = plName;
        this.engName = engName;
    }

    public String getPlName() {
        return plName;
    }

    public String getEngName() {
        return engName;
    }
}
