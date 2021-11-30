public class Contacto {
    String nombre, apellido;
    int casa, celular, trabajo, otro1, otro2;

    public Contacto(String nombre, String apellido, int casa, int celular, int trabajo, int otro1, int otro2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
        this.celular = celular;
        this.trabajo = trabajo;
        this.otro1 = otro1;
        this.otro2 = otro2;
    }

    public Contacto(String nombre, String apellido, int casa, int celular, int trabajo, int otro1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
        this.celular = celular;
        this.trabajo = trabajo;
        this.otro1 = otro1;
        this.otro2 = 0;
    }

    public Contacto(String nombre, String apellido, int casa, int celular, int trabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
        this.celular = celular;
        this.trabajo = trabajo;
        this.otro1 = 0;
        this.otro2 = 0;
    }

    public Contacto(String nombre, String apellido, int casa, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
        this.celular = celular;
        this.trabajo = 0;
        this.otro1 = 0;
        this.otro2 = 0;
    }

    public Contacto(String nombre, String apellido, int casa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
        this.celular = 0;
        this.trabajo = 0;
        this.otro1 = 0;
        this.otro2 = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public int getOtro1() {
        return otro1;
    }

    public void setOtro1(int otro1) {
        this.otro1 = otro1;
    }

    public int getOtro2() {
        return otro2;
    }

    public void setOtro2(int otro2) {
        this.otro2 = otro2;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", casa=" + casa +
                ", celular=" + celular +
                ", trabajo=" + trabajo +
                ", otro1=" + otro1 +
                ", otro2=" + otro2 +
                '}';
    }
}
