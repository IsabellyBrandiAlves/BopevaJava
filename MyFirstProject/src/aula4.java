public class aula4 {

    // FUNÇÕES


//    public static void main(String[] args) {
//
//        calc(23,10,5); //argumentos
//
//    }
//
//    static void calc(double x, double y, int z) {
//
//        //static void -> declaração padrão
//        //calc -> nome da função, geralmente usar verbos para definir o que a função irá fazer
//        //() -> parenteses, são usados para definir o que chegará de parâmetro para aquela função - tipo(int/double) nomedavariavel(x,y,z)
//        //{} -> bloco de código que será executado
//
//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x/y);
//        System.out.println(x*y);
//
//    }



    //ATIVIDADE



    public static void main(String[] args) {


        SomaString("Bem","Vindos!");
        CalculaNumeros(250,120);

    }
    static void SomaString(String str, String str1){

        System.out.println(str + " " + str1 + "\n");

    }
    static void CalculaNumeros(double num1, double num2){

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num2 - num1);

    }

}
