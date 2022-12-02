import java.util.Arrays;

public class ComparandoArrays {

    public static void main(String[] args) {

        int[] numbersA = new int[]{1,2,3};
        int[] numbersB = new int[]{1,2,3};

        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals(numbersB));
        System.out.println(numbersA + " " + numbersB);
        // o conteúdo é o mesmo mas a posição armazenada na memória é diferente

        System.out.println(Arrays.equals(numbersA, numbersB));
        // comparando os conteúdos

    }

}
