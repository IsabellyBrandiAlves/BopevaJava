package co.isabellybrandialves.bank;

public class App {

    public static void main(String[] args) {

        System.out.println("Olá mundo!");

        // criar uma conta (agencia, conta, nome)
        //      limitar o nome = 12 caracteres

        Account account = new Account("0001", "1234", "Seu Barriga");

        // sacar valores
        //      não pode sacar mais do que tem

        boolean succeed = account.withDraw(200.0);
        if (!succeed){
            System.out.println("SAQUE: Você não tem saldo suficiente para sacar!");
        }


        // depositar

        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(200)){
            System.out.println("SAQUE:Você não tem saldo suficiente para sacar!");
        }
        else {
            System.out.println("Saque efetuado!");
        }
        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }
        else {
            System.out.println("Saque efetuado!");
        }

        // informar para o usuário as operações (saque, deposito)
        System.out.println(account);


    }

}
