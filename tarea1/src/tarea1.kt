const val pi = 3.1416

fun main() {
    //1.- Para un número decimal, qué tipo de dato se asigna por defecto? Imprimirlo.

    val decimal = 3.02
    println (decimal::class.simpleName)

    // se asigna tipo double


    // 2.     Volver flotante a la variable decimal.
    val decimal2 = 3.02f

    /*3.     Declarar una variable const val con el valor de PI y multiplicarla por 2
     veces nuestra variable decimal para sacar el perímetro de un círculo. */

    var radio = pi * (decimal2 * decimal2)
    println ("El perímetro del círculo es: [$radio] siendo resultado nuestra variable perímetro. ")





    /*La ecuación de la pendiente se obtiene por la siguiente expresión:
    m = y2-y1/x2-x1
    5. Expresarla ahora con operadores.*/

    var y1: Float
    var y2: Float
    var x1: Float
    var x2: Float
    var m: Float

    // 6.Resolver el valor de la pendiente, tomando en cuenta que P1(4,3), P2(-3,-2)

    x1 = 4f
    x2 = -3f
    y1 = 3f
    y2 = -2f

    m = (y2-y1)/(x2-x1)

    print ("el resultado de la pendiente es: $m")

}