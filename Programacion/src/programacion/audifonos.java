package programacion;

public class audifonos {

    private boolean cableado;
    private boolean encendido;
    private boolean conectado;
    private boolean reproducir;
    private int volumen = 20;
    private int cambioCancion = 10;

    public void setCableado(boolean cable) {
        cableado = cable;
    }

    public void setEncendido(boolean prendido) {
        encendido = prendido;
    }

    public void setConectado(boolean conect) {
        if (encendido = true) {
            conectado = conect;
        }
    }

    public void setReproduciendo(boolean play) {
        if (conectado = true) {
            reproducir = play;
        }
    }

    public void setVolumenMas() {
        if (conectado = true) {
            volumen = volumen + 1;
        }
    }

    public void setVolumenMin() {
        if (conectado = true) {
            volumen = volumen - 1;
        }
    }

    public void setSigCancion() {
        if (conectado == true) {
            if (cambioCancion == 1) {
                cambioCancion = cambioCancion + 1;
            }
        }
    }

    public void setAntCancion() {
        if (conectado == true) {
            if (cambioCancion == 2) {
                cambioCancion = cambioCancion - 1;
            }
        }
    }

    public boolean getCableado() {
        return cableado;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public boolean getConectado() {
        return conectado;
    }

    public boolean getReproduciendo() {
        return reproducir;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getCancion() {
        return cambioCancion;
    }
}
