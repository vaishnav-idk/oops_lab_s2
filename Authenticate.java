import java.util.*;

class Auth extends Exception  
{  
    Auth (String str)  
    {  
        super(str);  
    }  
} 

public class Authenticate {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        String uname = sc.next();  
        System.out.println("Enter the password: ");
        String pass = sc.next();  
        sc.close();        

        if(uname.equals("exam1") && pass.equals("exam@123"))
            System.out.println("Login Success");
        else{
                try{
                    throw new Auth("Error: wrong credentials Entered!!!");
                }
                catch(Auth e){
                    System.out.println(e.getMessage());
                }
        }    
    }
}





