import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Hosgeldiniz, urunun kdvsiz fiyatini giriniz.");
int tutar = scanner.nextInt();
double kdvliTutar;
String kdvdegeri = "";
if (tutar>=1000){
     kdvliTutar = tutar+(tutar*8/100);
    String kdvDegeri = "%8";

}
else {
    kdvliTutar = tutar+(tutar*18/100);
    String kdvDegeri = "%18";
}


        System.out.println("Kdvsiz deger : " + tutar);
        System.out.println("Kdvli deger : " + kdvliTutar);
        System.out.println(kdvdegeri);






    }
}