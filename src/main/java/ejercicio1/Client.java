package ejercicio1;

import behavioral.memento.structure.Originator;

public class Client {

    public static void main(String[] args) {

        Caretaker1 caretaker = new Caretaker1();
        Originator1 originator = new Originator1();

        Archivo archivo;

        archivo = new Archivo("Este archivo es una prueba", "version1");
        originator.setMemento(archivo);
        caretaker.addMemento(originator.createMemento());
        archivo = new Archivo("el exito solo depende de tu esfuerzo", "version2");
        originator.setMemento(archivo);
        caretaker.addMemento(originator.createMemento());
        archivo = new Archivo("prologo", "version3");
        originator.setMemento(archivo);
        caretaker.addMemento(originator.createMemento());
        archivo = new Archivo("este documento fue actualizado satisfactoriamente", "version4");
        originator.setMemento(archivo);
        caretaker.addMemento(originator.createMemento());

        archivo = originator.restoreMemento(caretaker.getMemento("version1"));
        System.out.println("texto actual: ");
        archivo.showInfo();

    }

}
