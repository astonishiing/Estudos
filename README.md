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
## CONTRUTORES
- Também conhecidos pelo inglês constructors, os construtores são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida. Eles são obrigatórios e são declarados

- Um construtor em Java é um bloco de código especial dentro de uma classe, designado para inicializar novos objetos. Caracteriza-se por ter o mesmo nome da classe e por não especificar um tipo de retorno, nem mesmo void. Os construtores são chamados automaticamente quando um novo objeto é criado, facilitando a configuração inicial do objeto com valores específicos ou a execução de qualquer rotina preparatória necessária.

Características principais:

1. Nome: Deve coincidir exatamente com o nome da classe.
2. Retorno: Não possui, nem mesmo void.
3. Acesso: Pode ter qualquer modificador de acesso (public, private, etc.), controlando assim sua visibilidade.

### Tipos de Construtores

1. Construtor Padrão: Se uma classe não possui construtores explicitamente definidos, o Java fornece um construtor padrão, sem argumentos, que não faz nada além de chamar o construtor da superclasse.

2. Construtor Parametrizado: Permite que o desenvolvedor especifique um ou mais parâmetros, possibilitando a inicialização de objetos com diferentes estados.

### Importância dos Construtores

1. Inicialização Segura: Garantem que todos os objetos de uma classe sejam inicializados em um estado consistente.
2. Flexibilidade: A sobrecarga de construtores permite a inicialização de objetos de várias formas.
3. Encapsulamento: Contribuem para o encapsulamento, permitindo a inicialização de atributos privados.

Os construtores são uma ferramenta poderosa em Java, oferecendo aos desenvolvedores controle preciso sobre como os objetos são inicializados, garantindo que estejam sempre em um estado válido. Ao compreender e utilizar efetivamente os construtores, é possível escrever código mais limpo, seguro e reutilizável, elevando a qualidade das aplicações Java desenvolvidas.

```java
public class Carro{

/* CONSTRUTOR DA CLASSE Carro */
public Carro(){
//Faça o que desejar na construção do objeto
   }

 }
```

O construtor sempre tem a seguinte assinatura:

```java
modificadores de acesso (public nesse caso) + nome da classe (Carro nesse caso) + parâmetros (nenhum definidoneste caso)

O construtor pode ter níveis como: public, private ou protected.
```
Porém, por que alguém colocaria um construtor private, para que assim ninguém pudesse instanciar essa classe? Um dos motivos é a aplicação do padrão de projeto Singleton, que controla se um objeto já foi ou não criado. Para que isso ocorra ele não pode deixar que ninguém chame diretamente o construtor da classe.

Para criar um objeto da classe Carro simplesmente usamos a palavra reservada “new” e o nosso construtor é chamado

```java
public class Carro{

/* CONSTRUTOR DA CLASSE Carro */
public Carro(){
//Faça o que desejar na construção do objeto
  }

}

public class Aplicacao {

public static void main(String[] args) {
//Chamamos o construtor sem nenhum parâmetro
Carro fiat = new Carro();
  }

}
```

Por padrão, o Java já cria esse construtor sem parâmetros para todas as classes, então você não precisa fazer isso se utilizará apenas construtores sem parâmetros. Por outro lado, se você quiser, poderá criar mais de um construtor para uma mesma classe. Ou seja, posso criar um construtor sem parâmetros, com dois parâmetros e outro com três parâmetros.

_$$ DESTRUTORES $$_

Não é garantido que o Garbage Collection irá destruir este objeto, já que ele o faz na hora que achar conveniente e o programador não tem nenhum controle sobre isso.

A forma mais adequada de “tentar” destruir um objeto em Java é atribuir valores nulos a ele. Assim, quando o Garbage Collection for realizar o seu trabalho, verá que seu objeto não está sendo mais utilizado e o destruirá.

## MÉTODOS


- Quando definimos um objeto num programa orientado a objetos, implementamos todo o comportamento desse objeto em um ou mais métodos.

- Um método em Java é equivalente a uma função, subrotina ou procedimento em outras linguagens de programação.

- Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe.

A sintaxe para construção de um método é a seguinte:
```java
[modificador] tipo_retorno identificador ([argumentos]) {

//Corpo do método

}
```

### Modificadores de Acesso

Java controla o acesso a atributos e métodos através do uso dos modificadores de acesso. São eles:

public : É o menos restritivo de todos. Atributos e métodos declarados como public
em uma classe podem ser acessados pelos métodos da própria classe, por classes
derivadas desta e por qualquer outra classe em qualquer outro pacote.

protected : Atributos e métodos definidos como protected são acessíveis pelos
métodos da própria classe e pelas classes derivadas.

private : É o mais restritivo. Atributos e métodos declarados como private só podem ser acessados pelos métodos da própria classe.

Quando nenhum modificador é definido (acesso do tipo “package”), os atributos e
métodos podem ser acessados pelos métodos da própria classe, pelas classes derivadas e por qualquer outra classe dentro do mesmo pacote.

É importante destacar que esse controle não se aplica às variáveis locais aos métodos.

### Nome de Métodos

O nome de um método deve começar com uma letra (a-z/A-Z), um underscore (_), ou um sinal de dólar ( $ ). Os caracteres subsequentes podem incluir os dígitos de 0 a 9.

**Convenção** : Use verbos para nome de métodos. Faça a primeira letra do nome
minúscula com cada letra inicial interna maiúscula. Por exemplo : getUserName(),
getMaxPrice().

### Argumentos

Um método pode ter zero ou mais argumentos (ou parâmetros).

Caso não tenha argumentos, é necessário informar os parênteses vazios tanto na
definição como na chamada do método.

O nome do método acrescido de seus parâmetros é denominado assinatura do
método.

Cada argumento deve ser declarado como define-se uma variável, especificando o
seu tipo e nome.

Caso seja mais de um argumento, cada declaração deve estar separada por vírgula.

### Retornando Valor a Partir de um Método

É possível associar um valor de retorno a um método. Para isso, é preciso definir, na frente do nome do método, o tipo do valor a ser retornado. O tipo pode ser um primitivo ou então uma classe ou interface. Caso o método não retorne valor algum, é obrigatória a utilização do tipo void na assinatura do método. Veja os exemplos abaixo:

```java
public int getAge () {

return age;

}
```

O comando return é utilizado para passar o valor requerido de volta para quem chamou o método e é obrigatório quando o tipo de retorno não é void. Ele deve receber um único valor ou uma expressão que deve ser compatível com o tipo de retorno especificado para o método. Quando o comando é encontrado, o método termina sua execução imediatamente, ignorando todas as instruções subsequentes.

Um comando return sem valor de retorno retorna o tipo void, mas não é obrigatória sua utilização nestes casos.

### Passando Parâmetros para um Método

**Passando um Primitivo:** Quando um valor primitivo é passado na chamada de um
método, uma **cópia** deste valor é criada e atribuída para o argumento do método
responsável por recebê-la. Se o método mudar este valor, apenas o valor do
argumento local ao método é afetado. Quando o método terminar sua execução, o valor original da variável utilizada para passar o valor primitivo na chamada do
método permanecerá inalterado.

```java
public void incrementa (int num) {

num++;

System.out.println(“num : ” + num);

}
```

```java
int num = 10;

incrementa (num); //Imprimirá 11

System.out.println(”num : ” + num); //Imprimirá 10
```

**Passando a Referência de um Objeto:** Quando o tipo passado para o método não for um primitivo mas sim um objeto, esse comportamento muda. Quando passamos um objeto, uma referência ao objeto original é passada ao invés de uma cópia do objeto.

A referência contém o endereço de memória onde está contido o objeto original e
qualquer modificação feita pelo método no argumento que recebeu esta referência
afetará também o objeto original.

O Java é mais purista em relação à orientação a objetos que Delphi, portanto não existem “funções” perdidas, cada método esta hierarquicamente ligado a uma classe, portanto você sempre irá acessar um método através:
```java
Classe.Método() ou Objeto.Método
```

