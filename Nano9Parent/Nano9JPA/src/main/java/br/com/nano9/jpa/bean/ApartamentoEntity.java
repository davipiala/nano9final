package br.com.nano9.jpa.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@javax.persistence.Table(name="apartamentos")
public class ApartamentoEntity
{
  @javax.persistence.Id
  @Column(name="codigo", unique=true)
  private int id;
  @Column(name="numero")
  private int numero;
  @Column(name="andar")
  private int andar;
  @Column(name="bloco")
  private String bloco;
  
  public ApartamentoEntity() {}
  
  @OneToMany(targetEntity=MoradorEntity.class, fetch=FetchType.LAZY)
  private List<MoradorEntity> moradores = new ArrayList();
  @OneToMany(targetEntity=VagaEntity.class, fetch=FetchType.LAZY)
  private List<VagaEntity> vagas = new ArrayList();
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public int getNumero() {
    return numero;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  public int getAndar() {
    return andar;
  }
  
  public void setAndar(int andar) {
    this.andar = andar;
  }
  
  public String getBloco() {
    return bloco;
  }
  
  public void setBloco(String bloco) {
    this.bloco = bloco;
  }
  
  public List<MoradorEntity> getMoradores() {
    return moradores;
  }
  
  public void setMoradores(List<MoradorEntity> moradores) {
    this.moradores = moradores;
  }
  
  public List<VagaEntity> getVagas() {
    return vagas;
  }
  
  public VagaEntity getVagasById(int id)
  {
    VagaEntity vaga = new VagaEntity();
    vaga.setCodigo(id);
    int index = vagas.indexOf(vaga);
    return (VagaEntity)vagas.get(index);
  }
  
  public void setVagas(List<VagaEntity> vagas) {
    this.vagas = vagas;
  }
  
  public void addVaga(VagaEntity vaga)
  {
    vagas.add(vaga);
  }
}