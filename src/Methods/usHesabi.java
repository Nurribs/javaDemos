package Methods;
import java.util.Scanner;
public class usHesabi {
    static int usAlma(int a, int b) {

        if(a == 1 || b == 0)
            return 1;

        return usAlma(a,b-1) * a;
    }
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int a= inp.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int  b= inp.nextInt();

        System.out.println("Üs işleminin sonucu: " +usAlma(a,b));

    }
}
