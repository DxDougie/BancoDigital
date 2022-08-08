public class Main {

    public static void main(String [] args) {
        Cliente douglas = new Cliente();
        douglas.setNome("Douglas");
        Conta cc= new ContaCorrente(douglas);
        Conta poupanca = new ContaPoupanca(douglas);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
}