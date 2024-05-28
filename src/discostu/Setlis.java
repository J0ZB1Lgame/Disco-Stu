
package discostu;

public class Setlis {

    public int id;
    public int totalCanciones = 0;
    public Cancion [] song;

    public Setlis() {
    }
    
//------------------------------------------------------------------------------    

    /**
     * metodo para la declaracion del tamaño del arreglo
     * @param id es la posicion de la lista 0 = nuevas canciones, 1 = favoritas, 2 = tristes y 3 = amor
     */
    
    public Setlis (int id) {
        this.id = id;
        this.song = new Cancion [10];
    }

//------------------------------------------------------------------------------    
    
    /**
     * luego de ingresar la cancion, este metodo agrega la cancion en una posicion dentro de la lista 
     * @param cancion los datos de la cancion a ingresar 
     * @param id la posicion de la lista 
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
     * id de la pocion de la cancion 
     * @return posicion
     */
    
    public int getId() {
        return id;
    }

    /**
     * cambio de posicion
     * @param id posicion de la cancion
     */
    
    public void setId(int id) {
        this.id = id;
    }

    /**
     * total de canciones dentro de la lista 
     * @return numero de canciones posibles de la lista 
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
     * datos de la cancion 
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
     * se utiliza este metodo para buscar la cancion dentro de la lista
     * @param nombre nombre de la cancion a buscar, este nombre fue el ingresado por el usuario
     * @return los datos de la cancion 
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
     * metodo para eliminar una cancion determiada dentro de la lista
     * @param nombre como variable para buscar y eliminar, este nombre fue el ingresado por el usuario
     * @return datos de la cancion eliminada
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
