package ejercicio1;

public class Archivo {

    private String texto;
    private String state;

    public Archivo(String texto, String state) {

        this.texto = texto;
        this.state = state;

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void showInfo() {
        System.out.println(texto);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
