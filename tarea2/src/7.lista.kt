fun contarRepeticiones(listaNombres: List<String>): Map<String, Int> {
    val conteo = mutableMapOf<String, Int>()

    for (nombreCompleto in listaNombres) {
        val nombresSeparados = nombreCompleto.split(" ")
        for (nombre in nombresSeparados) {
            if (conteo.containsKey(nombre)) {
                conteo[nombre] = conteo.getValue(nombre) + 1
            } else {
                conteo[nombre] = 1
            }
        }
    }

    return conteo
}

fun main() {
    val nombres = listOf(
        "Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo",
        "Ernesto", "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan"
    )

    val conteoNombres = contarRepeticiones(nombres)
    for ((nombre, repeticiones) in conteoNombres) {
        println("$nombre se repite $repeticiones veces")
    }
}

