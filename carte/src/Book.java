import java.util.List;

public class Book {
    String nume;
    List<Author> authors;
    List<Chapeter> chapeters;

    public Book(String titanic) {
        this.nume=titanic;
    }
    public void addAuthor(Author b){
        authors.add(b);
    }
    public void addchapeters(Chapeter c){
        chapeters.add(c);
    }
    public void createCharacter(String tit){
        Chapeter b=new Chapeter();
        b.createCharacter(tit);
    }


}
