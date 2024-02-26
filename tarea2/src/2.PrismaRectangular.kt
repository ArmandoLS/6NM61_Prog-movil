//2.-Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área.

fun calcularVolumenPrismaRectangular(base: Double, altura: Double, profundidad: Double): Double {
    val areaBase = calcularAreaRectangulo(base, altura)
    return areaBase * profundidad
}

fun main() {
    val base = 5.0
    val altura = 10.0
    val profundidad = 3.0

    val volumen = calcularVolumenPrismaRectangular(base, altura, profundidad)
    println("El volumen del prisma rectangular con base $base, altura $altura y profundidad $profundidad es: $volumen")
}
