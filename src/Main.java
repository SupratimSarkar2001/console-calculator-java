import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      boolean flag=true;

      while(flag) {
          System.out.println("*******************************");
          System.out.println("Enter 1: To SUM");
          System.out.println("Enter 2: To SUBTRACT");
          System.out.println("Enter 3: To MULTIPLY");
          System.out.println("Enter 4: To DIVISION");
          System.out.println("Enter 5: To EXIT");
          System.out.println("*******************************");

          int input=sc.nextInt();

          switch (input){
              case 1:{
                  System.out.print("Enter number 1: ");
                  float a=sc.nextFloat();
                  System.out.print("Enter number 2: ");
                  float b=sc.nextFloat();
                  System.out.println(a+b);
                  break;
              }
              case 2:{
                  System.out.print("Enter number 1: ");
                  float a=sc.nextFloat();
                  System.out.print("Enter number 2: ");
                  float b=sc.nextFloat();
                  System.out.println(a-b);
                  break;
              }
              case 3:{
                  System.out.print("Enter number 1: ");
                  float a=sc.nextFloat();
                  System.out.print("Enter number 2: ");
                  float b=sc.nextFloat();
                  System.out.println(a*b);
                  break;
              }
              case 4:{
                  System.out.print("Enter number 1: ");
                  float a=sc.nextFloat();
                  System.out.print("Enter number 2: ");
                  float b=sc.nextFloat();
                  System.out.println(a/b);
                  break;
              }
              case 5:{
                  System.out.println("Exiting....");
                  flag=false;
                  break;
              }
          }
      }
    }
}