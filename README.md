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

