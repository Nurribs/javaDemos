package loopExamples;
import java.util.Scanner;
public class ucVeDordeTamBolunme {
    public static void main(String[] args) {
        int j,sayac=0;
        double toplam=0.0,ortalama=0.0;

        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number: ");
        j= inp.nextInt();

        for(int i=1; i<=j; i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
                toplam += i;
                sayac++;
            }
        }
        ortalama=toplam/sayac;
        System.out.println("Toplam: " +toplam);
        System.out.println("Sayac: " +sayac);
        System.out.println("Ortalama: " +ortalama);
    }
}
