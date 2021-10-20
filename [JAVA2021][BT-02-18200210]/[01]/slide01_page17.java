import java.util.Scanner;

public class slide01_page17 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your age.");
    int age = keyboard.nextInt();
    String s1 = keyboard.nextLine();
    System.out.println("Enter your name.");
    String name = keyboard.nextLine();
    System.out.println(name + ", you are " + age + " years old.");
  }
}