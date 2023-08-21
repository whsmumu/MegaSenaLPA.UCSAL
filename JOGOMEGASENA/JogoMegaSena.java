package JOGOMEGASENA;

import java.util.Random;
import java.util.Scanner;
public class JogoMegaSena {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args){
        
        int numberUsuario[] = new int[6];
        int numberMega [][] = new int[6][10];
        int numberSorteio [] = new int [6];
    

        System.out.println("JOGO DA MEGA SENA \n-----------------------------------------");
        numberUsuario(numberUsuario); 
        numberMega(numberMega);
        numberSorteio(numberSorteio);
        verificarNumber(numberUsuario, numberSorteio);
    }
    public static int [] numberUsuario (int [] numberUsuario){ // metodo para receber os numeros digitados pelo usuario
        System.out.println("DIGITE OS SEUS 6 NUMEROS DA SORTE: DE 1 ATÉ 60 ");
        for (int i = 0; i < numberUsuario.length; i++) {
            numberUsuario[i] = scan.nextInt();
            if(numberUsuario[i]>60||numberUsuario[i]<=0){
                System.out.println("NUMERO DIGITADO É INVALIDO!");
                System.exit(0); // parar programa caso a condição seja feita
            }
        }
        return numberUsuario;
    }
    public static void numberMega(int [][] numberMega){ // metodo para gerar a tabela da mega sena com numeros aleatorios de 0 a 99
        System.out.println("-----TABELA DA MEGA SENA-----");
        int contador = 0;
        for (int linha = 0; linha < numberMega.length; linha++) {
            for (int coluna = 0; coluna < numberMega[linha].length; coluna++) {
                numberMega[linha][coluna] = contador+=1;

                    System.out.print(numberMega[linha][coluna] + " ");

            }
            System.out.println(" "); // para ficar bonitinho as colunas
        }
        System.out.println("-----------------------------------------");
    }
    public static int [] numberSorteio(int [] numberSorteio){
        Random random = new Random();
        for (int i = 0; i < numberSorteio.length; i++) {
            numberSorteio[i] = random.nextInt(61);
            System.out.println("Numeros sortidos foi: "+numberSorteio[i]);
        }
        return numberSorteio;
    }
    public static void verificarNumber(int [] numberUsuario, int [] numberS){
        int contadorDeGanhos = 0;
        System.out.print("Numeros do usuario foi: ");
        for (int i = 0; i < numberS.length; i++) {
            System.out.print(numberUsuario[i]+ " ");
        }
        
        for (int numberU = 0; numberU < numberUsuario.length; numberU++) {
            for (int numberC = 0; numberC < numberS.length; numberC++) 
                    if(numberUsuario[numberU] == numberS[numberC]){
                    contadorDeGanhos++;
                    System.out.print("\nVocê acertou o numero: "+numberUsuario[numberU]);
                }
            
        }
                System.out.println("\n-----------------------------------------");
                if (contadorDeGanhos==0) {
                    System.out.println("Que triste a vida em amigão, a sorte não esta com você, zero numeros ");
                } else if(contadorDeGanhos==1){
                    System.out.println("So acertou um unico numero, você nao ganhou nada");
                    
                }else if(contadorDeGanhos==2){
                    System.out.println("Quase ganhou algo em, 2 acertos ate que foi muito");

                }else if(contadorDeGanhos==3){
                    System.out.println("Você acertou 3 numeros, ganhou um PARABENS!");

                }else if(contadorDeGanhos==4){
                    System.out.println("Uau, você acertou 4 numeros, tome 2 reais");

                }else if(contadorDeGanhos==5){
                    System.out.println("Nossa vocè acertou 5 numeros, quase conseguiu o premio final, tome ai 5 reais e seja feliz");

                }else if(contadorDeGanhos==6){
                    System.out.println("Congratulations Senhor(a), você acaba de ser o mais novo milionario!");

                }
    }
}