package BaiTap;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       while (true){
           try {
               System.out.println("Moi nhap so thu 1: ");
               int firstNumber = Integer.parseInt(scanner.nextLine());
               System.out.println("Moi nhap so thu 2: ");
               int secondNumber = Integer.parseInt(scanner.nextLine());
               int max;
               if(firstNumber > secondNumber){
                   max = firstNumber;
               }else{
                   max = secondNumber;
               }
               System.out.println("Max: " + max);
               break;
           }catch (NumberFormatException e){
               System.err.println("Input invalid");
           }
       }
    }
}
