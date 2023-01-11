package api.gerenciamentoPessoas.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String CEP;
    private String numero;
    private String cidade;


    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.CEP = endereco.CEP();
        this.numero = endereco.numero();
        this.cidade = endereco.cidade();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if (endereco.logradouro() != null) {
            this.logradouro = endereco.logradouro();
        }
        if (endereco.CEP() != null) {
            this.CEP = endereco.CEP();
        }
        if (endereco.numero() != null) {
            this.numero = endereco.numero();
        }
        if (endereco.cidade() != null) {
            this.cidade = endereco.cidade();
        }
    }
}
