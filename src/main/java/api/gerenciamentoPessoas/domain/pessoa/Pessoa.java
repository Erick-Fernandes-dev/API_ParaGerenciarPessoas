package api.gerenciamentoPessoas.domain.pessoa;

import api.gerenciamentoPessoas.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Date dataDeNascimento;

    @Embedded
    private Endereco endereco;

    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.endereco = new Endereco(dados.endereco());
    }

}
