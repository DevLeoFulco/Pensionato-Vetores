# README - Vetores e Manipulação de Índices

## Conceitos de Vetores e Manipulação de Índices

### Vetores (Arrays)
Em programação, um vetor (ou array) é uma estrutura de dados que armazena elementos do mesmo tipo em posições contíguas na memória. Os elementos são acessados por meio de um índice que representa sua posição no vetor. No Java, os vetores têm um tamanho fixo quando são criados e podem armazenar objetos ou tipos primitivos.

### Manipulação de Índices
A manipulação de índices refere-se ao processo de acessar e modificar elementos em um vetor através de seus índices. Os índices em Java começam do zero, ou seja, o primeiro elemento tem índice 0, o segundo tem índice 1 e assim por diante. Manipular índices é fundamental para realizar operações como inserção, remoção e atualização de elementos em um vetor.

## Aplicação no Código

### 1. Declaração e Inicialização de um Vetor
```java
Rent[] vet = new Rent[10];
```
No código fornecido, um vetor chamado `vet` é declarado para armazenar instâncias da classe `Rent`. O tamanho do vetor é definido como 10.

### 2. Loop para Preencher o Vetor
```java
for (int i=1; i<=n; i++) {
    // ...
    vet[numeroQuarto] = new Rent(nome, email);
}
```
Um loop é utilizado para preencher o vetor com instâncias da classe `Rent`. O usuário fornece o número do quarto, que é utilizado como índice para armazenar a informação do aluguel no vetor.

### 3. Impressão dos Quartos Ocupados
```java
for (int i=0; i<10; i++) {
    if (vet[i] != null) {
        System.out.println(i + ": " + vet[i]);
    }
}
```
Outro loop é utilizado para percorrer o vetor e imprimir os quartos ocupados. A verificação `vet[i] != null` é realizada para garantir que apenas os quartos ocupados sejam impressos.

## Conclusão
O código exemplifica a utilização de vetores em Java para armazenar informações sobre quartos alugados. A manipulação de índices é crucial para acessar, inserir e verificar elementos no vetor, permitindo uma organização eficiente e fácil recuperação de dados. Este README fornece uma breve visão dos conceitos aplicados no código disponibilizado.
