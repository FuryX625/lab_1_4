import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner odczyt = new Scanner(System.in);
    int wybor;
    double r1, r2, pole, pole2, a, b;
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
        r1=odczyt.nextDouble();
        System.out.println("Podaj promien 2. koła");
        r2=odczyt.nextDouble();
        if (r1<=0 || r2<=0){
          System.out.println("Złe dane;");
          break;
        }
        r1=Math.pow(r1,2);
        r2=Math.pow(r2,2);
        pole=pi*r1+pi*r2;
        System.out.println("Pole kola = "+pole);
       break;
      case 2:
        System.out.println("Podaj długośc boku a: ");
        a=odczyt.nextDouble();
        System.out.println("Podaj długośc boku b: ");
        b=odczyt.nextDouble();
        if (a<=0 || b<=0){
          System.out.println("Złe dane;");
          break;
          }
        pole=a*b;
        System.out.println("Pole prostokąta to: "+pole);
      break;
      case 3:
        System.out.println("Podaj bok a oraz b: ");
        a=odczyt.nextDouble();
        b=odczyt.nextDouble();
        if (a<=0 || b<=0){
          System.out.println("Złe dane;");
          break;
          }
        pole=(a*b)/2;
        System.out.println("Pole trójkąta prostokątnego wynosi: "+pole);
      break;
      case 4:
        System.out.println("Podaj długośc boku kwadratu nr 1: ");
        a=odczyt.nextDouble();
        System.out.println("Podaj długośc boku kwadratu nr 1: ");
        b=odczyt.nextDouble();
        if (a<=0 || b<=0){
          System.out.println("Złe dane;");
          break;
          }
        pole=Math.pow(a,2);
        pole2=Math.pow(b,2);
        double wynik = pole+pole2;
        System.out.println("Suma pól wynosi"+wynik);
      break;
      default: 
      break;
      
    }
  }
}