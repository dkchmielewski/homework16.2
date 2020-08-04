public enum CardValue {
    TWO("dwojka", "two"),
    THREE("trojka", "three"),
    FOUR("czworka", "four"),
    FIVE("piatka", "five"),
    SIX("szostka", "six"),
    SEVEN("siodemka", "seven"),
    EIGHT("osemka", "eight"),
    NINE("dziewiatka", "nine"),
    TEN("dziesiatka", "ten"),
    JACK("walet", "jack"),
    QUEEN("krolowa", "queen"),
    KING("krol", "king"),
    ACE("as", "ace");

    private final String plName;
    private final String engName;

    CardValue(String plName, String engName) {
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
