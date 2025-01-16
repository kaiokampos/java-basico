# RESUMO DO ESTUDO DA LINGUAGEM JAVA

## Introdução
Esse material será composto de uma maneira que faça sentido para mim, quando eu rever saber do que se trata.

O conteúdo deste projeto foi retirado do curso `Java COMPLETO Programação Orientada a Objetos + Projetos`
do _Nélio Alves_ na [Udemy](https://www.udemy.com/course/java-curso-completo/).
 
Esse resumo esta sendo feito por mim [Kaio Campos](https://github.com/kaiokampos) para futuras consultas, e esse projeto está de acordo com o material disponibilizado pelo professor.

## Estrutura de uma aplicação Java

Java é uma linguagem orientada a objetos, e a base de um objeto é uma classe, todo o código java tem que está dentro de classes.
Depois da classe tem o conceito de package(pacotes), onde separamos as classes nos seus pacotes (`Entities`, `Services`, `Repositories`).
Depois do package temos o Módulo, onde agrupamos os pacotes. MÓDULO(Financeiro) > PACKAGES(Entities, Services) > CLASSES.

![estrutuar de uma aplicação](assets/images/estruturaBasicaJava.png)
![estrutuar de uma aplicação](assets/images/estruturaBasica1.png)

## Expressões aritméticas

Basicamente as mesmas operações aritméticas visto na matemática básica, com a mesma ordem de precedência.

Ordem de Precedência dos Operadores Aritméticos em Java.

Parênteses (): Operações dentro de parênteses são realizadas primeiro.

Exemplo: (a + b) * c

Exponenciação: Java não possui um operador de exponenciação nativo, mas você pode usar Math.pow(base, expoente) para calcular potências.
Multiplicação *, Divisão /, e Módulo %: Esses operadores têm a mesma precedência e são avaliados da esquerda para a direita.

Exemplo: a * b / c % d

Adição + e Subtração -: Esses operadores também têm a mesma precedência e são avaliados da esquerda para a direita.

Exemplo: a + b - c

## Variáveis e tipos primitivos em Java

Definição informal:
Em programação, uma variável é uma porção de memória (RAM) utilizada para armazenar
dados durante a execução dos programas.

![estrutuar de uma aplicação](assets/images/declaracaoVariavel.png)
![estrutuar de uma aplicação](assets/images/tiposPrimitivos.png)

## Casting em Java
Optei por adicionar esse resumo logo abaixo das imagens, pois fica bem mais visual e fácil de entender.

1. Casting Implícito (Widening Casting)
   O casting implícito ocorre quando você converte um tipo de dado menor para um tipo de dado maior. Isso é feito automaticamente pelo compilador, pois não há perda de dados. Por exemplo, você pode converter um int para um long, float ou double.



```java
public class CastingExemplo {
    public static void main(String[] args) {
        int numeroInt = 100;
        long numeroLong = numeroInt; // Casting implícito de int para long
        float numeroFloat = numeroInt; // Casting implícito de int para float
        double numeroDouble = numeroInt; // Casting implícito de int para double

        System.out.println("Número Int: " + numeroInt);
        System.out.println("Número Long: " + numeroLong);
        System.out.println("Número Float: " + numeroFloat);
        System.out.println("Número Double: " + numeroDouble);
    }
}
Saída:
Número Int: 100
Número Long: 100
Número Float: 100.0
Número Double: 100.0
```
2. Casting Explícito (Narrowing Casting)
   O casting explícito é necessário quando você converte um tipo de dado maior para um tipo de dado menor. Isso deve ser feito manualmente, pois pode haver perda de dados. Por exemplo, você pode converter um double para um int.

```java
public class CastingExemplo {
    public static void main(String[] args) {
        double numeroDouble = 9.78;
        int numeroInt = (int) numeroDouble; // Casting explícito de double para int

        System.out.println("Número Double: " + numeroDouble);
        System.out.println("Número Int: " + numeroInt); // A parte decimal é perdida
    }
}
Saída:
Número Double: 9.78
Número Int: 9
```
## Entrada de dados via console
Scanner
Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da seguinte forma:

Scanner sc = new Scanner(System.in);

import java.util.Scanner;

faça sc.close() quando não precisar mais do objeto sc
```java
import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      sc.close();
   }
}
```
Scanner

• next() -> lê uma palavra

• nextInt() -> lê um inteiro

• nextDouble() -> lê um double

• next().charAt(0) -> lê um charactere

• Locale -> para definir o PONTO OU A VIRGULA

• Como ler até a quebra de linha:

    usando nextLine()
    como limpar o buffer de leitura -> Solução:
       Faça um nextLine() extra antes de
       fazer o nextLine() de seu interesse.


## Resumo: Estrutura Condicional em Java

## **1. Expressões Comparativas**
### **Definição**
Comparações entre valores utilizando operadores:
- `>`: maior
- `<`: menor
- `>=`: maior ou igual
- `<=`: menor ou igual
- `==`: igual
- `!=`: diferente

### **Exemplo**
```java
int x = 5;
System.out.println(x > 3);  // true
System.out.println(x == 10);  // false
```
## **2. Expressões Lógicas**
### **Definição**
Combinações lógicas de condições utilizando operadores:
- `&&` (E): todas as condições devem ser verdadeiras.
- `||` (OU): pelo menos uma condição deve ser verdadeira.
- `!` (NÃO): inverte o valor lógico.


### **Exemplo**
```java
int x = 5;
System.out.println(x > 0 && x < 10);  // true
System.out.println(x < 0 || x == 5);  // true
System.out.println(!(x > 10));  // true
```

## **3. Estrutura Condicional (if-else)**
### **Definição**
Permite executar blocos de código baseados em condições.

### **Exemplo**
```java
Sintaxe
if (condição) {
        // código se verdadeiro
        } else {
        // código se falso
        }
}

Exemplo:
int horas = 15;
if (horas < 12) {
        System.out.println("Bom dia!");
} else if (horas < 18) {
        System.out.println("Boa tarde!");
} else {
        System.out.println("Boa noite!");
}
```
## **4. Estrutura switch-case**
### **Definição**
Alternativa ao if-else para múltiplas condições baseadas em um único valor.

### **Exemplo**
```java
int dia = 3;
switch (dia) {
        case 1: 
            System.out.println("Domingo"); 
            break;
        case 2: 
            System.out.println("Segunda"); 
            break;
        case 3: 
            System.out.println("Terça"); 
            break;
        default: 
            System.out.println("Valor inválido"); 
            break;
        }
```

## **5. Operadores de Atribuição Cumulativa**
### **Definição**
Reduzem a necessidade de escrever expressões completas:
- `a += b;` é equivalente a `a = a + b;` 
- `a *= b;` é equivalente a `a = a * b;`

### **Exemplo**
```java
iint a = 10;
a += 5;  // a = 15
a *= 2;  // a = 30
System.out.println(a);
```
## **6. Expressão Condicional Ternária**
### **Definição**
Alternativa simplificada ao if-else para atribuição de valores.

Sintaxe: `(condição) ? valor_se_verdadeiro : valor_se_falso.`

### **Exemplo**
```java
int preco = 50;
String desconto = (preco > 100) ? "10%" : "5%";
System.out.println(desconto);
```
## **7. Escopo e Inicialização de Variáveis**
### **Definição**
Escopo: a região do programa onde a variável é válida. Se ela for declarada dentro do escopo da funão só será válida dentro da função.
Inicialização: uma variável deve ser inicializada antes de ser usada.

### **Exemplo**
```java
int x;
if (true) {
x = 10;  // Inicialização dentro do escopo
        }
        System.out.println(x);  // OK
```
# Estruturas Repetitivas em Java

Este resumo aborda os principais conceitos e exemplos de estruturas repetitivas em Java. Estas estruturas são usadas para executar blocos de código várias vezes, dependendo de condições específicas.

---

## **1. Estrutura Repetitiva `while`**
### **Definição**
- Repete um bloco de comandos enquanto a condição for verdadeira.
- Usada quando **não se sabe previamente a quantidade de repetições**.

### **Sintaxe**
```java
while (condição) {
    // comandos
}
```
Exemplo
Problema: Somar números inteiros até que seja digitado 0.
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int soma = 0;
int num = sc.nextInt();

while (num != 0) {
    soma += num;
    num = sc.nextInt();
}
System.out.println("Soma: " + soma);
sc.close();
```

## **2. Estrutura Repetitiva `for`**
### **Definição**
   Executa um bloco de comandos para um intervalo de valores.
   Usada quando se sabe previamente a quantidade de repetições.
### **Sintaxe**
```java
for (início; condição; incremento) {
    // comandos
}
```
Exemplo
Problema: Ler N números inteiros e calcular a soma.
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int soma = 0;

for (int i = 0; i < N; i++) {
    int num = sc.nextInt();
    soma += num;
}
System.out.println("Soma: " + soma);
sc.close();
```


## **3. Estrutura Repetitiva `do-while`**
### **Definição**
Executa o bloco de comandos pelo menos uma vez, pois a condição é verificada no final.
```java
do {
        // comandos
        } while (condição);

```
Exemplo
Problema: Converter temperaturas de Celsius para Fahrenheit até o usuário decidir parar.
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
char resposta;

do {
        System.out.print("Digite a temperatura em Celsius: ");
double C = sc.nextDouble();
double F = 9.0 * C / 5.0 + 32.0;
    System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

    System.out.print("Deseja repetir (s/n)? ");
    resposta = sc.next().charAt(0);
} while (resposta != 'n');

        sc.close();
```

# Programação Orientada a Objetos com Java
Primeiramente precisamos ve um código ou problema sem orientação a objetos, para podermos entender a solução com orientação a objetos

Problema: Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):

```java
import java.util.Locale;
import java.util.Scanner;

public class Program {
       public static void main(String[] args) {

          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          double xA, xB, xC, yA, yB, yC;
          
          System.out.println("Enter the measures of triangle X: ");
          xA = sc.nextDouble();
          xB = sc.nextDouble();
          xC = sc.nextDouble();
          
          System.out.println("Enter the measures of triangle Y: ");
          yA = sc.nextDouble();
          yB = sc.nextDouble();
          yC = sc.nextDouble();
          
          double p = (xA + xB + xC) / 2.0;
          double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
          
          p = (yA + yB + yC) / 2.0;
          double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
          
          System.out.printf("Triangle X area: %.4f%n", areaX);
          System.out.printf("Triangle Y area: %.4f%n", areaY);
          
          if (areaX > areaY) {
              System.out.println("Larger area: X");
          } else {
              System.out.println("Larger area: Y");
          }
          
          sc.close();
   }
}
```
Como podemos observar e pontuar no código acima, para representar o triângulo tivemos que usar 3 variáveis diferentes para 
cada lado do triângulo, vou pontuar alguns "defeitos", uso de memória, legibilidade, desempenho...

## Vou apresentar uns conceitos sobre Orientação a Objetos
A programação orientada a objetos (POO) é um paradigma que organiza o código em torno de objetos, que representam entidades do mundo real. Para entender isso em detalhes, precisamos explorar os conceitos de classes, objetos e atributos.
### **Classes, Objetos, Atributos**

### 1. Classes:

#### **Definição**

- Uma classe é um modelo ou molde que define os atributos (características) e métodos (comportamentos) de um objeto.

- Pensa-se nela como uma "receita" ou "plano" para criar objetos.
```java
Estrutura de uma Classe em Java
        
public class Produto {
    // Atributos da classe
    String nome;
    double preco;
    int quantidade;

    // Método da classe
    public double calcularValorTotal() {
        return preco * quantidade;
    }
}

```
#### Componentes de uma Classe
1. Nome: A identidade da classe (Produto, por exemplo).
2. Atributos: Variáveis que armazenam as informações do objeto (classe).
3. Métodos: Funções que definem os comportamentos da classe (objeto).
4. Construtores: Método especial usado para inicializar objetos.

### 2. Objetos:
#### **Definição**

- Um objeto é uma instância de uma classe.
- Cada objeto criado a partir de uma classe pode ter seus próprios valores para os atributos definidos pela classe

```java
Criação de um Objeto
        
public class TestaProduto {
    public static void main(String[] args) {
        // Criando um objeto da classe Produto
        Produto p1 = new Produto();
        
        // Atribuindo valores aos atributos do objeto
        p1.nome = "Notebook";
        p1.preco = 3500.00;
        p1.quantidade = 5;

        // Chamando um método do objeto
        System.out.println("Valor total: " + p1.calcularValorTotal());
    }
}

```

#### Características dos Objetos
- Estado: Determinado pelos valores de seus atributos.
  - Exemplo: nome = "Notebook", preco = 3500.00, quantidade = 5.
- Comportamento: Definido pelos métodos que podem ser chamados no objeto.
  - Exemplo: p1.calcularValorTotal() retorna o valor total no estoque.
- Identidade: Cada objeto tem uma identidade única, mesmo que os valores dos atributos sejam iguais a outro objeto.

### 2. Atributos:
#### **Definição**
- Os atributos são as variáveis que armazenam os dados ou propriedades de um objeto.
- Eles definem o estado de um objeto.

#### **Tipos de Atributos**
1. Atributos de instância: Cada objeto tem sua própria cópia desses atributos.
   - Exemplo: Cada `Produto` pode ter valores diferentes para `nome`, `preco` e `quantidade`.
2. Atributos estáticos: Pertencem à classe e não a objetos individuais.

Exemplo
```java
public static double taxaDesconto;
```
### Modificadores de Acesso ###
`public`: Atributo acessível de qualquer lugar.

`private`: Atributo acessível apenas dentro da própria classe (boa prática).



# **Resumo: Relação Entre Classe, Objeto e Atributos**

| **Termo**  | **Descrição**                                   | **Exemplo**                 |
|------------|--------------------------------------------------|-----------------------------|
| **Classe** | Modelo para criar objetos                        | `Produto`                   |
| **Objeto** | Instância de uma classe                          | `Produto p1 = new Produto();` |
| **Atributo** | Característica que define o estado do objeto  | `nome`, `preco`, `quantidade` |

## **Exemplo Prático**

### **Classe Produto**
```java
public class Produto {
    // Atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor para inicializar os atributos
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos para acessar os atributos (Getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método para calcular valor total no estoque
    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
```
Criação de um Objeto

```java
public class TestaProduto {
    public static void main(String[] args) {
        // Criando um objeto da classe Produto
        Produto p1 = new Produto("Notebook", 3500.00, 5);

        // Exibindo informações sobre o produto
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Quantidade: " + p1.getQuantidade());
        System.out.println("Valor Total: " + p1.calcularValorTotal());
    }
}
```

## Resumo: Construtores, Palavra `this`, Sobrecarga e Encapsulamento

### 1. **Construtores**
- Executam durante a instanciação do objeto.
- Usos principais:
    - Iniciar valores dos atributos.
    - Exigir que o objeto receba dados ao ser criado.
- Se um construtor personalizado não for especificado, a classe fornece um construtor padrão:
  ```java
  Product p = new Product();
  ```
- Possibilidade de sobrecarga de construtores (vários construtores com diferentes listas de parâmetros):
  ```java
  public Product(String name, double price) {
      this.name = name;
      this.price = price;
  }
  ```

### 2. **Palavra `this`**
- Referência ao próprio objeto.
- Usos comuns:
    - Diferenciar atributos de variáveis locais.
    - Passar o objeto atual como argumento para métodos.

Exemplo para diferenciar atributos locais:
```java
public Product(String name, double price) {
    this.name = name;
    this.price = price;
}
```

### 3. **Sobrecarga**
- Permite que uma classe tenha métodos ou construtores com o mesmo nome, mas diferentes listas de parâmetros.

Exemplo:
```java
public Product(String name, double price) { ... }
public Product(String name) { ... }
```

### 4. **Encapsulamento**
- Oculta os detalhes de implementação de uma classe, expondo apenas operações seguras.

#### Princípios:
- Manter o estado dos objetos consistente.
- Proteger atributos com modificadores de acesso (`private`, `public`, etc.).
- Utilizar **getters** e **setters** para acessar atributos privados:

Exemplo:
```java
private String name;
private double price;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

### 5. **Modificadores de Acesso**
- `private`: acesso apenas dentro da classe.
- `protected`: acesso no mesmo pacote e em subclasses.
- `(default)`: acesso no mesmo pacote.
- `public`: acesso em qualquer classe.

### Exercício Prático
**Sistema bancário:**
- Cadastro de conta bancária com opção de valor inicial.
- Operações: Depósito, Saque (com taxa).
- Controle de saldo usando princípios de encapsulamento e sobrecarga de construtores.

**Exemplo:**
```text
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00

Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00
```

## Resumo: Memória, Arrays e Listas em Java

### **1. Tipos de Dados em Java**
- **Tipos Referência**: Variáveis que armazenam endereços para objetos na memória.
- **Tipos Valor (Primitivos)**: Variáveis que armazenam diretamente os dados.

![estrutuar de uma aplicação](assets/images/referencia-valor.png)

### **2. Gestão de Memória**
- **Garbage Collector**: Automatiza a liberação de memória desalocando objetos que não têm mais referências.
- **Escopo Local**: Variáveis locais são desalocadas assim que seu escopo termina.

### **3. Arrays - (Vetores)**
- Em programação, "vetor" é o nome dado a arranjos unidimensionais.
- Estruturas homogêneas e ordenadas que armazenam elementos do mesmo tipo.
- **Propriedades:**
    - **Tamanho fixo**: definido na criação.
    - **Acesso imediato**: elementos acessíveis por índices.
     - Alocada de uma vez só, em um bloco contíguo de memória
- **Vantagens:**
   - Acesso imediato aos elementos pela sua posição
- **Desvantagens:**
    - Tamanho fixo
    - Dificuldade para se realizar inserções e deleções.
- **Exemplos:**
    - Armazenar alturas de pessoas e calcular a média.
    - Armazenar dados de produtos e calcular o preço médio.

### **4. Listas**
- Estruturas ordenadas com tamanho variável, alocadas sob demanda.
- **Implementações Comuns:** `ArrayList`, `LinkedList`.
- **Operações:**
    - Adicionar, remover, acessar elementos.
    - Filtrar e buscar com expressões lambda.

### **5. Matrizes**
- Estruturas bidimensionais (vetor de vetores).
- **Vantagens:** Acesso imediato por posições.
- **Exercícios Práticos:**
    - Mostrar a diagonal principal de uma matriz.
    - Identificar valores adjacentes a um elemento específico.

### **Exercícios Práticos**
- **Aluguel de Quartos:** Gerenciamento de ocupação.
- **Cadastro e Aumento de Salário:** Manipulação de dados de funcionários.
- **Manipulação de Matrizes:** Busca de valores adjacentes e análise de dados.






















## **Estrutura **
### **Definição** 