import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=N;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
