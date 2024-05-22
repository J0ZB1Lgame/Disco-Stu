
package discostu;

public class Setlist {

    public int id;
    public int totalCanciones = 0;
    public Cancion [] song;

    public Setlist() {
    }

    public Setlist (int id) {
        this.id = id;
        this.song = new Cancion [10];
    }

    public void agregarCancion(Cancion cancion, int id ) {
        
        if (totalCanciones < song.length && song[totalCanciones] == null ){  
            song[totalCanciones] = cancion;
            totalCanciones++;
            if (id == 0) {
            System.out.println("La canción: " + cancion.toString() + " a sido agregada a la lista: Nuevas canciones");                             
            } if (id == 1){
            System.out.println("La cancion: " + cancion.toString() + " a sido agregada a la lista: Favoritas");
            } if (id == 2){
            System.out.println("La cancion: " + cancion.toString() + " a sido agregada a la lista: Triste");
            }if (id == 3){
            System.out.println("La cancion: " + cancion.toString() + " a sido agregada a la lista: Amor");
            }
            
        } else {
            System.out.println("Playlist llena");
        }   
    }         

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

    
    
    
    public Cancion[] buscarCancion() {
        return song;
    }

    public Cancion reproducirCancion() {
        // TODO implement here
        return null;
    }

    public Cancion eliminarCancion() {
        // TODO implement here
        return null;
    }

    public Cancion pausarYReanudarCancion() {
        // TODO implement here
        return null;
    }
}
