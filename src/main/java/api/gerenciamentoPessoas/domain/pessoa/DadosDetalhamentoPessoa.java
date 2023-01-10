package api.gerenciamentoPessoas.domain.pessoa;

import api.gerenciamentoPessoas.domain.endereco.Endereco;

import java.util.Date;

public record DadosDetalhamentoPessoa(Long id, String nome, Date dataDeNascimento, Endereco endereco) {

    public DadosDetalhamentoPessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getDataDeNascimento(), pessoa.getEndereco());
    }

}
