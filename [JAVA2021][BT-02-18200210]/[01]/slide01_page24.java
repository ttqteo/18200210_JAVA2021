import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class slide01_page24 {
  public static void main(String[] args) {
    Scanner fileIn = null;
    //read file
    try {
      fileIn = new Scanner(new FileInputStream("slide01_page24.txt"));
    } catch(FileNotFoundException e) {
      System.out.println("File not found.");
      System.exit(0);
    }

    String[] Arr = new String[0];
    while(fileIn.hasNextLine()) {
      String line = fileIn.nextLine();

      if (line.indexOf('-') > -1) {
        Arr = new String[0];
        System.out.println();
      }
      //caculate each ADC each day
      if (line.indexOf('#') > -1) {
        String[] info = line.split("#");
        int length = Integer.parseInt(info[3]);
        Float[] adc = new Float[length];
        int[] count = new int[length];
        //set array to Zero
        for(int i = 0; i < length; i++) {
          adc[i] = (float)0;
          count[i] = 0;
        }
        for (int i = 0; i < Integer.parseInt(info[2]); i++) {
          String[] data = Arr[i].split(",");
          int index = Integer.parseInt(data[1].substring(3)) - 1;
          adc[index] += Float.parseFloat(data[2]);
          count[index]++;
        }
        //Print to display
        for(int i = 0; i < length; i++) {
          System.out.println("ADC" + i + " " + (float)adc[i]/count[i] + " " + info[1]);
        }
      }

      if (line.indexOf(',') > -1) {
        String newArray[] = new String[Arr.length + 1];
        for (int i = 0; i < Arr.length; i++)
          newArray[i] = Arr[i];
        newArray[newArray.length - 1] = line;
        Arr = newArray;
      }
    }
    System.out.println();
    fileIn.close();
  }
}
