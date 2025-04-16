## PACOTES

Devo salientar que a IDE que utilizo é o Intellij IDEA, então tudo o que será apresentado de agora em diante será se acordo com as configurações bases dele. Obrigado, espero que gostem do estudo/revisão;.

-------------------------------------------------------------------------
A pasta <ins>idea</ins> é do intellij;

A pasta out é criada assim que executamos o **projeto**; Criando-se bytecodes

 > O JAVA É BASTANTE ORIENTADO A PACOTES
- Ele foi criado com o intuito de organizar e agrupar as classes que têm coisas em comum
- As classes nada mais é do que uma estrutura de diretórios
- O nome do pacote é a URL do seu site invertida (Exemplo: exemplo.com.br. Invertido ficaria: br.com.exemplo), e logo em seguida colocamos o nome do projeto (br.com.exemplo.crm), e logo em seguida colocamos as suas divisões (br.com.exemolo.crm.introducao). Os pacotes criados por vc devem ser criadas dentro de src (source)
- A partir desse momento todas as classes que forem criadas serão dentro do pacote
- Todas as classes dentro de pacotes devem ter um package, e obrigatoriamente a primeira linha de codigo precisa de um package para referenciar a em qual pacote você esta trabalhando.


> PORQUE PRECISAMOS DO NOME DO PACOTE?

Os pacotes ou packages em Java são fundamentais para a organização e estruturação de projetos de software. Eles permitem agrupar classes e interfaces relacionadas, facilitando a manutenção e a compreensão do código.

1. Melhor **organização** do código

2. Evita**conflito de nomes**  das classes

3. Garante **segurança** e controle de acesso

4. Permite **reutilização** do código

5. Facilita e **manutenção** e evolução do projeto

> O QUE SÃO BYTECODES EM JAVA?

O bytecode em Java é um conjunto de instruções intermediárias geradas pelo compilador (javac) a partir do código-fonte Java. Esse bytecode não é executado diretamente pelo sistema operacional, mas sim pela Java Virtual Machine (JVM).

O bytecode é independente da plataforma, o que significa que pode ser executado em qualquer sistema operacional que tenha uma JVM compatível. Isso torna o Java uma linguagem altamente portável, pois o mesmo código-fonte Java pode ser executado em diferentes plataformas sem a necessidade de recompilação.

<span style="color:green">BENEFÍCIOS</span>

1. **Portabilidade:**
O bytecode Java é independente da plataforma, o que significa que pode ser executado em qualquer sistema operacional que tenha uma JVM compatível. Isso permite que os desenvolvedores escrevam um único código-fonte Java que pode ser executado em diferentes plataformas sem a necessidade de recompilação.

2. **Segurança:**
O bytecode Java é executado dentro de uma sandbox controlada pela JVM. Isso significa que o código Java não tem acesso direto ao sistema operacional subjacente, o que torna a execução de código Java mais segura. A JVM também possui recursos de verificação de segurança embutidos para garantir que o bytecode seja seguro e não represente uma ameaça para o sistema.

3. **Desempenho:**
O bytecode Java é projetado para ser executado de forma eficiente pela JVM. A JVM possui um mecanismo de otimização que pode melhorar o desempenho do bytecode durante a execução. Além disso, a JVM pode compilar o bytecode em código nativo para obter um desempenho ainda melhor.

4. **Flexibilidade:**
O bytecode Java é uma forma intermediária de código que pode ser facilmente transformada em outras formas de código. Isso permite que os desenvolvedores usem ferramentas de análise estática ou de transformação de código para otimizar ou modificar o bytecode Java antes de ser executado pela JVM.

LIMITAÇÕES

1. **Desempenho inicial:**
Como o bytecode Java precisa ser interpretado e executado pela JVM, pode haver um tempo de inicialização mais longo em comparação com a execução direta de código nativo. No entanto, uma vez que o bytecode é interpretado e compilado pela JVM, o desempenho pode ser comparável ao código nativo.

2. **Dependência da JVM:**
Para executar o bytecode Java, é necessário ter uma JVM instalada no sistema. Isso pode ser uma limitação em alguns dispositivos ou sistemas operacionais que não possuem uma JVM disponível. No entanto, a JVM está amplamente disponível e é suportada em muitas plataformas.

----------------------------------------------------------------------------

## COMENTÁRIO

- Se colocarmos um comentário ele não é adicionado ao bytecode; 

