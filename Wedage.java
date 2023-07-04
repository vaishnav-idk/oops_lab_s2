import java.util.*;

class tooyoung extends Exception  
{  
    public tooyoung (String str)  
    {  
        super(str);  
    }  

} 

class tooold extends Exception  
{  
    public tooold (String str)  
    {  
        super(str); 
    } 
} 

public class Wedage{

    void young(int age) throws tooyoung{
        if(age<18){
            throw new tooyoung("Too Young");
        }
    }

    void old(int age) throws tooold{
        if(age>=60){
            throw new tooold("Too Old");
        }
    }       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age: ");
        int age = sc.nextInt();  
        Wedage wed = new Wedage();
        
        if(age >= 18 && age < 60){
            System.out.println("Correct Age");}

        else{
            try{
                wed.young(age);
            }
            catch(tooyoung e){
                System.out.println(e.getMessage());
            }
            try{
                wed.old(age);
            }
            catch(tooold e){
                System.out.println(e.getMessage());
            }
        }
    }
}