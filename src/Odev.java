// Dairenin Alanını ve Çevresini Hesaplayan Program :
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int r, a ;
        double pi = 3.14, alan, cevre, dilim;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez Açısını Giriniz : ");
        a = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilim = (pi * r * r * a) / 360;    // Merkez açısının ölçüsü 𝛼 olan daire diliminin alanı

        System.out.println("Direnin Çevresi : " + cevre);
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("a Açısına Göre Daire Diliminin Alanı : " + dilim);
    }
}
