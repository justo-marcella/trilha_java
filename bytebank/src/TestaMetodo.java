public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaMarcella = new Conta();
        contaDaMarcella.saldo = 100;
        contaDaMarcella.deposita(75);

        boolean conseguiuRetirar = contaDaMarcella.saca(35);

        Conta contaDoMarcos = new Conta();
        contaDoMarcos.deposita(1000);

        if(contaDoMarcos.transfere(300, contaDaMarcella)){
            System.out.println("Transferência feita com sucesso!");
        }else {
            System.out.println("Faltou dinheiro!");
        };
        System.out.println(contaDoMarcos.saldo);
        System.out.println(contaDaMarcella.saldo);

        contaDaMarcella.titular = "Marcella Justo";
        contaDoMarcos.titular = "Marcos Paulo Albuquerque";

        System.out.println(contaDaMarcella.titular);
        System.out.println(contaDoMarcos.titular);
    }
}