- Não devemos escrever algo “bobo” nos comentários (Exemplo: //Imprime linha), para estudos está tudo bem essa prática, mas para trabalho devemos evitar ao máximo. Existem casos que são exceções.

1. Tudo que estiver após // na mesma linha será ignorado pelo compilador. (Comentário de linha única)

2. /* */ Usado para comentários longos ou desativar partes do código temporariamente. (Comentários de múltiplas linhas)

3. /** javadoc: comentário para documentos, incluir tags especiais como @author, @param, @return, etc. (Ctrl + alt + Q forma renderizada)

----------------------------------------------------------------------------

## CONVENÇÕES DE VARIÁVEIS

Existem 8 tipos primitivos no Java: São tipos que irão guardar em memória; são palavras reservadas e todos escritos em letras minúsculas

Tipos Númericos Inteiros (Tipos Integrais): São usados para armazenar números inteiros, sem casas decimais.

| Tipo  | Tamanho  | Faixa de Valores                          | Exemplo            |
|-------|---------|-----------------------------------------|--------------------|
| byte  | 8 bits  | -128 a 127                             | `byte b = 100;`   |
| short | 16 bits | -32.768 a 32.767                      | `short s = 30000;` |
| int   | 32 bits | -2.147.483.648 a 2.147.483.647        | `int i = 100000;`  |
| long  | 64 bits | -9 quintilhões a 9 quintilhões        | `long l = 1000000L;` |

- **byte** e **short** são raramente usados; normalmente usamos int para números inteiros.

- **long** deve ser usado para números muito grandes e precisa de um L no final do valor.
---
Tipos Numéricos de Ponto Flutuante: São usados para armazenar números com casas decimais.

| Tipo   | Tamanho  | Precisão                              | Exemplo                  |
|--------|---------|-------------------------------------|--------------------------|
| float  | 32 bits | Aproximadamente 6-7 dígitos decimais  | `float f = 3.14f;`       |
| double | 64 bits | Aproximadamente 15-16 dígitos decimais | `double d = 3.1415926535;` |

- **double** é mais preciso e mais usado que **float.**

---
Tipo Caractere: Armazena um único caractere. (Usa-se a tradução de acordo com a tabela ASCII ou usa a tabela Unicode; char caractere = ‘\u0041’; char caractere = 64);

```java
public class Exemplo {
    public static void main(String[] args) {
        char variavelChar = 'A';
        char character = 65;

        System.out.println('\u0041');
        System.out.println(variavelChar);
        System.out.println(character);
    }
}
```
---
Tipo Booleano: Usado para armazenar valores verdadeiro ou falso

| Tipo   | Tamanho | Valores         | Exemplo               |
|--------|---------|----------------|-----------------------|
| boolean | 1 bit  | `true` ou `false` | `boolean ativo = true;` |

- O boolean só pode ter true ou false, sem valores numéricos. Usado para valores lógicos

---
Para criarmos uma variável primeiramente devemos colocar o tipo dela e em seguida devemos colocar o nome (int idade); (int idadeDoPaiNaHoraDoCadastro).

Para iniciarmos uma variável (int idade = 10); Nós temos um espaço em memória que é uma referência, que nesse caso é idade contendo o valor 10 guardado em memória.

Exemplo de código:

```java
public class teste {
	int idade = 10;
	System.out.println(idade)  // O que será impresso será o valor armazenado em memória que nesse caso é 10
}
```
Outra forma de escrita querendo colocar algum texto dentro do println usando a concatenação:
```java
System out.println( “A idade é: ”+ idade) // Concatenação
```
---

## CASTING

Casting é o processo de converter um tipo de dado em outro em Java. Isso pode ser necessário quando queremos trabalhar com tipos de dados diferentes em uma operação.
Existem dois tipos de casting em Java:

1. Casting Implícito (Widening Casting)

Também chamado de conversão automática, ocorre quando um tipo menor é convertido para um tipo maior sem perda de dados.

**Não ocorre perda de dados**

**byte → short → int → long → float → double**

```java
public class ExemploCasting {
    public static void main(String[] args) {
        int numero = 100;
        double valor = numero;

        System.out.println(valor);
    }
}
```



2. Casting Explícito (Narrowing Casting)
Quando queremos converter um tipo maior para um tipo menor, precisamos forçar a conversão usando parênteses.

**Possivel perda de dados**
**double → float → long → int → short → byte**
```java
public class ExemploCasting {
    public static void main(String[] args) {
        double valor = 9.78;
        int numero = (int) valor;

        System.out.println(numero); 
    }
}
```
O casting de objetos em Java é uma maneira de transformar uma variável de um tipo para outro. No contexto da orientação a objetos, especialmente quando lidamos com herança e polimorfismo, o casting é frequentemente usado para especificar ou alterar o tipo de uma referência a um objeto, permitindo que os programadores acessem métodos específicos da classe ou ajustem o comportamento do programa com base no tipo do objeto.

O casting permite que um objeto seja tratado como um tipo diferente de sua declaração original, desde que haja uma relação de herança entre eles.

Há dois tipos de casting de objetos:

- Casting implícito ou upcasting;

- Casting explícito ou downcasting.

Casting implícito ou upcasting é a conversão de uma referência de uma subclasse para uma superclasse. Isso é feito automaticamente pelo Java, pois o objeto da subclasse é sempre uma instância de sua superclasse. O upcasting é seguro e não requer uma sintaxe especial para ser realizado.

Resumindo, o upcasting acontece quando uma variável-objeto de uma classe ancestral referencia um objeto instância de uma das classes descendentes da hierarquia:

Uma classe descendente **É** uma classe ancestral;
Cachorro **É** um Animal.

Se temos uma classe Animal e uma classe Cachorro que herda de Animal, podemos fazer upcasting de Cachorro para Animal automaticamente, como mostrado a seguir:
```java
Animal rex = new Cachorro(); // Upcasting (casting implícito)
```

No exemplo acima, o objeto Cachorro é referenciado como Animal, o que é permitido pois Cachorro é uma subclasse de Animal.

O **upcasting** permite o uso de polimorfismo, onde uma referência de superclasse pode apontar para objetos de qualquer uma de suas subclasses, permitindo chamar os métodos que são sobrescritos nas subclasses através da referência da superclasse.

**Casting explícito ou downcasting** é a conversão de uma referência de uma superclasse para uma subclasse. O downcasting precisa ser feito explicitamente pelo programador, pois pode levar a uma ClassCastException em tempo de execução se o objeto não for uma instância da classe para a qual está sendo convertido.

Se tivermos uma referência de Animal que **sabemos ser** um Cachorro, podemos fazer downcasting para acessar métodos específicos de Cachorro:
```java
Cachorro dog = (Cachorro) rex; // Downcasting (casting explícito)
```

Para fazer downcasting de forma segura, geralmente verifica-se primeiro o tipo do objeto com o operador instanceof:
```java
if (animal instanceof Cachorro) {
     Cachorro rex = (Cachorro) animal;
     // Agora é seguro chamar métodos específicos de Cachorro
}

```
Resumindo, o upcasting ocorre automaticamente e é seguro, enquanto o downcasting precisa ser realizado com cuidado para evitar exceções. O uso do operador instanceof ajuda a garantir que a conversão seja feita com segurança.

O casting de objetos em Java permite aos programadores manipularem referências de objetos e acessar métodos específicos, mas deve ser usado com cautela para evitar exceções em tempo de execução.

## STRING

Em Java, String é uma sequência de caracteres utilizada para representação e manipulação de texto. Quando é necessário representar informações textuais em uma aplicação, seja ela para Desktop ou Web, instâncias da classe String serão criadas invariavelmente. Isto é, sempre que precisarmos mostrar alguma informação em um sistema, dificilmente vamos conseguir isso sem o auxílio de Strings.

### Como utilizar Strings em Java

A classe String permite a criação de suas instâncias de diversas maneiras. Ela possui vários construtores que recebem diversos tipos de parâmetros. Pelo fato de ser uma classe amplamente utilizada, ela também fornece um “atalho” para a criação de forma mais rápida de seus objetos

```java
1 package principal;
2
3 public class ClassePrincipal {
4
5   public static void main(String[] args) {
6     String minhaString1 = new String();
7     minhaString1 = "Java";
8     String minhaString2 = "Java";
9     String minhaString3 = new String("Java");
10    String minhaString4 = "";
11
12    char[] meusChars = new char[] {'J','a','v','a'};
13    String minhaString5 = new String(meusChars);
14  }
15 }
```

**Linha 6:** A classe String, assim como qualquer classe em Java, pode ser instanciada com a utilização da palavra chave new. Neste caso, está sendo criado um objeto String vazio que é atribuído à variável de referência minhaString1;

**Linha 7:** A variável minhaString1 recebe o valor “Java”. Como a variável já foi declarada na linha anterior, neste momento acontece apenas a atribuição do conteúdo à variável;

**Linha 8:** Representa a maneira mais rápida e fácil de criar um novo objeto desta classe e atribuí-lo a uma variável (no caso, minhaString2);

**Linha 9:** Há diversos construtores na classe String. Esta linha demonstra a utilização de um deles: passar um objeto String no construtor de modo a criar um novo objeto String. Com relação à criação de objetos na memória, há uma diferença considerável no modo como as linhas 8 e 9 o fazem.

**Linha 10:** Aqui uma String vazia é criada utilizando-se o mesmo mecanismo de “atalho” que foi demonstrado na linha 8, só que o conteúdo para o qual aponta a variável minhaString4 é uma String vazia. Pode-se dizer que, com relação ao conteúdo, as linhas 6 e 10 fazem a mesma coisa: criam uma String vazia;

**Linhas 12 e 13:** Como já foi comentado neste artigo, a classe String possui diversos construtores. Não cabe aqui tentarmos demonstrar a utilização de cada um deles. Estas duas linhas demonstram mais um exemplo de como podemos criar objetos String a partir de outros objetos passados como parâmetro no construtor. A variável minhaString5 tem o mesmo conteúdo das variáveis minhaString1, minhaString2 e minhaString3, porém foi inicializada de uma maneira diferente das demais, recebendo um array de char.

No Java, String é uma classe usada para representar sequências de caracteres.

Ela faz parte do pacote java.lang, o que significa que pode ser usada sem precisar de importação;  String é chamada de tipo de referencia  (refences type);7

<ins>Características principais da String:</ins>

1. Imutável – Uma vez criada, uma String não pode ser alterada.

2. Armazenada no String Pool – Para otimizar o uso de memória.

3. Fornece vários métodos para manipulação de texto (como length(), substring(), replace(), etc.).



## OPERADORES ARITMÉTICOS

Os operadores aritméticos em Java são usados para realizar cálculos matemáticos, como adição, subtração, multiplicação e divisão. Eles operam sobre valores numéricos e retornam um resultado numérico. O operador + é sobrecarregado; 

O resultado de operações entre valores inteiros sempre resultará um valor inteiro;

Exemplo de código:
```java
int numero01 = 10
	int numero02 =  20
	System.out.println(“Valor” + numero01+numero02);
	// Nesse caso o sinal +, será de concatenação e não mais de adição

```

Outros exemplos:
```java
int numero01 = 10
	int numero02 =  20
	System.out.println(numero01+numero02);
	//Nesse caso o sinal +, vai ser de soma, ou seja, usado para uma operação aritmética

int numero01 = 10
	int numero02 =  20
	System.out.println(numero01+numero02+”Valor”);
	//Nesse caso o sinal +, será se soma, porque as variaveis estão sendo as primeiras a serem chamadas

int numero01 = 10
	int numero02 =  20
	double resultado = numero01 / numero02
	System.out.println(resultado);
	//Caso você execute, irar ver que o resultado entre essa operação é 0.0, pois está dividindo dois números inteiros. Se quisermos ver o resultado 0.5 na tela, basta trocar a variavel int numero02 para double. Vejamos abaixo:

int numero01 = 10
	double numero02 =  20
	double resultado = numero01 / numero02
	System.out.println(resultado);
```

## OPERADORES RELACIONAIS: 
- Os operadores relacionais comparam dois operandos e determinam a validade de um relacionamento. A tabela a seguir descreve os quatro operadores relacionais:

- São utilizados principalmente na etapa de processamento - para a construção da lógica - possibilitando realizar ações específicas sobre os dados. Adição, subtração, multiplicação, comparação são apenas alguns exemplos.
  
- Além do operador básico, Java oferece operadores de atribuição composta que combinam operações aritméticas ou bit a bit com a atribuição.

| Operador | Uso |
|----------|-------------------------------------------------------------|
| `<`      | Indica se o valor do operando esquerdo é menor do que o valor do operando direito. |
| `>`      | Indica se o valor do operando esquerdo é maior do que o valor do operando direito. |
| `<=`     | Indica se o valor do operando esquerdo é menor ou igual ao valor do operando direito. |
| `>=`     | Indica se o valor do operando esquerdo é maior ou igual ao valor do operando direito. |

Quando trabalhamos com tipos boolean, utilizamos “is”. Exemplo:
```java
boolean isDezMaiorQueVinte = 10 > 20;
boolean isDezMenorQueVinte = 10 < 20;
boolean isDezIgualVinte = 10 == 20;
boolean isDezIgualDez = 10 == 10.0;
boolean isDezDiferenteDez = 10 != 10;

System.out.println(“Maior que vinte?” + isDezMaiorQueVinte);
System.out.println(“Menor Que vinte?” + isDezMenorQueVinte);
System.out.println(“Dez igual a vinte?” + isDezIgualVinte);
System.out.println(“Dez diferente de Dez?” + isDezDiferenteDez);
System.out.println(“Dez igual a Dez?” + isDezIgualDez); // Nesse exemplo o resultado sera verdadeiro, pois eles são valores comparáveis

```

## OPERADORES LÓGICOS:

- Precisam trabalhar em conjunto com as estruturas condicionais para fazer mais sentido. **Operadores lógicos retornam boolean:**

| Operador | Nome       | Descrição                                       | Tipo   |
|----------|-----------|-------------------------------------------------|--------|
| `and`    | Conjunção  | Retorna `True` se ambos os operandos forem `True`  | Binário |
| `or`     | Disjunção  | Retorna `True` se pelo menos um dos operandos for `True` | Binário |
| `not`    | Negação    | Inverte o resultado lógico                     | Unário  |

O tipo do resultado com esses operadores é bool (True ou False)

| Operando 1 | Operando 2 | and  | not(and) |
|------------|------------|------|---------|
| True       | True       | True | False   |
| True       | False      | False | True    |
| False      | True       | False | True    |
| False      | False      | False | True    |

Ao usar o operador and (conjunção), quando apenas os dois operandos tiverem o valor True, o resultado da operação será True
---
Ao utilizar o operador or (disjunção), quando pelo menos um dos operandos tiver valor True, o resultado da operação será True.

| Operando 1 | Operando 2 | or   | not(or) |
|------------|------------|------|---------|
| True       | True       | True | False   |
| True       | False      | True | False   |
| False      | True       | True | False   |
| False      | False      | False | True    |

O operador not (negação) é um operador unário, pois é aplicado em apenas um operando, invertendo o seu valor lógico.

Ex.: AND

```java
int idade = 35;
float salario = 3500F;
boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; //Para ser verdadeiro ambas as condições sejam verdade
boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
System.out.println(“isDentroDaLeiMaiorQueTrinta: ” +  isDentroDaLeiMaiorQueTrinta);
Sysmte.out.println(“isDentroDaLeiMaiorQueTrinta: ” +  isDentroDaLeiMaiorQueTrinta);

```

Ex.: OR

```java
double valorTotalContaCorrente = 200;
double valorTotalContaPoupanca = 10000;
float valorPlaystation = 5000F;

boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
System.out.println(“isPlaystationCincoCompravel” + isPlaystationCincoCompravel);

```

## ESTRUTURAS DE REPETIÇÃO

1. For: Ideal para quando sabemos exatamente quantas vezes queremos repetir um bloco de código. Ele utiliza uma variável contadora que é inicializada, testada e atualizada a cada iteração; O laço for é ideal para situações em que o número de iterações é conhecido

2. While: Executa um bloco de código enquanto uma condição específica for verdadeira. A condição é testada antes de cada iteração, o que significa que o bloco de código pode não ser executado nenhuma vez se a condição inicial for falsa;  o while é usado quando a condição deve ser avaliada antes da execução do bloco de código

3. Do-while: Similar ao while, mas com uma diferença crucial: o bloco de código é executado pelo menos uma vez, pois a condição é testada após a execução do bloco; e o do-while garante que o bloco seja executado pelo menos uma vez, mesmo que a condição seja falsa.

### For

O laço for é utilizado quando sabemos de antemão quantas vezes queremos executar um bloco de código. A estrutura do for inclui uma inicialização, uma condição e uma atualização. Vamos ver um exemplo prático:

Quando utilizamos o for, precisamos de uma variável para auxiliar a controlar a quantidade de repetições a serem executadas. Essa variável é chamada de variável de controle e é declarada no primeiro argumento do for.

O segundo argumento do for é utilizado para definir até quando o for será executado. Geralmente, trata-se de uma condição booleana em cima da variável de controle.

O terceiro argumento indica o quanto a variável de controle será modificada no final de cada execução dentro do for.

```java
for (<variável de controle>, <análise da variável de controle>, <incremento da variável de controle>) {
    // Código a ser executado
}

```

```java
public class Exemplo{
	public static void main(String[] args){
		for(int i = 1; i <= 20; i++){
		System.out.println(i + “- Carneiros”);
		}
	}
}

```

Isso acontece porque:

- A variável de controle, que chamamos de “i”, tem seu valor inicial como 0;

- No segundo bloco, onde escrevemos “i <= 10”, estamos dizendo que o conteúdo do for será executado enquanto o valor de i for menor ou igual a 10;

- Com o terceiro bloco definido como “i++”, estamos dizendo que, no fim de cada execução do for, o conteúdo de “i” será incrementado em 1 unidade. Isso quer dizer que, no fim da primeira execução, i irá de 0 para 1; na segunda execução, irá de 1 para 2, e assim por diante;

- Com isso, o conteúdo do for será executado por 11 vezes, já que o i é iniciado em 0. A saída do código acima mostra que a mensagem foi escrita por 11 vezes, onde o “i” variou de 0 até 10.

- Neste exemplo, o programa imprime números de 1 a 20. A variável i é inicializada com 1, a condição verifica se i é menor ou igual a 20, e a atualização incrementa i em 1 a cada iteração.

- Um ponto importante sobre o for é que, por causa da utilização da variável de controle, geralmente ele é utilizado quando sabemos exatamente quantas vezes queremos repetir a execução do trecho de código.

While

O laço while é mais adequado quando não sabemos quantas vezes o bloco de código precisará ser executado. A condição é testada antes de cada iteração.

O while também é uma estrutura de repetição, assim como o for. A diferença entre ambas é que, enquanto usamos o for quando geralmente conhecemos a quantidade de vezes que o trecho de código deverá ser repetido, nós utilizamos o while quando não sabemos exatamente quantas vezes o código será repetido.

```java
while (<condição>) {
    // Trecho de código a ser repetido
}

```

Perceba que a condição para interrupção da repetição do trecho dentro do while se dá através de uma condição booleana.

```java
public class Exemplo{
public static void main(String[] args){
	int i = 0
		while(i < 10){
		System.out.println(testes + i);
		i++
		}
	}
}
```

Neste exemplo, o laço imprime números de 0 a 9. A variável i é incrementada em 1 a cada iteração, e a condição i < 10 é testada antes de cada execução do bloco.

Do-while
O laço do-while garante que o bloco de código será executado pelo menos uma vez, independentemente da condição inicial.

```java
public class Main{
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.println(i + “Celulares”);
            i++;
        }while(i < 10);
    }
```
	
Neste exemplo, o bloco de código dentro do do é executado primeiro e, em seguida, a condição i < 10 é testada. Se for verdadeira, o bloco é executado novamente.

## Laço for-each em Java

O for-each é uma estrutura de repetição em Java projetada para iterar sobre elementos de arrays e coleções de forma simplificada. Ele é ideal quando precisamos percorrer todos os elementos de uma lista sem a necessidade de um índice de controle.

A principal vantagem do for-each é sua **sintaxe enxuta e legibilidade**, reduzindo a possibilidade de erros ao acessar elementos diretamente. No entanto, ele não permite **modificar a estrutura da coleção** enquanto está sendo percorrida.

### Como usar laços de repetição em Java
Os laços de repetição são usados em diversas situações na programação. Aqui estão algumas dicas sobre como os utilizar efetivamente:

**Escolha o laço certo:** Use for quando souber exatamente quantas vezes o bloco de código deve ser executado. Use while ou do-while quando a quantidade de repetições depender de uma condição dinâmica.

**Evite loops infinitos:** Certifique-se de que a condição de término será eventualmente atendida. Um loop infinito pode travar o programa.

**tilize break e continue quando necessário:** O comando break pode ser usado para sair de um loop antecipadamente, enquanto continue pode ser usado para pular a iteração atual e continuar com a próxima.

<ins>Boas práticas ao utilizar laços de repetição</ins>
Os laços de repetição são fundamentais para a programação, mas seu uso inadequado pode levar a desempenho ineficiente, loops infinitos e código difícil de entender. Aqui estão algumas boas práticas para garantir que seus loops sejam eficientes e bem estruturados.

**1. Evite loops infinitos:**
Loops infinitos podem travar a aplicação e consumir recursos desnecessários. Certifique-se de que há uma condição de parada clara.

**2. Escolha o laço correto para cada situação:**
Cada laço tem um propósito específico. Escolha o mais adequado para o problema que está resolvendo.

**Use for quando souber o número exato de iterações.
Use while quando a condição de repetição for baseada em um evento externo.
Use do-while quando precisar garantir que o bloco de código execute pelo menos uma vez.
Use for-each para percorrer listas de forma simples.**

## Como usar laços de repetição em Java?

- Os laços de repetição são usados em diversas situações na programação. Aqui estão algumas dicas sobre como os utilizar efetivamente:

- **Escolha o laço certo:** Use for quando souber exatamente quantas vezes o bloco de código deve ser executado. Use while ou do-while quando a quantidade de repetições depender de uma condição dinâmica.

- **Evite loops infinitos:** Certifique-se de que a condição de término será eventualmente atendida. Um loop infinito pode travar o programa.

- **Utilize break e continue quando necessário:** O comando break pode ser usado para sair de um loop antecipadamente, enquanto continue pode ser usado para pular a iteração atual e continuar com a próxima.

## Boas práticas ao utilizar laços de repetição

Os laços de repetição são fundamentais para a programação, mas seu uso inadequado pode levar a **desempenho ineficiente, loops infinitos e código difícil de entender.** Aqui estão algumas boas práticas para garantir que seus loops sejam eficientes e bem estruturados.

### 1. Evite loops infinitos:

Loops infinitos podem travar a aplicação e consumir recursos desnecessários. Certifique-se de que há uma condição de parada clara.

### 2. Escolha o laço correto para cada situação:

Cada laço tem um propósito específico. Escolha o mais adequado para o problema que está resolvendo.

**- Use for quando souber o número exato de iterações.**

**- Use while quando a condição de repetição for baseada em um evento externo.**

**- Use do-while quando precisar garantir que o bloco de código execute pelo menos uma vez.**

**- Use for-each para percorrer listas de forma simples.**

**3. Evite modificações diretas em coleções dentro de loops**

Se precisar remover itens de uma lista dentro de um loop, use um iterador para evitar ConcurrentModificationException.

<ins>Correção usando um iterador:</ins>

```java
Iterator<String> iterator = nomes.iterador();
while (iterator.hasNext()){
    if(iterator.next().equals("Carlos")){
            iterator.remove();    
        }
}
```

**4. Sempre inicialize variáveis corretamente:**
   
Variáveis de controle mal inicializadas podem gerar comportamentos inesperados nos loops.

**5. Prefira loops otimizados para grandes volumes de dados:**

Se estiver lidando com grandes quantidades de dados, utilize streams e paralelismo para otimizar o processamento.

**Exemplo usando Stream API:**

```java
List<Integer> numeros = Array.asList(1,2,3,4,5);
numeros.stream().forEach(System.out::println);
```

Seguindo essas boas práticas, você garante que seus laços de repetição **sejam eficientes, seguros e fáceis de manter**. Ao aplicar esses conceitos no seu código, você evita **erros comuns** e **melhora a performance das suas aplicações Java.**

Em conclusão, os laços de repetição em Java permitem a execução repetida de um bloco de código. Compreender como e quando usar for, while e do-while pode tornar seu código mais eficiente e claro. 

Portanto, é importante lembrar sempre de escolher o laço adequado para a sua necessidade e evitar loops infinitos. Com prática, você será capaz de utilizar esses conceitos de maneira eficaz em seus projetos de programação.

## Java - Break e Continue

É possível interromper a execução de uma estrutura de repetição a força, ignorando completamente qualquer código remanescente ou mesmo a condição que controla quando o loop termina, usando o comando break. Sempre que o comando break é encontrado, o loop é finalizado e a execução do programa continua da próxima linha após a estrutura de repetição em questão.

O programa abaixo deveria exibir todos os números entre 0 e 100 pulando de 2 em 2. Contudo, assim que a variável cont chegar a 20 nós usamos o comando break para parar a execução daquele loop imediatamente.

```java
for (int cont = 0; cont <= 100; cont += 2){
  System.out.print(cont + " ");
  
  // Para o loop quando cont = 20
  if (cont == 20) break;
}

System.out.println("- Estamos fora do loop!");
```
RESULTADO:

```
0 2 4 6 8 10 12 14 16 18 20 - Estamos fora do loop
```

Perceba que assim que cont passa a armazenar o valor 20 o teste da estrutura de decisão if da verdadeiro e então o comando break é lido. O loop para, e o comando System.out.println, que está logo após o loop, é executado.

É importante notar que, em caso de loops aninhados apenas o mais interno é finalizado. Como no fragmento abaixo:

```java
for (int i = 0; i < 3; i++) {
  System.out.println("Contador do loop externo: " + i);
  System.out.print("    Contador do loop interno: ");

  for (int j = 0; j <= 100; j += 2) {
    System.out.print(j + " ");
    
    // Finaliza o Loop se j = 20
    if (j == 20) break;
  
  }
  System.out.println(); // Apenas pula uma linha
}
        
System.out.println("Loop finalizado!");
```

RESULTADO:

```
Contador do loop externo: 0
    Contador do loop interno: 0 2 4 6 8 10 12 14 16 18 20 
Contador do loop externo: 1
    Contador do loop interno: 0 2 4 6 8 10 12 14 16 18 20 
Contador do loop externo: 2
    Contador do loop interno: 0 2 4 6 8 10 12 14 16 18 20 
Loop finalizado!
```

### Usando break com Rótulos

A forma estendida é break <rótulo>, onde <rótulo> deve ser substituído por uma sequência de caracteres que identifica um bloco de código ou uma estrutura de repetição. Quando esse comando é executado, o computador continua a execução do programa a partir da primeira instrução que vem depois do bloco ou estrutura indicada.

É importante destacar que o bloco de código, que é delimitado por { e }, deve englobar o comando break, mesmo que não diretamente. Por esse motivo, a forma estendida do break pode ser usada para sair de um ou mais blocos aninhados (que estão um dentro do outro), como veremos em nosso exemplo.

```java
for (int i = 1; i <= 2; i++) {
  System.out.println("\n i é " + i);
  um: { 
    dois: {
      if (i == 1) break um; // Retorna para o bloco rotulado um
      if (i == 2) break dois; // Volta para o bloco rotulado dois
      
      // A instrução abaixo não será executada.
      System.out.println("Não será executada.");
    }
    // A linha abaixo está dentro do bloco um.
    System.out.println("Depois do bloco dois.");
  }
  System.out.println("Depois do bloco um.");
}
```

No fragmento acima temos uma estrutura de repetição que conta de 1 a 2. Dentro dessa repetição nós temos dois blocos, que foram rotulados com os nomes um e dois. Dentro do bloco dois existe temos duas estruturas de decisão if, que determinam, nesse caso, para fora de qual bloco a execução do programa deve seguir,

O primeiro if compara o valor de i com 1, e caso haja uma correspondência a execução pula para fora do bloco um. Nesse caso, o a instrução que imprime “Depois do bloco um.” na tela é executada.

O segundo if compara o valor de i com 2 e, caso haja correspondência, o comando break dois é executado, fazendo o computador sair do bloco com rótulo dois. Ao sair do bloco dois, a próxima instrução imprime “Depois do bloco dois.” na tela. Depois dessa execução, todas as instruções do bloco um estão finalizadas, então o andamento do programa continua da próxima linha logo após o bloco um, que se trata da instrução que imprime “Depois do bloco um.”


RESULTADO:

i é 1
Depois do bloco um.

 i é 2
Depois do bloco dois.
Depois do bloco um.

O rótulo pode identificar um bloco independente, como os usados no exemplo anterior, ou um bloco que faz parte da estrutura de um comando, como o while por exemplo. O rótulo pode estar antes do comando ou antes do bloco, como mostra o fragmento a seguir.

```java
// Rótulo aparece antes da declaração
loop1: 
for (int i = 0; i <= 3; i++) {
  for (int j = 0; j <= 2; j++) {
    if (i == 1 && j == 1) break loop1; // Pula para fora do loop.
    System.out.println("i = " + i + " e j = " + j);
  }
}
        
System.out.println();
System.out.println("Depois do loop1.");
System.out.println();
        
// Rótulo aparece antes da declaração
for (int i = 0; i <= 3; i++)
loop2: {
  for (int j = 0; j <= 2; j++) {
    if (i == 1 && j == 1) break loop2; // Pula para fora do loop.
                
    System.out.println("i = " + i + " e j = " + j);
  }
}
         
System.out.println();
System.out.println("Depois do loop2.");
System.out.println();

```

Nesse programa existe duas partes que possuem mais ou menos a mesma estrutura, com exceção da localização do rótulo. No primeiro conjunto de fors aninhados o rótulo foi localizado antes do comando. Com essa organização, quando o comando break loop1 é executado todas as iterações do loop1 são ignoradas e a execução do programa continua da próxima linha após o loop.

No segundo conjunto de fors aninhados o rótulo foi localizado antes do bloco. Com essa organização, quando o comando break loop2 é lido a iteração atual do loop2 é finalizada, e a próxima é iniciada.

Em ambos os casos o texto “i = 1 e j = 1” não é exibido. Mas no segundo o computador continua as próximas iterações do loop. Tome um tempo para analisar o código e o resultado.

## O Comando continue

O continue, assim como o break, influência a progressão de uma estrutura de repetição. Quando o continue é encontrado no bloco do loop, todas as declarações seguintes (que ainda estão dentro do bloco) são ignoradas, e a próxima iteração é iniciada.

```java
for( int i = 1; i <= 10; i++){
  if (i == 5) continue; // Começa a próxima iteração.
  System.out.print(i + " "); // Será ignorado quando i = 5
}
```

Normalmente, o loop no fragmento acima exibiria todos os números de 1 até 10. Contudo, quando i contém 5, o comando continue é executado, o que finaliza a iteração atual e inicia a próxima. É importante notar que os parâmetros do loop ainda são respeitados, de modo que a próxima iteração somente acontece se a condição for satisfeita. Se por acaso a iteração for a última, então o loop é terminado, e a execução do programa continua da linha após a declaração.

RESULTADO:

```
1 2 3 4 6 7 8 9 10
```

Usando continue com Rótulos:

Também podemos usar rótulos com o comando continue, Ele é útil para sair de loops aninhados enquanto mantem a execução do loop rotulado. O resultado é praticamente o mesmo que o do comando break quando este é colocado antes do bloco de uma estrutura de repetição.

```java
// Rótulo aparece antes da declaração
loop1: 
for (int i = 0; i <= 3; i++) {
  for (int j = 0; j <= 2; j++) {
    if (i == 1 && j == 1) continue loop1; // Pula para a próxima iteração do loop1
      System.out.println("i = " + i + " e j = " + j);
    }
  }
}
```

Quando ambos i e j são 1 a execução do programa deve continuar da próxima iteração do loop1.

RESULTADO:

```
i = 0 e j = 0
i = 0 e j = 1
i = 0 e j = 2
i = 1 e j = 0
i = 2 e j = 0
i = 2 e j = 1
i = 2 e j = 2
i = 3 e j = 0
i = 3 e j = 1
i = 3 e j = 2
```


