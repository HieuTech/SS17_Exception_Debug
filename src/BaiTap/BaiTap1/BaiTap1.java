package BaiTap.BaiTap1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("input value a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("input value b");

                int b = Integer.parseInt(scanner.nextLine());
                int total = a + b;

                System.out.println("Total " + total);
            }catch (NumberFormatException e){
                System.out.println("Input invalid ");
            }
        }

    }






}
