package ejercicio3;

public abstract class IObserver {

    public IObserver(boolean soloVideos) {

        this.soloVideos = soloVideos;
    }

    boolean soloVideos;

    public abstract void update(String msg);

    public boolean isSoloVideos() {
        return soloVideos;
    }
}
