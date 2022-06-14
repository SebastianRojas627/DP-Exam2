package ejercicio3;

public class Client {

    public static void main(String[] args) {

        PaginaWeb paginaWeb = new PaginaWeb();

        paginaWeb.attach(new Usuario("Diego", false));
        paginaWeb.attach(new Usuario("Mateo", false));
        paginaWeb.attach(new Usuario("Mauricio", true));
        paginaWeb.attach(new Usuario("Fernando", true));
        paginaWeb.attach(new Usuario("Manuel", true));

        paginaWeb.subirImagen();
        paginaWeb.subirVideo();

    }
}
