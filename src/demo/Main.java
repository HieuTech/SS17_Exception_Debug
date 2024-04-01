package demo;

import demo.TriangleUnCheckedException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        checkTriangle(0,1,2);


    }

    public static void checkTriangle(double a, double b, double c){

        if(a <= 0 || b <= 0 || c <= 0){
            throw new TriangleUnCheckedException("Canh tam giac phai nho hon ko");
        }
    }
}