
import java.util.Scanner;

public class RectangularStar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}