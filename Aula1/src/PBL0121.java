import java.util.Scanner;

public class PBL0121 {

    // define a função f(x)
    public static double f(double x){
        return 2 * Math.sin(x) + Math.cos(x) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de 'a': ");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de 'b': ");
        double b = sc.nextDouble();
            // caso passa das condições, realiza o calculo. Se não, encerra o programa
            if (a <= b) {
                System.out.println("Digite o valor de 'n': ");
                int n = sc.nextInt();
                if (n > 0) {
                    double area_total = 0;
                    double x = a;
                    double h = (b - a) / n;
                    double y1 = f(x);
                    int i = 0;
                    while (i < n) {
                        x = x + h;
                        double y2 = f(x);
                        double area_trapezio = ((y1 + y2) / 2) * h;
                        area_total = area_total + area_trapezio;
                        y1 = y2;
                        i = i + 1;
                    }
                    System.out.println(area_total);
                } else {
                    System.out.println("Erro: o valor de 'n' deve ser maior que zero");
                }
            } else {
                System.out.println("Erro: o valor de 'a' dever ser menor ou igual ao valor de 'b'");
            }
        }

    }