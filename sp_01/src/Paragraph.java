import java.util.ArrayList;
import java.util.Vector;

public class Paragraph {
    String name_subchapter;
    static int indexof_subchapter=0;
    Vector<Paragraph>t=new Vector<>();

    Paragraph(String nn){
        this.name_subchapter=nn;
        indexof_subchapter++;
    }
    public String getprint(){
        return name_subchapter;
    }
    public int createparagraph(String sub){
        Paragraph chp=new Paragraph(name_subchapter);
        t.add(new Paragraph(name_subchapter));
        return name_subchapter.indexOf(String.valueOf(chp));
    }

}
