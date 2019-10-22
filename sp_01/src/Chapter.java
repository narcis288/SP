import java.util.ArrayList;

public class Chapter {
    String name_chapter;
    static int bucatii=0;
    int indexOf=0;
    ArrayList<SubChapter> subChapters=new ArrayList<>();
        Chapter(){

        }
        Chapter(String nn){
            this.name_chapter=nn;
            bucatii++;
        }

        public int createsubChapter(String name_chapter){
                SubChapter chp=new SubChapter(name_chapter);
                subChapters.add(chp);
                return subChapters.indexOf(chp);
            }
         public int indexOf(){
            return this.bucatii;
         }

    public void setSubChapters(SubChapter subChapters) {
        subChapters.add(subChapters);
    }
    public SubChapter getSubchapter(int index ){
            return subChapters.get(index);
    }
    public String toString(){
            return  subChapters.size() +" subparagrafe , cu  "+subChapters.toString();
    }
}
