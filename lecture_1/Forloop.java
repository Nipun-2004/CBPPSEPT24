package lecture_1;
import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number");
            int n =scanner.nextInt();
            int sum =0;
            int i;
            for(i=0;i<=n;i++)
            sum+=i;
            System.out.println(sum);
        }
    }
    
