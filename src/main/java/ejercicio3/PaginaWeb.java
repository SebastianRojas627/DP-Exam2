package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements ISubject {

    private List<IObserver> observers = new ArrayList<>();

    public void subirVideo() {
        System.out.println("Subiendo nuevo video");
        this.notifyObservers("Nuevo video", true);
    }

    public void subirImagen() {
        System.out.println("Subiendo nueva imagen");
        this.notifyObservers("Nueva imagen", false);
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ejercicio3.IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg, boolean video) {

        if (video) {
            for (IObserver obs : observers) {
                obs.update("INFO> Evento " + msg);
            }
        } else {
            for (IObserver obs : observers) {
                if(obs.isSoloVideos())
                obs.update("INFO> Evento " + msg);
            }
        }
    }
}
