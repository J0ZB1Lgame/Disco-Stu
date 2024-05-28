
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
     * datos de la cancion 
     * @param nombre nombre de la cancion 
     * @param artista cantante dueño de la cancion 
     * @param album album donde se publico el la cancion
     * @param genero genero musical de la cancion
     * @param duracion duracion total de la cancion 
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
     * @param nombre nombre de la cancion 
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
     * @param artista cantante dueño de la cancion
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
     * @param album albun donde se publico la cancion
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
     * @param genero genero musical de la cancion
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
     * @param duracion duracion total de la cancion
     */

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * 
     * @return nombre de la cancion
     */
    
    public String consultarNombre() {
        return nombre;
    }
    
//------------------------------------------------------------------------------    

    /**
     * metodo para declarar que se esta reproduciendo la cancion 
     */
    
    public void iniciarReproduccion() { 
        this.enReproduccion = true;
        this.pausada = false;
        System.out.println("Reproduciendo: " + nombre + " a " + mp3.volumen + "%");
    }
    
    /**
     * metodo para declarar que se pauso la cancion 
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
     * @return retorna la reproduccion de una cancion 
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
     * metodo para declarar que se pauso la cancion
     */

    public void detenerReproduccion() {
        this.enReproduccion = false;
        this.pausada = false;
        System.out.println("Reproducción detenida: " + nombre);
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * 
     * @return datos de la cancion 
     */
    
    public String toString() {
       
        return "Nombre: " + nombre + " " +
               "Artista: " + artista + " " +
               "Albun: " + album + " " +
               "Genero: " + genero + " " + "Duracion: " + duracion;
    }
}
