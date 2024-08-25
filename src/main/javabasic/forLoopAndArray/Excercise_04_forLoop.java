package forLoopAndArray;

public class Excercise_04_forLoop {
    public static void main(String[] args) {
        //Tạo mảng để lưu giá trị chẵn từ 0 đến 50
        int maxNumber = 50;
        int array[] = new int[(maxNumber/2)+1];

        //Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        int i;
        for (i = 0; i <= maxNumber/2; i++) {
            array[i] = 2*i;
        }

        //Duyệt mảng để in ra kết quả sau khi nạp vào
        for (int j : array) {
            System.out.println("Cac so chan: " + j);
        }
    }
}