Para os métodos estáticos não é necessário instanciar um objeto para usá-lo, já nos outros casos, a funcionalidade do método só é possível após instanciação, que é a criação de um objeto a partir da sua classe.

### CONCEITOS EM PROJETOS MAIORES

OBS: O uso de métodos separa e organiza a lógica, além disso, tratar problemas grandes, dividindo os mesmos em problemas menores é uma técnica bastante efetiva.

Um método deve ser codificado dentro da classe a qual pertence, portanto estará entre as chaves da classe. Um método em Java, tal como uma função retorna um valor, mas alternativamente podemos dizer que ele retorna vazio (void), sendo, portanto somente um procedimento.

```java
<qualificadores> <tipo-de-retorno> <nome-do-método> ([lista-de-parâmetros]){

<bloco-de-comandos>

}
```
O primeiro detalhe é relativo a <qualificadores> estes podem assumir várias formas, iremos destacar mais a frente este tópico, mas neste momento você deve conhecer:

**public static** – Permite criar um método que pode ser executado por agentes externos, inclusive independente de instanciação.

**private static** – Como o nome sugere este método só é visível dentro da própria classe onde foi definido e poderá ser executado diretamente sem necessidade de instanciação.

Em ambos os casos omitindo-se a palavra, static, estaremos obrigando a instanciação de um objeto para então utilizar o método, um método estático é mais oneroso para o sistema, porém sempre temos algum método estático que inicia o processo de execução.

**Com estes dois qualificadores é possível atender a praticamente todos os casos.**

O [tipo-de-retorno] é um valor ou objeto que é retornado pelo método após o
processamento interno do método, como em uma função matemática, você pode passar parâmetros e ter um valor como resposta. Você declara o [tipo-de-retorno] como um tipo de dados ou uma classe.

A [lista-de-parâmetros] é opcional, mas muito interessante para fazer a interface entre o exterior e a rotina que esta internalizada ao método, ao seja, pela parametrização que você consegue criar métodos genéricos, que atendam a várias situações.
As chaves servirão para agrupar o que faz parte do método, em termos de codificação.

## Associação entre Classes ou Objetos em Java

Na programação orientada a objetos (POO), a associação entre classes ou objetos é um relacionamento onde um objeto de uma classe se refere a outro objeto de outra classe. Essa associação pode ser simples ou complexa e pode ser representada de diversas maneiras. Três tipos principais de associação são usados para modelar o relacionamento entre objetos:

### 1. Composição (Composição Forte)

A composição é um tipo de associação mais forte, onde um objeto "parte" de outro objeto. Se o objeto "pai" for destruído, seus objetos "filhos" também serão destruídos. Em outras palavras, o ciclo de vida dos objetos componentes depende do ciclo de vida do objeto que os contém.

Características da Composição:

1. Relacionamento forte: O objeto "pai" contém o objeto "filho" e controla seu ciclo de vida.
   
2. Destruição: Quando o objeto "pai" é destruído, o objeto "filho" também é destruído.
 
3. Exemplo: Uma casa e seus cômodos. Se a casa for destruída, os cômodos também serão destruídos, pois não existem independentemente.

```java
class Cômodo {
    private String nome;

    Cômodo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Casa {
    private Cômodo cozinha;
    private Cômodo sala;
    private Cômodo quarto;

    // Construtor que cria os cômodos como parte da casa
    Casa() {
        this.cozinha = new Cômodo("Cozinha");
        this.sala = new Cômodo("Sala");
        this.quarto = new Cômodo("Quarto");
    }

    public void mostrarCômodos() {
        System.out.println("Cômodos da casa: ");
        System.out.println(cozinha.getNome());
        System.out.println(sala.getNome());
        System.out.println(quarto.getNome());
    }

    // A Casa destrói automaticamente seus Cômodos quando a Casa é destruída.
}

public class TesteComposicao {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.mostrarCômodos();
        // Se a casa for destruída, os cômodos também seriam.
    }
}
```

Explicação:

