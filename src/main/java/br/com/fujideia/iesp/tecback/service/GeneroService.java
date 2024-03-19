package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.repository.GeneroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero) {
        return repository.save(genero);
    }

    public List<Genero> listarTodos() {
        return repository.findAll();
    }


    public Genero atualizar(Genero genero) {
        if (genero.getId() == null) {
            throw new RuntimeException("Gênero sem ID");
        }
        return repository.save(genero);
    }

    public Genero buscarPorId(Long id) {
        return repository.findById(id).get();

    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }


}
