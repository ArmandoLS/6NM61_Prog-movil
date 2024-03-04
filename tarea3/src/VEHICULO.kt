class Vehiculo(
    val color: String,
    val marca: String,
    val modelo: String,
    val placas: String,
    var encendido: Boolean = false,
    var gasolina: Double
) {
    fun encender() {
        if (gasolina > 0) {
            encendido = true
            println("El vehículo se ha encendido.")
        } else {
            println("No hay suficiente gasolina para encender el vehículo.")
        }
    }

    fun apagar() {
        encendido = false
        println("El vehículo se ha apagado.")
    }

    fun recargar(cantidad: Double) {
        gasolina += cantidad
        println("Se han recargado $cantidad litros de gasolina. Gasolina total: $gasolina litros.")
    }
}

// Ejemplo de uso
fun main() {
    val miCoche = Vehiculo(color = "rojo", marca = "Toyota", modelo = "Corolla", placas = "ABC123", gasolina = 10.0)

    println("Encendiendo el vehículo...")
    miCoche.encender()

    println("Apagando el vehículo...")
    miCoche.apagar()

    println("Recargando gasolina...")
    miCoche.recargar(20.0)

    println("Intentando encender el vehículo de nuevo...")
    miCoche.encender()
}
