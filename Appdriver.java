import java.io.IOException;

public class Appdriver {

    public static void main(String[] args)throws IOException {
        
        

        	System.out.println("*******************************************************************");
		System.out.println("*            Enter Only Number to do use the Address Book         *");
		System.out.println("*******************************************************************");
		System.out.println("*                                                                 *");
        	System.out.println("*            0.    Press 0 to Load Data from file                 *");
		System.out.println("*            1.    Press 1 to Enter The Entry                     *");
		System.out.println("*            2.    Press 2 to Search Specific Entry               *");
		System.out.println("*            3.    Press 3 to Sort The Address Book               *");
		System.out.println("*            4.    Press 4 to Delete The Entry                    *");
		System.out.println("*            5.    Press 5 to Edit an Existing Entry              *");
		System.out.println("*            6.    Press 6 to List all Data                       *");
		System.out.println("*            7.    Press 7 to Save Data in file                   *");
       		System.out.println("*            8.    Press 8 to Exit                                *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
    
    
        
        Addressbook addressbook = new Addressbook();
        addressbook.Addbook();
    }
    
}
