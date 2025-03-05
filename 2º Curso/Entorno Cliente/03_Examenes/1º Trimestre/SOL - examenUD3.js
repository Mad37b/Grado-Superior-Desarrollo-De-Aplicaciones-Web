/*  
    Desarrollo web en entorno cliente
    DAW Distancia - Curso 24-25
    Examen UD3 - 241218
    Solución propuesta
*/

document.write("<h1> Examen UD3 - 241218</h1>");

// Ejercicio 1: Definir el array donde se almacenarán los libros disponibles en la librería.
var libros = [];

// Ejercicio 2. Definir el objeto Libro con las propiedades requeridas
class Libro {
    constructor(titulo, autor, precio) {
        this._titulo = titulo;
        this._autor = autor;
        this._cantidad = 0;
        this._precio = precio;
    }

// Ejercicio 3. Métodos del objeto Libro
    // Getters
    get titulo(){
        return this._titulo;
    }

    get autor() {
        return this._autor;
    }

    get cantidad() {
        return this._cantidad;
    }

    get precio() {
        return this._precio;
    }


    // Setters
    set titulo(nuevoTitulo) {
        this._titulo = nuevoTitulo;
    }

    set autor(nuevoAutor) {
        this._autor = nuevoAutor;
    }

    set cantidad(nuevaCantidad) {
        this._cantidad = nuevaCantidad;
    }

    set precio(nuevoPrecio) {
        this._precio = nuevoPrecio;
    }
}

// Ejercicio 4. Funciones
function consultarLibro(titulo) {
        for (var i = 0; i<libros.length;i++){
            if (libros[i].titulo === titulo) {
                alert("Cantidad de ejemplares disponibles de " + titulo + ": " + libros[i].cantidad);
                return;   
            }
        }
        alert("El libro " + titulo + " no se encuentra disponible en la librería.");
    }


function addLibro(libro,cantidad){
        let encontrado = false;
        for (let i = 0; i < libros.length; i++) {
            if (libros[i].titulo === libro.titulo) {
                let nuevaCantidad = libros[i].cantidad + cantidad; 
                libros[i].cantidad = nuevaCantidad; 
                encontrado = true; 
                break; 
            }
        }
    
        if (!encontrado) {
            // Si el libro no existe, agregarlo a la lista
            libro.cantidad = cantidad;
            libros.push(libro);
        }
    
        // Mostrar el mensaje
        document.write(
            "Se han añadido " + cantidad + " ejemplares del libro: " +
            libro.titulo + " a la librería "
        );
        document.write(" - Cantidad actual: " + libro.cantidad + "<br>");
    };

    


// Ejemplo de uso
// Crear libro
const libro1 = new Libro("El Quijote", "Miguel de Cervantes", 20);
document.write("Se ha creado el libro: " + libro1.titulo + "<br>");

// Añadir 5 ejemplares a la librería
addLibro(libro1, 5);

// Consultas libros
consultarLibro("El señor de los anillos");
consultarLibro("El Quijote");

// Añadimos otros 2 ejemplares
addLibro(libro1, 2);

// Nueva consulta
consultarLibro("El Quijote");