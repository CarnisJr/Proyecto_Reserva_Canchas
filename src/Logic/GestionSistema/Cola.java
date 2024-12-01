package Logic.GestionSistema;

import javax.swing.*;

public class Cola {

    private NodoCola inicio;
    private NodoCola fin;
    private int cantidad;

    public Cola() {

        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

    public boolean isEmpty(){

        return this.inicio == null && this.fin == null;
    }

    public void agregarElemento(JFrame frame){

        NodoCola nuevoNodo = new NodoCola(frame);

        if(this.isEmpty()){

            this.inicio = this.fin = nuevoNodo;
        }else{

            this.fin.setNext(nuevoNodo);
            this.fin = nuevoNodo;
        }
    }

    public JFrame quitarElemento(){

        NodoCola aux = this.inicio;

        if(isEmpty()){

            JOptionPane.showMessageDialog(null, "El cola esta vacio");
            return null;
        }else{

            if(this.inicio == this.fin){

                this.inicio = this.fin = null;
                agregarElemento(aux.getFrame());
                return aux.getFrame();
            }else{

                aux = this.inicio;
                this.inicio = this.inicio.getNext();
                agregarElemento(aux.getFrame());
                return aux.getFrame();
            }
        }
    }
}
