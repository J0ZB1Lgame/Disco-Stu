
package discostu;

import java.util.Scanner;

public class DiscoStu {

    static Scanner sc = new Scanner(System.in);
    static MP3 mp3 = new MP3();
    static Cancion cancion = new Cancion();


    public static void main(String[] args) {
      int opcion;
        do {
            System.out.println("--- DiscoStu ---");
            System.out.println("0. Salir");
            System.out.println("1. Crear canción");
            System.out.println("2. Agregar canción a la biblioteca");
            System.out.println("3. Mostrar Lista de canciones");
            System.out.println("4. Pausar y reanudar la reproducción");
            System.out.println("5. Avanzar y retroceder la canción");
            System.out.println("6. Controlar el volúmen");
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

                    pausarReanudar ();

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
    
    public static void crearCancion (){
      
        System.out.println("Crear canción");
        System.out.print("Ingrese los datos separados por - en el siguiente orden: nombre - artista - álbum - género - duración min.seg: ");
        String datos = sc.nextLine();
        System.out.println("Digíte el número de la biblioteca donde desea guardar esta nueva canción: ");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Triste");
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
            
        } else {
            System.out.println("El formato del texto no es válido");
        }
    }
    
//------------------------------------------------------------------------------    
    
    public static void agregarABiblioteca (){
        
    }
    
//------------------------------------------------------------------------------    
    
    public static void listaCanciones (){
        
        System.out.println("Ingrese la bibioteca a buscar");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Triste");
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
            System.out.println("Canciones que tienes guardadas en: Triste");
            System.out.println("");
            mp3.mostrarMP3(numBiblio);
        }if (numBiblio == 3){
            System.out.println("Canciones que tienes guardadas en: Amor");
            System.out.println("");
            mp3.mostrarMP3(numBiblio);
        }
        
    }
    
//------------------------------------------------------------------------------    
    
    public static void pausarReanudar (){
        
    }
    
//------------------------------------------------------------------------------    
    
    public static void avanzarRetroceder (){
        
    }
    
//------------------------------------------------------------------------------    
    
    public static void controlarVolumen (){
        
    }
    
//------------------------------------------------------------------------------    
    
     public static void buscarCancion (){
        
        System.out.println("Ingrese la biblioteca donde tiene la cancion");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Triste");
        System.out.println("4. Amor");
        int numBiblio = Integer.parseInt(sc.nextLine())-1;
        System.out.println("Ingrese el nombre de la cancion");
        String nombre = sc.nextLine();
        
        Cancion c = mp3.buscarCancion(nombre, numBiblio);
        System.out.println(c.toString());
    }
    
//------------------------------------------------------------------------------    
    
    public static void eliminarCancion (){
        
    }
    
}
