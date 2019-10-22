import java.util.ArrayList;

public class Table {
    String name_chapter;
    static int indexof_subchapter=0;
    ArrayList<SubChapter> lista;
    Table(String nn){
        this.name_chapter=nn;
        indexof_subchapter++;
    }
}
