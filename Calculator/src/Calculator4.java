import java.util.Scanner;

public class Calculator4 {

    public static void main(String[] args) {

        Escolha esc = new Escolha(); //Apenas fazendo uma chamada da classe Escolha, e criando a variável esc

        boolean val = false;//Criando a variável val(de valor), indicando que é booleana e que se inicia sendo falsa

        while(val == false) { //Enquanto "val" for "false" o while vai ficar fazendo loop, mas quando se tornar "true" ele vai parar
            int opc = esc.menu(); //Criando a variável opc(de opção), chamando o Menu lá embaixo
            val = esc.escolher(opc); //Chamando a função escolher, relacionando à opção(que está conectada ao Menu)
        }

    }

static class Escolha {

    //Criando as funções

    static double somar(double x, double y) {
        return x + y;
    }

    static double subtrair(double x, double y) {
        return x - y;
    }

    static double multiplicar(double x, double y) {
        return x * y;
    }

    static double dividir(double x, double y) {
        return x / y;
    }
    static double potencia(double x, double y) {
        return Math.pow(x, y);
    }

    static double raiz(int x, double y) {

        return Math.pow(x, 1/y);
    }

    static double porcentagem(double x, double y) {
        return x / 100 * y;
    }

    //Criando a chamada das funções através de números, em formato boolean(true or false)
    public boolean escolher(int escolha) {
        switch (escolha) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                System.out.println("FECHANDO A CALCULADORA...");
                return true;
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
                return false;
        }
    }

    //Criando o menu principal, com as informações conectadas às chamadas das funções

    public int menu() {

        //Fazendo o molde

        System.out.println("-----------------------------------------\n" +
                            "ESCOLHA:\n" +
                            "[1] Soma\n" +
                            "[2] Subtração\n" +
                            "[3] Divisão\n" +
                            "[4] Multiplicação\n" +
                            "[5] Potência\n" +
                            "[6] Raiz\n" +
                            "[7] Porcentagem\n" +

                            "\n[8] Fechar o programa\n" +
                            "-----------------------------------------");

        //A partir do que escolher... faça isso ou faça aquilo

        Scanner a = new Scanner(System.in);
        int escolha = a.nextInt();

        //Criando as variáveis x e y

        int x;
        int y;

        //Fazendo as condições

        if (escolha == 1) {
            System.out.println("Digite um número:");
            x = a.nextInt();
            System.out.println("Quer somar com qual número?");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + somar(x, y));
        }
        else if (escolha == 2) {
            System.out.println("Digite um número:");
            x = a.nextInt();
            System.out.println("Quer subtrair por qual número?");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + subtrair(x, y));
        }
        else if (escolha == 3) {
            System.out.println("Digite um número:");
            x = a.nextInt();
            System.out.println("Quer dividir por qual número?");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + dividir(x, y));
        }
        else if (escolha == 4) {
            System.out.println("Digite um número:");
            x = a.nextInt();
            System.out.println("Quer multiplicar por qual número?");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + multiplicar(x, y));
        }
        else if (escolha == 5) {
            System.out.println("Digite o número da base:");
            x = a.nextInt();
            System.out.println("Digite o número do expoente:");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + potencia(x, y));
        }
        else if (escolha == 6) {
            System.out.println("Qual o radicando?");
            x = a.nextInt();
            System.out.println("Qual é o índice?");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + raiz(x, y));
        }
        else if (escolha == 7) {
            System.out.println("Digite um número:");
            x = a.nextInt();
            System.out.println(x + "% de...");
            y = a.nextInt();
            System.out.println("RESULTADO:\n" + porcentagem(x, y) + "%");
        }

        return escolha;
    }
}
}