- A Casa tem instâncias de Cômodo. No exemplo acima, quando a instância de Casa for destruída, os Cômodos (cozinha, sala, quarto) também seriam destruídos, pois são componentes da Casa e não existem independentemente.
- A relação entre Casa e Cômodo é uma composição forte.

### 2. Agregação (Composição Fraca)

A agregação é uma forma de associação mais fraca em que o objeto "pai" pode conter objetos "filhos", mas esses objetos podem existir independentemente do "pai". Ou seja, se o objeto "pai" for destruído, os objetos "filhos" podem continuar existindo.

Características da Agregação:
1. Relacionamento mais fraco: O objeto "pai" contém o objeto "filho", mas não é responsável por seu ciclo de vida.

2. Existência independente: Os objetos "filhos" podem existir sem o objeto "pai".

3. Exemplo: Um departamento e seus funcionários. O departamento pode existir sem os funcionários, e os funcionários podem existir sem o departamento.

```java
class Funcionario {
    private String nome;

    Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Departamento {
    private String nome;
    private Funcionario funcionario;

    Departamento(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public void exibirInformacoes() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionario: " + funcionario.getNome());
    }

    // Mesmo que o Departamento seja destruído, o Funcionário pode continuar existindo.
}

public class TesteAgregacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria");
        Departamento departamento = new Departamento("RH", funcionario);
        departamento.exibirInformacoes();
        // O Departamento pode ser destruído, mas o Funcionário ainda existe.
    }
}
```

Explicação:

1. A agregação é uma associação mais fraca entre Departamento e Funcionario. Mesmo que o Departamento seja destruído, o Funcionario pode continuar existindo, já que ele é uma entidade independente.
2. A relação entre Departamento e Funcionario é uma agregação.

### 3. Multiplicidade

A multiplicidade descreve quantas instâncias de uma classe podem estar associadas a uma instância de outra classe. Ela indica o número de objetos que podem estar relacionados entre si.

Tipos de Multiplicidade:

1:1: Um objeto de uma classe está relacionado a exatamente um objeto de outra classe.

1:N: Um objeto de uma classe pode estar relacionado a vários objetos de outra classe (um para muitos).

N:M: Vários objetos de uma classe podem estar relacionados a vários objetos de outra classe (muitos para muitos).

Exemplo de Multiplicidade 1:N:

```java
class Autor {
    private String nome;

    Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Livro {
    private String titulo;
    private Autor autor; // Um autor para muitos livros

    Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor.getNome());
    }
}

public class TesteMultiplicidade {
    public static void main(String[] args) {
        Autor autor = new Autor("J.K. Rowling");
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor);
        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", autor);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        // Um autor pode escrever vários livros, mas cada livro tem exatamente um autor.
    }
}
```

Explicação:

A relação entre Autor e Livro é de 1:N. Um Autor pode escrever vários Livros, mas cada Livro tem exatamente um Autor.

Exemplo de Multiplicidade N:M:

```java
class Estudante {
    private String nome;

    Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Curso {
    private String nome;
    private List<Estudante> estudantes = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        for (Estudante estudante : estudantes) {
            System.out.println("Estudante: " + estudante.getNome());
        }
    }
}

public class TesteMultiplicidadeNM {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Ana");
        Estudante estudante2 = new Estudante("Carlos");

        Curso curso = new Curso("Matemática");
        curso.adicionarEstudante(estudante1);
        curso.adicionarEstudante(estudante2);

        curso.exibirInformacoes();
        // Muitos estudantes podem estar matriculados em muitos cursos.
    }
}
```

Explicação:

A relação entre Estudante e Curso é de N:M. Muitos Estudantes podem estar matriculados em muitos Cursos, e um Curso pode ter muitos Estudantes.

Composição: Relacionamento forte, onde o ciclo de vida do objeto "filho" depende do objeto "pai". Se o objeto "pai" for destruído, o objeto "filho" também será.

Agregação: Relacionamento mais fraco, onde o objeto "pai" pode conter objetos "filhos", mas esses objetos podem existir independentemente.

