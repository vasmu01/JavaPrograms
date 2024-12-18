import java.util.Scanner;

public class matrix2 {
    public static void main(String[] args) {
        int a [][]=new int [3][3];

        System.out.println("enter the Matrix number");


        Scanner obj=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            a[i][j]=obj.nextInt();
            }

        }
        System.out.println(" the matrix number are:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
         
           int b= (a[i][j]);
            }
            System.out.print("\n");

    }
 System.out.println("The sum of diagonal numbers of matrix is:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
         
                if(i==j){
             int c =i+j;
 System.out.print(c[i][j]);

         }
            } 
            System.out.print("\n");

    }
     
 }
}