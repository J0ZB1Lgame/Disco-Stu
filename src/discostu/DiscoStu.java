
package discostu;

import java.util.Scanner;

/**
 * @author  Josel Patiño - Miguel Correa - Leonardo Tolosa
*/

public class DiscoStu {
    
    static Scanner sc = new Scanner(System.in);
    static MP3 mp3 = new MP3();    
    
    /**
     * En este metodo se despliega el menu principal del MP3
     * @param args
     * @throws InterruptedException 
     */
    
    public static void main(String[] args) throws InterruptedException {
      int opcion;
        do {
            System.out.println("--- DiscoStu ---");
            System.out.println("0. Salir");
            System.out.println("1. Crear canción");
            System.out.println("2. Agregar cancion a la biblioteca");
            System.out.println("3. Lista de canciones");
            System.out.println("4. Reproducir, Pausar y reanudar la reproduccion");
            System.out.println("5. Avanzar y retroceder la cancion");
            System.out.println("6. Controlar el volumen");
            System.out.println("7. Buscar canción por nombre");
            System.out.println("8. Eliminar canción");
            System.out.println("Ingrese la opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:  
                    
                    crearCancion ();
                    
                    break;
                case 2:
                    
                    agregarABiblioteca ();
                    
                    break;
                case 3:
                    
                    listaCanciones ();
                    
                    break;
                case 4:
                    
                    iniciarPausarReanudar ();
                    
                    break;
                case 5:
                    
                    avanzarRetroceder ();
                    
                    break;
                case 6:
                    
                    controlarVolumen ();
                    
                    break;
                case 7:
                    
                    buscarCancion ();
                    
                    break;
                case 8:
                    
                    eliminarCancion ();
                    
                    break;    
                default:
                    
                    break;
            }
        } while (opcion != 0);
    }
    
//------------------------------------------------------------------------------    
    /**
     * En este metodo se crea una cancion y se agrega a un alista de reproduccion 
    */
    public static void crearCancion (){
        
        System.out.println("---------------------------------------------------");
        System.out.println("Crear canción");
        System.out.print("Ingrese los datos separados en el siguiente orden: nombre - artista - álbum - género - duración - min.seg: ");
        String datos = sc.nextLine();
        System.out.println("Digite el número de la biblioteca donde desea guardar esta nueva canción: ");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Tristes");
        System.out.println("4. Amor");
        int setlisNueva = (Integer.parseInt(sc.nextLine())-1);
        String partes [] = datos.split("-");
        if (partes.length == 5) {
            String nombre = partes[0];
            String artista = partes[1];
            String album = partes[2];
            String genero = partes[3];
            double duracion = Double.parseDouble(partes[4]);
            Cancion newCancion = new Cancion(nombre, artista, album, genero, duracion);
            mp3.crearCancion(newCancion, setlisNueva);
            System.out.println("---------------------------------------------------");
            
        } else {
            System.out.println("El formato del texto no es válido");
            System.out.println("---------------------------------------------------");
        }
    }
    
//------------------------------------------------------------------------------    
    /**
     * En este metodo se mueve la cancion a otras listas
    */
    
    public static void agregarABiblioteca () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("agregar a una nueva biblioteca");
        System.out.println("Ingrese el nombre de la canción que desea mover: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el número de la biblioteca a la que desea mover la canción: ");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Tristes");
        System.out.println("4. Amor");
        int nuevaBiblioteca = Integer.parseInt(sc.nextLine()) - 1;

        mp3.moverCancion(nombre, nuevaBiblioteca);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * En este metodo se imprimen las canciones de una lista deseada
    */
    
    public static void listaCanciones (){
        
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese la bibioteca a buscar");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Tristes");
        System.out.println("4. Amor");
        int numBiblio = (Integer.parseInt(sc.nextLine())-1);
        if (numBiblio == 0) {
            System.out.println("Canciones que tienes guardadas en: Nuevas canciones");
            System.out.println("");
            mp3.mostrarMP3(numBiblio);
            
        } if (numBiblio == 1){
            System.out.println("Canciones que tienes guardadas en: Favoritas");
            System.out.println("");
            mp3.mostrarMP3(numBiblio);
        } if (numBiblio == 2){
            System.out.println("Canciones que tienes guardadas en: Tristes");
            System.out.println("");
            mp3.mostrarMP3(numBiblio);
        }if (numBiblio == 3){
            System.out.println("Canciones que tienes guardadas en: Amor");
            System.out.println("");
            mp3.mostrarMP3(numBiblio);
        }
        System.out.println("---------------------------------------------------");
        
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * En este metodo se inicia, pausa o reanuda una cancion deseada
    */
    
    public static void iniciarPausarReanudar () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("Buscar cancion por nombre para pausar/reanudar");
        System.out.println("Escriba el nombre de la cancion a buscar");
        String nombre = sc.nextLine();
        mp3.iniciarPausarYReanudar(nombre);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * En este metodo se avanza o retrocede una cancion de la lista la cual se este reproduciendo
    */
    
    public static void avanzarRetroceder () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("Seleccione la dirección ('avanzar' o 'retroceder'): ");
        String direccion = sc.nextLine();
        mp3.avanzarYRetrocederCancion(direccion);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * En este metodo se controla el volumen del MP3
    */
    
    public static void controlarVolumen (){
        
        System.out.println("---------------------------------------------------");
        System.out.println("controlar volúmen");
        System.out.println("ingrese el volúmen de 0 a 100");
        int volumen = Integer.parseInt(sc.nextLine());
        mp3.controlarVolumen(volumen);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * En este metodo se crea una cancion y se agrega a un alista de reproduccion
    */
    
    public static void buscarCancion () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("Buscar canción por nombre");
        System.out.println("Escriba el nombre de la canción a buscar");
        String nombre = sc.nextLine();
        int lista = mp3.buscarCancion(nombre);
        switch (lista) {
                    case 0:
                        System.out.println("La canción " + nombre + " ha sido encontrada en la lista: Nuevas canciones");
                        break;
                    case 1:
                        System.out.println("La canción " + nombre + " ha sido encontrada en la lista: Favoritas");
                        break;
                    case 2:
                        System.out.println("La canción " + nombre + " ha sido encontrada en la lista: Tristes");
                        break;
                    case 3:
                        System.out.println("La canción " + nombre + " ha sido encontrada en en la lista: Amor");
                        break;
                }    
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    /**
     * En este metodo elimina una cancion determinada por el usuario
    */
    
    public static void eliminarCancion () throws InterruptedException{
        System.out.println("---------------------------------------------------");
        System.out.println("Eliminar canción por nombre");
        System.out.println("Escriba el nombre de la canción a eliminar");
        String nombre = sc.nextLine();
        mp3.eliminarCancion(nombre);
        System.out.println("---------------------------------------------------");
    }
    
}
