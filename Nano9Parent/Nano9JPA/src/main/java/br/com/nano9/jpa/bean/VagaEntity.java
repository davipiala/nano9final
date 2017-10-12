package br.com.nano9.jpa.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name="vagas")
public class VagaEntity implements Serializable
{
  private static final long serialVersionUID = -8133651479625272021L;
  @Id
  @Column(name="codigo", unique=true)
  private int codigo;
  
  public VagaEntity() {}
  
  public int getCodigo()
  {
    return codigo;
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public int hashCode() {
    return getCodigo();
  }
  
  public boolean equals(Object obj)
  {
    if (!(obj instanceof VagaEntity))
      return false;
    VagaEntity value = (VagaEntity)obj;
    return value.hashCode() == hashCode();
  }
}