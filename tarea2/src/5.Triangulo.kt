//5.-Crear una función que pida como parámetros las medidas de los lados de un triángulo.
// Debe imprimirnos el tipo de tríangulo:

fun determinarTipoTriangulo(lado1: Double, lado2: Double, lado3: Double) {
    if (lado1 == lado2 && lado2 == lado3) {
        println("El triángulo es equilátero: todos los lados son iguales.")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        println("El triángulo es isósceles: tiene dos lados iguales.")
    } else {
        println("El triángulo es escaleno: todos los lados son diferentes.")
    }
}

fun main() {
    println("Ingrese las medidas de los lados del triángulo:")
    val lado1 = readLine()!!.toDouble()
    val lado2 = readLine()!!.toDouble()
    val lado3 = readLine()!!.toDouble()

    determinarTipoTriangulo(lado1, lado2, lado3)
}
