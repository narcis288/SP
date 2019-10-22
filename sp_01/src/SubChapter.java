import java.util.ArrayList;

public class SubChapter {
    String name_chapter;
    static int indexof_subchapter=0;
    ArrayList<Paragraph> paragraphs=new ArrayList<>();
    ArrayList<Image> images=new ArrayList<>();
    ArrayList<Table> tables=new ArrayList<>();
    SubChapter(){

    }
    SubChapter(String nn){
        this.name_chapter=nn;
        indexof_subchapter++;
    }

    public int indexOf(Chapter p){
        return this.indexof_subchapter;
    }

    public void add(SubChapter subChapters) {
    }
    public int createparagraph(String sub){
        Paragraph chp=new Paragraph(name_chapter);
        paragraphs.add(chp);
        return paragraphs.indexOf(chp);
    }
    public int createImage(String sub){
        Image chp=new Image(name_chapter);
        images.add(chp);
        return images.indexOf(chp);
    }
    public int createTable(String sub){
        Table chp=new Table(name_chapter);
        tables.add(new Table(name_chapter));
        return tables.indexOf(chp);
    }
    public void print(){
        System.out.println("Subcapitolul:"+name_chapter) ;
        System.out.printf("\n");
        for(int r=0;r<paragraphs.size();r++);
        {

            System.out.printf("Paragraf ");

        }

    }
    public int getpara(){
        return paragraphs.lastIndexOf(paragraphs);
    }


}
