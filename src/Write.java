import java.io.*;
public class Write {
    public static void main(String[] args) {
        try {
            FileWriter writer=new
                    FileWriter("C:\\Users\\Kunal\\Desktop\\BCA\\3rd SEM\\OOP in java\\mytext.txt");
            writer.write("This is a content written in file.");
            writer.write(" This is another content");
            System.out.println("Contents written successfully !");
            writer.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
