package br.com.nano9.biz.bean;

import java.io.Serializable;

public class VagaBean implements Serializable {

	private static final long serialVersionUID = -3898240624487603836L;
	private int codigo;

	public VagaBean() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int hashCode() {
		return getCodigo();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof VagaBean))
			return false;
		VagaBean value = (VagaBean) obj;
		return value.hashCode() == hashCode();
	}

}
