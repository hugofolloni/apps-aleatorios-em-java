// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;
import java.util.ArrayList;

@Path("/resultadobusca")
public class ResultadoBuscaResource {
    @GET
    @Produces("text/html")
    public String resultadoBusca(@QueryParam("palindromo") @DefaultValue("") String buscaUser) {
        ArrayList<String> listaQuePossuem = PalindromoApplication.temEstePalindromo(buscaUser);
        String html = "<html><head><meta charset=\"UTF-8\"><title>Busca por " + buscaUser + "</title></head><body><h2>Busca por <strong>\"" + buscaUser + "\"</strong></h2>";
        if(listaQuePossuem.size() == 0){
            html += "<p>Não foi encontrado nenhum palíndromo que contenha essa sequência de letras.</p>";
        }
        else {
            for (int i = 0; i < listaQuePossuem.size(); ++i) {
                html += "<p style=\"color: " + (i % 2 == 0 ? "orange" : "green") + "\">" + listaQuePossuem.get(i) + "</p>";
            }
        }
        html += "<p><a href=\"buscar\">Realizar nova busca</a></p>";
        html += "<p><a href=\"listar\">Voltar à lista</a></p>";
        html += "</body></html>";
        return html;
    }
}
