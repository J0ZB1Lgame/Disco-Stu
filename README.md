# DiscoStu

DiscoStu es un sencillo reproductor de música en línea de comandos escrito en Java. Permite a los usuarios crear, agregar, buscar, y eliminar canciones en diferentes bibliotecas. También simula la reproducción de canciones y permite controlar el volumen.

## Características

1. Crear Canción: Añade nuevas canciones a una biblioteca seleccionada.
2. Agregar Canción a Biblioteca: Mueve canciones entre diferentes bibliotecas.
3. Lista de Canciones: Muestra todas las canciones en una biblioteca seleccionada.
4. Reproducir, Pausar y Reanudar: Controla la reproducción de una canción.
5. Avanzar y Retroceder: Navega entre las canciones de una biblioteca.
6. Controlar el Volumen: Ajusta el volumen de la reproducción.
7. Buscar Canción por Nombre: Encuentra una canción específica en las bibliotecas.
8. Eliminar Canción: Borra canciones de las bibliotecas.

## Estructura del Proyecto

El proyecto consta de cuatro clases principales:

1. **DiscoStu**: Esta es la clase principal que contiene el menú interactivo y las funciones que llaman a los métodos del reproductor MP3.

2. **MP3**: Esta clase gestiona las bibliotecas de canciones y contiene métodos para crear, buscar, eliminar y reproducir canciones.

3. **Setlist**: Representa una lista de canciones. Cada `Setlist` pertenece a una categoría específica (Nuevas canciones, Favoritas, Triste, Amor).

4. **Cancion**: Representa una canción con sus atributos como nombre, artista, álbum, género y duración.
   

## Uso

Al ejecutar la aplicación, verás un menú con las siguientes opciones:

- `0. Salir`: Cierra la aplicación.
- `1. Crear canción`: Crea una nueva canción y la agrega a una biblioteca seleccionada.
- `2. Agregar canción a la biblioteca`: Agrega la canción a una biblioteca seleccionada.
- `3. Mostrar Lista de canciones`: Muestra las canciones en una biblioteca seleccionada.
- `4. Pausar y reanudar la reproducción`: Muestra la reproducción en pausa y también reanudada por medio de Boolean.
- `5. Avanzar y retroceder la canción`: Muestra si avanza o retrocede la reproducción con Boolean.
- `6. Controlar el volúmen`: Es una variable global que muestra números del 1 al 5 representando el nivel del volúmen.
- `7. Buscar canción por nombre`: Busca una canción por nombre en una biblioteca seleccionada.
- `8. Eliminar canción`: Elimina una canción por nombre de una biblioteca seleccionada.

### Ejemplo de Uso

1. **Crear una canción**:
   - Selecciona la opción `1. Crear canción`.
   - Ingresa los datos de la canción en el formato `nombre - artista - álbum - género - duración (en minutos.segundos)`.
   - Selecciona la biblioteca donde deseas agregar la canción.

2. **Reproducir una canción**:
   - Selecciona la opción `1. Reproducir canción`.
   - Ingresa el número de la biblioteca donde está la canción.
   - Ingresa el nombre de la canción.
   - La canción se reproducirá por el tiempo especificado en su duración, luego se mostrará un mensaje de finalización.

## Contribuciones

¡Las contribuciones son bienvenidas! Por favor, abre un "issue" para discutir lo que te gustaría cambiar o mejora en el proyecto.

## Licencia

Este proyecto está licenciado bajo la Licencia Apache 2.0.

## Autores

- **Leonardo Tolosa** - 507232713
- **Josel Patiño** - 506232065
- **Miguel Correa** - 506232069
