public class TestaReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta R$" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);
    }
}
