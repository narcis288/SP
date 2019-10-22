import java.util.List;
import java.util.Vector;

public class Chapeter {
    List<Chapeter> lista;
    public Chapeter(){

    }
    public Chapeter(String chapterPage) {

    }

    public static void add(Chapeter chr) {
    }
    public int createCharacter(String chapterPage){
        Chapeter chr=new Chapeter(chapterPage);
        Chapeter.add(chr);
        return chapterPage.indexOf(chapterPage);
    }
}
