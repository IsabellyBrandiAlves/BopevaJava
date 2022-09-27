public class Calculator2 {

    // AULA 6

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]); //[] = pegar a posição e converter para o valor denominado abaixo
        double y = Double.parseDouble(args[2]);

        if (args[1].equals("%")) {

            porcentagem(x, y);

        }
        else if (args[1].equals("!")) {

            potencia(x, y);

        }
        else if (args[1].equals("/")) {

            if (args[0].equals("0")||args[2].equals("0")) {
                System.out.println("Não existe fração com 0");
            }

            else {
                fracao(x, y);
            }

        }

    }

    static void porcentagem(double x, double y){

        System.out.println(x / 100 * y + "%");

    }

    static void potencia(double x, double y){

        System.out.println(Math.pow(x, y));

    }
    static void fracao(double x, double y){

        System.out.println(1 / x);
        System.out.println(1 / y);

    }


}
