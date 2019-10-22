import java.util.ArrayList;

public class Image {
    String name_chapter;
    static int indexof_subchapter=0;
    ArrayList<SubChapter> lista;
    Image(String nn){
        this.name_chapter=nn;
        indexof_subchapter++;
    }
}
