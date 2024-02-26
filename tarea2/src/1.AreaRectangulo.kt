//1.-Crear una función que calcule el área de un rectángulo por medio
// de su base y altura, implementarla en main.

fun calcularAreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun main() {
    val base = 5.0
    val altura = 10.0

    val area = calcularAreaRectangulo(base, altura)
    println("El área del rectángulo con base $base y altura $altura es: $area")

    }