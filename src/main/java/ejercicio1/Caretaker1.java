package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Caretaker1 {

    private Map<String, Memento1> states = new HashMap<String, Memento1>();
    private int version = 1;

    public void addMemento(Memento1 m) {

        states.put("version" + version, m);
        version++;
    }

    public Memento1 getMemento(String position) {
        return states.get(position);
    }


}