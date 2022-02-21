// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;

@Path("/buscar")
public class BuscarResource {
    @GET
    @Produces("text/html")
    public String buscar() {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Buscar Palíndromo</title></head>";
        html += "<body><h2>Buscar Palíndromo</h2>$formadicionar<p><a href=\"listar\">Cancelar</a></p><body></html>";
        html = html.replace("$formadicionar",htmlForm());
        return html;
    }

    private String htmlForm() {
        String formhtml = "<form method=\"GET\" action=\"resultadobusca\">";
        formhtml += "<input type=\"text\" name=\"palindromo\"></input>";
        formhtml += "<input type=\"submit\" value=\"Buscar\"></input></form>";
        return formhtml;
    }
}