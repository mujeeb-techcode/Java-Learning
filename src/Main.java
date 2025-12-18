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