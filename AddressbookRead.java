import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;


public class AddressbookRead extends Addressbook {

    public void readAddressBook() throws IOException {
       	
		try {
			FileInputStream fileIn = new FileInputStream("Addressbook.ser");

			ObjectInputStream in = new ObjectInputStream(fileIn);
	    
	                AddressbookTemplate Template = (AddressbookTemplate)in.readObject();

			System.out.println(Template.toString());

			in.close();

			fileIn.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} 
    }
}
