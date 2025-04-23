import java.io
import java.io.IOException;*
public class FileReadExample {
    public.static.void main(string[] args) throws IOE Exception
    Bufferedreader br= new bufferreader new file reader ("C:\Users\CSE-Lab\Desktop\CSE_24021\week8\week9.txt");
    String line;
    While ((line=br readline()!)=null);
    System.out.println(line);
    br.close();
    catch (IOException e);
    e.printStackTrace();
}
 
 

}