Multiplicidade: Refere-se à quantidade de objetos de uma classe que podem ser associados a objetos de outra classe. Pode ser 1:1, 1:N, ou N:M.

## HERANÇA

"É um”. Utilizamos herança quando queremos estender uma funcionalidade de uma classe. Acoplando fortemente o código. Ou utilizamos quando queremos fazer o polimorfismo

Na programação modular existe uma técnica chamada Herança que é utilizada para reuso, evitando a repetição de um mesmo trecho de código que faz as mesmas coisas em diversos lugares no código, ajudando então na boa prática de deixar o código mais objetivo e limpo.

Um exemplo básico para entender o conceito seria: Um cachorro e um homem, embora obviamente se diferem, possuem uma característica em comum: são mamíferos, eu não preciso repetir essa mesma informação se eu posso reutilizá-la. Assim como um beija-flor e uma galinha são aves, ou seja, possuem algo em comum. Em um nível mais acima, podemos concluir que cachorro, homem, beija-flor e galinha possuem algo em comum: ambos são animais. Sempre um vai recuperando as informações do outro.

Sendo assim, não há necessidade de repetir sempre e caso exista um outro mamífero, como um gato, basta reutilizar as informações já existentes acrescentando as características específicas, no caso a especialização.

> Definição geral:

Formalmente, a Herança é uma técnica para reutilizar características de uma classe na definição de outra classe, determinando uma hierarquia de classes. Diante deste cenário existem as seguintes terminologias relacionadas à Herança:

- Superclasses (pai): Classes mais genéricas que devem guardar membros em comum.

- Subclasses (filha): Classes especializadas que acrescentam novos membros, especializando a classe.
 
Com este conceito aplicado de maneira correta é possível reutilizar componentes de maneira mais rápida e simples além de facilitar a extensibilidade do sistema. Por falar em extensibilidade, o operador extends é utilizando na subclasse para estender a superclasse.

Os atributos e métodos são herdados por todos os objetos dos níveis mais baixos considerando o modificador de acesso.
Diferentes subclasses podem herdar as características de uma superclasse.

> Principais benefícios

- Reutilização de código uma vez que as similaridades são compartilhadas e as diferenças preservadas.
  
- Facilitação da manutenção do sistema trazendo maior legibilidade do código existente, quantidade menor de linhas de código e alterações em poucas partes do código.

> Herança simples

Provavelmente a herança simples seja a mais utilizada, mesmo porque linguagens como o JAVA aceitam somente ela. Ou seja, não tem como ter herança por cima de herança, bom, pelo menos não sem usar alguns artifícios.

Um exemplo pode ser visto abaixo: um veículo pode ser tanto um carro, quanto uma moto. O veículo seria a superclasse enquanto as demais uma subclasse que vai herdar todas as propriedades da superclasse.

```java
public class Veiculo {
        public String modelo;
        public String marca;
    }

    public class Carro extends Veiculo {
        public String porta;
    }

    public class Moto extends Veiculo {
        public int bau_carga;
    }
```
No entanto, uma herança pode herdar outra. Por exemplo, existem vários tipos de carro: hatch, sedan, caminhonete, SUV, entre outros. É possível criar uma classe para representar um carro SUV que vai herdar as propriedades de: Carro e Veículo. Ou seja: SUV é um Carro que é um Veículo.


```java
public class Caminhonete extends Carro {
        public int litros_Cacamba;
    }
```

Ou seja, vimos que o nível mais alto é a Generalização e o mais baixo a Especialização, sendo que quanto mais se desce na árvore da herança, maior a especialização.

### CONSTRUTORES

Os construtores são herdados quando existe a herança, sendo chamados em cascata durante a instanciação das classes mais especializadas, de forma implícita ou explícita.

A chamada implícita geralmente ocorre ao construtor de Object. Ou seja, se uma classe não herda explicitamente de outra classe, ela então herda de Object. No caso do exemplo abaixo, os métodos construtores Veiculo herdam implicitamente de Object.

