<h1>Desafio Stone</h1>

<h2>Descrição</h2>
Projeto realizado como solução para o teste técnico do Programa de Formação em Elixir da Stone.

<h2>Pré-requisitos</h2>
Para executar o programa, é necessário utilizar o Java 8 ou superior. Utilize a IDE Java de sua preferência (recomendo o Eclipse).

<h2>O projeto</h2>
O programa recebe uma lista de compra de itens, calcula o valor total da compra e o divide por uma quantidade definida de pessoas (representadas por e-mails), respeitando sempre valores inteiros – ou seja, para uma compra no valor de 100 que será dividida entre três pessoas, duas pagarão 33 e uma 34.

<h2>Narrativa técnica</h2>
As classes “Item” e “Email” definem os atributos e métodos dos objetos trabalhados.
As classes “GeraListaItens” e “GeraListaEmails” constroem listas com valores aleatórios e tamanhos que podem ser aleatórios ou não (basta definir o parâmetro na execução do método).
A classe “Calcula” implementa o método que, ao receber as duas listas (de itens e e-mails), calcula o valor total da compra e o divide igualmente entre os e-mails, retornando um Map em que a chave é o e-mail e o valor correspondente ao preço a ser pago individualmente pela compra.
A classe “Desafio” é onde o programa é de fato executado. Nela instanciamos um List para cada lista a ser gerada (para tamanhos aleatórios de lista execute o método sem parâmetro; para definir um tamanho parta a lista, passe o valor desejado como parâmetro do respectivo método).

<h2>Rodando o Programa</h2>
<p>1.	Baixe o arquivo do programa para a sua máquina no diretório de sua preferência;</p>
<p>2.	Baixe em sua máquina a IDE Java de sua preferência (recomendo o Eclipse);</p>
<p>3.	Para o Eclipse:</p>

<p>3.1.	Abra o projeto em seu workspace, clicando em File --> Open Projects from File System...:</p>
![1](https://user-images.githubusercontent.com/62861521/105642325-e154b700-5e67-11eb-8f45-fb2320b4f175.png)

<p>3.2.	Escolha o diretório em que está o projeto clicando em Directory e depois Finish:</p>
 
<p>3.3.	Com o projeto aberto em seu workspace, acesse o arquivo “Desafio.java” em desafio-stone --> src --> desafio --> Desafio.java:</p>

<p>3.4.	Com o arquivo aberto, clique em Run (botão verde de “play” na barra superior):</p>

<p>3.5.	O resultado deve aparecer no console, mostrando uma lista de produtos com nome, preço unitário, quantidade e total por produto, o total da compra, o total de e-mails (pessoas) e quanto cada um deve pagar:</p>

<h2>Autoria</h2>
Breno Noccioli - desenvolvedor full stack.
