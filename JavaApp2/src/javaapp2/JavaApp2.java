import java.util.Scanner;
public class JavaApp {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       int score = 0;
       System.out.print("input Score:   ");
       score = kb.nextInt();
       if(score>=80){
           System.out.print("\nGrade = 4");
       }else if(score>=70){
           System.out.print("\nGrade = 3");
       }else if(score>=60){
           System.out.print("\nGrade = 2");
       }else if(score>=50){
           System.out.print("\nGrade = 1");
       }else{
           System.out.print("|nGrade = 0");
       }
    }
    
}
