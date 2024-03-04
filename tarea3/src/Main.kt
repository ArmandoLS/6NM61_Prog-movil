fun main() {
    // Crear un objeto de Vehiculo y establecer los datos de tu coche
    val miCoche = Vehiculo(
        color = "azul",
        marca = "Honda",
        modelo = "Civic",
        placas = "XYZ0302",
        gasolina = 15.0 // Supongamos que tiene 15 litros de gasolina inicialmente
    )

    // Checar si el coche está encendido
    println("Estado del coche antes de encenderlo: ${if (miCoche.encendido) "Encendido" else "Apagado"}")

    // Encender el coche
    println("Encendiendo el coche...")
    miCoche.encender()

    // Volver a checar si el coche está encendido
    println("Estado del coche después de encenderlo: ${if (miCoche.encendido) "Encendido" else "Apagado"}")

    // Verificar el nivel del tanque imprimiendo la cantidad de gasolina
    println("Cantidad de gasolina en el tanque: ${miCoche.gasolina} litros")

    // Recargar unos cuantos litros de gasolina
    val cantidadRecarga = 10.0
    println("Recargando $cantidadRecarga litros de gasolina...")
    miCoche.recargar(cantidadRecarga)

    // Volver a consultar la cantidad de gasolina en el tanque
    println("Cantidad de gasolina en el tanque después de recargar: ${miCoche.gasolina} litros")
}
