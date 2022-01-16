package br.com.maquiagensapi.service.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FabricanteVO {

    private Long id;

    private String razaoSocial;

    private String nomeFantasia;

    private String pais;

    private String cnpj;
}
