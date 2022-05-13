import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
//        int add = mat[0][0]+mat[0][1]+mat[0][2]+mat[1][1]+mat[2][0]+mat[2][1]+mat[2][2];
//        System.out.println(add);
//        int max=0;
//        for (int i = 1; i < n-1; i++) {
//            for (int j = 1; j < m-1; j++) {
//                max = mat[i-1][j-1]+mat[i-1][j]+mat[i-1][j+1]+mat[i][j]+mat[i+1][j-1]+mat[i+1][j]+mat[i+1][j+1];
//                if(max<add){
//                    max = add;
//                }else{
//
//                }
//            }
//        }
//        System.out.println(max);
        int max=0;
        int max_sum=0;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {

                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);

                max_sum = Math.max(max_sum, sum);
            }
        }
        System.out.println(max_sum);

    }
}