```java
public class Veiculo{
   public String marca;
   public String modelo;
   public Veiculo() {}
   public Veiculo(String modelo, String marca) {
      this.modelo = modelo;
      this.marca = marca;
   }
}
```

Já a chamada explícita ocorre como no exemplo abaixo:

```java
public class Carro extends Veiculo{ 
   public int porta; 
   // Chamada implicita para o construtor de Veiculo
   public Carro() { }
   // Chamada explicita para o construtor de Veiculo
   public Carro(String marca, String modelo, int porta) { 
      super(modelo); 
      super(marca);
      this.porta = porta; 
   } 
}
```
Para compreender melhor o código acima, é importante conhecer as referências this e super.

- Referência this: Referência à membros do objeto corrente.
- Referência super: Referência à membros da superclasse, sendo também utilizado para chamar o construtor: Subclasse chama o construtor da superclasse; Primeira instrução no construtor da subclasse.

> Sobrescrita de métodos

Os métodos podem ser sobrescritos, o que é diferente de sobrecarga por terem a mesma assinatura e o tipo de retorno. No entanto, como toda regra possui uma exceção, aqui a que se aplica é: Métodos finais e private não podem ser sobrescritos uma vez que o acesso não pode ser restringido.

- Public -> Public
- Protected -> Protected, Public

Atributos não são redefiníveis: Se um atributo de mesmo nome for definido na subclasse, a definição na superclasse é ocultada.

Membros estáticos: Não são redefinidos, mas ocultados, como o acesso é feito pelo nome da classe, estar ou não ocultado terá pouco efeito.

```java
public class Veiculo 
{
   public void tipoVeiculo()
   {
        System.out.println("O veículo é um carro ou moto");
   }
}
public class Carro extends Veiculo
{
   @Override
   public void tipoVeiculo()
   {
      System.out.println("O veículo é um carro");
   }
}
public class TesteHeranca 
{ 
   public static void main(String[] args) 
   { 
      Veiculo v = new Pessoa("Gol", "VolksWagen"); 
      v.tipoVeiculo(); 
Carro c = new Carro ("Gol", "VolksWagen", 4); 
      e.tipoVeiculo(); 
   } 
}
```

## ENUM

As enumerações estão presentes em várias linguagens de programação, mas em Java elas têm características especiais.

> Para que servem as enumerações?

As enumerações são usadas quando precisamos definir um conjunto fixo de constantes. Por exemplo, podemos criar uma enumeração com os meses do ano (janeiro, fevereiro, março…) ou com códigos de status, como sucesso, em espera, falha.

> O que são enumerações em Java

É muito importante entender que, diferente de outras linguagens, **Java implementa enumerações como tipos de classe**, ou seja, elas definem um tipo de dado. E, como as enumerações representam um conjunto fixo de valores, **um objeto de uma enumeração só pode assumir os valores declarados em sua lista de constantes** (meses do ano, códigos de status, etc.).

> Criando uma enumeração

Uma enumeração é criada com o uso da palavra-chave enum. Essa declaração define uma classe, chamada de tipo enum (enum type).

```java
enum Sinalizacao {
	VERDE, AMARELO, VERMELHO;
}
```

1. Os identificadores VERDE, AMARELO e VERMELHO são chamados de constantes de enumeração;

2. Cada identificador é declarado implicitamente como um campo público estático final de Sinalizacao;

3. As constantes de enumeração são chamadas **autotipadas**, o que quer dizer que seu tipo é o mesmo da enumeração que as contêm, ou seja, VERDE, AMARELO e VERMELHO são constantes do tipo **Sinalizacao.**

Você pode declarar uma variável de um tipo de enumeração previamente definido, da mesma forma que faria com qualquer outro tipo. Por exemplo, assim se declara uma variável de tipo de enumeração Sinalizacao chamada sin.

```java
class EnumDemo {
  Sinalizacao sin;
}
```

