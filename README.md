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
