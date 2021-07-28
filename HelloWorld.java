import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int n = userInput.nextInt();
        if(n%5 == 0 && n%3 == 0){
            System.out.println("Hello World");
        }
        else if(n%3 == 0){
            System.out.println("Hello");
        }
        else if(n%5 == 0) {
            System.out.println("World");
        }
    }
}
