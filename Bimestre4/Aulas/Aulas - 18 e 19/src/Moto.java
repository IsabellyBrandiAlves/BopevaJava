public class Moto {

    // Acelerar, desacelerar, frear, seguir alguma direção
    private static final int MAX_RUN = 2; //vai até 99km
    private String acelerar;

    public Moto(String acelerar) {
        this.acelerar = acelerar;
        setRun(acelerar);
    }
    public void setRun(String run) {
        if (run.length() > MAX_RUN) {
            System.out.println("Você não pode acelerar mais do que 99km!");
            this.acelerar = run.substring(0, MAX_RUN);
            System.out.println("Diminui sua velocidade para: " + acelerar);
        }
        else {
            this.acelerar = run;
            System.out.println("Parabéns, você está em uma boa velocidade.");
            System.out.println(acelerar);
        }
    }
}
