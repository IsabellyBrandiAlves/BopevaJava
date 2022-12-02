import java.util.Arrays;

public class PreenchendoArrays {

    public static void main(String[] args) {

        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "Desconhecido");

        System.out.println(Arrays.toString(names));

    }

}
