package dev.aluno.datastructures.list.tests;

import dev.aluno.datastructures.list.MyLinkedList;

public class MyLinkedListTests {

    private static int passed = 0;
    private static int failed = 0;

    private static void assertTrue(String testName, boolean condition) {
        if (condition) {
            System.out.println("  [OK] " + testName);
            passed++;
        } else {
            System.out.println("  [ERRO] " + testName);
            failed++;
        }
    }

    private static void testSizeAndEmpty() {
        System.out.println("\n--- size() / isEmpty() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        assertTrue("Lista nova tem tamanho 0", list.size() == 0);
        assertTrue("Lista nova está vazia", list.isEmpty());

        list.addFirst(10);
        assertTrue("Após addFirst tamanho é 1", list.size() == 1);
        assertTrue("Lista não está vazia após inserção", !list.isEmpty());
    }

    private static void testAddFirst() {
        System.out.println("\n--- addFirst() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        assertTrue("Primeiro elemento é 10", list.get(0) == 10);
        assertTrue("Segundo elemento é 20", list.get(1) == 20);
        assertTrue("Último elemento é 30", list.get(2) == 30);
        assertTrue("Tamanho é 3", list.size() == 3);
        System.out.println("  Lista: " + list);
    }

    private static void testAddLast() {
        System.out.println("\n--- addLast() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertTrue("Primeiro elemento é 10", list.get(0) == 10);
        assertTrue("Último elemento é 30", list.get(2) == 30);
        assertTrue("Tamanho é 3", list.size() == 3);
        System.out.println("  Lista: " + list);
    }

    private static void testInsertAt() {
        System.out.println("\n--- insertAt() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(30);
        list.insertAt(1, 20);

        assertTrue("Elemento no índice 0 é 10", list.get(0) == 10);
        assertTrue("Elemento no índice 1 é 20", list.get(1) == 20);
        assertTrue("Elemento no índice 2 é 30", list.get(2) == 30);
        assertTrue("Tamanho é 3", list.size() == 3);
        System.out.println("  Lista: " + list);

        list.insertAt(0, 5);
        assertTrue("Novo início é 5", list.get(0) == 5);

        list.insertAt(list.size(), 99);
        assertTrue("Novo final é 99", list.get(list.size() - 1) == 99);
    }

    private static void testAddSorted() {
        System.out.println("\n--- addSorted() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addSorted(30);
        list.addSorted(10);
        list.addSorted(20);
        list.addSorted(5);
        list.addSorted(40);

        assertTrue("Índice 0 é 5", list.get(0) == 5);
        assertTrue("Índice 1 é 10", list.get(1) == 10);
        assertTrue("Índice 2 é 20", list.get(2) == 20);
        assertTrue("Índice 3 é 30", list.get(3) == 30);
        assertTrue("Índice 4 é 40", list.get(4) == 40);
        assertTrue("Tamanho é 5", list.size() == 5);
        System.out.println("  Lista: " + list);
    }

    private static void testRemoveFirst() {
        System.out.println("\n--- removeFirst() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        int removed = list.removeFirst();
        assertTrue("Valor removido é 10", removed == 10);
        assertTrue("Novo início é 20", list.get(0) == 20);
        assertTrue("Tamanho agora é 2", list.size() == 2);

        list.removeFirst();
        list.removeFirst();
        assertTrue("Lista está vazia", list.isEmpty());
    }

    private static void testRemoveLast() {
        System.out.println("\n--- removeLast() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        int removed = list.removeLast();
        assertTrue("Valor removido é 30", removed == 30);
        assertTrue("Novo final é 20", list.get(list.size() - 1) == 20);
        assertTrue("Tamanho agora é 2", list.size() == 2);

        list.removeLast();
        list.removeLast();
        assertTrue("Lista está vazia", list.isEmpty());
    }

    private static void testRemoveAt() {
        System.out.println("\n--- removeAt() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        int removed = list.removeAt(1);
        assertTrue("Valor removido é 20", removed == 20);
        assertTrue("Elemento no índice 1 agora é 30", list.get(1) == 30);
        assertTrue("Tamanho agora é 3", list.size() == 3);
        System.out.println("  Lista após removeAt(1): " + list);
    }

    private static void testRemoveByValue() {
        System.out.println("\n--- remove(element) ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertTrue("remove(20) retorna verdadeiro", list.remove(20));
        assertTrue("remove(99) retorna falso", !list.remove(99));
        assertTrue("Tamanho agora é 2", list.size() == 2);
        System.out.println("  Lista após remove(20): " + list);
    }

    private static void testFind() {
        System.out.println("\n--- find() ---");
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addLast("apple");
        list.addLast("banana");
        list.addLast("cherry");

        assertTrue("find 'banana' -> 1", list.find("banana") == 1);
        assertTrue("find 'apple' -> 0", list.find("apple") == 0);
        assertTrue("find 'cherry' -> 2", list.find("cherry") == 2);
        assertTrue("find 'grape' -> -1", list.find("grape") == -1);
    }

    private static void testGetAndSet() {
        System.out.println("\n--- get() / set() ---");
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addLast("first");
        list.addLast("second");
        list.addLast("third");

        assertTrue("get(0) é 'first'", "first".equals(list.get(0)));
        assertTrue("get(2) é 'third'", "third".equals(list.get(2)));

        list.set(1, "SECOND");
        assertTrue("set(1) alterou para 'SECOND'", "SECOND".equals(list.get(1)));
    }

    private static void testClear() {
        System.out.println("\n--- clear() ---");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.clear();

        assertTrue("Tamanho é 0 após clear", list.size() == 0);
        assertTrue("Lista está vazia após clear", list.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  MyLinkedList — Suíte de Testes");
        System.out.println("========================================");

        testSizeAndEmpty();
        testAddFirst();
        testAddLast();
        testInsertAt();
        testAddSorted();
        testRemoveFirst();
        testRemoveLast();
        testRemoveAt();
        testRemoveByValue();
        testFind();
        testGetAndSet();
        testClear();

        System.out.println("\n========================================");
        System.out.printf("  Resultados: %d passaram, %d falharam%n", passed, failed);
        System.out.println("========================================");
    }
}