package BaiTap;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter DTF  = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       while (true){
           try{
               System.out.println("Xin moi nhap Ngay Thang Nam");

               LocalDate result = LocalDate.parse(scanner.nextLine(), DTF);
               String[] handleResult = String.valueOf(result).split("-");

               boolean checkYear = false;
               boolean checkMonth = false;
               boolean checkDay = false;


                   if(Integer.parseInt(handleResult[0]) > 0){
                        checkYear = true;
                   }
               if(Integer.parseInt(handleResult[1]) > 0 && Integer.parseInt(handleResult[1]) <= 12){
                   checkMonth = true;

               }
               switch (Integer.parseInt(handleResult[1])){
                   case 1, 3, 5, 7:
                       if(Integer.parseInt(handleResult[2]) > 0 && Integer.parseInt(handleResult[2]) < 31){
                           checkDay = true;
                       }
                       break;
                   case 2:
                       if(Integer.parseInt(handleResult[2]) > 0 && Integer.parseInt(handleResult[2]) < 28){
                           checkDay = true;
                       }
                       break;
                   case 4, 6:
                       if(Integer.parseInt(handleResult[2]) > 0 && Integer.parseInt(handleResult[2]) < 30){
                           checkDay = true;
                       }
                       break;
                   default:
                       System.out.println("month out of rank");
                       break;
               }


               if(checkDay && checkMonth && checkYear){
                       System.out.println("Ngay thang nam hop le");
                   }else{
                       throw new RuntimeException("Datetimeformat invalid ");
                   }



//               System.out.println(handleResult);
           }catch (DateTimeParseException e){
               System.out.println("Date is informatted");
           }
       }

    }
}
