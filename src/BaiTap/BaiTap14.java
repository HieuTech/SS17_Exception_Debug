package BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            try {
                System.out.println("How many element you want to add");
                int count = Integer.parseInt(scanner.nextLine());
                checkListEmpty(count);
                int sum = 0;

                for (int i = 0; i < count; i++) {
                    System.out.printf("add element number %d \n", i+1);
                    int value = Integer.parseInt(scanner.nextLine());
                    list.add(value);
                    sum += value;
                }
                int avgResult = Math.round((float) sum /list.size());
                System.out.println(avgResult);
                break;
            }catch (NumberFormatException e) {
                System.out.println("Input invalid");
            }
        }

    }

    public static void checkListEmpty(int count){
        if(count <= 0){
            throw new RuntimeException("Array is not be empty");
        }

    }
}
