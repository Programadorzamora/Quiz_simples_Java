Como acessar o arquivo:

Para fazer funcionar o código basta baixar no computador e verificar o caminho até chegar no arquivo main, com essa informação acesse o Prompt de Comando e use o comando .cd nome_do_diretório até chegar a pasta onde foi baixado o arquivo main.java, agora ainda no Prompt de Comando digite javac main.java para executar o código.



O funcionamento do código:

O primeiro código é uma classe principal que contém um loop que permite ao usuário selecionar uma das seis opções, todas elas sendo um método da classe “Jogador”, sendo três opções parte do quiz onde o usuário deve selecionar a resposta correta digitando o número correspondente. Se a resposta estiver correta, a pontuação do jogador é aumentada em 10 pontos e o número de acertos é incrementado em 1. Se a resposta estiver errada, apenas o número de erros é incrementado em 1.
1- jogador.matematica(): quando essa opção é selecionada ativa outros 3 métodos que ativa as perguntas relacionadas a matemática. 
2- jogador.geometria(): quando essa opção é selecionada ativa outros 3 métodos que ativa as perguntas relacionadas a geometria. 
3- jogador.portugues(): quando essa opção é selecionada ativa outros 3 métodos que ativa as perguntas relacionadas a português. 
4- jogador.pontos(): exibe a pontuação atual do jogador.
5- jogador.acertos_erros(): exibe a quantidade perguntas respondidas e quantas ele acertou.
6- sair: essa opção vai mudar o valor de x para 0, assim quebrando o loop que funcionava com a condição(x==1).
