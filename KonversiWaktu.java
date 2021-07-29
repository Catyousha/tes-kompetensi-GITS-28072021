import java.util.Scanner;

public class KonversiWaktu {
    private static void notValidPrint(String reason) {
        System.out.println("Format waktu tidak valid!");
        System.out.println(reason);
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan waktu [format: hh:mm:ss aa, contoh: 12:00:00 AM]: ");
        String waktu = userInput.nextLine(); //"12:45:01 AM"
        String[] waktuParts = waktu.split("\\s+"); //["12:45:01", "AM"]
        String[] bagianWaktuParts = waktuParts[0].split(":"); //["12", "45", "01"]
        if(waktuParts.length != 2){
            notValidPrint("Format input tidak terdiri dari waktu dan AM / PM!");
        }
        if(!waktuParts[1].equals("PM") && !waktuParts[1].equals("AM")){
            notValidPrint("Penunjuk waktu haruslah berupa AM atau PM!");
        }
        if(bagianWaktuParts.length != 3){
            notValidPrint("Format waktu haruslah berupa hh:mm:ss aa! Contoh: 12:00:00 AM");
        }
        for (String bagianWaktu : bagianWaktuParts) {
            if (bagianWaktu.length() == 2) {
                try {
                    int test = Integer.parseInt(bagianWaktu);
                } catch (Exception e) {
                    notValidPrint("Format jam, menit, dan detik haruslah berupa angka!");
                }
            } else {
                notValidPrint("Format jam, menit, dan detik haruslah berupa 2 angka!");
            }
        }
        if(Integer.parseInt(bagianWaktuParts[0]) == 12 && waktuParts[1].equals("AM")){
            bagianWaktuParts[0] = "00";
        }
        if(Integer.parseInt(bagianWaktuParts[0]) < 12 && waktuParts[1].equals("PM")){
            bagianWaktuParts[0] = Integer.toString(Integer.parseInt(bagianWaktuParts[0]) + 12);
        }
        String hasilKonversi = bagianWaktuParts[0] + ':' + bagianWaktuParts[1];
        System.out.println(hasilKonversi);
    }
}
