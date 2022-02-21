// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;

@Path("/listar")
public class PalindromoResource {
    @GET
    @Produces("text/html")
    public String listar(@QueryParam("ordena") @DefaultValue("false") boolean ordena) {
        String bkurl = "https://cdn.pixabay.com/photo/2016/11/28/21/36/white-1866105_960_720.jpg";
        String html = "<html><head><meta charset=\"UTF-8\"><title>Lista de Palíndromos</title></head>";
        html += "<body style=\"background-image: url('"+bkurl+"');\"><h2 style=\"color: green\">Lista de Palíndromos</h2>$listapalindromo";
        html += "<p><a href=\"adicionar\">Adicionar novo</a></p>";
        html += "<p><a href=\"buscar\">Buscar palíndromo</a></p>";
        html += "<p style=\"font-size: 12px; font-style: italic;\">Saiba mais sobre palíndromos <a href=\"sobre\">aqui</a>.</body></html>";
        html = html.replace("$listapalindromo",PalindromoApplication.palindromosToHTML(ordena));
        return html;
    }
}