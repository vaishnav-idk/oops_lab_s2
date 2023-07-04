import java.util.*;

class negative extends Exception  
{  
    public negative (String str)  
    {  
        super(str);  
    }  
} 

public class Avgint {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of Positive integers to find the average of: ");
        int n = sc.nextInt();  
        int[] arr;
        arr = new int[n];

        for(int i = 0; i < arr.length ; i++){
            System.out.println("Enter Positive integer: ");
            arr[i] = sc.nextInt(); 
            
            if(arr[i] < 0)
            {
                try
                    {
                        throw new negative("Error: Negative Integer Entered!!!");
                    }
                catch(negative e){
                    System.out.println(e.getMessage());
                }

                return;
            }
        }
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            sum=sum+arr[i];
        }

        double average = sum/n;
        System.out.println(average);

    }
}




