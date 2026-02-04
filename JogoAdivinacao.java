import java.util.Random;
import java.util.Scanner;

// ========================================
// JOGO DE ADIVINHAÇÃO EM JAVA
// ========================================
// Descrição: Jogo interativo onde o jogador tenta 
// adivinhar um número aleatório entre 1 e 100.
// O programa fornece dicas se o palpite está muito 
// alto ou muito baixo até o jogador acertar.


// Classe principal do jogo
public class JogoAdivinacao {


    //Cria o metodo de entrada
    public static void main(String[] args) {
        //Cria um metodo Scanner para ler o que o usuario digita
        Scanner Scanner = new Scanner(System.in);
        //Cria o meto Random para gerar os numeros do jogo
        Random random = new Random();
        //Variavel para determinar se o Jogador que jogar novamente
        String jogarNovamente = "s";

        //loop principal do jogo
        while (jogarNovamente.equals("s")) {
            

            //Exibe o titulo e o que o jogo ira fazer
            System.out.println("== ADIVINHE ==");
            System.out.println("Estou pensando em um numero entre 1 e 100...");


            //Gera o numero secreto entre 1 e 100
            int numeroSecreto = random.nextInt(100) + 1;
            //Armazena o numero de tentativas do usuario
            int tentativas = 0;
            //Armazena a quantidades de chutes do usuario
            //Começa em 0 por segurança
            int chute = 0;

            //Loop de tentativas
            while(chute != numeroSecreto) {
                //Solicita o palpite para o jogador
                System.out.println("Digite o seu palpite: ");
                //Le a resposta do usuario
                chute = Scanner.nextInt();
                //Armazena a tentativa e sempre adiciona + 1
                tentativas++;

                //Estrutura condicional para verificar o chute
                if (chute < numeroSecreto) {
                    //Se o chute for menor que o numero sorteado
                    System.out.println("Muito Abaixo!, Tente um numero maior.");
                } else if (chute > numeroSecreto) {
                    //Se o chute for menor que o numero sorteado
                    System.out.println("Muito Alto!, Tente um numero menor");
                } else {
                    //Se o chute for o numero exato que foi sorteado
                    System.out.println("PARABENS VOCÊ ACERTOU!!!");
                    //Calcula quantas tentativas ele usou e escreve
                    System.out.println("Você levou " + tentativas + " tentativas.");
                    System.out.println();

                    //Pergunta se o usuario deseja jogar novamente
                    System.out.println("Você quer jogar novamene? (s/n): ");
                    //Le a resposta digitada pelo usuario
                    jogarNovamente = Scanner.next();

                }

            } //Fim do Loop de tentativas


        } //Fim do Loop principal

        //Finaliza o Scanner
        Scanner.close();

        //Agradecimento para o usuario
        System.out.println("Obrigado por jogar!");

    } //Fim do metodo main
} //Fim da classe JogoAdivinhação

// ========================================
// TECNOLOGIAS UTILIZADAS:
// - Java SE
// - Random (java.util) - geração de números aleatórios
// - Scanner (java.util) - entrada de dados
// 
// CONCEITOS APLICADOS:
// - Estruturas condicionais (if/else)
// - Laços de repetição aninhados (while dentro de while)
// - Geração de números aleatórios
// - Entrada e saída de dados
// - Operadores de comparação
// - Incremento de variáveis (++)
// - Lógica de jogo com feedback ao usuário
// ========================================