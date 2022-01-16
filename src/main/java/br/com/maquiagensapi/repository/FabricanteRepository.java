package br.com.maquiagensapi.repository;

import br.com.maquiagensapi.repository.entities.FabricanteEntity;
import org.springframework.data.repository.CrudRepository;

public interface FabricanteRepository extends CrudRepository<FabricanteEntity, Long> {
}
