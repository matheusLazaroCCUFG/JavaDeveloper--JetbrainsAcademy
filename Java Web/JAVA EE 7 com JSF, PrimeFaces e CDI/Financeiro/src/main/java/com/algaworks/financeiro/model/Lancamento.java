/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.model;
// imports...

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Pessoa pessoa;
    private String descricao;
    private BigDecimal valor;
    private TipoLancamento tipo;
    private Date dataVencimento;
    private Date dataPagamento;
    
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "pessoa_id")
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    @Column(length = 80, nullable = false)
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Column(precision = 10, scale = 2, nullable = false)
    public BigDecimal getValor() {
        return valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public TipoLancamento getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoLancamento tipo) {
        this.tipo = tipo;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vencimento", nullable = false)
    public Date getDataVencimento() {
        return dataVencimento;
    }
    
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento", nullable = true)
    public Date getDataPagamento() {
        return dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
