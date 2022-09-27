public class aula2 {

    // TESTANDO VARIÁVEIS

    public static void main(String[] args) {

    // Criando um número aleatório em double, transformando pra int

        double numeroa = Math.random() * 11;
        int inteiro = (int)numeroa;

    //Se der 1 o Kaio vive, se der qualquer outro número, o Kaio morre

        System.out.println("VIVO OU MORTO?\n\nKAIO:");
        String vivo = "Vivo!";
        String morto = "Morto!";

        int Kaio = (inteiro);
            if (Kaio <= 5)
                System.out.println(vivo);
            else {
                System.out.println(morto);
            }

        System.out.println("\nBELLY:");

        int Belly = (inteiro);
        if (Belly > 5)
            System.out.println(vivo);
        else {
            System.out.println(morto);
        }


    //Sorteando um número aleatório de 1 a 6, simulando um dado

        double numerob = Math.random() * 13;
        int dado = (int)numerob;
        System.out.println("\nDADO\n\nNúmero sorteado no dado: " + dado);


    }
}
