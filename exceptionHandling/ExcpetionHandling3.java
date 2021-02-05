package mentoring.exceptionHandling;

import java.io.File;
import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcpetionHandling3 {

//    public static void A(){
//        B();
//    }
//    public static void B(){
//        System.out.println("hi");
//        A();   }
    public static void main(String[] args) {
  try {
   // Scanner input1 = new Scanner(new File("abc.txt"));
      int vals []={10,12,35,45,78};
      Scanner   input = new Scanner(System.in);
      System.out.println("Enter value for division ");
      int x = input.nextInt();
      for (int v : vals ) {
          System.out.println(v+ "/ "+x+ " = "+  (v/(x)));
      }
      System.out.println("Enter index :");
      int val=input.nextInt();
      System.out.println("item at index "+val+"is  :"+vals[val]);


  } catch (InputMismatchException ime) {
      System.out.println("enter inout a valid integer ");
  }catch (ArithmeticException  ae){
      System.out.println("Zero is not a valid for division ");
  }catch (ArrayIndexOutOfBoundsException aob) {

      System.out.println("Index out of bond ");
  }catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();

  }
        System.out.println("OK");



    }}
