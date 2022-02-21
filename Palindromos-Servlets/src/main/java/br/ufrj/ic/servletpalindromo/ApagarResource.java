// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;

@Path("/apagar")
public class ApagarResource {
    @GET
    @Produces("text/html")
    public String apagar(@QueryParam("apagarPalindromo") @DefaultValue("") String palindromoParaApagar) {
        if(PalindromoApplication.existePalindromo(palindromoParaApagar)){
            PalindromoApplication.palindromos.remove(palindromoParaApagar);
            String html = "<html><head><meta charset=\"UTF-8\"><title>Sucesso!</title></head>";
            html += "<body><h2>Palíndromo deletado!</h2><p>" + palindromoParaApagar + " foi excluído da lista.</p><p><a href=\"listar\">Voltar à lista</a></p></body></html>";
            return html;
        }
        else{
            String html = "<html><head><meta charset=\"UTF-8\"><title>Erro!</title></head>";
            html += "<body><h2>Erro ao deletar!!</h2><p>"+ palindromoParaApagar +" não foi excluído por não ser estar na lista.</p><p><a href=\"listar\">Voltar à lista</a></p></body></html>";
            return html;
        }
    }

}
