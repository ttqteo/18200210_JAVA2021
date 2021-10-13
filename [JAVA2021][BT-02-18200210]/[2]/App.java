import java.util.Scanner;

public class App {
  static boolean b;
  public static void main(String[] args) {
    System.out.println("--Trang 5--");
    byte value = 9;
    byte mask = 6;

    if (value == 9 & ++mask == 6) {
      System.out.println("led turn ON");
      System.out.println(mask);
    } else {
      System.out.println("led turn OFF");
      System.out.println(mask);
    }
    System.out.println();
    mask = 6;
    if (value == 9 & mask++ == 6) {
      System.out.println("led turn ON");
      System.out.println(mask);
    } else {
      System.out.println("led turn OFF");
      System.out.println(mask);
    }

    System.out.println("--Trang 8--");
    char keyPress = 'A';
    switch(keyPress) {
      default:
      System.out.println("Program is still alive");
      case 'A':
      case 'a':
      System.out.println("Exit program");  
      break;
    }
    System.out.println();
    char keyPress2 = 'B';
    switch(keyPress2) {
      default:
      System.out.println("Program is still alive");
      case 'A':
      case 'a':
      System.out.println("Exit program");  
      break;
    }

    System.out.println("--Trang 10--");
    short hand = 42;
    if (hand < 50 && !b)
      hand++;
    if (hand > 50);
    else if (hand > 40) {
      hand += 7;
      hand++;
    } else 
      --hand;
    System.out.println(hand);

    System.out.println("--Trang 19--");
    int n = 6;
    while (n-- > 0)
      System.out.println(n);
    System.out.println();
    n = 6;
    do {
      System.out.println(n);
    } while (--n > 0);
    System.out.println();
    byte abc = 112;
    do {
      System.out.println(abc);
    } while (++abc > 111 && abc++ > 112);
    System.out.println();
    abc = 112;
    do {
      System.out.println(abc);
    } while (++abc > 111 | abc++ > 112);

    System.out.println("--Trang 22--");
    int term, sum;
    for (term = 1, sum = 0; (term <= 5) | (sum++ <= 20); term++, sum = sum + 3);
    System.out.print(term);
    System.out.println(" " + sum);

    System.out.println("--Trang 26--");
    String s = "";
    char c = ' ';
    Scanner keyboard = new Scanner(System.in);
    do {
      System.out.println("Enter 'A' for option A " + "or 'B' for option B.");
      s = keyboard.next();
      s = s.toLowerCase();
      c = s.charAt(0);
    } while ((c != 'a') && (c != 'b'));
  }
}