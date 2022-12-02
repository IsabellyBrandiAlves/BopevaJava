import java.util.Arrays;

public class Ordenação {

    public static void main(String[] args) {

        int[] numbers = new int[]{10,30,3,2,1,5,2,3,10};
        Arrays.sort(numbers);
        System.out.println(numbers); // <- hashcode int[] (Identificador)
        System.out.println(Arrays.toString(numbers));

    }

}
