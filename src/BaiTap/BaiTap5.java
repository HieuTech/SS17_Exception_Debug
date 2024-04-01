package BaiTap;

import java.util.*;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.asList(234,1,2,1325,235,26,2342,12);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Input value to search  ");
      while (true){
          try{
              int value = Integer.parseInt(scanner.nextLine());
              int searchValue = binarySearch(list, value);
              if(searchValue == -1){
                  System.out.println("Value not found");
              }else{
                  System.out.println("Result " + searchValue);
                  break;
              }
          }catch (NumberFormatException e) {
              System.out.println("Input invalid");
          }
      }

    }

    public static int binarySearch(List<Integer> list, int value){
        int start = 0;
        int end = list.size() -1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(list.get(mid) < value){
                start = mid + 1;
            }
            else if(list.get(mid) > value){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
