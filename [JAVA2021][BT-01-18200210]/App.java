public class App {
    public static void main(String[] args) throws Exception {
        String chuoi1 = "lop  hoc java. bat dau luc muoi hai gio";
        String chuoi2 = "";
        chuoi1 = chuoi1.trim().toLowerCase();
        int length = chuoi1.length() - 1;
        int start = 0;
        int end = 0;
        int i = 0;
        while (i < length) { 
            if (i == length - 1) {
                if (chuoi1.charAt(i) == ' ' && chuoi1.charAt(i+1) != ' ') {
                    chuoi2 += String.valueOf(chuoi1.charAt(length)).toUpperCase();
                } else {
                    String temp = chuoi1.substring(start, length+1);
                    chuoi2 += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);
                }
            }
            if (chuoi1.charAt(i) == ' ' && chuoi1.charAt(i+1) != ' ') {
                start = i + 1;
            }
            if (chuoi1.charAt(i) != ' ' && chuoi1.charAt(i+1) == ' ') {
                end = i + 1;
                String temp = chuoi1.substring(start, end);
                chuoi2 += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + ' ';
            }
            i++;
        }
        System.out.println("chuoi truoc khi chuyen hoa: " + chuoi1);
        System.out.println("->chuoi sau khi chuyen hoa: " + chuoi2);
    }
}
