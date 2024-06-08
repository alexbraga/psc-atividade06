<h1 align="center">
  Desenvolvimento de Sistema com Auxílio de IA Generativa
</h1>

<h3 align="center">
    Atividade Avaliativa 6 da disciplina de Programação de Soluções Computacionais
</h3>

<p align="center">
  <a href="https://github.com/alexbraga/psc-atividade06/commits/master"><img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/alexbraga/psc-atividade06"></a>
</p>

<h4 align="center">
	 Status: Em Andamento
</h4>

<p align="center">
 <a href="#sobre">Sobre</a> •
 <a href="#requisitos-do-programa">Requisitos do Programa</a> •
 <a href="#processo">Processo</a> •
 <a href="#características-técnicas">Características Técnicas</a> •
 <a href="#como-funciona">Como Funciona</a> •
 <a href="#unidade-curricular">Unidade Curricular</a> •
 <a href="#autor">Autor</a>
</p>

## Sobre

<p align="justify">A atividade consiste em criar um programa em C# ou Java com o auxílio de uma ou mais IAs generativas. O objetivo é reforçar os conceitos discutidos no curso e praticar suas habilidades de programação e uso de IA.</p>

---

## Requisitos do Programa

1. O programa deve ser um aplicativo de console em C# ou Java.
2. O programa deve receber as seguintes informações do trabalhador: nome, salário bruto, desconto do INSS, número de dependentes, valor total de descontos cabíveis para dedução de IRRF, CPF e CEP.
3. O programa deve calcular o imposto de renda retido na fonte e retornar o valor do salário líquido.
4. O CEP informado deve ser consultado e o programa deve retornar o endereço completo do trabalhador.
5. O CPF deve ser validado.
6. Esses dados devem ser armazenados em um arquivo de texto incremental, ou seja, o programa deve guardar todos os valores recebidos.
7. Se o trabalhador já existir, o programa deve sobrepor o que foi calculado anteriormente.

---

## Processo

1. **Discussão com a IA**: Primeiro, discuta com uma IA a melhor arquitetura e padrões de projeto para construir o programa.
2. **Identificação de dificuldades**: Identifique os pontos que você tem dificuldade e peça à IA para explicar como aplicar a linguagem e os padrões para resolver o problema que se encontra.
3. **Exercícios de prática**: Peça à IA exercícios sobre o tema que você tem dificuldade.
4. **Correção de código**: Peça à IA para corrigir a forma como você fez.
5. **Habilitação da IA na IDE**: Habilite uma IA Generativa na IDE (caso tenha acesso) e a instrua sobre a estrutura geral.
6. **Casos de teste**: Solicite à IA casos de teste para o seu programa.

---

## Características Técnicas

A presente aplicação implementa os seguintes padrões de projeto e arquitetura:

- MVC (Model-View-Controller)
- Singleton
- DAO (Data Access Object)
- Strategy
- Factory

---

## Como Funciona

1. <a href="#clonando-o-repositório">Clonando o repositório</a>
2. <a href="#executando-a-aplicação">Executando a aplicação</a>

#### Pré-requisitos

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:

- [Git](https://git-scm.com)
- [Java JDK 17](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)

Além disso, você talvez deseje utilizar uma IDE para trabalhar com o código, tal como o
[IntelliJ IDEA](https://www.jetbrains.com/idea/).

#### Clonando o repositório

Abra uma janela do terminal e execute o seguinte comando
```
git clone https://github.com/alexbraga/psc-atividade06.git
```

#### Executando a aplicação

Navegue até a raiz do projeto
```
cd psc-atividade06
```

Compile o código
```
mvn compile
```

Execute a aplicação
```
java -cp target/classes Main
```
- ATENÇÃO: para executar a aplicação no Windows use `java -cp target\classes Main`

- Alternativamente, abra `psc-atividade06` com sua IDE de preferência e execute `Main.java`

---

## Unidade Curricular

### Programação de Soluções Computacionais
  - #### Centro Universitário de Belo Horizonte (UniBH)

#### Professores
  - Alexandre "Montanha" de Oliveira
  - Flávio Henrique Batista de Souza

---

## Autor

<h4>Alexandre Braga</h4>

<div>
<a href="https://www.linkedin.com/in/alexgbraga/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-blue?style=for-the-badge&logo=Linkedin&logoColor=white" alt="LinkedIn"></a>&nbsp;
<a href="mailto:contato@alexbraga.com.br" target="_blank"><img src="https://img.shields.io/badge/-email-c14438?style=for-the-badge&logo=Gmail&logoColor=white" alt="E-Mail"></a>
</div>