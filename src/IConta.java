public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void imprimirExtrato();
    void trasferir(String tipoTr, double valor, Conta contaDestino);
    void pagamento(double valor);
}
