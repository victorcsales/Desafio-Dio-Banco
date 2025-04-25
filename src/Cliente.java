import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    private String nome;
    private int cpf;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
