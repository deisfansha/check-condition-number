import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int number = input.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int number){
        if (number >= 0&&(number %3 == 0 && number %5 == 0)){
            System.out.println("Bilangan "+number+" memenuhi kondisi");
        }else {
            System.out.println("Bilangan "+number+" tidak memenuhi kondisi");
        }
    }
}