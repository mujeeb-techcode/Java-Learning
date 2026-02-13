import java .util.Scanner;
public class consept{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char choise;
       do {
           System.out.println("Mujeeb Express:");
           System.out.println("From:");
           String name = sc.nextLine();
           System.out.println("To:");
           String name2 = sc.nextLine();

           if(name.equalsIgnoreCase("Lahore")  && name2.equalsIgnoreCase("DGk")){
               System.out.println("Lahore  to  Dera Ghazi Khan  "+  "RS:2500");
           }
           else if(name.equals("DGK")   && name2.equalsIgnoreCase("Lahore")){
               System.out.println("Dera Ghazi Khan  to  Lahore  "+  "RS:2500");
           }
           else if(name.equalsIgnoreCase("Karachi")  &&  name2.equalsIgnoreCase("Lahore")){
               System.out.println("Karachi  to  Lahore  "+  "RS:5000");

           }
           else if ( name.equalsIgnoreCase("Lahore")  &&  name2.equalsIgnoreCase("Karachi")){
               System.out.println("Lahore  to  Karachi  "+  "RS:5000");
           }
           else if(name.equalsIgnoreCase("Lahore")  &&  name2.equalsIgnoreCase("Multan")){
               System.out.println("Lahore  to  Multan  "+  "RS:2000");
           }
           else if(name.equalsIgnoreCase("Multan")  &&  name2.equalsIgnoreCase("Lahore")){
               System.out.println("Multan  to  Lahore  "+  "RS:2000");
           }
           else {
               System.out.println("Not service availible at now.");
           }

           System.out.print("kiya ap or tickets check kary gay? (y/n): ");
           choise = sc.next().charAt(0);
       }
       while (choise=='Y' ||  choise=='y');{
            System.out.println("Have a nice day!:");
        }




    }
}