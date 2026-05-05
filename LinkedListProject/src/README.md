![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge&logo=github)
![Status](https://img.shields.io/badge/status-Completo-brightgreen?style=for-the-badge)
![Estrutura de Dados](https://img.shields.io/badge/Estrutura%20de%20Dados-Lista%20Encadeada-blue?style=for-the-badge)

# 📚 ED — Implementação de Lista Encadeada em Java

Este projeto apresenta a implementação de uma **Lista Dinâmica Encadeada (Linked List)** utilizando **Java**, desenvolvida manualmente **sem o uso de estruturas prontas da linguagem**.

A lista é genérica (`<T>`), permitindo armazenar qualquer tipo de dado, com suporte a operações completas de inserção, remoção, busca e manipulação.

---

# 🧠 Estrutura do Projeto

## 📌 Interface (TAD)
Arquivo: `MyList.java`

Define o contrato da estrutura seguindo o conceito de **Tipo Abstrato de Dados (TAD)**:

- Inserção
- Remoção
- Consulta
- Atualização
- Busca
- Controle de tamanho

---

## ⚙️ Implementação
Arquivo: `MyLinkedList.java`

Responsável pela implementação da lista encadeada.

### 🔹 Estrutura Interna:
- `Node<T>` → Classe interna que representa cada nó da lista
- `head` → Referência para o primeiro elemento
- `tail` → Referência para o último elemento
- `size` → Quantidade de elementos

---

## 🧪 Testes
Arquivo: `MyLinkedListTests.java`

Classe responsável por validar todas as operações da lista, simulando um ambiente de testes com saída no terminal.

---

# 🚀 Funcionalidades

## ➕ Inserção
- `addFirst(T element)` → Insere no início
- `addLast(T element)` → Insere no final
- `insertAt(int index, T element)` → Insere em posição específica
- `addSorted(T element)` → Insere mantendo ordenação

## ➖ Remoção
- `removeFirst()` → Remove o primeiro elemento
- `removeLast()` → Remove o último elemento
- `removeAt(int index)` → Remove por posição
- `remove(T element)` → Remove por valor

## 🔍 Busca e Consulta
- `find(T element)` → Retorna o índice do elemento
- `get(int index)` → Retorna elemento pela posição
- `size()` → Retorna o tamanho da lista

## 🔄 Atualização
- `set(int index, T element)` → Atualiza valor em uma posição

## 🧹 Controle
- `clear()` → Remove todos os elementos
- `isEmpty()` → Verifica se está vazia

---

# 🧠 Conceitos Aplicados

- Lista Encadeada (Linked List)
- Tipo Abstrato de Dados (TAD)
- Generics em Java (`<T>`)
- Estruturas dinâmicas
- Manipulação de referências (ponteiros)
- Encapsulamento
- Separação entre interface e implementação
- Tratamento de exceções

---

# ⚙️ Tecnologias

- Java (JDK 17+ ou superior)
- IntelliJ IDEA
- Git
- GitHub

---

# ▶️ Como Executar

1. Clonar o repositório:

   git clone https://github.com/SEU-USUARIO/LinkedListProject.git

2. Entrar na pasta:

   cd LinkedListProject

3. Compilar:

   javac dev/aluno/datastructures/list/*.java dev/aluno/datastructures/list/tests/*.java

4. Executar os testes:

   java dev.aluno.datastructures.list.tests.MyLinkedListTests

---

# 🎯 Objetivo

Projeto desenvolvido para fins acadêmicos com o objetivo de **compreender o funcionamento interno de listas encadeadas**, sem utilizar estruturas prontas da linguagem.

A proposta reforça o domínio de:

- Lógica de programação
- Estruturas de dados
- Organização de código
- Programação orientada a objetos

---

# 💡 Diferenciais do Projeto

- Implementação manual completa de lista encadeada
- Uso de Generics (`<T>`)
- Separação clara entre **interface (TAD)** e **implementação**
- Testes automatizados via terminal
- Tratamento de erros (índices inválidos, lista vazia, etc.)
- Código limpo e didático

---

# 👨‍💻 Autor

Carlos Sales