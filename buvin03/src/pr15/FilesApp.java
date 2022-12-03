package pr15;
import java.io.*;
public class FilesApp {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("C:\\Users\\ivc1-5\\note.txt", false))
        {
            // запись всей строки
            String text = "Тестовый текст в файл";
            writer.write(text);

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileReader reader = new FileReader("C:\\Users\\ivc1-5\\note.txt"))
        {
            // читаемпосимвольно
            int c;
            while((c= reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}



