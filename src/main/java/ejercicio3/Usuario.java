package ejercicio3;

public class Usuario implements IObserver{

    private String nombre;
    public boolean soloVideos;

    public Usuario(String nombre, boolean soloVideos) {

        this.nombre = nombre;
        this.soloVideos = soloVideos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSoloVideos(boolean soloVideos) {
        this.soloVideos = soloVideos;
    }

    @Override
    public void update(String msg) {

        System.out.println(nombre + "recibe notificacion");
        System.out.println("MSG: " + msg);
    }

    @Override
    public boolean isSoloVideo() {
        return isSoloVideo();
    }
}
