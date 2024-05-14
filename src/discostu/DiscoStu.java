
package discostu;

import java.util.Scanner;

public class DiscoStu {
    
    static Scanner sc = new Scanner(System.in);
    static Setlis setlis = new Setlis();
    static MP3 mp3 = new MP3();
    static Cancion cancion = new Cancion();


    public static void main(String[] args) {
      int opcion;
        do {
            System.out.println("--- Bienvenido a DiscoStu ---");
            System.out.println("0. Salir");
            System.out.println("1. Crear cancion");
            System.out.println("2. Agregar cancion a la biblioteca");
            System.out.println("3. lista de canciones");
            System.out.println("4. Pausar y reanudar la reproduccion");
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
      
        System.out.println("Crear cancion");
        System.out.print("Ingrese los datos separados por - en el orden nombre - artista - album - genero - duracion: ");
        String datos = sc.nextLine();
        String partes [] = datos.split("&");
        if (partes.length == 5) {
            String nombre = partes[0];
            String artista = partes[1];
            String album = partes[2];
            String genero = partes[3];
            double duracion = Double.parseDouble(partes[4]);
            Cancion newCancion = new Cancion(nombre, artista, album, genero, duracion);
            
        } else {
            System.out.println("El formato del texto no es valido");
        }
    }
    
//------------------------------------------------------------------------------    
    
    public static void agregarABiblioteca (){
        
    }
    
//------------------------------------------------------------------------------    
    
    public static void listaCanciones (){
        
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
        
    }
    
//------------------------------------------------------------------------------    
    
    public static void eliminarCancion (){
        
    }
    
}
