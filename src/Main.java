import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Cliente victor = new Cliente("Victor", 256);

        Conta cc = new ContaCorrente(victor);
        Conta cp = new ContaPoupanca(victor);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(100);
        cp.depositar(150);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.sacar(10);
        cp.sacar(20);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.pagamento(60);
        cp.trasferir("TED",50,cc);
        cc.imprimirExtrato();
        cp.imprimirExtrato();



    }

}