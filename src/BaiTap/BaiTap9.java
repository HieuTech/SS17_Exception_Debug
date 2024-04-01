package BaiTap;

import java.util.Scanner;

public class BaiTap9 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            System.out.println("Input Integer");
            int input = Integer.parseInt(scanner.nextLine());
            if (input <= 0){
                throw new RuntimeException("value must greater than 0");
            }
            int result = fibonacci(input);
            System.out.println("result " + result);
        }catch (NumberFormatException e){
            System.out.println("Input invalid ");
        }

    }

    public static int fibonacci(int value){
            if(value <= 1){
                return value;
            }else{
                return fibonacci(value -1) + fibonacci( value - 2);
            }
    }

}