Não é possível instanciar um tipo enum usando new. Como sin é de tipo Sinalizacao, os únicos valores que podem ser atribuídos a ela são aqueles definidos pela enumeração, e obtemos esse valor usando a sintaxe de acesso a membro estático do Java — lembre-se que as constantes de enumeração são campos públicos estáticos:

```java
class EnumDemo {
  Sinalizacao sin;
  sin = Sinalizacao.AMARELO;
}
```

> Comparando enumerações

Como é impossível instanciar explicitamente um tipo enum, só pode haver uma instância de cada constante de enumeração.

Portanto, podemos usar o operador relacional == em vez do método equals para comparar duas referências de objetos do mesmo tipo enum. Também é possível usar o método equals mas, por simplicidade, dê preferência à primeira opção.

```java
class EnumDemo {
  Sinalizacao sin = Sinalizacao.AMARELO;

  if (sin == Sinalizacao.VERDE) // …  
  
  if (sin.equals(Sinalizacao.VERMELHO)) // …
} 
```

> Exibindo uma constantes de enumeração

A exibição de uma constante de enumeração, por exemplo utilizando println(), resulta em seu nome, como definido na enumeração.

```java
class EnumDemo {
  System.out.println(Sinalizacao.VERMELHO);
}
```

> Enumerações em instrução switch

É possível controlar uma instrução switch usando o valor de uma enumeração:

```java
class EnumDemo {
  Sinalizacao sin = Sinalizacao.AMARELO;

  switch (sin) {
	  case VERDE:
		  // ...
	  case AMARELO:
		  // ...
	  case VERMELHO:
		  // ...
  } 
}
```

- Duas observações importantes:

As instruções case devem usar constantes do mesmo tipo enum da expressão switch;

Nas instruções case, os nomes das enumerações devem ser usados sem a especificação de seu tipo de enumeração (VERDE em vez de Sinalizacao.VERDE), porque ele já é especificado implicitamente na expressão switch, e incluí-lo causará erro de compilação.

> Maiúsculo ou minúsculo?

Java não faz nenhuma exigência estilística, mas muitos programadores definem as constantes de enumeração com maiúsculas, como fizemos em nossos exemplos até agora. Essa preferência se deve ao fato de que muitas vezes as enumerações substituem variáveis de tipo final, que por tradição também costumam ser escritas com maiúsculas.

### Enumerações vs variáveis final

Muitos programadores acham que as enumerações substituem as variáveis final, mas ambas devem ser usadas em situações distintas:

**Enumerações:** São indicadas quando precisamos definir uma lista de itens pré-definidos e representados por um identificador.

**Variáveis final:** São usadas para definir um valor constante, como o tamanho de um array ou o valor máximo que uma variável do encapsulador de tipo Integer pode assumir (Integer.MAX_VALUE).

> Definindo construtores, métodos e variáveis de instância

Como cada constante de enumeração é um objeto de seu tipo de enumeração (Sinalizacao.VERDE é um objeto de tipo Sinalizacao), **podemos ter construtores, métodos e variáveis de instância em uma enumeração:**

1. O construtor é chamado uma vez para cada constante quando ela é criada durante a inicialização da classe;

2. Como qualquer outra classe, um tipo enum pode ter dois ou mais construtores sobrecarregados;

3. Todo construtor de enum sem modificador de acesso é private. Tentar usar os modificadores public e protected causará erro de compilação. Portanto, na prática só é possível definir construtores privados em um tipo enum;

4. Cada constante tem sua própria cópia de qualquer variável de instância definida pela enumeração e pode chamar qualquer um de seus métodos.

exemplo ilustra o uso de um construtor:

```java
enum Sinalizacao {
	VERDE(120), AMARELO(5), VERMELHO(60);

	private final int tempo;

	Sinalizacao(int t) {
		tempo = t;
	}

	int getTempo() {
		return tempo;
	}
}

class EnumDemo1 {
	public static void main(String[] args) {
		System.out.println("O tempo do sinal " + 
				   Sinalizacao.VERDE + " é " + 
				   Sinalizacao.VERDE.getTempo() + "segundos.");
	}
}
```

