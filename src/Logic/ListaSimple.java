package Logic;

import javax.swing.*;

public class ListaSimple {

    private Nodo inicio;
    private int tamanio;

    public ListaSimple() {

        this.inicio = null;
        this.tamanio = 0;
    }

    public boolean isEmpty(){

        return this.inicio == null;
    }

    /**
     * Agrega un nodo a la lista
     * @param n instancia de la clase Nodo
     */
    public void agregarElemento(Nodo n){

        Nodo aux = this.inicio;

        if(isEmpty()){

            this.inicio = n;
            tamanio++;
        }else{

            while(aux.getNext() != null){

                aux = aux.getNext();
            }

            aux.setNext(n);
            tamanio++;
        }
    }

    /**
     * Mostrar elementos. Provisional el text area
     * @param textArea instancia de JTextArea
     */
    public void mostrarElementos(JTextArea textArea){

        Nodo aux = this.inicio;
        StringBuilder str = new StringBuilder();

        while(aux != null){

            str.append(aux.getCancha().getCodigo()).append("\n");
            aux = aux.getNext();
        }

        textArea.setText(str.toString());
    }
}
