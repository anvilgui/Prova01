import java.util.LinkedList;

public class ListaLigada extends LinkedList {

    public boolean inverte(){

        LinkedList listaInvertida = new LinkedList();
        for (int i = this.size() - 1; i >= 0; i--) {
            listaInvertida.add(this.get(i));
        }

        for (int i = 0; i < listaInvertida.size(); i++) {
            this.set(i , listaInvertida.get(i));
        }
        return true;
    }

    public boolean intercalar(LinkedList list) {
        for (int i = this.size() - 1; i >= 0; i--) {
            this.add(i, list.get(i));
        }
        return true;
    }

    public boolean unir(LinkedList list) {
        int var = this.size();
        for (int i = 0; i <= list.size() - 1; i++) {
            this.add(var, list.get(i));
            var++;
        }
        return true;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        int teste = this.size() - 1;

        for (int i = 0; i < this.size(); i++) {
            s.append(this.get(i));
            if (i != teste) {
                s.append(" ");
            }
        }

        s.append("]");

        return s.toString();
    }
}