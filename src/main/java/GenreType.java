public enum GenreType {
    HORROR("Very scary"),
    COMEDY("Funny"),
    ROMANCE("Romantic"),
    BIOGRAPHY("True account"),
    THRILLER("Tense story, often with a twist");

    private final String value;

    GenreType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
