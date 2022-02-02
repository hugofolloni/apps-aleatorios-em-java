// Aluno: Hugo Folloni Guarilha - DRE: 121085854

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        integerToString(123456789);
        integerToString(1231);
        integerToString(9321321);
        integerToString(1123321154);
        integerToString(123121124143L);
        integerToString(100110152);
    }

    static String integerToString(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(String.valueOf(n / 1000000000));
        arrayList.add(String.valueOf((n % 1000000000)/ 1000000));
        arrayList.add(String.valueOf((n % 1000000) / 1000));
        arrayList.add(String.valueOf(n % 1000));

        System.out.println(getNumeroPorTrio(arrayList));

        return getNumeroPorTrio(arrayList);
    }

    // Decidi criar este overload para comportar os números até um trilhão, já que alguns números maiores que 2 bilhões diziam ser muito longos para um inteiro.
    static String integerToString(long n){

        ArrayList<String> arrayList = new ArrayList<>();

        // Divido o número em fatias de 3, para comportar os milhões, bilhões, etc.
        arrayList.add(String.valueOf(n / 1000000000));
        arrayList.add(String.valueOf((n % 1000000000)/ 1000000));
        arrayList.add(String.valueOf((n % 1000000) / 1000));
        arrayList.add(String.valueOf(n % 1000));

        System.out.println(getNumeroPorTrio(arrayList));

        return getNumeroPorTrio(arrayList);

    }


    private static String getNumeroPorTrio(ArrayList<String> arrayList){
        Map<String, String> numeros_key = numeros_key();

        String número = new String();

        // Como estava dando problemas com o objeto do array que possui apenas um elemento, fiz isto para padronizar em 3 elementos.
        for(int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i).length() < 2){
                String antigo = arrayList.get(i);
                arrayList.set(i, "00" + antigo);
            }
        }

        for(int i = 0; i < arrayList.size(); i++){

            // Aqui altero os modificadores de milhão, bilhão e milhar para os casos de não termos nenhum elemento, apenas um, ou mais de um.
            String modificador = new String();
            if(arrayList.get(i).equals("000")){
                modificador = "";
            }
            else if (arrayList.get(i).equals("001")) {
                switch(i){
                    case 0:
                        modificador = "Bilhão ";
                        break;
                    case 1:
                        modificador = "Milhão ";
                        break;
                    case 2:
                        modificador = "Mil ";
                        break;
                    case 3:
                        modificador = "";
                        break;
                }
            }
            else {
                switch(i){
                    case 0:
                        modificador = "Bilhões ";
                        break;
                    case 1:
                        modificador = "Milhões ";
                        break;
                    case 2:
                        modificador = "Mil ";
                        break;
                    case 3:
                        modificador = "";
                        break;
                }
            }

            String anterior = número;

            if(arrayList.get(i).equals("000")){
                número = "";
            }
            else if (arrayList.get(i).equals("100")){
                número = "Cem " + modificador;
            }
            else {

                String linkPrimeiroSegundo = new String();
                String linkSegundoTerceiro = new String();

                String primeiro = arrayList.get(i).charAt(0) + "00";

                if (primeiro.equals("000")){
                    linkPrimeiroSegundo = "";
                }
                else{
                    linkPrimeiroSegundo = "e ";
                }

                // Aqui me certifico de diferenciar as dezenas começadas com 1 e as não começadas, afinal tem vinte e dois e doze.
                if (arrayList.get(i).charAt(1) == '1') {
                    String segundo = arrayList.get(i).substring(1, 3);

                    número = anterior + numeros_key.get(primeiro) + linkPrimeiroSegundo + numeros_key.get(segundo) + modificador;

                } else {
                    String segundo = arrayList.get(i).charAt(1) + "0";
                    String terceiro = arrayList.get(i).substring(2, 3);

                    if(segundo.equals("00")){
                        linkSegundoTerceiro = "";
                    }
                    else{
                        linkSegundoTerceiro = "e ";
                    }

                    número = anterior + numeros_key.get(primeiro) + linkPrimeiroSegundo + numeros_key.get(segundo) + linkSegundoTerceiro + numeros_key.get(terceiro) + modificador;
                }
            }
        }

        return número;
    }

    // Dicionário
    private static Map<String, String> numeros_key() {

        Map<String, String> numeros_key = new HashMap();

        numeros_key.put("0","");
        numeros_key.put("00","");
        numeros_key.put("000","");

        numeros_key.put("1", "Um ");
        numeros_key.put("2", "Dois ");
        numeros_key.put("3", "Três ");
        numeros_key.put("4", "Quatro ");
        numeros_key.put("5", "Cinco ");
        numeros_key.put("6", "Seis ");
        numeros_key.put("7", "Sete ");
        numeros_key.put("8", "Oito ");
        numeros_key.put("9", "Nove ");
        numeros_key.put("10", "Dez ");

        numeros_key.put("11", "Onze ");
        numeros_key.put("12", "Doze ");
        numeros_key.put("13", "Treze ");
        numeros_key.put("14", "Catorze ");
        numeros_key.put("15", "Quinze ");
        numeros_key.put("16", "Dezesseis ");
        numeros_key.put("17", "Dezessete ");
        numeros_key.put("18", "Dezoito ");
        numeros_key.put("19", "Dezenove ");

        numeros_key.put("20", "Vinte ");
        numeros_key.put("30", "Trinta ");
        numeros_key.put("40", "Quarenta ");
        numeros_key.put("50", "Cinquenta ");
        numeros_key.put("60", "Sessenta ");
        numeros_key.put("70", "Setenta ");
        numeros_key.put("80", "Oitenta ");
        numeros_key.put("90", "Noventa ");

        numeros_key.put("100", "Cento ");
        numeros_key.put("200", "Duzentos ");
        numeros_key.put("300", "Trezentos ");
        numeros_key.put("400", "Quatrocentos ");
        numeros_key.put("500", "Quinhentos ");
        numeros_key.put("600", "Seiscentos ");
        numeros_key.put("700", "Setecentos ");
        numeros_key.put("800", "Oitocentos ");
        numeros_key.put("900", "Novecentos ");

        return numeros_key;
    }

}
