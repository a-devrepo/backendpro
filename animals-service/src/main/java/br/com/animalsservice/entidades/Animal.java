package br.com.animalsservice.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(name = "nome_provisorio", nullable = false)
    private String nomeProvisorio;

    @Column(name = "idade_estimada", nullable = false)
    private String idadeEstimada;

    @Column(name = "raca", nullable = false)
    private String raca;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_entrada", nullable = false)
    private Date dataEntrada;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_adocao")
    private Date dataAdocao;

    @Column(name = "condicao_chegada", nullable = false)
    private String condicaoChegada;

    @Column(name = "nome_recebedor", nullable = false)
    private String nomeRecebedor;

    @Column(name = "data_obito")
    private String dataObito;

    public String getDataObito() {
        return dataObito;
    }

    public void setDataObito(String dataObito) {
        this.dataObito = dataObito;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public String getCondicaoChegada() {
        return condicaoChegada;
    }

    public void setCondicaoChegada(String condicaoChegada) {
        this.condicaoChegada = condicaoChegada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(String idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }
}