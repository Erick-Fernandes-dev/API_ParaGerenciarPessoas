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

}
