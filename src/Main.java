import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("\nArtik yil hesaplama\n\nBulundugunuz yili giriniz :");
        Scanner oku=new Scanner(System.in);
        int yil= oku.nextInt();

        if(yil%400==0){
            System.out.println(yil +" Artik yil");
        } else if (yil%4==0 && yil%100!=0) {
            System.out.println(yil + " Artik yil");
            
        }else {
            System.out.println(yil + " Artik degil");
        }
    }
}