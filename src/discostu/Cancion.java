
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
    
    /**
     * datos de la canción 
     * @param nombre nombre de la canción 
     * @param artista cantante dueño de la canción 
     * @param album album donde se publicó la canción
     * @param genero género musical de la canción
     * @param duracion duración total de la canción 
     */
    
    public Cancion(String nombre, String artista, String album, String genero, Double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;      
    }
    
//------------------------------------------------------------------------------    

    /**
     * 
     * @return 
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre nombre de la canción 
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return 
     */

    public String getArtista() {
        return artista;
    }
    
    /**
     * 
     * @param artista cantante dueño de la canción
     */

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    /**
     * 
     * @return 
     */

    public String getAlbum() {
        return album;
    }
    
    /**
     * 
     * @param album album donde se publicó la canción
     */

    public void setAlbum(String album) {
        this.album = album;
    }
    
    /**
     * 
     * @return 
     */

    public String getGenero() {
        return genero;
    }
    
    /**
     * 
     * @param genero genero musical de la canción
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**
     * 
     * @return 
     */

    public Double getDuracion() {
        return duracion;
    }
    
    /**
     * 
     * @param duracion duración total de la canción
     */

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * 
     * @return nombre de la canción
     */
    
    public String consultarNombre() {
        return nombre;
    }
    
//------------------------------------------------------------------------------    

    /**
     * método para declarar que se esta reproduciendo la canción 
     */
    
    public void iniciarReproduccion() { 
        this.enReproduccion = true;
        this.pausada = false;
        System.out.println("Reproduciendo: " + nombre + " a " + mp3.volumen + "%");
    }
    
    /**
     * método para declarar que se pausó la canción 
     */

    public void pausarReproduccion() {
        if (enReproduccion && !pausada) {
            this.pausada = true;
            System.out.println("Canción pausada: " + nombre);
        } else if (enReproduccion && pausada) {
            this.pausada = false;
            System.out.println("Reanudando canción: " + nombre+ " a " + mp3.volumen + "%");
        }
    }

    /**
     * 
     * @return retorna la reproducción de una canción 
     */
    
    public boolean estaEnReproduccion() {
        return enReproduccion;
    }
    
    /**
     * 
     * @return retorna el estado de pausa 
     */

    public boolean estaPausada() {
        return pausada;
    }
    
    /**
     * método para declarar que se pausó la canción
     */

    public void detenerReproduccion() {
        this.enReproduccion = false;
        this.pausada = false;
        System.out.println("Reproducción detenida: " + nombre);
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * 
     * @return datos de la canción 
     */
    
    public String toString() {
       
        return "Nombre: " + nombre + " " +
               "Artista: " + artista + " " +
               "Albun: " + album + " " +
               "Genero: " + genero + " " + "Duracion: " + duracion;
    }
}
