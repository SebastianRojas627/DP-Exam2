package ejercicio1;

public class Memento1 {

    private Archivo state;

    public Memento1(Archivo concreteObject) {
        state = concreteObject;
    }

    public Archivo getState() {
        return state;
    }
}
