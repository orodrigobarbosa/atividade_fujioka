package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme) {
        return repository.save(filme);
    }

    public List<Filme> listarTodos() {
        return repository.findAll();
    }

    public Filme atualizar(Filme filme) {
        if (filme.getId() == null) {
            throw new RuntimeException("Filme sem ID");
        }
        return repository.save(filme);
    }

    public Filme buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

}
