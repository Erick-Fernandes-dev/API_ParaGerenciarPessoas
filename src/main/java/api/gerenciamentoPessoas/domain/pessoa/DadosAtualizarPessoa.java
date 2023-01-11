package api.gerenciamentoPessoas.domain.pessoa;

import api.gerenciamentoPessoas.domain.endereco.DadosEndereco;
import api.gerenciamentoPessoas.domain.endereco.Endereco;

import java.util.Date;

public record DadosAtualizarPessoa(Long id, String nome, Date dataDeNascimento, DadosEndereco endereco) {
}
