import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bandas{

    public static void main(String[] args) {

        ArrayList<String> banda = new ArrayList<String> ();
        Scanner a = new Scanner(System.in);

        System.out.println("Primeira banda:");

        String b1 = a.nextLine();
        banda.add(b1);

        System.out.println("Segunda banda:");

        String b2 = a.nextLine();
        banda.add(b2);

        System.out.println("Terceira banda:");

        String b3 = a.nextLine();
        banda.add(b3);

        System.out.println("Quarta banda:");

        String b4 = a.nextLine();
        banda.add(b4);

        System.out.println("Quinta banda:");

        String b5 = a.nextLine();
        banda.add(b5);

        System.out.println(Arrays.toString(banda.toArray()) + "\n");

        System.out.println("Banda 3 -> " + banda.get(2) + "\n");

        System.out.println("Adicionando Quiet Riot onde estava a terceira banda:");
        banda.add( banda.indexOf(b3), "Quiet Riot                                                                                                               ");
        System.out.println(Arrays.toString(banda.toArray()) + "\n");

        System.out.println( "Removendo a terceira banda: ");
        banda.remove(b3);
        System.out.println(Arrays.toString( banda.toArray()) + "\n");

        System.out.println("Adicione mais uma banda:");

        String b6 = a.nextLine();
        banda.add(b6);

        System.out.println("Adicione mais uma banda:");

        String b7 = a.nextLine();
        banda.add(b7);

        System.out.println("Adicione mais uma banda:");

        String b8 = a.nextLine();
        banda.add(b8);

        System.out.println( "Número de elementos na lista: " );
        System.out.println( banda.size());

        System.out.println( Arrays.toString( banda.toArray() ) );

    }

}