
package discostu;

import java.util.Scanner;

public class DiscoStu {
    
    static Scanner sc = new Scanner(System.in);
    static MP3 mp3 = new MP3();    
    
    public static void main(String[] args) throws InterruptedException {
      int opcion;
        do {
            System.out.println("--- DiscoStu ---");
            System.out.println("0. Salir");
            System.out.println("1. Crear cancion");
            System.out.println("2. Agregar cancion a la biblioteca");
            System.out.println("3. lista de canciones");
            System.out.println("4. Reproducir, Pausar y reanudar la reproduccion");
            System.out.println("5. Avanzar y retroceder la cancion");
            System.out.println("6. Controlar el volumen");
            System.out.println("7. Buscar cancion por nombre");
            System.out.println("8. Eliminar cancion");
            System.out.println("Ingrese la opcion: ");
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
    
    public static void crearCancion (){
      
        System.out.println("---------------------------------------------------");
        System.out.println("Crear cancion");
        System.out.print("Ingrese los datos separados por - en el orden nombre - artista - album - genero - duracion min.seg: ");
        String datos = sc.nextLine();
        System.out.println("Digite el numero de la biblioteca donde desea guardar esta nueva cancion: ");
        System.out.println("1. Nuveas canciones");
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
            System.out.println("El formato del texto no es valido");
            System.out.println("---------------------------------------------------");
        }
    }
    
//------------------------------------------------------------------------------    
    
    public static void agregarABiblioteca () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("agregar a nueva biblioteca");
        System.out.println("Ingrese el nombre de la cancion que desea mover: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el numero de la biblioteca a la que desea mover la cancion: ");
        System.out.println("1. Nuevas canciones");
        System.out.println("2. Favoritas");
        System.out.println("3. Tristes");
        System.out.println("4. Amor");
        int nuevaBiblioteca = Integer.parseInt(sc.nextLine()) - 1;

        mp3.moverCancion(nombre, nuevaBiblioteca);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    public static void listaCanciones (){
        
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese la bibioteca a buscar");
        System.out.println("1. Nuveas canciones");
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
    
    public static void iniciarPausarReanudar () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("Buscar cancion por nombre para pausar/reanudar");
        System.out.println("Escriba el nombre de la cancion a buscar");
        String nombre = sc.nextLine();
        mp3.iniciarPausarYReanudar(nombre);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    public static void avanzarRetroceder () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("Seleccione la direccion ('avanzar' o 'retroceder'): ");
        String direccion = sc.nextLine();
        mp3.avanzarYRetrocederCancion(direccion);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    public static void controlarVolumen (){
        
        System.out.println("---------------------------------------------------");
        System.out.println("controlar volumen");
        System.out.println("ingrese el volumen de 0 a 100");
        int volumen = Integer.parseInt(sc.nextLine());
        mp3.controlarVolumen(volumen);
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    public static void buscarCancion () throws InterruptedException{
        
        System.out.println("---------------------------------------------------");
        System.out.println("Buscar cancion por nombre");
        System.out.println("Escriba el nombre de la cancion a buscar");
        String nombre = sc.nextLine();
        int lista = mp3.buscarCancion(nombre);
        switch (lista) {
                    case 0:
                        System.out.println("La cancion " + nombre + " ha sido encontrada en la lista: Nuevas canciones");
                        break;
                    case 1:
                        System.out.println("La cancion " + nombre + " ha sido encontrada en la lista: Favoritas");
                        break;
                    case 2:
                        System.out.println("La cancion " + nombre + " ha sido encontrada en la lista: Tristes");
                        break;
                    case 3:
                        System.out.println("La cancion " + nombre + " ha sido encontrada en en la lista: Amor");
                        break;
                }    
        System.out.println("---------------------------------------------------");
    }
    
//------------------------------------------------------------------------------    
    
    public static void eliminarCancion () throws InterruptedException{
        System.out.println("---------------------------------------------------");
        System.out.println("eliminar cancion por nombre");
        System.out.println("Escriba el nombre de la cancion a eliminar");
        String nombre = sc.nextLine();
        mp3.eliminarCancion(nombre);
        System.out.println("---------------------------------------------------");
    }
    
}
