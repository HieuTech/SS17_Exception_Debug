package BaiTap;

public class BaiTap4 {
    public static void main(String[] args) {
        String[] strList = {"3sf3", "4d0", "2", "3", "4", "5"};

        int[] newList = new int[strList.length];
        for (int i = 0; i < strList.length; i++){
            try{
                newList[i] = Integer.parseInt(strList[i]);
            }catch (NumberFormatException e){
                newList[i] = 0;
            }
        }
        for (Integer i: newList){
            System.out.println("i "+ i);
        }
    }
}
