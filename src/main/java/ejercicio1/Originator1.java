package ejercicio1;

public class Originator1 {

    private Archivo state;

    public void setMemento(Archivo state) {

        if(state.getTexto().length() > 4) {
            System.out.println("Originator> set state" + state.getState());
            this.state = state;
        } else {

            System.out.println("No se tiene el minimo de palabras requeridas para realizar un versionamiento");
        }
    }

    public Memento1 createMemento() {

        return new Memento1(state);
    }

    public Archivo restoreMemento(Memento1 m) {
        this.state = m.getState();
        return this.state;
    }
}
