package br.com.maquiagensapi.controller.request;


import br.com.maquiagensapi.enums.TipoDeProduto;

import java.time.LocalDate;

public class ProdutoRequest {

    private String nome;

    private TipoDeProduto tipoDeProduto;

    private LocalDate dataValidade;

    private FabricanteRequest fabricante;

    private Double peso;

    private String lote;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeProduto getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(TipoDeProduto tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public FabricanteRequest getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteRequest fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
