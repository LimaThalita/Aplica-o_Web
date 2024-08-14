package com.epifanio.aplicacao_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.epifanio.aplicacao_web.model.Usuario;

public interface ProjetowebRepository extends JpaRepository<Usuario, Long>{
    Usuario findById(long id);

}
