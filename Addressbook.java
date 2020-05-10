import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List; 
import java.util.ArrayList;
import java.util.Iterator; 
import java. util. Collections;

public class Addressbook {
    
    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

    List<AddressbookTemplate> list = null;

    AddressbookTemplate Template = null;

    Iterator<AddressbookTemplate> iterator = null;

    AddressbookWrite addbookWrite = null;

    //AddressbookRead addbookRead = null;

    public void Addbook()throws IOException {

        while(true) {
			
            	int iChoice = 0;
		
		System.out.println("Please Enter Your Choice to use the Database: ");
			
            	try {
        		iChoice = Integer.parseInt(bufferReader.readLine());
			
            	} catch (NumberFormatException e) {
				
                	System.out.println("Please Enter Only Number:");
				
                	bufferReader.readLine();
				
                	continue;
		        
			} catch (Exception e) {
				
                	e.printStackTrace();
				
                	continue;
		        }

        	switch(iChoice) {

                	case 0:
                    
				//addbookRead = new AddressbookRead();
                    		//addbookRead.readAddressBook();
                    
                    	break;
                
                	case 1://Adds an Entries In Database
                    		try {
                	    		System.out.println("Enter First Name : ");
			    		String fName = bufferReader.readLine();

                            		System.out.println("Enter Last Name : ");
			    		String lName = bufferReader.readLine();
					
                            		System.out.println("Enter Phone Number : ");
			    		String phoneNumber = bufferReader.readLine();

			    		System.out.println("Enter Email Address : ");
			    		String emailId = bufferReader.readLine();

			    		System.out.println("Enter Address : ");
			    		String Address = bufferReader.readLine();

			    		if(list == null) {
						list = new ArrayList<AddressbookTemplate>();
                            		}
						
                    	    		Template = new AddressbookTemplate(fName,lName,phoneNumber,emailId,Address);
			    		list.add(Template);
			    		Template.printInfo();
                    	    		System.out.println("Data Successfully gets loaded In Database");
						
				    } catch (IOException e) {
					System.out.println("Problem in Adding Entry");
					e.printStackTrace();
				    }
				    break;
                	case 2: 
                    		if (list != null) {
                        
					System.out.println("Enter 1 to Serch By First Name");
                        		System.out.println("Enter 2 to Serch By Last Name");
					System.out.println("Enter 3 to Serch By Phone Number");
					System.out.println("Enter 4 to Serch By Email ID");
					System.out.println("Enter 5 to Serch By Address");
                        
					System.out.println("Enter Your Choice:");
					int search_Choice = Integer.parseInt(bufferReader.readLine());
                        		System.out.println();
                        		System.out.println("Enter 1 to Full Match");
                        		System.out.println("Enter 2 to Starts With");
					System.out.println("Enter 3 to Ends With");
					System.out.println("Enter 4 to Contains");
                        		System.out.println();
                        
					for(iterator = list.iterator(); iterator.hasNext();) {
                        		 Template = iterator.next();
					 
					if (search_Choice == 1) {
							
                                	 	System.out.println("Enter Your Choice:");
                                		int criteria_Choice = Integer.parseInt(bufferReader.readLine());
							
                                		if(criteria_Choice == 1) {
                                    			System.out.println("Enter First Name That You Want to Search:");
                                    			String searchFirstName = bufferReader.readLine();

                                    			if (Template.getFirstName().equalsIgnoreCase(searchFirstName)) {
                                        			System.out.println("You are Searched Information First Name With Full Match is:");
                                        			Template.printInfo();
                                    			}
                                		} else if(criteria_Choice == 2) {
                                    			System.out.println("Enter Starting Characters of First Name That You Want to Search:");
                                    			String firstNameStartsWith = bufferReader.readLine();
                                
                                    			if (Template.getFirstName().startsWith(firstNameStartsWith)) {
                                        			System.out.println("You are Searched Information First Name Starts With:");
                                        			Template.printInfo();
                                    			}
                                		} else if(criteria_Choice == 3) {
                                    			System.out.println("Enter Last Characters of First Name That You Want to Search");
                                    			String firstNameEndsWith = bufferReader.readLine();
                                
                                    			if (Template.getFirstName().endsWith(firstNameEndsWith)) {
                                       				System.out.println("*****You are Searched Information First Name Ends With*****");
                                       				Template.printInfo();
                                    			}
                                		} else if(criteria_Choice == 4) {
                                    			System.out.println("Enter Characters That You Want to Search");
                                    			String firstNameContains = bufferReader.readLine();
                                
                                    			if (Template.getFirstName().contains(firstNameContains)) {
                                        			System.out.println("*****You are Searched Information First Name Contains*****");
                                        			Template.printInfo();
                                			}
                                		}
                            		
					} else if (search_Choice == 2) {
                                		System.out.println("Enter Your Choice:");
                                		int criteria_Choice2 = Integer.parseInt(bufferReader.readLine());
							
						if(criteria_Choice2 == 1) {
                                			System.out.println("Enter Last Name That You Want to Search:");
                                			String searchLastName = bufferReader.readLine();

                                			if (Template.getLastName().equalsIgnoreCase(searchLastName)) {
                                    				System.out.println("You are Searched Information Last Name With Full Match is:");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice2 == 2) {
                                			System.out.println("Enter Starting Characters of Last Name That You Want to Search:");
                                			String lastNameStartsWith = bufferReader.readLine();
                                
                                			if (Template.getLastName().startsWith(lastNameStartsWith)) {
                                			    	System.out.println("You are Searched Information First Name Starts With:");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice2 == 3) {
                                			System.out.println("Enter Last Characters of Last Name That You Want to Search");
                                			String lastNameEndsWith = bufferReader.readLine();
                                
                                			if (Template.getLastName().endsWith(lastNameEndsWith)) {
                                    				System.out.println("*****You are Searched Information Last Name Ends With*****");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice2 == 4) {
                                			System.out.println("Enter Characters That You Want to Search");
                                			String laststNameContains = bufferReader.readLine();
                                
                                			if (Template.getLastName().contains(laststNameContains)) {
                                    				System.out.println("*****You are Searched Information Last Name Contains*****");
                                    				Template.printInfo();
                                			}
                            			}
                        		} else if (search_Choice == 3) {
						System.out.println("Enter Your Choice:");
                            			int criteria_Choice3 = Integer.parseInt(bufferReader.readLine());
						
						if(criteria_Choice3 == 1) {
                                			System.out.println("Enter Phone Number That You Want to Search:");
                                			String searchPhoneNo = bufferReader.readLine();

                                			if (Template.getPhoneNumber().equalsIgnoreCase(searchPhoneNo)) {
                                    			System.out.println("You are Searched Information of Phone Number With Full Match is:");
                                    			Template.printInfo();
                                			}
                            			}else if(criteria_Choice3 == 2) {
                                			System.out.println("Enter Starting Numbers of Phone Number That You Want to Search:");
                                			String phoneNoStartsWith = bufferReader.readLine();
                                
                                			if (Template.getPhoneNumber().startsWith(phoneNoStartsWith)) {
                                    				System.out.println("You are Searched Information Phone Number Starts With:");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice3 == 3) {
                                			System.out.println("Enter Last Characters of Phone Number That You Want to Search");
                                			String phoneNoEndsWith = bufferReader.readLine();
                                
                                			if (Template.getPhoneNumber().endsWith(phoneNoEndsWith)) {
                                    				System.out.println("*****You are Searched Information Phone Number Ends With*****");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice3 == 4) {
                                			System.out.println("Enter Characters That You Want to Search");
                                			String phoneNoContains = bufferReader.readLine();
                                
                                			if (Template.getPhoneNumber().contains(phoneNoContains)) {
                                    				System.out.println("*****You are Searched Information of Phone Number Contains*****");
                                    				Template.printInfo();
                                			}
                            			}
                        		} else if (search_Choice == 4) {
						System.out.println("Enter Your Choice:");
                            			int criteria_Choice4 = Integer.parseInt(bufferReader.readLine());
							
                            			if(criteria_Choice4 == 1) {
                                			System.out.println("Enter EmailId That You Want to Search:");
                                			String searchEmailId = bufferReader.readLine();

                                			if (Template.getEmailAddress().equalsIgnoreCase(searchEmailId)) {
                                    				System.out.println("You are Searched Information of EmailID With Full Match is:");
                                    				Template.printInfo();
                                			}
                            			}else if(criteria_Choice4 == 2) {
                                			System.out.println("Enter Starting Characters of EmailID That You Want to Search:");
                                			String emailIdStartsWith = bufferReader.readLine();
                                
                                			if (Template.getEmailAddress().startsWith(emailIdStartsWith)) {
                                    				System.out.println("You are Searched Information EmailId Starts With:");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice4 == 3) {
                                			System.out.println("Enter Last Characters of EmailID That You Want to Search");
                                			String emailIdEndsWith = bufferReader.readLine();
                                
                                			if (Template.getEmailAddress().endsWith(emailIdEndsWith)) {
                                    				System.out.println("*****You are Searched Information EmailId Ends With*****");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice4 == 4) {
                                			System.out.println("Enter Characters That You Want to Search");
                                			String emailIdContains = bufferReader.readLine();
                                
                                			if (Template.getEmailAddress().contains(emailIdContains)) {
                                    				System.out.println("*****You are Searched Information of EmailID Contains*****");
                                    				Template.printInfo();
                                			}
                            			}
                        		} else if (search_Choice == 5) {
						System.out.println("Enter Your Choice:");
                            			int criteria_Choice5 = Integer.parseInt(bufferReader.readLine());
							
                            			if(criteria_Choice5 == 1) {
                                			System.out.println("Enter Address That You Want to Search:");
                                			String searchAddress = bufferReader.readLine();

                                			if (Template.getAddress().equalsIgnoreCase(searchAddress)) {
                                 	   			System.out.println("You are Searched Information of Address With Full Match is:");
                                    	   			Template.printInfo();
                                			}
                            			} else if(criteria_Choice5 == 2) {
                                			System.out.println("Enter Starting Characters of Address That You Want to Search:");
                                			String AddressStartsWith = bufferReader.readLine();
                                
                                			if (Template.getAddress().startsWith(AddressStartsWith)) {
                                    				System.out.println("You are Searched Information Address Starts With:");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice5 == 3) {
                                			System.out.println("Enter Last Characters of Address That You Want to Search");
                                			String AddressEndsWith = bufferReader.readLine();
                                
                                			if (Template.getAddress().endsWith(AddressEndsWith)) {
                                    				System.out.println("*****You are Searched Information Address Ends With*****");
                                    				Template.printInfo();
                                			}
                            			} else if(criteria_Choice5 == 4) {
                                			System.out.println("Enter Characters That You Want to Search");
                                			String AddressContains = bufferReader.readLine();
                                
                                			if (Template.getAddress().contains(AddressContains)) {
                                    				System.out.println("*****You are Searched Information of Address Contains*****");
                                    				Template.printInfo();
                                			}
                            			}
                        		   } else {
					 	System.out.println("Entry Not Found!!!");
					  }
                    			}
                    		} else {
					System.out.println("Database Is Empty");
				}
                    
        

                	break;

                	case 3://Sorts The AddressBook
                		if(list != null) {
                    			System.out.println("Press 1 To Sort AddressBook By First Name");
                    			System.out.println("Press 2 To Sort AddressBook By Last Name");
                    
                    			System.out.println("Enter Your Choice:");
                    			int sort_Choice = Integer.parseInt(bufferReader.readLine());
                    
                    			if(sort_Choice == 1) {
                        			Collections.sort(list, (o1,o2) ->  o1.getFirstName().compareTo(o2.getFirstName()));
                        			System.out.println("*******************Data Sorted Successfully By First Name*******************");
                        
                    			} else if(sort_Choice == 2) {
                        			Collections.sort(list, (o1,o2) ->  o1.getLastName().compareTo(o2.getLastName()));
                        			System.out.println("*******************Data Sorted Successfully By Last Name*******************");
                    			} else {
                        			System.out.println("Data Not Sorted");
                    			}	
                    
                    			if(list != null) {
                        			for (AddressbookTemplate Template : list) {
                            				System.out.println(Template.toString());
                            			}
                        		}	
                		} else {
					System.out.println("Database is Empty!!!!!!"); 
				}
	
                		break;

                	case 4://Delete An entry From the Database
                       		if(list != null) {
                           
                           	int iSize = list.size();

                           	try {
                                     System.out.println("Enter First And Last Name To Delete An Entry");
                                		
                                     System.out.println("Enter First Name:");
                                     String f_Name = bufferReader.readLine();

                               	     System.out.println("Enter Last Name:");
                                     String l_Name = bufferReader.readLine();

                                     for(iterator = list.iterator(); iterator.hasNext();) {
                                         Template = iterator.next();
                                         if((Template.getFirstName().equalsIgnoreCase(f_Name))&&(Template.getLastName().equalsIgnoreCase(l_Name))) {
                                                iterator.remove();
                                            }
                                        }
                                        
                                        
                                	if(list.size() < iSize) {
                                    		System.out.println("Entry Removed Successfully");
                                	} else {
                                    		System.out.println("Entry Not Found");
                                	}
                            	   } catch(IOException e) {
                                 	 e.printStackTrace();
                            	   }
                       		} else {
                           		System.out.println("Database is empty");
                       		}
                       	break;

                	case 5://Edit The Entry
                        	if(list != null) {
                            	System.out.println("Enter First And Last Name of Entry That you want to update:");
                            
                            	System.out.println("Enter First Name:");
                            	String firstName = bufferReader.readLine();

                            	System.out.println("Enter Last Name:");
                            	String lastName = bufferReader.readLine();

                            for(iterator = list.iterator(); iterator.hasNext();) {
                            	Template = iterator.next();

                            	if((Template.getFirstName().equalsIgnoreCase(firstName))&&(Template.getLastName().equalsIgnoreCase(lastName))) {
                                        
					System.out.println("Enter 1 to Update first Name");
                                        System.out.println("Enter 2 to Update Last Name");
                            		System.out.println("Enter 3 to Update Number");
                            		System.out.println("Enter 4 to Update Email Address");
                            		System.out.println("Enter 5 to Update Address");
                            		System.out.println();
                            
                            		System.out.println("Please Enter Your Choice to Update:");
                            		int Choice = Integer.parseInt(bufferReader.readLine());

                                        if(Choice == 1) {
                                             	System.out.println("Enter New First Name:");
                                	    	String newFirstName = bufferReader.readLine();
                                            	Template.setFirstName(newFirstName);
                                	    	System.out.println("Name Updated Successfully: "+Template.getFirstName());
                                        } else if(Choice == 2) {
                                            	System.out.println("Enter New Last Name:");
                                	    	String newLastName = bufferReader.readLine();
                                            	Template.setLastName(newLastName);
                                	    	System.out.println("Last Name Updated Successfully: "+Template.getLastName());
                                        } else if(Choice == 3) {
                                	    	System.out.println("Enter New Phone Number:");
                                		String new_Number = bufferReader.readLine();
                                		Template.setPhoneNumber(new_Number);
                                		System.out.println("Phone Number Successfully: "+Template.getPhoneNumber());
                            		} else if(Choice == 4) {
                                		System.out.println("Enter New Email Address:");
                                		String new_EmailAddress = bufferReader.readLine();
                                		Template.setEmailAddress(new_EmailAddress);
                                		System.out.println("Email Address Updated Successfully: "+Template.getEmailAddress());
                            		}else if(Choice == 5) {
                                		System.out.println("Enter New Address:");
                                		String new_Address = bufferReader.readLine();
                                		Template.setAddress(new_Address);
                                		System.out.println("Email Address Updated Successfully: "+Template.getAddress());
                            		}
                                    }
                                } 
                                }else {
                                    System.out.println("Entry Not Found!!!");
                            }
			break;

                	case 6: //List All Data From The Data Base
                    		if(list != null) {
                        		for (AddressbookTemplate Template : list) {
                            			System.out.println(Template.toString());
                            		}
                        	} else {
					System.out.println("Database IS Empty");
				}
			break;

                	case 7: 
                    		if(list != null) {
                        		addbookWrite = new AddressbookWrite();
                        		addbookWrite.WriteObject();
                        		System.out.println("Data Successfully Gets Loaded in File");
                    		} else {
                        		System.out.println("Database is Empty");
                    		}
                    
                	break;

                	case 8: //Exit the Program
                 	       System.out.println("Thank You for using Address Book");
                 	       System.exit(0);
                	break;

         	}
        }
    }
}
