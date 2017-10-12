package br.com.nano9.jpa.bean;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contaspagar")
public class ContaPagaEntity
  implements Serializable
{
  private static final long serialVersionUID = -8586048614499767817L;
  @Id
  @Column(name="codigo", unique=true)
  private int id;
  @Column(name="descricao")
  private String descricao;
  @Column(name="dataReferencia")
  private LocalDate dataReferencia;
  @Column(name="dataPagamento")
  private LocalDate dataPagamento;
  @Column(name="valor")
  private double valor;
  @Column(name="fornecedor")
  private String fornecedor;
  
  public ContaPagaEntity() {}
  
  public int getId()
  {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public LocalDate getDataReferencia() {
    return dataReferencia;
  }
  
  public void setDataReferencia(LocalDate dataReferencia) {
    this.dataReferencia = dataReferencia;
  }
  
  public LocalDate getDataPagamento() {
    return dataPagamento;
  }
  
  public void setDataPagamento(LocalDate dataPagamento) {
    this.dataPagamento = dataPagamento;
  }
  
  public double getValor() {
    return valor;
  }
  
  public void setValor(double valor) {
    this.valor = valor;
  }
  
  public String getFornecedor() {
    return fornecedor;
  }
  
  public void setFornecedor(String fornecedor) {
    this.fornecedor = fornecedor;
  }
}