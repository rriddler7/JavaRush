package JavaSyntax;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("/Users/rriddler/Desktop/clean.sh");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/rriddler/Desktop/clean_copy.sh");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
