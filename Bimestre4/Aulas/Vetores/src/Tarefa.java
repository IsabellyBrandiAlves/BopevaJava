public class Tarefa {

    public static void main(String[] args) {

        int vet1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vet2[] = {1,3,4,6,5,10,13,15,9,23,11,21,20,14,15};

        System.out.print("vet1 = ");

        for (int valor:vet1) {
            System.out.print(valor);
        }

        System.out.print("\nvet2 = ");

        for (int valor:vet2) {
            System.out.print(valor);
        }

        System.out.print("\nvet3 = ");

        for(int vet3=0; vet3<=vet1.length-1; vet3++){

            if (vet1[vet3] == vet2[vet3]){
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }

    }

}
