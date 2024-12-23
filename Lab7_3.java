//NumberFormatException
import java.util.*;

public class Lab7_3 {

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        double decimal = 0.0;
        for (int i = binaryString.length() - 1,power=0; i >= 0; i--,power++) {
            String tmp1 = "" + binaryString.charAt(i);//convert char to string
            int base = Integer.parseInt(tmp1);//parse string into corresponding integer
            
            if (base == 0 || base == 1) {
                decimal = decimal + base*Math.pow(2, power);
            } else {
                throw new NumberFormatException();
            }
        }
        return (int)decimal;
    }

    public static void main(String args[]) {
        
        System.out.println(bin2Dec("1011"));
        

    }
}
