package operatorToanTu;

public class Excercise_03_ThucHienToanTu {
    //On tap cac loai toan tu
    public static void toanTu(String userName, String passWord) {
        String messageLoginSuccessful = "Congratulation! Log in successfully!";
        String messageLoginFail = "Your account or password is wrong.";
        if (userName == passWord) {
            System.out.println("The username and password are same! Please change to be different");
        } else if (userName != passWord && userName.length() > 3) {
            System.out.println(messageLoginSuccessful);
        } else {
            System.out.println(messageLoginFail);
        }
    }

    public static void main(String[] args) {
        toanTu("abc", "abc");
        toanTu("abc", "123");
        toanTu("abcd", "a123");
    }
}
