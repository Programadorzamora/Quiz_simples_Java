import java.util.Scanner;

public class Jogador {
    // essas variáveis armazenam os acertos e erros do jogador
    static int acertos;
    static int erros;
    // variáveis que armazenam nome e pontuação do objeto instanciado
    String nome;
    int pontuacao;

    static Scanner ler = new Scanner(System.in);
    static int opc;
    
    // metodo construtor
    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    // mostra a pontuação do jogador
    public void pontos() {
        System.out.println(pontuacao);
    }

    public void acertos_erros(){
        System.out.println("De " + (acertos+erros)+ " questoes respondidas voce acertou " + (acertos));
    }


    // vai chamar as funçõs do quiz selecionado
    public void matematica(){
        matematica1();
        matematica2();
        matematica3();
    }

    public void matematica1(){
        int x = 1;
        while(x==1){
        System.out.println("25 / 5 = ? \n1- 5\n2- 10\n3- 2\n4- 3");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("acertou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==1){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

    public void matematica2(){
        int x = 1;
        while(x==1){
            System.out.println("7 + 2 x 4 = ? \n1- 36\n2- 30\n3- 16\n4- 15");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("errou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("acertou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==4){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

    public void matematica3(){
        int x = 1;
        while(x==1){
            System.out.println("2 + 2 = ? \n1- 2\n2- 3\n3- 4\n4- 5");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("errou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("acertou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==3){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }



    public void geometria(){
        geometria1();
        geometria2();
        geometria3();
    }

    public void geometria1(){
        int x = 1;
        while(x==1){
            System.out.println("Qual e a área de um quadrado de 9x9?\n1- 90\n2- 81\n3- 100\n4- 50");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("errou");break;
                case 2:System.out.println("acertou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==2){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
                x = 1;
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

    public void geometria2(){
        int x = 1;
        while(x==1){
            System.out.println("Qual e o perimetro de um triangulo de 4x8x8 = ? \n1- 20\n2- 256\n3- 16\n4- 15");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("acertou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==1){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
                x = 1;
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

    public void geometria3(){
        int x = 1;
        while(x==1){
            System.out.println("Qual e a area de um retangulo 6x4 = ? \n1- 30\n2- 25\n3- 24\n4- 10");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("errou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("acertou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==3){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
                x = 1;
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }
    


    public void portugues(){
        portugues1();
        portugues2();
        portugues3();
    }

    public void portugues1(){
        int x = 1;
        while(x==1){
            System.out.println("Complete a seguinte frase: Eu _____ (estudar) portugues todos os dias. (presente)\n1- estudo\n2- estudar\n3- estudarei\n4- estudamos");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("acertou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==1){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
                x = 1;
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

    public void portugues2(){
        int x = 1;
        while(x==1){
            System.out.println("Ontem nos _____ (ir) ao cinema. (pretérito perfeito) \n1- partimos\n2- foram\n3- iremos\n4- fomos");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("errou");break;
                case 2:System.out.println("errou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("acertou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==4){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
                x = 1;
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

    public void portugues3(){
        int x = 1;
        while(x==1){
            System.out.println("Ela _____ (gostar) do chocolate. (preterito perfeito) \n1- gostar\n2- gostou\n3- gostava\n4- curtiu");
            opc = ler.nextInt();
            switch(opc){
                case 1:System.out.println("errou");break;
                case 2:System.out.println("acertou");break;
                case 3:System.out.println("errou");break;
                case 4:System.out.println("errou");break;
                default: System.out.println("opa, tente de novo");
            }
            if(opc==2){
                pontuacao += 10;
                acertos +=1;
                x = 0;
            } else if(opc < 1 || opc > 4){
                System.out.println("nenhuma das alternativas foi selecionada, tente novamente");
                x = 1;
            } else{
                erros += 1;
                x = 0;
            }
        }
        
    }

}
