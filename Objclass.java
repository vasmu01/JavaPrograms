import java.util.Scanner;
 class volume{
      Scanner value=new Scanner(System.in);

      int a=value.nextInt();

            int b=value.nextInt();

      int c=value.nextInt();
 double vol(){
      return a*b*c;
 }
 }
 class ObjClass{
      public static void main(String []args){
           
               System.out.println("Enter the value of a : ");
                     System.out.println("Enter the value of b : ");
                           System.out.println("Enter the value of c : ");
                volume Tvolume= new volume();
                double vol2;
                
                vol2=Tvolume.vol();
                System.out.println("The volume of a b c is:"+ (vol2));
                
                
           
      }
 }   