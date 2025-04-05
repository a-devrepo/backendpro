package br.com.animalsservice.entidades;

import java.sql.Date;

public class AnimaisResgatados {

    private String nomeFuncionario;
    private Long quantidadeAnimais;
    private Date dataInicio;
    private Date dataFim;

    public AnimaisResgatados(String nomeFuncionario, Long quantidadeAnimais, Date dataInicio, Date dataFim) {
        this.quantidadeAnimais = quantidadeAnimais;
        this.nomeFuncionario = nomeFuncionario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Long getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(Long quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
