package ejercicio1;

public class Archivo {

    private String texto;
    private String state;
    Caretaker1 caretaker = new Caretaker1();
    Originator1 originator = new Originator1();

    public Archivo(String texto, String state) {

        this.texto = texto;
        if (texto.length() < 5) {
            System.out.println("No se cumple con el minimo de palabras, no es posible realizar versionamiento");
        } else {
            this.state = state;
            originator.setMemento(this);
            caretaker.addMemento(originator.createMemento());
        }
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

    public Caretaker1 getCaretaker() {
        return caretaker;
    }

    public Originator1 getOriginator() {
        return originator;
    }
}
