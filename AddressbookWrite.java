import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddressbookWrite extends Addressbook  {
    
    public void WriteObject() throws IOException {

        try {
            	FileOutputStream fileOutStream = new FileOutputStream("Addressbook.ser");
            	
		ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutStream);

            	objectOutStream.writeObject(list);

            	objectOutStream.close();
        
	} catch (FileNotFoundException e) {
            
		e.printStackTrace();
        
	} catch (IOException e) {
            
		e.printStackTrace();
        } 
    }
    
}
