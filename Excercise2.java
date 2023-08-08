import java.util.Scanner;

public class Excercise2{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;

        
     /*    System.out.println("type the number from 1 to 10 ");
        num = entry.nextInt();

         if (num <= 0 || num > 10) {
            System.out.println("Numbers added are invalited" );
         }else{
            for(int i =1; i<=10; i++){

                System.out.println(num+ "x" +i+ "=" + (num * i)); 
            
            }
         } */

         System.out.println("type the number from 1 to 10");
         num = entry.nextInt();

         if(num >= 0 && num <= 10){
            for(int i =1; i<=10; i++){

            System.out.println(num+ "x" +i+ "=" + (num * i)); 
            }   
         }else{
           System.out.println("Nums added are invalited");
         }
   
                
        }
    }
