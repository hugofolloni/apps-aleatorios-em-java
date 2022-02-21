// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;

@Path("/salvar")
public class SalvarResource {
    @GET
    @Produces("text/html")
    public String salvar(@QueryParam("palindromo") @DefaultValue("") String novopalindromo) {
        if (PalindromoApplication.ehPalindromo(novopalindromo)) {
            if(PalindromoApplication.existePalindromo(novopalindromo)){
                String html = "<html><head><meta charset=\"UTF-8\"><title>Erro!</title></head>";
                html += "<body><h2>Erro ao adicionar!</h2><p>"+novopalindromo+" não foi adicionado pois já estava na lista.</p><p><a href=\"listar\">Voltar à lista</a></p></body></html>";
                return html;
            }
            else {
                PalindromoApplication.palindromos.add(novopalindromo);
                String html = "<html><head><meta charset=\"UTF-8\"><title>Sucesso!</title></head>";
                html += "<body><h2>Novo palíndromo adicionado!</h2><p>" + novopalindromo + " foi adicionado à lista.</p><p><a href=\"listar\">Voltar à lista</a></p></body></html>";
                return html;
            }
        } else {
            String html = "<html><head><meta charset=\"UTF-8\"><title>Erro!</title></head>";
            html += "<body><h2>Erro ao adicionar!</h2><p>"+novopalindromo+" não foi adicionado por não ser um palíndromo.</p><p><a href=\"listar\">Voltar à lista</a></p></body></html>";
            return html;
        }
    }
}