import java.util.Scanner;

public class main{

    // aqui declaro scanner e variaveis que usarei nas funções
    static Scanner ler = new Scanner(System.in);
    static int opc;

    public static void main(String[] args) {

        // peço nome do usuario e jogo dentro de uma classe
        System.out.println("Ola, tudo bem, antes de responde o quiz deixa te fazer uma pergunta: Qual o seu nome?");
        String nome = ler.next();
        Jogador jogador = new Jogador(nome, 0);
        System.out.println("Ola " + nome + ", agora escolha uma entre as seguintes opcoes de quiz.");

        //aqui eu coloco o código em loop
        int x = 1;
        while(x==1){
            System.out.println("\n1- matematica basica\n2- geometria\n3- portugues\n4- pontuacao\n5- acertos\n6- sair\n");
            opc = ler.nextInt();
            switch (opc){
                //aqui eu faço o código passar pelas opções
                case 1: jogador.matematica(); break;
                case 2: jogador.geometria(); break;
                case 3: jogador.portugues(); break;
                case 4: jogador.pontos(); break;
                case 5: jogador.acertos_erros(); break;
                case 6: x = 0; break;
                default: System.out.println("opa, tente novamente\n");
            }
        
        }
         
    }


}
    
