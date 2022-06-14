package ejercicio1;

import behavioral.memento.structure.Originator;

public class Client {

    public static void main(String[] args) {

        Archivo archivo;

        archivo = new Archivo("Este archivo es una prueba", "version1");
        archivo = new Archivo("el exito solo depende de tu esfuerzo", "version2");
        archivo = new Archivo("prologo", "version3");
        archivo = new Archivo("este documento fue actualizado satisfactoriamente", "version4");

        archivo = archivo.getOriginator().restoreMemento(archivo.getCaretaker().getMemento(1));
        System.out.println("*************VALORES ACTUALES ********************");
        archivo.showInfo();

    }

}
