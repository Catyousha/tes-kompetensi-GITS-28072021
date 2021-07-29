import java.util.Scanner;

public class CekPalindrom {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan kalimat yang ingin diuji palindrom-nya: ");
        String kalimat = userInput.nextLine();
        char[] hurufKalimat = kalimat.toCharArray();
        int endIdx = hurufKalimat.length - 1;
        for(int startIdx = 0; startIdx < hurufKalimat.length; startIdx++){
            //System.out.println(hurufKalimat[startIdx]+" "+hurufKalimat[endIdx]);
            if(hurufKalimat[startIdx] != hurufKalimat[endIdx]){
                System.out.println("Kalimat tersebut tidak termasuk palindrom!");
                System.exit(0);
            }
            if(startIdx == endIdx){
                break;
            }
            endIdx--;
        }
        System.out.println("Kalimat tersebut termasuk palindrom!");
    }
}
