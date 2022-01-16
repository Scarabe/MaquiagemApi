package br.com.maquiagensapi.mapper;

import br.com.maquiagensapi.controller.request.FabricanteRequest;
import br.com.maquiagensapi.controller.response.FabricanteResponse;
import br.com.maquiagensapi.repository.entities.FabricanteEntity;
import br.com.maquiagensapi.service.vo.FabricanteVO;

import java.util.ArrayList;
import java.util.List;

public class FabricanteMapper {
    private FabricanteMapper() {
    }

    public static FabricanteVO toVO(FabricanteRequest fabricanteRequest){
        return FabricanteVO.builder()
                .cnpj(fabricanteRequest.getCnpj())
                .nomeFantasia(fabricanteRequest.getNomeFantasia())
                .pais(fabricanteRequest.getPais())
                .razaoSocial(fabricanteRequest.getRazaoSocial())
                .build();
    }

    public static FabricanteVO toVO(FabricanteEntity fabricanteEntity){
        return FabricanteVO.builder()
                .id(fabricanteEntity.getId())
                .cnpj(fabricanteEntity.getCnpj())
                .nomeFantasia(fabricanteEntity.getNomeFantasia())
                .pais(fabricanteEntity.getPais())
                .razaoSocial(fabricanteEntity.getRazaoSocial())
                .build();
    }


    public static List<FabricanteVO> toVO(Iterable<FabricanteEntity> fabricanteEntities){
        List<FabricanteVO> vos = new ArrayList<>();
        fabricanteEntities.forEach(fabricanteEntity -> vos.add(toVO(fabricanteEntity)));
        return vos;
    }

    public static FabricanteEntity toEntity(FabricanteVO fabricanteVO) {
        return FabricanteEntity.builder()
                .id(fabricanteVO.getId())
                .cnpj(fabricanteVO.getCnpj())
                .nomeFantasia(fabricanteVO.getNomeFantasia())
                .pais(fabricanteVO.getPais())
                .razaoSocial(fabricanteVO.getRazaoSocial())
                .build();
    }

    public static FabricanteResponse toResponse(FabricanteVO fabricanteVO){
        return FabricanteResponse.builder()
                .id(fabricanteVO.getId())
                .cnpj(fabricanteVO.getCnpj())
                .nomeFantasia(fabricanteVO.getNomeFantasia())
                .pais(fabricanteVO.getPais())
                .razaoSocial(fabricanteVO.getRazaoSocial())
                .build();
    }

    public static List<FabricanteResponse> toResponse(List<FabricanteVO> fabricantesVO){
        List<FabricanteResponse> responsese = new ArrayList<>();
        fabricantesVO.forEach(fabricanteVO -> responsese.add(toResponse(fabricanteVO)));
        return responsese;
    }
}