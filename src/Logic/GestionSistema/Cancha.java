package Logic.GestionSistema;

import Logic.Usuario.Estudiante;

public class Cancha {

    private int codigo;
    private boolean estado;
    private Estudiante estudiante;

    public Cancha (int codigo, boolean estado, Estudiante estudiante) {

        this.codigo = codigo;
        this.estado = false;
        this.estudiante = estudiante;
    }

    public int getCodigo() {

        return this.codigo;
    }

    public boolean getEstado() {

        return this.estado;
    }

    public Estudiante getEstudiante() {

        return estudiante;
    }
}
