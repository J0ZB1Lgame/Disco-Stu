
package discostu;

public class Setlis {

    public int id;
    public int totalCanciones = 0;
    public Cancion [] song;

    public Setlis() {
    }
    
//------------------------------------------------------------------------------    

    /**
     * método para la declaración del tamaño del arreglo
     * @param id es la posición de la lista 0 = nuevas canciones, 1 = favoritas, 2 = tristes y 3 = amor
     */
    
    public Setlis (int id) {
        this.id = id;
        this.song = new Cancion [10];
    }

//------------------------------------------------------------------------------    
    
    /**
     * luego de ingresar la canción, este método agrega la canción en una posición dentro de la lista 
     * @param canción los datos de la canción a ingresar 
     * @param id la posición de la lista 
     */
    
    public void agregarCancion(Cancion cancion, int id ) {
        
        if (totalCanciones < song.length && song[totalCanciones] == null ){  
            song[totalCanciones] = cancion;
            totalCanciones++;
            if (id == 0) {
            System.out.println("la cancion: " + cancion.toString() + " a sido agregada a la lista Nuveas canciones"); 
            
            } if (id == 1){
            System.out.println("la cancion: " + cancion.toString() + " a sido agregada a la lista Favoritas");
            
            } if (id == 2){
            System.out.println("la cancion: " + cancion.toString() + " a sido agregada a la lista Tristes");
            
            }if (id == 3){
            System.out.println("la cancion: " + cancion.toString() + " a sido agregada a la lista Amor");
            
            }
            
        }else{
            System.out.println("playlist llena");
            
        }   
    }         

//------------------------------------------------------------------------------    
    
    /**
     * id de la posición de la canción 
     * @return posicion
     */
    
    public int getId() {
        return id;
    }

    /**
     * cambio de posición
     * @param id posición de la canción
     */
    
    public void setId(int id) {
        this.id = id;
    }

    /**
     * total de canciones dentro de la lista 
     * @return número de canciones posibles de la lista 
     */
    
    public int getTotalCanciones() {
        return totalCanciones;
    }

    /**
     * cambio de total de canciones posibles en la lista 
     * @param totalCanciones  
     */
    
    public void setTotalCanciones(int totalCanciones) {
        this.totalCanciones = totalCanciones;
    }

    /**
     * datos de la canción 
     * @return 
     */
    
    public Cancion[] getCancion() {
        return song;
    }

    /**
     * cambiar datos de la cancion 
     * @param cancion 
     */
    
    public void setCancion(Cancion[] cancion) {
        this.song = cancion;
    }
    
//------------------------------------------------------------------------------    

    /**
     * se utiliza este método para buscar la canción dentro de la lista
     * @param nombre nombre de la canción a buscar, este nombre fue el ingresado por el usuario
     * @return los datos de la canción 
     */
    
    public Cancion buscarCancion(String nombre) {
        for (int i = 0; i < song.length; i++) {
            Cancion cancion = song[i];
           if (cancion != null && cancion.consultarNombre().equals(nombre)) {
                return cancion;
            }
        }
        return null;
}

//------------------------------------------------------------------------------    
    
    /**
     * método para eliminar una canción determiada dentro de la lista
     * @param nombre como variable para buscar y eliminar, este nombre fue el ingresado por el usuario
     * @return datos de la canción eliminada
     */
    
    public Cancion eliminarCancion(String nombre) {
        for (int i = 0; i < song.length; i++) {
            Cancion cancion = song[i];
            if (cancion != null && cancion.consultarNombre().equals(nombre)) {
                song[i] = null;
                totalCanciones--;
                return cancion;
            }
        }
        return null;
    } 
}
