// Aluno: Hugo Foloni Guarilha - DRE: 121085854

package br.ufrj.ic.servletpalindromo;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

@ApplicationPath("/api")
public class PalindromoApplication extends Application {
    protected static ArrayList<String> palindromos = new ArrayList<>();

    protected static String palindromosToHTML(boolean ordena) {
        if (palindromos.size() == 0) {
            return "<p>Lista vazia! Adicione seu primeiro palíndromo para começar.</p>";
        }
        ArrayList<String> pali_copy = new ArrayList<>(palindromos);
        if (ordena) {
            Collections.sort(pali_copy);
        }
        String html = "";
        for (int i=0;i<pali_copy.size();++i) {
            html += "<p style=\"color: "+ (i % 2 == 0 ? "orange" : "green") +"\">"+pali_copy.get(i)+" <a href=\"apagar?apagarPalindromo=" + pali_copy.get(i) + "\"><img src='https://cdn-icons-png.flaticon.com/512/1483/1483063.png' height='20px'></img>  </a> </p>";
        }
        return html;
    }

    public static boolean existePalindromo(String texto){
        if(palindromos.contains(texto)){
            return true;
        }
        else {
            return false;
        }
    }

    protected static boolean ehPalindromo(String texto) {
        if (texto.length() < 1) {
            return false;
        }
        for (int i=0;i < texto.length()/2; ++i) {
            char c1 = texto.charAt(i);
            char c2 = texto.charAt(texto.length()-1-i);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> temEstePalindromo(String parte){
        ArrayList<String> contemParte = new ArrayList<>();
        for(int i = 0; i < palindromos.size(); i++){
            if(palindromos.get(i).contains(parte)){
                contemParte.add(palindromos.get(i));
            }
        }
        return contemParte;
    }
}