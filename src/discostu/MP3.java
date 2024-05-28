
package discostu;

//import java.util.Arrays;

public class MP3 {

    private Setlist [] setlist;
    public int volumen;


    public MP3 () {
        this.setlist = new Setlist[4];
        for (int i = 0; i < 4; i++) {
            setlist[i] = new Setlist(i);
        }
    }

    public void crearCancion(Cancion cancion, int lista) {
        Setlist biblio = setlist [lista];
        biblio.agregarCancion(cancion, lista);
        
        
    }

    public Setlist agregarBiblioteca(int id) {
        // TODO implement here
        return null;
    }

    public Cancion buscarCancion(String nombre, int id) {
        // TODO implement here
        
        Cancion[] temp= null;
        Cancion encontrada =new Cancion();
        //for (int i = 0; i < 4; i++) {
            System.out.println("buscamos "+nombre+" "+id);
            
             temp = this.setlist[id].song;
                // System.out.println("encontre "+Arrays.toString(this.setlist));
                 System.out.println("encontre "+this.setlist[0].song[0].getNombre());
                 
                 
                 for (int i = 0; i < setlist[0].totalCanciones; i++) {
                     {
                         System.out.println(""+setlist[0].song[i]);
                     }
                     
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

    public void mostrarMP3(int id) {
        
        for (int i = 0; i < setlist.length; i++) {
            Setlist lista = setlist[i];
            if (lista.getId() == id){
                for (int j = 0; j < lista.getCancion().length; j++){
                     System.out.println(lista.getCancion()[j]);   
                     System.out.println();
                }
            }
        }
    }

    public Cancion avanzarYRetrocederCancion(String nombre) {
        // TODO implement here
        return null;
    }
}
