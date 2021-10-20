public class slide01_page13 {
  public static void main(String[] args) {
    int count = 9;
    for (int i = 0; i < 9; i++) {

      for (int j = 0; j < 11; j++) {
        if (j > count)
          System.out.print(' ');
        else
          System.out.print(j);
      }

      for (int j = 11; j > -1; j--) {
        if (j > count)
          System.out.print(' ');
        else
          System.out.print(j);
      }

      System.out.println(' ');
      if ( i < 4) count = count - 2;
      else count = count + 2;
    }
  }
}