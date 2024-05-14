
package discostu;

public class Cancion {
    
    public Cancion() {
    }

    private String nombre;
    private String artista;
    private String album;
    private String genero;
    private Double duracion;
    
    
    public Cancion(String nombre, String artista, String album, String genero, Double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    public String consultarNombre() {
        return "";
    }

    public String toString() {
       
        return "Nombre: " + nombre + " " +
               "Artista: " + artista + " " +
               "Albun: " + album + " " +
               "Genero: " + genero + " " + "Duracion: " + duracion;
    }
}
