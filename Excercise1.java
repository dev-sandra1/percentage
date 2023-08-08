import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int edad, sumaEdad=0;
        float heightSum, heightSum=0;
    

        for(int i = 1; i<=5; i++ ){
            System.out.print("enter your age: ");
            age = entry.nextInt();
             System.out.print("enter your height: ");
            heightSum = entry.nextFloat(); 
            
           
            if(age >=18 && heightSum >=1.75){
                ageSum += age;
                heightSum+= heightSum;
            }
            System.out.println("--------------------");
        }

        //ecribir cuanto el promedio y mostrarlo
        
        int ageAverage = ageSum / 5;
        float heightAverage = heightSum/ 5;

        System.out.println("The age average is: " + ageAverage);
        System.out.println("The age average is: " + heightAverage);
        
        
        
           
    } 
         
}