package discostu;

public class MP3 {

    private Setlis [] setlist;
    public int volumen;
    
    
    public MP3 () {
        this.setlist = new Setlis[4];
        for (int i = 0; i < 5; i++) {
            setlist[i] = new Setlis(i);
        }
    }
    
    public void crearCancion(Cancion cancion, int lista) {
        // TODO implement here
    }

    public Setlis agregarBiblioteca(int id) {
        // TODO implement here
        return null;
    }

    public Cancion buscarCancion(String nombre) {
        // TODO implement here
        return null;
    }

    public Cancion reproducirCancion(String nombre) {
        // TODO implement here
        return null;
    }

    public void eliminarCancion(String nombre) {
        // TODO implement here

    }

    public Cancion pausarYReanudarCancion(String nombre) {
        // TODO implement here
        return null;
    }

    public void controlarVolumen() {
        // TODO implement here

    }

    public void mostrarMP3() {
        // TODO implement here

    }

    public Cancion avanzarYRetrocederCancion(String nombre) {
        // TODO implement here
        return null;
    }
}
