import java . util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Check paper");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bio:");
        int m1 = sc.nextInt();
        System.out.println("Enter the number if English:");
        int m2 = sc.nextInt();
        System.out.println("Enter the number of physics:");
        int m3 = sc.nextInt();

        float avg =(m1+m2+m3)/3.0f;
        System.out.println("Total Average is "+avg);

        if(avg>=33){
            System.out.println("You promoted");
        }
        else {
            System.out.println("you not promoted");
        }
    }
}