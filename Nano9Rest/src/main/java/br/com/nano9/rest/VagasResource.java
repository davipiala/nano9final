package br.com.nano9.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.nano9.biz.bean.VagaBean;


@Path("vagas")
public class VagasResource {

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public VagaBean getIt() {
    	VagaBean vaga = new VagaBean();
    	vaga.setCodigo(1);
        return vaga;
    }
}
