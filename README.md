# <a href="https://imgbb.com/"><img src="https://i.ibb.co/51bfmLv/image-2024-07-01-T11-45-10-371-Z.png" alt="image-2024-07-01-T11-45-10-371-Z" border="0" width="300"></a> Java Spring Expert - Exercício: JUnit vanilla

#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)
## Formação Desenvolvedor Moderno Módulo: Back end
<b>Capítulo: Testes automatizados</b>

## Principais Tecnologias

- <img width="100px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" title = "Java" /> Java 21 : Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- <img width="100px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-plain-wordmark.svg" title = "JUnit 5.8.1" /> JUnit 5.8.1 : Usamos o Junit 5.8 para fazer os testes unitários
<br><br>

## Exercício: JUnit vanilla
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/DRM7kr3/image-2024-08-04-T19-41-00-630-Z.png" alt="image-2024-08-04-T19-41-00-630-Z" border="0"></a>
</p>
<br><br>

Um financiamento possui três dados:
-	<b>totalAmont:</b> valor total de dinheiro financiado
-	<b>income:</b> renda mensal do cliente que está financiando
-	<b>months:</b> número de meses do financiamento

E dois métodos:
-	<b>entry:</b> entrada do financiamento, igual a 20% do valor total
-	<b>quota:</b> prestação mensal do financiamento (sem juros)

Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:

<b>Exemplo 1:</b> { totalAmount: 100000, income: 2000, months: 20 }<br>
Este exemplo é INVÁLIDO porque com esses dados a entrada seria 20000 e a prestação seria 4000. <br>Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

<b>Exemplo 2:</b> { totalAmount: 100000, income: 2000, months: 80 }<br>
Já este exemplo é VÁLIDO porque a entrada seria 20000 e a prestação seria 1000. <br>Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.<br><br>

### Você deve implementar os seguintes testes para validar esta classe (total = 10 testes):

### Construtor
-	Deve criar o objeto com os dados corretos quando os dados forem válidos
-	Deve lançar IllegalArgumentException quando os dados não forem válidos

### setTotalAmount
-	Deve atualizar o valor quando os dados forem válidos
-	Deve lançar IllegalArgumentException quando os dados não forem válidos

### setIncome
-	Deve atualizar o valor quando os dados forem válidos
-	Deve lançar IllegalArgumentException quando os dados não forem válidos

### setMonths
-	Deve atualizar o valor quando os dados forem válidos
-	Deve lançar IllegalArgumentException quando os dados não forem válidos

### entry
-	Deve calcular corretamente o valor da entrada

### quota
-	Deve calcular corretamente o valor da prestação






