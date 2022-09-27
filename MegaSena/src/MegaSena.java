import java.util.Random;

public class MegaSena {

    //16/09/22

    public static void main(String[] args) {

        Random gerar = new Random();

        //While

        int i = 0; // criando a variável i

        System.out.println("WHILE\n");

        while (i < 6){

            System.out.println(gerar.nextInt(60));
            i++;

        }

        //For

        System.out.println("\nFOR\n");

        for (int j = 0; j < 6; j++){

            System.out.println(gerar.nextInt(60));

        }

    }



}
