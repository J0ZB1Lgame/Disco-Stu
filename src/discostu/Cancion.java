
package discostu;

public class Cancion {
    
    

    private String nombre;
    private String artista;
    private String album;
    private String genero;
    private Double duracion;
    private boolean enReproduccion;
    private boolean pausada;
    static MP3 mp3 = new MP3();
    
    public Cancion() {
    }
    
//------------------------------------------------------------------------------    
    
    public Cancion(String nombre, String artista, String album, String genero, Double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;      
    }
    
//------------------------------------------------------------------------------    

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
    
//------------------------------------------------------------------------------    
    
    public String consultarNombre() {
        return nombre;
    }
    
//------------------------------------------------------------------------------    

    public void iniciarReproduccion() { 
        this.enReproduccion = true;
        this.pausada = false;
        System.out.println("Reproduciendo: " + nombre + " a " + mp3.volumen + "%");
    }

    public void pausarReproduccion() {
        if (enReproduccion && !pausada) {
            this.pausada = true;
            System.out.println("Canción pausada: " + nombre);
        } else if (enReproduccion && pausada) {
            this.pausada = false;
            System.out.println("Reanudando canción: " + nombre+ " a " + mp3.volumen + "%");
        }
    }

    public boolean estaEnReproduccion() {
        return enReproduccion;
    }

    public boolean estaPausada() {
        return pausada;
    }

    public void detenerReproduccion() {
        this.enReproduccion = false;
        this.pausada = false;
        System.out.println("Reproducción detenida: " + nombre);
    }
    
//------------------------------------------------------------------------------    
    
    public String toString() {
       
        return "Nombre: " + nombre + " " +
               "Artista: " + artista + " " +
               "Albun: " + album + " " +
               "Genero: " + genero + " " + "Duracion: " + duracion;
    }
}
