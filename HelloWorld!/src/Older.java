import java.util.Scanner;
import java.util.Arrays;

public class Older {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Me diga duas datas de nascimento e lhe direi quem é o mais velho.");

        System.out.println("Diga-me a primeira: ");
        String dataNasc1 = input.nextLine();
        String[] strNasc1 = dataNasc1.split("/");
        int day1 = Integer.parseInt(strNasc1[0]);
        int month1 = Integer.parseInt(strNasc1[1]);
        int year1 = Integer.parseInt(strNasc1[2]);

        System.out.println("Agora me diga a segunda: ");
        String dataNasc2 = input.nextLine();
        String[] strNasc2 = dataNasc2.split("/");
        int day2 = Integer.parseInt(strNasc2[0]);
        int month2 = Integer.parseInt(strNasc2[1]);
        int year2 = Integer.parseInt(strNasc2[2]);

        if(year1 < year2){
            System.out.println("O primeiro é mais velho!");
        }
        else if(year1 > year2){
            System.out.println("O segundo é mais velho!");
        }
        else{
            if(month1 < month2){
                System.out.println("O primeiro é mais velho!");
            }
            else if(month1 > month2){
                System.out.println("O segundo é mais velho!");
            }
            else{
                if(day1 < day2){
                    System.out.println("O primeiro é mais velho!");
                }
                else if(day1 > day2){
                    System.out.println("O segundo é mais velho!");
                }
                else{
                    System.out.println("Ambos tem a mesma idade!");
                }
            }
        }
    }
}
