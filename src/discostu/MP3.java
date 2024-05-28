
package discostu;

public class MP3 {

    private Setlis [] setlist;
    public int volumen = 50;
    static int tiempoEspera = 3000; 
    private Cancion cancionActual;

//------------------------------------------------------------------------------
    
    public MP3 () {
        this.setlist = new Setlis[4];
        for (int i = 0; i < 4; i++) {
            setlist[i] = new Setlis(i);
        }
    }
    
//------------------------------------------------------------------------------    
    
    public void crearCancion(Cancion cancion, int lista) {
        Setlis biblio = setlist [lista];
        biblio.agregarCancion(cancion, lista);             
    }

//------------------------------------------------------------------------------    
    
    public void moverCancion(String nombre, int id) throws InterruptedException {
        
        Setlis listaActual = setlist[buscarCancion(nombre)];
        Setlis nuevaLista = setlist[id];
        Cancion cancion = listaActual.eliminarCancion(nombre);
        System.out.println("Moviendo cancion...");
        Thread.sleep(tiempoEspera);
        System.out.println("finalizado");
        if (cancion != null) {
            nuevaLista.agregarCancion(cancion, id);
            switch (id) {
                    case 0:
                        System.out.println("La cancion " + nombre + " ha sido movida a la lista: Nuevas canciones");
                        
                        break;
                    case 1:
                        System.out.println("La cancion " + nombre + " ha sido movida a la lista: Favoritas");
                        
                        break;
                    case 2:
                        System.out.println("La cancion " + nombre + " ha sido movida a la lista: Tristes");
                        
                        break;
                    case 3:
                        System.out.println("La cancion " + nombre + " ha sido movida a en la lista: Amor");
                        
                        break;
                }
        } else {
            switch (buscarCancion(nombre)) {
                    case 0:
                        System.out.println("La cancion " + nombre + " no se encontró en la lista: Nuevas canciones");
                        
                        break;
                    case 1:
                        System.out.println("La cancion " + nombre + " no se encontró en la lista: Favoritas");
                        
                        break;
                    case 2:
                        System.out.println("La cancion " + nombre + " no se encontró en la lista: Tristes");
                
                        break;
                    case 3:
                        System.out.println("La cancion " + nombre + " no se encontró en la lista: Amor");
                        
                        break;
                }
            }
    }
    
//------------------------------------------------------------------------------    

    public void mostrarMP3(int id) {
        
        for (int i = 0; i < setlist.length; i++) {
            Setlis lista = setlist[i];
            if (lista.getId() == id){
                for (int j = 0; j < lista.getCancion().length; j++){
                     System.out.println(lista.getCancion()[j]);   
                     System.out.println();
                }
            }
        }
    }
    
//------------------------------------------------------------------------------    

    public void iniciarPausarYReanudar(String nombre) throws InterruptedException {
        
        Setlis setlis = setlist[buscarCancion(nombre)];
        Cancion cancion = setlis.buscarCancion(nombre);
        if (cancion != null) {
            if (cancionActual != null && !cancionActual.consultarNombre().equals(nombre)) {
                cancionActual.detenerReproduccion();
            }
            if (cancionActual == null || !cancionActual.consultarNombre().equals(nombre)) {
                cancionActual = cancion;
                cancionActual.iniciarReproduccion();
            } else {
                cancionActual.pausarReproduccion();
            }
        } else {
            System.out.println("La canción \"" + nombre + "\" no se encontró.");
        }
    }
    
//------------------------------------------------------------------------------    
    
    public Cancion avanzarYRetrocederCancion(String direccion) throws InterruptedException {
    
        
        if (cancionActual == null) {
        System.out.println("No se esta reproduciendo ninguna cancion actualmente.");
        return null;
    }
        System.out.println("cancion reproduciendose actualmente");
        Cancion[] listaCanciones = getCancionesEnLista(buscarCancion(cancionActual.getNombre()));
        int indexActual = getIndexCancionActual(listaCanciones);
        if (direccion.equalsIgnoreCase("avanzar")) {
            int siguienteIndex = indexActual + 1;
            if (siguienteIndex < listaCanciones.length && listaCanciones[siguienteIndex] != null) {
                cancionActual = listaCanciones[siguienteIndex];
                System.out.println("Reproduciendo siguiente cancion: " + cancionActual.consultarNombre() + " a: " + volumen + "%");     
            } else {
            System.out.println("No hay mas canciones en la lista para reproducir.");
            }
        } else if (direccion.equalsIgnoreCase("retroceder")) {        
            int anteriorIndex = indexActual - 1;        
            if (anteriorIndex >= 0 && listaCanciones[anteriorIndex] != null) {            
                cancionActual = listaCanciones[anteriorIndex];
                System.out.println("Reproduciendo cancion anterior: " + cancionActual.consultarNombre() + " a: " + volumen + "%");        
            } else {            
                System.out.println("No hay mas canciones en la lista para reproducir.");        
            }
        } else {        
            System.out.println("Direccion no valida. Por favor, ingrese 'avanzar' o 'retroceder'.");
    }
        return null;
}

private Cancion[] getCancionesEnLista(int id) {
    Setlis lista = setlist[id];
    return lista.getCancion();
}

private int getIndexCancionActual(Cancion[] listaCanciones) {
    for (int i = 0; i < listaCanciones.length; i++) {
        if (listaCanciones[i] != null && listaCanciones[i].equals(cancionActual)) {
            return i;
        }
    }
    return -1;
}

    
//------------------------------------------------------------------------------

    public void controlarVolumen(int nVolumen) {
        System.out.println("volumen actual: " + volumen);
        if ( (nVolumen >= 0)&&(nVolumen <= 100)){
            volumen = nVolumen;
            System.out.println("nuevo volumen: " + volumen);
        }else{
            System.out.println("nivel de volumen no admitido, intente de nuevo");
        }

    }
    
//------------------------------------------------------------------------------    
    
    public int buscarCancion(String nombre) throws InterruptedException {
        int i = 0;
        System.out.println("buscando cancion...");
        Thread.sleep(tiempoEspera);
        for (i = 0; i < setlist.length; i++) {
            Setlis setlis = setlist[i];
            Cancion cancion = setlis.buscarCancion(nombre);
            if (cancion != null) {
                System.out.println(setlis.buscarCancion(nombre).toString());
                return i;
            }
        }
        System.out.println("La cancion " + nombre + " no esta en ninguna lista de canciones");
        return 0;
    }
    
//------------------------------------------------------------------------------    

    public void eliminarCancion(String nombre) throws InterruptedException {
        Setlis lista = setlist[buscarCancion(nombre)];
        Cancion cancion = lista.eliminarCancion(nombre);
        System.out.println("procesando...");
        Thread.sleep(tiempoEspera);
        if ( cancion != null){
            System.out.println("la cancion:" + nombre + " ha sido eliminada del MP3");
        } else {
            System.out.println("cancion no encontrada intente de nuevo");
        }  
    }
}
