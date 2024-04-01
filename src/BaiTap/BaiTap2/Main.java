package BaiTap.BaiTap2;

import java.util.*;

public class Main {
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                System.out.println("How many element you want to add");
                int count = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < count; i++) {
                    System.out.printf("Position %d ", i + 1);
                    int value = Integer.parseInt(scanner.nextLine());
                    list.add(value);
                }
                int max = list.stream().max(Integer::compare).get();
                System.out.println(max);
                break;
            }catch (NoSuchElementException e){
                System.out.println("Array is not be  empty ");
            }catch (NumberFormatException e){
                System.out.println("Your input invalid");
            }
        }



    }



}
