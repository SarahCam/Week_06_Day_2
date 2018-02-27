
public class Book {

    private String name;
    private GenreType genre;

    public Book(String name, GenreType genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }

    public GenreType getGenre(){
        return this.genre;
    }

    public String getValueFromEnum(){
        return this.genre.getValue();
    }

}
