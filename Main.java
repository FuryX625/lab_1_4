import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner odczyt = new Scanner(System.in);
    int wybor;
    double r1, r2, polekol, poleprost, a, b;
    double pi=3.14;
    System.out.println("wybierz (1-4)");
    System.out.println("1. Suma pól 2 kół");
    System.out.println("2. Pole prostokąta");
    System.out.println("3. Pole trójkąta prostokątnego");
    System.out.println("4. Suma pół 2 kwadratów");
    wybor=odczyt.nextInt();
    switch (wybor) {
      case 1:
        System.out.println("Podaj promien 1. koła");
        r1=odczyt.nextInt();
        System.out.println("Podaj promien 2. koła");
        r2=odczyt.nextInt();
        r1=Math.pow(r1,2);
        r2=Math.pow(r2,2);
        polekol=pi*r1+pi*r2;
        System.out.println("Pole kola = "+polekol);
       break;
      case 2:
        System.out.println("Podaj długośc boku a: ");
        a=odczyt.nextInt();
        System.out.println("Podaj długośc boku b: ");
        b=odczyt.nextInt();
        poleprost=a*b;
        System.out.println("Pole prostokąta to: "+poleprost);
      break;
      
    }
  }
}