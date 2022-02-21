// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.*;

@Path("/sobre")
public class SobreResource {
    @GET
    @Produces("text/html")
    public String sobre() {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Sobre Palímdromos</title></head>";
        html += "<body><h2>Sobre Palímdromos</h2>$textosobre<p><a href=\"listar\">Voltar para a lista</a></p><body></html>";
        String sobre = "Palíndromo é uma palavra, frase ou número que permanece igual quando lida de trás para diante. Por extensão, palíndromo é qualquer série de elementos com simetria linear, ou seja, que apresenta a mesma sequência de unidades nos dois sentidos.\n" +
                "\n" +
                "A palavra \"palíndromo\" vem do grego palin (πάλιν, \"para trás, novamente\") + dromos (δρόμος, \"caminho, rua\") - que corre em sentido inverso. Mas o termo foi cunhado em inglês (palindrome), no século XVII, e os primeiros a utilizá-lo foram os escritores Henry Peacham e Ben Jonson.";
        html = html.replace("$textosobre",sobre);
        return html;
    }
}