package BaiTap;

import java.util.*;

public class BaiTap13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = checkInput(scanner);

        String[] listStr1 = value.split("");
        List<String> listStr = new ArrayList<>(Arrays.asList(listStr1));
        Collections.reverse(listStr);
        System.out.println(listStr);
    }

    public static String checkInput(Scanner scanner){
        System.out.println("Input a string");
        String value = scanner.nextLine();
        if(value.isEmpty()){
            throw new RuntimeException("Value is not be empty");
        }
        return value;
    }
}
