import java.io.Serializable;
 
class AddressbookTemplate implements Serializable {

   
    private String first_Name;
    private String last_Name;
    private String phone_Number;
    private String email_Id;
    private String Address;
    
    AddressbookTemplate (String fName,String lName,String phoneNumber,String emailId,String personalAddress) {
        
        first_Name = fName;
        last_Name = lName;
        phone_Number = phoneNumber;
        email_Id = emailId;
        Address = personalAddress;

    }
    
    public void setFirstName(String fName) {
        this.first_Name = fName;
    }
    
    public String getFirstName() {
        return first_Name;
    }

    public void setLastName(String lName) {
        this.last_Name = lName;
    }
    
    public String getLastName() {
        return last_Name;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phone_Number = phoneNumber;
    } 
    
    public String getPhoneNumber() {
        return phone_Number;
    } 

    public void setEmailAddress(String emailId) {
        this.email_Id = emailId;
    }
  
    public String getEmailAddress() {
        return email_Id;
    }

    public void setAddress(String personalAddress) {
       this.Address = personalAddress;
   }

   public String getAddress() {
       return Address;
   }

    public void printInfo() {
        System.out.println("First Name:"+first_Name+",Last Name:"+last_Name+",Phone Number:"+phone_Number+",EmailId:"+email_Id+",Address:"+Address);
    }
    
    @Override
    public String toString() {
        return "[First Name:"+first_Name+",Last Name:"+last_Name+",Phone Number:"+phone_Number+",EmailId:"+email_Id+",Address:"+Address+"]";
    }
}

