import graphics.*;
import java.util.*;

public class packagetest{
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        graphics.rectangle r = new graphics.rectangle();
        graphics.square s = new graphics.square();
        graphics.circle c = new graphics.circle();
        graphics.triangle t = new graphics.triangle();

        int choice, cont=1, side,len,br;
        double rad;
        float base,height;

        do{
        System.out.println("Select Shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");

        choice=sc.nextInt();

        switch(choice){
            case 1: 
            System.out.println("Enter Length");
            len=sc.nextInt();
            System.out.println("Enter Breadth");
            br=sc.nextInt();
            r.area(len, br);
            break;

            case 2: 
            System.out.println("Enter Side");
            side=sc.nextInt();
            s.area(side);
            break;

            case 3: 
            System.out.println("Enter Radius");
            rad=sc.nextDouble();
            c.area(rad);
            break;  

            case 4: 
            System.out.println("Enter Base");
            base=sc.nextFloat();
            System.out.println("Enter Height");
            height=sc.nextFloat();
            t.area(base, height);
            break;
            
            default: System.out.println("Invalid Choice!!!");
        }

        System.out.println("Press 0 to exit, any other key to continue");
        cont=sc.nextInt();

        }while(cont!=0);
    }

}
