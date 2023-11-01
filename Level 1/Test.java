import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = "12103";
        scn.close();
        printEncoding(str, "");
    }

    public static void printEncoding(String str, String ansf) {

        if (str.length() == 0) {
            System.out.print(ansf + " ");
            return;
        }else if(str.length() == 1){
            String ch0 = str.substring(0, 1);
            String roq0 = str.substring(1);
            String code0 = (char)('a' +
                                  (Integer.parseInt(ch0) - 1)) + "";
            printEncoding(roq0, str + code0);
        }
         else {
            char ch0 = str.charAt(0);
            if (ch0 == '0') {
                return;
            }
            String roq0 = str.substring(1);
            String codeO = ('a' + (ch0 - '0') - 1) + "";
            printEncoding(roq0, ansf + codeO);

            String ch01 = str.substring(0, 2);
            String roq01 = str.substring(2);
            String codeO1 = ('a' + Integer.parseInt(ch01) - 1) + "";
            if (Integer.parseInt(codeO1) <= 26) {
                printEncoding(roq01, ansf + codeO1);
            }
        }

    }
}