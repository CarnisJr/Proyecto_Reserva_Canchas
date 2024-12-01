package Logic.GestionSistema;

import javax.swing.*;

public class NodoCola {

    private JFrame frame = new JFrame();
    private NodoCola next;

    public NodoCola(JFrame frame) {

        this.frame = frame;
        this.next = null;
    }

    public JFrame getFrame() {

        return frame;
    }

    public void setFrame(JFrame frame) {

        this.frame = frame;
    }

    public NodoCola getNext() {

        return next;
    }

    public void setNext(NodoCola next) {

        this.next = next;
    }
}
