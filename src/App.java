import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double n1, n2, select;
        
        System.out.print("Ilk Sayiyi Giriniz :");
        n1 = input.nextDouble();
        System.out.print("Ikinci Sayiyi Giriniz :");
        n2 = input.nextDouble();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        select = input.nextDouble();

        if(select==1){
            System.out.println("Toplama :" + (n1+n2));
        } else if(select==2){
            System.out.println("Cikarma :" + (n1-n2));
        }else if(select==3){
            System.out.println("Carpma : " + (n1*n2));
        }else if(select==4){
            if(n2!=0){
            System.out.println("Bolme :" + (n1/n2));
            }else{
                System.out.println("Bir Sayi Sifira Bolunemez.");
            }
        }else{
            System.out.println("Gecersiz Bir Komut Girdiniz.Tekrar Deneyin.");
        }
    }
}
