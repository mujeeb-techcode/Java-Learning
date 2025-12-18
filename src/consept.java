import java. util. Scanner;
public class consept{
    public static void main(String[] args) {
        System.out.println("practice");
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();



        String s = "Java";

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }


    }
}