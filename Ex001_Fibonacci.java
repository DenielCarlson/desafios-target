import java.util.Locale;
import java.util.Scanner;

public class Ex001_Fibonacci{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int num;

        while(true){

            try{

                System.out.println("Informe um numero para saber se ele pertence a sequencia de fibonacci: ");
                num = Integer.parseInt(input.nextLine());

                System.out.println((verificadorFibonacci(num))?"E um numero da sequencia":"Nao faz parte da sequencia");
                break;
    
            }
            catch(NumberFormatException e){
                
                mensagemErro("VALOR INCORRETO!");
                continue;

            }
            finally{

                System.out.println();

            }

        }

        input.close();

    }

    // verificar se o valor do parametro existe na sequencia de fibonacci
    public static boolean verificadorFibonacci(int x){

        int[] n = new int[3];
        n[0] = 0;
        n[1] = 1;
        

        while(x >= n[2]){

            if((n[0] == x) || (n[1] == x) || (n[2] == x)) return true;

            n[2] = n[0] + n[1];

            n[0] = n[1];
            n[1] = n[2];

        }

        return false;

    }

    //Uma rotina que mostra a mensagem de erro do parametro no console
    public static void mensagemErro(String msg){
        System.out.println("------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------");
    }

}