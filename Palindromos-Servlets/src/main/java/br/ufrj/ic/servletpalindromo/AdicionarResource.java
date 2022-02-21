// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;

@Path("/adicionar")
public class AdicionarResource {
    @GET
    @Produces("text/html")
    public String adicionar() {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Adicionar Palíndromo</title></head>";
        html += "<body><h2>Adicionar Palíndromo</h2>$formadicionar<p><a href=\"listar\">Cancelar</a></p><body></html>";
        html = html.replace("$formadicionar",htmlForm());
        return html;
    }

    private String htmlForm() {
        String formhtml = "<form method=\"GET\" action=\"salvar\">";
        formhtml += "<input type=\"text\" name=\"palindromo\"></input>";
        formhtml += "<input type=\"submit\" value=\"Adicionar\"></input></form>";
        return formhtml;
    }
}