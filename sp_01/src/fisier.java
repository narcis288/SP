import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class fisier {
    public static void citestefisier(String fis) throws IOException {
        FileReader f = null;
        try {
            System.out.println("Deschidem fiserul " + fis);
            f = new FileReader(fis);

            int c;
            while ((c = f.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            System.err.print("Fisierul nu a fost gasit 1 \n");
            System.err.print("Exceptie:" + e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.out.print("Eroarea la citirea din fisier");
            e.printStackTrace();
        } finally {
            if(f!=null){
                System.out.println("\nInchidem fisierul");
            try{
            f.close();
        }catch(IOException e){
            System.err.println("Fisierul nu poate fi inchis");
            e.printStackTrace();
        }}}
    }
    public static void main(String []args){
        if(args.length>0) {
            try {
                citestefisier(args[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("Lipeste numele fisierului");
    }
}

