package co.isabellybrandialves.bank;

public class Account {

    private static final int MAX_LENGTH = 12;

    // final -> constante | não é possível modificar a variável em NENHUM lugar
    // constante é tudo maiúsculo

    private String ag;
    private String cc;
    private String name;

    private double balance;

    private  Log logger;

    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        this.name = name;
        setName(name);
        logger = new Log();
    }

    public void setName(String name) {
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
            //seleciona apenas o que está dentro dos limites, o resto é deletado
        }
        else {
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("DEPÓSITO - R$ " + value + " Sua conta agora é de R$ " + balance);
    }

    public boolean withDraw(double value) {
        if (balance < value) {
            logger.out("SAQUE - R$ " + value + " Seu saldo atual é de R$" + balance);
            return false;
        }
        balance -= value;
        logger.out("Sua conta agora é de R$ " + balance);
        return true;
    }

    @Override
    public String toString(){
        String result = "A conta " + this.name + " " + this.ag + " / " + this.cc + " possui R$" + balance;
        return result;
    }

}
