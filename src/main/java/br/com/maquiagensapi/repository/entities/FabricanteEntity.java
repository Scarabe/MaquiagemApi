package br.com.maquiagensapi.repository.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "fabricante")
public class FabricanteEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    private String pais;

    private String cnpj;
}
