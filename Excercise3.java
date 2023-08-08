import java.util.Scanner;

public class Excercise3{
    public static void main(String[] args) {
         Scanner entry = new Scanner(System.in);

        int num;
          System.out.println("digita un numero del 0 hasta el 999");
         num = entry.nextInt();
         if(num >= 0 && num <=9){ 
             while (num >= 0 && num <= 9) {
          
           System.out.println("The number is 1 digits");
          break;
         } 
        }else if(num>=10 && num <= 99){ 
            System.out.println("The number is 2 digits.");

        } else if(num >= 100 && num <= 999){
             System.out.println("The number is 3 digits.");

        }else{System.out.println("error");}
        
 
         
 }  }
    /*  while (num >= 0 && num <= 9) {
          
           System.out.println("The number is 1 digits");
             System.out.println("digita un numero del 0 hasta el 999");
         num = entry.nextInt();


         if (num >= 10 && num <= 99) {
            System.out.println("The number is 2 digits.");
               System.out.println("digita un numero del 0 hasta el 999");
         num = entry.nextInt();

        } else if (num >= 100 && num <= 999) {
            System.out.println("The number is 3 digits.");
             System.out.println("digita un numero del 0 hasta el 999");
         num = entry.nextInt(); */