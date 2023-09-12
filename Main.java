import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int r ;
        double pi = 3.14 ;
        Scanner inp = new Scanner(System.in) ;
        System.out.print("Dairenin yarı çapı değerini giriniz : ") ;
        r = inp.nextInt();
        double alan = pi * r * r ;
        System.out.println("Alan : " + alan);
        double Çevre = 2 * pi * r ;
        System.out.print("Çevre : " +  Çevre ) ;

    }
}