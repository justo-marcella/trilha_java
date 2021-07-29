public class CriaConta {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta();
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.titular);

       Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A segunda conta tem R$" + segundaConta.saldo);

    }
}
