package BaiTap;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BaiTap3 {
    public static void main(String[] args) {
        String[] strList = {"3sf3", "4d0", "2", "3", "4", "5"};

        int sum = 0;
        for (String str : strList) {
            try {
                sum += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("error parsing" + e);
            }
        }
        System.out.println("total " + sum
        );


    }


}
