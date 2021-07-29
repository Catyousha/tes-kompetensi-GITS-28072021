import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifikasiEmail {
    private static void notValidPrint(String reason) {
        System.out.println("Email tidak valid!");
        System.out.println(reason);
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan email: ");
        String email = userInput.nextLine(); // "awanama@gmail.com"
        String[] emailParts = email.split("@"); // ['awanama', 'gmail.com'];
        if(emailParts.length != 2){
            notValidPrint("Tanda '@' tidak ditemukan atau lebih dari satu!");
        }
        if(emailParts[0].length() > 20){
            notValidPrint("Panjang email maksimum 20 karakter sebelum ‘@’!");
        }
        Pattern cekDomain = Pattern.compile("(\\.co\\.id$)|(\\.com$)");
        Matcher domainValid = cekDomain.matcher(emailParts[1]);
        if(!domainValid.find()){
            notValidPrint("Hanya diperbolehkan email dengan domain '.com' atau 'co.id'!");
        }
        System.out.println("Email telah tervalidasi!");
    }
}
