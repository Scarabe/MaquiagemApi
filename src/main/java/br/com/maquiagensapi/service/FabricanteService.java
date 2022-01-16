package br.com.maquiagensapi.service;

import br.com.maquiagensapi.exception.NotFound;
import br.com.maquiagensapi.service.vo.FabricanteVO;

import java.util.List;

public interface FabricanteService {
    void insert(FabricanteVO fabricanteVO);

    FabricanteVO getById(Long id) throws NotFound;

    void deleteById(Long id);

    List<FabricanteVO> findAll();
}
