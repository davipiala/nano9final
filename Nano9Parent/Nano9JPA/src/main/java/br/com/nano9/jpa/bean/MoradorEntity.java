package br.com.nano9.jpa.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@javax.persistence.Table(name="moradores")
public class MoradorEntity implements Serializable
{
  private static final long serialVersionUID = -3463689992241078084L;
  @javax.persistence.Id
  @Column(name="codigo", unique=true)
  private int id;
  @Column(name="nome")
  private String nome;
  @Column(name="cpf")
  private String cpf;
  @Column(name="telefone")
  private String telefone;
  @Column(name="responsavel")
  private String responsavel;
  
  public MoradorEntity() {}
  
  public int getId()
  {
    return id;
  }
  
  public void setId(int id) { this.id = id; }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) { this.nome = nome; }
  
  public String getCpf() {
    return cpf;
  }
  
  public void setCpf(String cpf) { this.cpf = cpf; }
  
  public String getTelefone() {
    return telefone;
  }
  
  public void setTelefone(String telefone) { this.telefone = telefone; }
  
  public String getResponsavel() {
    return responsavel;
  }
  
  public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}