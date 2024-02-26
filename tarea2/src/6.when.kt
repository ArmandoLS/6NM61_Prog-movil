//6.-Con When identificar si el tipo de dato es:
//String
//Int
//Double
//Otro

fun identificarTipoDato(valor: Any) {
    when (valor) {
        is String -> println("El valor es de tipo String.")
        is Int -> println("El valor es de tipo Int.")
        is Double -> println("El valor es de tipo Double.")
        else -> println("El valor es de otro tipo.")
    }
}

fun main() {
    val ejemplo1: String = "Hola"
    val ejemplo2: Int = 10
    val ejemplo3: Double = 5.0
    val ejemplo4: Char = 'a'

    identificarTipoDato(ejemplo1)
    identificarTipoDato(ejemplo2)
    identificarTipoDato(ejemplo3)
    identificarTipoDato(ejemplo4)
}
