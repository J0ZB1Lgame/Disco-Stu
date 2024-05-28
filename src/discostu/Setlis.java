
package discostu;

public class Setlis {

    public int id;
    public int totalCanciones = 0;
    public Cancion [] song;

    public Setlis() {
    }
    
//------------------------------------------------------------------------------    

    public Setlis (int id) {
        this.id = id;
        this.song = new Cancion [10];
    }

//------------------------------------------------------------------------------    
    
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalCanciones() {
        return totalCanciones;
    }

    public void setTotalCanciones(int totalCanciones) {
        this.totalCanciones = totalCanciones;
    }

    public Cancion[] getCancion() {
        return song;
    }

    public void setCancion(Cancion[] cancion) {
        this.song = cancion;
    }
    
//------------------------------------------------------------------------------    

    public Cancion reproducirCancion() {
        // TODO implement here
        return null;
    }
    
//------------------------------------------------------------------------------    
    
    public Cancion pausarYReanudarCancion() {
        // TODO implement here
        return null;
    }
    
//------------------------------------------------------------------------------    
    
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
