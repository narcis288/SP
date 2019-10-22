import javax.management.StringValueExp;

public class Test {
    public static void main(String [] args){
        Book discoTitanic=new Book(" Disco Titanic");
        Authors rpGheo=new Authors("Radu Pavel Gheo");

        discoTitanic.addauthors(rpGheo);
        int indexofChapter=discoTitanic.createChapter("Chapter 1");
        Chapter chp1=discoTitanic.getChapter(indexofChapter);
        int indexofsubchapter = chp1.createsubChapter("Subcapitol 1.1");


        SubChapter scOneOne=chp1.getSubchapter(indexofsubchapter);
        scOneOne.createparagraph("Paragraph 1");
        scOneOne.createparagraph("Paragraph 2");
        scOneOne.createImage("image");
        scOneOne.createparagraph("Paragraph 4");
        scOneOne.createTable("table 1");
        int t=scOneOne.createparagraph("Paragraph 5");

        scOneOne.print();


    }
}
