import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) Primeira questão

        int indice = 13,soma = 0, k = 0;

        while (k<indice){
            k += 1;
            soma += k;
        }
        System.out.println("Resultado da primeira questão é: " + soma);

        //-------------- Fim da primeira questão ------------------- //



        // 2) Segunda Questão


        Scanner input = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        System.out.println("Segunda Questão");
        System.out.println("Digite um número:");
        int limit = input.nextInt();

        while (f2 < limit ){
            int fn = f1 + f2;
            if(fn > limit){
                System.out.println(limit +" não pertence a sequencia");
                break;
            } else if (fn == limit) {
                System.out.println(limit + " pertence a sequencia");
                break;
            }
            f1 = f2;
            f2 = fn;
        }

        //-------------- Fim da Segunda questão ------------------- //


        // 3) Terceira questão

        //  a)  1,3,5,7,9
        //  b)  2,4,8,16,32,64,128
        //  c)  0,1,4,9,16,25,36,49
        //  d)  4,16,36,64,100
        //  e)  1,1,2,3,5,8,13
        //  f)  2,10,12,16,17,18,19,200


        //-------------- Fim da terceira questão ------------------- //


        // 4) Quarta questão

        // Resposta : Os dois estarão na mesma distancia de Ribeirão Preto, pois ao se cruzarem
        // independente da velocidade, a distancia para ribeirão vai ser a mesma, no exato momento
        // que se cruzarem.


        //-------------- Fim da quarta questão ------------------- //

        // 5) Quinta Questão
        System.out.println("Quinta Questão : ");
        String palavra = "inverso";
        char[] dst = new char[palavra.length()];

        for (int i = 0; i < palavra.length() ; i++) {
            dst[palavra.length() - i - 1 ] = palavra.charAt(i);

        }
        String novaPalavra = String.copyValueOf(dst);
        System.out.println("O inverso da palavra: " + palavra + " é: " + novaPalavra);


        //-------------- Fim da quarta questão ------------------- //
        


    }
}