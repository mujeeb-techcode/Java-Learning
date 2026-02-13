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
