/* 12345
 * 1234
 * 123
 * 12
 * 1
 */

import java.util.Scanner;
public class InvertedNumberRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=N;j>i;j--){
                System.out.print(N-j+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
