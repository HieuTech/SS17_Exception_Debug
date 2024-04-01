package BaiTap;

import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Input valid to check prime number");
                int value = Integer.parseInt(scanner.nextLine());
                if(value <= 1){
                    System.out.printf("%d is not prime number \n", value);
                }
                for (byte i = 2; i <= Math.sqrt(value); i++){
                    if(value % i == 0){
                        System.out.printf("%d is not prime number \n", value);
                    }
                }
                System.out.printf("Prime number: %d\n", value);


            }catch (NumberFormatException e){
                System.err.println("Input invalid");
            }
        }
    }
}
