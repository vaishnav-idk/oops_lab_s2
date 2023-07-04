import java.util.*;
public class stringmanipulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=sc.next();
        System.out.println();
        System.out.println("Enter String 2");
        String s2=sc.next();     
        System.out.println();
        
        if(s1.compareTo(s2)>0)
            System.out.println("String 1 is Greater");

        else if(s1.compareTo(s2)==0)
            System.out.println("Both Strings Are Equal");

        else
            System.out.println("String 2 is Greater");
        
        System.out.println();
        System.out.println(s1.concat(s2));
        System.out.println();

        String s3= "Hello Everyone"; 
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.length());
        System.out.println(s3.replace("y", "i"));
        System.out.println(s3.charAt(3));

    }
}
