package collection;

import java.util.ArrayList;

public class Excercise_05_Collection_SolveEx04 {
    public static void main(String[] args) {
        //Xu ly bai tap 4 voi ArrayList
        int maxNumber = 50;
        ArrayList<Integer> evenNumber = new ArrayList<>((maxNumber / 2) + 1);
        //Tao vong lap FOR de in ra cac so chan
        int i;
        for (i = 0; i <= (maxNumber / 2); i++) {
            evenNumber.add(2 * i);
        }
        // Duyệt mảng để in ra kết quả sau khi nạp vào
        for (Integer integer : evenNumber) {
            System.out.println("Cac so chan: " + integer);
            ;
        }
    }
}