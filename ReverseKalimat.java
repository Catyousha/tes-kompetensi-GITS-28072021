import java.util.Scanner;

public class ReverseKalimat {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan kalimat yang ingin dibalik: ");
        String kalimat = userInput.nextLine();
        char[] res = new char[kalimat.length()];
        char[] hurufKalimat = kalimat.toCharArray();
        int idx = 0;
        for (int i = hurufKalimat.length - 1; i >= 0; i--){
            res[idx] = hurufKalimat[i];
            idx+=1;
        }
        System.out.println(new String(res));
    }
}
