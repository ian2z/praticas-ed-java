package listaligada;

public class ListaLigada {
    private No primeiro;

    public ListaLigada() {
        this.primeiro = null;
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    public void remover(int valor) {
        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }
        if (primeiro.getDado() == valor) {
            primeiro = primeiro.getProximo();
            return;
        }

        No atual = primeiro;
        No anterior = null;

        while (atual != null && atual.getDado() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual == null) {
            System.out.println("Valor não encontrado.");
            return;
        }
        anterior.setProximo(atual.getProximo());
    }

    public void exibir() {
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getProximo();
        }
    }
}
