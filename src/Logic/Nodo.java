package Logic;

public class Nodo {

    private Cancha cancha;
    private Nodo next;

    /**
     * Contructor del nodo
     * @param cancha instancia de la clase Cancha
     * @param next siempre inicializarse como null
     */
    public Nodo(Cancha cancha, Nodo next) {

        this.cancha = cancha;
        this.next = next;
    }
    
    public void setCancha(Cancha cancha) {

        this.cancha = cancha;
    }

    public Cancha getCancha() {

        return this.cancha;
    }

    public void setNext(Nodo next) {

        this.next = next;
    }

    public Nodo getNext() {

        return this.next;
    }
}
