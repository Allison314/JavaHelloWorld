/**
 * The HelloWorld class demonstrates a simple Java program 
 * that prints "Hello, World!" to the console.
 *  
 * @author J. Cihlar
 * @version 1.0
 * @since 2024-08-18
 */

import java.util.Scanner;

public class HelloWorld {

    // this is where every Java program starts
  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.print("Your name: ");
    String name = sc.next();

    // Prints "Hello, World!" to the console
    System.out.print("Hello, ");
    System.out.println(name);
  }
}
