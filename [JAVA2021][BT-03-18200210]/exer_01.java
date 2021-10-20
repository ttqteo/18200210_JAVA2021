public class exer_01 {
  public void setDate(int month, int day, int year) {
    System.out.println("void setDate(int month, int day, int year)");
  }
  public void setDate(String month, int day, int year) {
    System.out.println("void setDate(String month, int day, int year)");
  }
  public void setDate(int year) {
    System.out.println("void setDate(int year)");
  }
  public String setDate(int month, int year) {
    return "String setDate(int month, int year)";
  }
  public int setDate(String month, int year) {
    return 20;
  }
  public static void main(String[] args) {
    exer_01 myObj = new exer_01();
    myObj.setDate(10, 20, 2021);
    myObj.setDate("Oct", 10, 2021);
    myObj.setDate(2000);
    System.out.println(myObj.setDate(10, 2021));
    System.out.println("int setDate(String month, int year) " + myObj.setDate("Oct", 2021));
  }
}