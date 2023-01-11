package api.gerenciamentoPessoas.domain.pessoa;

import api.gerenciamentoPessoas.domain.endereco.Endereco;

import java.util.Date;

public record DadosListagemPessoa(Long id, String nome, Date dataDeNascimento, Endereco endereco) {

    public DadosListagemPessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getDataDeNascimento(), pessoa.getEndereco());
    }
}
