<<<<<<< HEAD
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Marks calculation");
        Scanner n = new Scanner (System.in);
        System.out.println("<-----Enter the Marks taken in bio:");
        int a= n.nextInt();
        System.out.println("<-----Enter the Marks taken in Chemistry :");
        int b = n.nextInt();

        System.out.println("<-----Enter the marka taken in urdu:");
        int c= n.nextInt();

        System.out.println("<-----Number in math:");
        int d = n .nextInt();

        System.out.println("<-----Number in English:");
        int e = n.nextInt();
        System.out.println("The total number are all subjects :");
        System.out.println((a+b+c+d+e)+"    Out of 500");

    }
}
=======
<<<<<<< HEAD
public class Main{
    public static void main{
        System.out.println("Practice java basics ");
    }

}
=======
import java . util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Roommates calculation system:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Shoiab:");
        int m1 = sc.nextInt();
        System.out.println("Mujeeb:");
        int m2 = sc.nextInt();
        System.out.println("Adil:");
        int m3 = sc.nextInt();

        float avg =(m1+m2+m3)/3.0f;
        System.out.println("Total Average is "+avg);

        if(avg>=0){
            System.out.println("totel bill");
        }
        else {
            System.out.println("Bill not be correct");
        }
    }
}
>>>>>>> a1d469dbf57b0969024c20a7ac4c034af56c59b7
>>>>>>> 24c14bc5d9deeda8daaed769fb8599251d533dce
