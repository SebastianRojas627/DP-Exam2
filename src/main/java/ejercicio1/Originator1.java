package ejercicio1;

public class Originator1 {

    private Archivo state;

    public void setMemento(Archivo state) {

        System.out.println("Originator> set state" + state.getState());
        this.state = state;
    }

    public Memento1 createMemento() {

        return new Memento1(state);
    }

    public Archivo restoreMemento(Memento1 m) {
        this.state = m.getState();
        return this.state;
    }
}
