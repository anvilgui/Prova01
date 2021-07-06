import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista(5);
        Lista listaA = new Lista(5);
        ArrayList listaB = new ArrayList();

        lista.adiciona(5);
        lista.adiciona(21);
        lista.adiciona(13);

        System.out.print("1.");
        System.out.println("Lista atual: " + lista);
        lista.inverte();
        System.out.println("Lista invertida: " + lista);

        listaA.add(3);
        listaA.add(6);
        listaA.add(9);

        System.out.print("Lista atual: ");

        System.out.print("[ ");
        for (int i = 0; i < listaA.size() ; i++) {
            System.out.print(listaA.get(i)+ " ");
        }
        System.out.print("]\n");

        listaB.add(1);
        listaB.add(2);
        listaB.add(7);
        listaB.add(15);
        listaB.add(19);

        System.out.print("Lista por parâmetro: ");

        listaA.intercalar(listaB);
        System.out.print("[");
        for (int i = 0; i < listaA.size() ; i++) {
            System.out.print(listaA.get(i)+ " ");
        }
        System.out.print("]\n");

        System.out.print("\n2.");

        ListaPilha listaPilha = new ListaPilha<>();

        listaPilha.adicionar("Rosa");
        listaPilha.adicionar("Roxo");
        listaPilha.adicionar("Azul");
        listaPilha.adicionar("Amarelo");
        listaPilha.adicionar("Cinza");

        System.out.println("Elementos: " + listaPilha);

        listaPilha.remover();

        System.out.println("Último elemento removido: " + listaPilha+ "\n");

        listaPilha.adicionar("Vermelho");
        listaPilha.adicionar("Verde");

        System.out.println("Elementos add: " + listaPilha);

        listaPilha.remover();

        System.out.println("Último elemento removido: " + listaPilha);

        System.out.print("\n3.a)");

        ListaLigada listaLigada = new ListaLigada();
        ListaLigada listaIntercalar = new ListaLigada();

        listaLigada.add(5);
        listaLigada.add(8);
        listaLigada.add(13);
        listaLigada.add(16);
        listaLigada.add(19);

        System.out.println("Lista atual: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista invertida: " + listaLigada);

        listaIntercalar.add(8);
        listaIntercalar.add(10);
        listaIntercalar.add(15);
        listaIntercalar.add(20);
        listaIntercalar.add(25);

        listaLigada.intercalar(listaIntercalar);

        System.out.println("\nLista intercalada: " + listaLigada);

        System.out.print("\n3.b)");

        ListaLigada novaLista = new ListaLigada();

        novaLista.add(1);
        novaLista.add(2);
        novaLista.add(3);
        novaLista.add(4);
        novaLista.add(7);

        System.out.println("Nova lista 1: " + novaLista);
        novaLista.unir(listaIntercalar);
        System.out.println("Nova lista 2: " + novaLista);

    }
}