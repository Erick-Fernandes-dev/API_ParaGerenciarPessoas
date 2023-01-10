package api.gerenciamentoPessoas.controller;

import api.gerenciamentoPessoas.domain.pessoa.DadosCadastroPessoa;
import api.gerenciamentoPessoas.domain.pessoa.DadosDetalhamentoPessoa;
import api.gerenciamentoPessoas.domain.pessoa.Pessoa;
import api.gerenciamentoPessoas.domain.pessoa.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody DadosCadastroPessoa dados, UriComponentsBuilder uriBuilder) {

        var pessoa = new Pessoa(dados);
        this.repository.save(pessoa);
        var uri = uriBuilder.path("/pessoas/{id}").buildAndExpand(pessoa.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoPessoa(pessoa));

    }


}
