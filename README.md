# 📚 BookList TAD - Java

Este repositório contém a implementação completa de um **Tipo Abstrato de Dados (TAD)** para gerenciamento de um acervo de livros, desenvolvido para a disciplina de Estrutura de Dados.

## 🚀 Sobre o Projeto

A aplicação utiliza uma **lista sequencial (array estático)** para armazenar IDs de livros (tipo `int`). O foco principal é a manipulação direta de índices e a garantia de que a lista permaneça compactada através de operações de deslocamento (*shift*).

### Funcionalidades Principais:
* **Inserção Adaptativa:** Adição no início (Prioridade), no final, em posições específicas ou de forma ordenada por ID.
* **Remoção com Shift:** Remoção de livros garantindo que não fiquem "buracos" no array.
* **Busca e Acesso:** Localização de itens por ID e acesso direto via índice.
* **Estado do Sistema:** Verificação de capacidade máxima e total de itens inseridos.

---

## 🛠️ Tecnologias e Conceitos

* **Linguagem:** Java 17+
* **Estrutura de Dados:** Lista Sequencial (Vetor)
* **Conceitos:** Interfaces, Encapsulamento, Deslocamento de Memória (Shifting) e Complexidade de Algoritmos.

---

## 📂 Estrutura do Código

1.  **`BookListTAD.java`**: Interface que define o contrato com os métodos de manipulação.
2.  **`BookList.java`**: Implementação concreta com lógica de deslocamento de elementos.
3.  **`Main.java`**: Interface de usuário via console para testes em tempo real.

---

## 📈 Análise de Complexidade das Operações

| Operação | Complexidade | Justificativa |
| :--- | :--- | :--- |
| **addLast / removeLast** | $O(1)$ | Acesso direto ao final da lista via contador. |
| **addFirst / removeFirst** | $O(n)$ | Exige o deslocamento de todos os elementos existentes. |
| **insertAt / removeAt** | $O(n)$ | Deslocamento proporcional à posição escolhida. |
| **find (Busca)** | $O(n)$ | Varredura linear até encontrar o ID solicitado. |
| **get / set** | $O(1)$ | Acesso direto ao índice do array. |

---

## 📝 Exemplo de Log de Execução

```text
--- SISTEMA DE BIBLIOTECA ---
[+] Livro 101 adicionado ao final.
[+] Livro 102 adicionado ao final.
[+] Livro 100 inserido no início.

--- ACERVO ATUAL ---
[ ID:100 ID:101 ID:102 ]
--------------------

[-] Livro 100 removido do início. (Elementos movidos para a esquerda)
