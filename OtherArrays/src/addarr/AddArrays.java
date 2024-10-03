package addarr;
import java.util.Scanner;

public class AddArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrices: ");
        int n = sc.nextInt();
        int a[][] = new int[n+1][n+1];
        int b[][] = new int[n+1][n+1];
        int c[][] = new int[n+1][n+1];
        System.out.println("Enter the 1st matrix");
        for (int i = 1; i <= n ; i++ )
            for (int j = 1; j <= n;j++) a[i][j]=sc.nextInt();
        System.out.println("Enter the 2nd matrix");
        for (int i = 1; i <= n ; i++ )
            for (int j = 1; j <= n;j++) b[i][j]=sc.nextInt();
        for (int i = 1; i <= n ; i++ )
            for (int j = 1; j <= n;j++) c[i][j]=a[i][j]+b[i][j];
        System.out.println("Result matrix:");
        for (int i = 1; i <= n ; i++ ){
            for (int j = 1; j <= n;j++) System.out.print(c[i][j]+" ");
            System.out.println("");
        }
    }
}
