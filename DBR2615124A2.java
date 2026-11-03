package dbr2615124a2;

import java.util.*;
public class DBR2615124A2 {

   
    public static void main(String[] args) {
         //asking from user information
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first station:");
       int firststat=input.nextInt();
       
       System.out.print("Enter last station:");
       int laststat=in.nextInt();put
       
       System.out.println();
       //calc and display
       if(firststat<laststat){
            System.out.println("Route Direction: Ascending");
             int routeD=laststat-firststat;
            System.out.println("Route Distance ="+routeD);
            System.out.println("Route Code: "+"A"+"-"+firststat+"-"+laststat);
       } else if(firststat>laststat){
              System.out.println("Route Direction: Descending");
             int routeD=firststat-laststat;
            System.out.println("Route Distance ="+routeD);
            System.out.println("Route Code: "+"D"+"-"+firststat+"-"+laststat);
       } else if(firststat==laststat){
             System.out.println("Invalid Route!");
       }
    }
}
