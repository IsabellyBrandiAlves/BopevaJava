import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {

        int vet[] = {3, 7, 6, 1, 9, 4, 2};

        for(int v:vet){
            System.out.print(v + " ");
        }
        int pos = Arrays.binarySearch(vet, 8);
        System.out.println("\nEncontrei o valor na posição " + pos);
    }
}
