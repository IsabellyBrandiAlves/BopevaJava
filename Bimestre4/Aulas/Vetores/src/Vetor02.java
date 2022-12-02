public class Vetor02 {

    public static void main(String[] args) {

        String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c<mes.length; c++){
            System.out.println(mes[c] + " tem " + dias[c] + " dias.");
        }

        int nums[] = dias;

        int sum = getSum(nums);
        System.out.println("Total de dias ao ano: " + sum);

    }

    public static int getSum(int[] nums) {
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }
        return sum;
    }

}
