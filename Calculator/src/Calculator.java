public class Calculator {

    // NO PROMPT DE COMANDO:
    // javac Calculator.java -> PARA COMPILAR O CÓDIGO
    // java Calculator somar 0 0 -> EXEMPLO DE EXECUÇÃO DE CÓDIGO

    public static void main(String[] args) {

        double x = Double.parseDouble(args[1]); //[] = pegar a posição e converter para o valor denominado abaixo
        double y = Double.parseDouble(args[2]);

        if(args[0].equals("somar")) {

            somar(x, y);

        }

        else if(args[0].equals("subtrair")) {

            subtrair(x, y);

        }

        else if(args[0].equals("multiplicar")) {

            multiplicar(x, y);

        }

        else if(args[0].equals("dividir")) {

            dividir(x, y);

        }

        else System.out.println("Comando não existe!!!");

    }

    static void somar(double x, double y){

        System.out.println(x + y);

    }

    static void subtrair(double x, double y){

        System.out.println(x - y);

    }

    static void multiplicar(double x, double y){

        System.out.println(x * y);

    }

    static void dividir(double x, double y){

        System.out.println(x / y);

    }

}
