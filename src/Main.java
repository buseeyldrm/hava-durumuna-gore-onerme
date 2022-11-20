import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner klavye=new Scanner(System.in);

        String havaDurumlari="1.Hava Durumu: 5 dereceden küçük \n"
                        +"2.Hava Durumu: 5-15 derece arasında \n"
                        +"3.Hava Durumu: 15-25 derece arasında \n"
                        +"4.Hava Durumu: 25 dereceden büyük ";

        System.out.println(havaDurumlari);
        System.out.println();

        System.out.print("Bir secenek seçin:  ");
        int secim=klavye.nextInt();

        switch (secim){
            case 1:
                System.out.println("Kayak yapabilirsin.");
                break;
            case 2:
                System.out.println("Sinemaya gidebilirsin.");
                break;
            case 3:
                System.out.println("Piknik yapabilirsin");
                break;
            case 4:
                System.out.println("Yüzebilirsin");
                break;
            default:
                System.err.println("Geçersiz seçim yaptınız.LÜtfen geçerli bir seçim yapınız.");
        }

    }
}