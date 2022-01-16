package br.com.maquiagensapi.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FabricanteResponse {

    private Long id;

    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("nome_fantasia")
    private String nomeFantasia;

    private String pais;

    private String cnpj;
}
