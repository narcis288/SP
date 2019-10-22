import java.util.ArrayList;

public class Book {
    public ArrayList<Chapter> chapters=new ArrayList<>();
    public ArrayList<Authors> authors=new ArrayList<>();
    String nume;
    Book (){

    }
    Book (String nume){
        this.nume=nume;
    }
    public void chapters(String cep){
        chapters.add(new Chapter(cep));
    }
    public void addauthors(Authors cc){
        authors.add(cc);
    }
    public Chapter getChapter(int i){
        return chapters.get(i);

    }
    public int createChapter(String name_chapter){
        Chapter chp=new Chapter(name_chapter);
        chapters.add(chp);
        return chapters.indexOf(chp);
    }
    public String toString(){
        return "Cartea "+this.nume+" are " +chapters.size() +" paragrafe"+ chapters.toString();
    }

}
