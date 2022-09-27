public class Calculator3 {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]); //[] = pegar a posição e converter para o valor denominado abaixo
        int y = Integer.parseInt(args[2]);

        if (args[1].equals("!")) {

            potencia(x, y);

        }
    }

    static void potencia(int x, int y) {

        int i = 0;
        int base = x;

        while(i <= y){

            base = base * x;
            i++;

        }

        if (y == 0){
            System.out.println("1");
        }
        else {
            System.out.println(base);
        }


    }
}
