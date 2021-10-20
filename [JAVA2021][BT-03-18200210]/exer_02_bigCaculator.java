import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class exer_02_bigCaculator {


  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    BigDecimal ans = new BigDecimal(0);
    BigDecimal num1 = new BigDecimal(0);
    BigDecimal num2 = new BigDecimal(0);
    char key = ' ';

    do {
      System.out.println("\n----Big Caculator----\n");
      System.out.print("Number 1? ");
      while(true) {
        try {
          num1 = new BigDecimal(keyboard.nextLine());
          break;
        } catch (Exception e) {
          System.out.print("Error! Type again: ");
        }
      }

      System.out.print("(+,-,*,/)? -> ");
      key = keyboard.next().charAt(0);
      while (!(key == '+' || key == '-' || key == '*' || key == '/')) {
        System.out.print("Error! Type again: ");
        key = keyboard.next().charAt(0);
      }

      keyboard.nextLine();
      System.out.print("Number 2? ");
      while(true) {
        try {
          num2 = new BigDecimal(keyboard.nextLine());
          break;
        } catch (Exception e) {
          System.out.print("Error! Type again: ");
        }
      }

      switch (key) {
        case '+': ans = num1.add(num2); break;
        case '-': ans = num1.subtract(num2); break;
        case '*': ans = num1.multiply(num2); break;
        case '/': if (num2.compareTo(new BigDecimal(0)) != 0) ans = num1.divide(num2, 10, RoundingMode.CEILING); break;
      }

      System.out.print("\n" + num1 + "" + key + "" + num2 + "\n=");
      if (num2.compareTo(new BigDecimal(0)) == 0 && key == '/') 
        System.out.println("Infinity"); 
      else 
        System.out.println(ans.round(new MathContext(10, RoundingMode.CEILING)));
      System.out.print("\n(1) New\n(0) Exit\n-> ");
      key = keyboard.next().charAt(0);
      while (!(key == '0' || key == '1')) {
        System.out.print("Error! Type again: ");
        key = keyboard.next().charAt(0);
      }
      keyboard.nextLine();
    } while (key != '0');

    keyboard.close();
  }
}