1. Uma variável de instância tempo que contém o tempo em segundos que o sinal fica ativo. (Perceba que declaramos tempo como final porque, conceitualmente, uma constante de enumeração deve representar um valor fixo, embora não seja obrigatório usar esse modificador);

2. Um construtor que recebe como argumento o tempo de ativação do sinal;

3. O método getTempo(), que retorna o valor de tempo.

Observe que os argumentos do construtor são colocados entre parênteses após cada constante. Esses valores são passados para o parâmetro t de Sinalizacao, cujo valor é então atribuído à variável de instância tempo.

Já que cada constante de enumeração é um objeto e, portanto, têm sua própria cópia de tempo, podemos obter o tempo de um sinal especificado chamando getTempo().

### Métodos values() e valueOf()

Toda enumeração tem dois métodos implícitos, que são adicionados automaticamente pelo compilador quando ele cria um enum. Esta é a forma geral desses métodos:

```java
public static E[]values();
public static E valueOf(String name);
```

O método **values()** retorna um array contendo todas as constantes de enumeração na ordem em que elas foram declaradas; ele é comumente usado para iterar sobre os valores de um tipo enum;

O método **valueOf()** retorna a constante de enumeração cujo valor corresponde ao string passado como argumento ou lança um IllegalArgumentException se o tipo enum não tiver nenhuma constante com o nome especificado.

```java
enum Sinalizacao {
	VERDE, AMARELO, VERMELHO;
}

public class EnumDemo2 {
	public static void main(String[] args) {
		for (Sinalizacao sin : Sinalizacao.values()) {
      			System.out.println("Sinal " + sin);
		}

		System.out.println();

		Sinalizacao sin = Sinalizacao.valueOf("VERDE");
		System.out.println("sin contém " + sin);

	}
}
```

RESULTADO: 
```java
Sinal VERDE
Sinal AMARELO
Sinal VERMELHO

sin contém VERDE
```

> Restrições do tipo enum

Há duas restrições importantes sobre as enumerações:

1. Um tipo enum não pode ser uma superclasse, ou seja, ele é uma classe implicitamente final (não pode ser estendido por outra classe);

2. Uma enumeração não pode herdar outra classe.

A segunda restrição decorre do fato de que todo tipo enum herda implicitamente a classe java.lang.Enum, e Java não permite herança múltipla.

> Adicionando corpo a uma constante de enumeração

Uma constante de enumeração também pode ter um corpo. **Esse corpo define implicitamente uma declaração de classe anônima que estende o tipo enum que a contém.** O corpo da classe segue as regras das classes anônimas, como não poder definir nenhum construtor explícito. Também é possível ter métodos de instância no corpo mas, como veremos no próximo exemplo, para que possam ser chamados fora do tipo enum ele precisa sobrescrever algum método acessível dentro do tipo enum.

```java
enum Operacao {
	MAIS {
		@Override
		double avaliar(double x, double y) {
			return x + y;
		}
	},
	MENOS {
		@Override
		double avaliar(double x, double y) {
			return x - y;
		}
	},
	VEZES {
		@Override
		double avaliar(double x, double y) {
			return x * y;
		}
	},
	DIVIDIDO_POR {
		@Override
		double avaliar(double x, double y) {
			return x / y;
		}
	};

	// Cada constante realiza uma operação aritmética
	abstract double avaliar(double x, double y);
}

class EnumDemo3 {
	public static void main(String[] args) {
		double x = 2.0;
		double y = 1.0;
		for (Operacao op : Operacao.values())
			System.out.println(x + " " + op + " " + y + " = " + op.avaliar(x, y));
	}
}
```

RESULTADO:

```java
2.0 MAIS 1.0 = 3.0
2.0 MENOS 1.0 = 1.0
2.0 VEZES 1.0 = 2.0

2.0 DIVIDIDO_POR 1.0 = 2.0
```

Nesse exemplo temos uma enumeração que define as operações aritméticas básicas. Cada constante tem sua versão do método abstrato avaliar, que realiza a operação representada pela constante.


_@astonishiing_
