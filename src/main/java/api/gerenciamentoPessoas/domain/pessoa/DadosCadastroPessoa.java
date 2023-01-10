package api.gerenciamentoPessoas.domain.pessoa;

import api.gerenciamentoPessoas.domain.endereco.DadosEndereco;
import api.gerenciamentoPessoas.domain.endereco.Endereco;

import java.util.Date;

public record DadosCadastroPessoa(String nome, Date dataDeNascimento, DadosEndereco endereco) {
}
