import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    
    public static void main(String[] args){
        
        int contador = 0;
        String texto;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite um texto: ");
        texto = input.nextLine();

        System.out.println();

        contador = verificarOcorrencias(texto, 'a');
    
        System.out.println((contador == 0)?"A letra 'a' nao existe no seu texto": "A letra 'a' existe no seu texto");
        System.out.println("Ocorrencias: " + contador);

        input.close();
    }

    //verifica quantas vezes 'a' se repete no texto, caso nenhuma, retorna 0
    public static int verificarOcorrencias(String string, char x){

        int contador = 0;
        int tamanho = string.length();

        for(int i = 0; i < tamanho; i++){

            string = converterParaLetraMinuscula(string);

            if(string.charAt(i) == x){

                contador++;

            }

        }

        return contador;
    }

    //Converte letras maiusculas para minusculas sem usar o toLowerCase();
    public static String converterParaLetraMinuscula(String string){

        String resultado = "";
        int tamanho = string.length();

        for(int i = 0; i < tamanho; i++){

            if(((int) (string.charAt(i)) >= 65) && ((int) (string.charAt(i)) <= 90)){

                resultado += ((char) (((int) string.charAt(i)) + 32));
            
            }else{

                resultado += string.charAt(i);

            }
        }

        return resultado;
    }

}
