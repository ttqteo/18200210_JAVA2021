import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class slide01_page23 {
  public static void main(String[] args) {
    Scanner fileIn = null;
    try {
      fileIn = new Scanner(new FileInputStream("abc.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      System.exit(0);
    }
    System.out.println("File " + (fileIn.hasNextLine() == Boolean.TRUE ? "co" : "khong co") + " du lieu");
    int i = 0;
    int cnt = fileIn.nextInt();
    System.out.println("So dong " + cnt);
    fileIn.nextLine();
    while(fileIn.hasNext()) {
      i++;
      System.out.println(i + ". " + fileIn.nextLine());
    }
    fileIn.close();
  }
}
