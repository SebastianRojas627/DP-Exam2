package ejercicio3;

public class Usuario extends IObserver{

    private String nombre;

    public Usuario(String nombre, boolean soloVideos) {
        super(soloVideos);
        this.nombre = nombre;
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

}
