package br.com.maquiagensapi.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FabricanteRequest {

    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("nome_fantasia")
    private String nomeFantasia;

    private String pais;

    private String cnpj;
}
