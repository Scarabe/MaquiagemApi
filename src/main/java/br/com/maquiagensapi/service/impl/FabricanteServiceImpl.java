package br.com.maquiagensapi.service.impl;

import br.com.maquiagensapi.exception.NotFound;
import br.com.maquiagensapi.mapper.FabricanteMapper;
import br.com.maquiagensapi.repository.FabricanteRepository;
import br.com.maquiagensapi.service.FabricanteService;
import br.com.maquiagensapi.service.vo.FabricanteVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FabricanteServiceImpl implements FabricanteService {

    private final FabricanteRepository fabricanteRepository;

    public void insert(FabricanteVO fabricanteVO) {
        fabricanteRepository.save(FabricanteMapper.toEntity(fabricanteVO));
    }

    public FabricanteVO getById(Long id) throws NotFound {
        return FabricanteMapper.toVO(fabricanteRepository.findById(id)
                .orElseThrow(NotFound::new));
    }
    
    public void deleteById(Long id) {
        fabricanteRepository.deleteById(id);
    }

    public List<FabricanteVO> findAll() {
        return FabricanteMapper.toVO(fabricanteRepository.findAll());
    }
}
