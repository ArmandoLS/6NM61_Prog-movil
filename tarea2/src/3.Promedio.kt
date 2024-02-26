//3.-Crear una función que entregue el promedio de tres calificaciones.
// Esta debe recibir dos parámetros con calificaciones por defecto 8, y el tercer parámetro no debe venir predefinido.

import java.util.Scanner

fun calcularPromedioCalificaciones(calificacion1: Double = 8.0, calificacion2: Double = 8.0, calificacion3: Double): Double {
    return (calificacion1 + calificacion2 + calificacion3) / 3
}

fun main() {
    val scanner = Scanner(System.`in`)

    val calificacion1 = 8.0
    val calificacion2 = 8.0

    println("Ingrese la tercera calificación:")
    val calificacion3 = scanner.nextDouble()

    val promedio = calcularPromedioCalificaciones(calificacion1, calificacion2, calificacion3)
    println("El promedio de las calificaciones es: $promedio")
}
