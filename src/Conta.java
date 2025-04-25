import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class  Conta implements IConta{

    private static int SEQUENCIAL;
    private int agencia;
    private int numConta;
    private double saldo;
    @Setter
    private Cliente cliente;
    @Setter
    private Banco banco;
    private boolean contaAtiva = false;


    public Conta (Cliente cliente){
        this.numConta = SEQUENCIAL++;
        banco = new Banco();
        this.cliente = cliente;
        this.contaAtiva = true;
    }

    @Override
    public void sacar(double valor) {
        if (contaAtiva==true){
            saldo-=valor;
        }else
            System.out.println("Conta Inativa ou Inesistente");
    }

    @Override
    public void depositar(double valor) {
        if (contaAtiva==true){
            saldo+=valor;
        }else
            System.out.println("Conta Inativa ou Inesistente");
    }

    @Override
    public void trasferir(String tipoTr, double valor, Conta contaDestino) {
        if (contaAtiva==true && tipoTr.equals("PIX")){
            this.sacar(valor);
            contaDestino.depositar(valor);


        } else if (contaAtiva==true && tipoTr.equals("TED")) {
            double trfValor = valor + (valor * 0.05);
            saldo-=trfValor;
            contaDestino.depositar(trfValor);
        } else
            System.out.println("Conta Inativa ou Inesistente");
    }

    @Override
    public void pagamento (double valor) {
        saldo+=valor;
    }

    public void imprimirInfoComuns() {
        System.out.println(String.format("Banco: %s", banco.getNome()));
        System.out.println(String.format("Agencia: %d", banco.getAgencia()));
        System.out.println(String.format("Cliente: %s", cliente.getNome()));
        System.out.println(String.format("CPF: %d", cliente.getCpf()));
        System.out.println(String.format("Conta: %d", this.numConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Conta esta ativa: %s", this.contaAtiva));
    }


    }
