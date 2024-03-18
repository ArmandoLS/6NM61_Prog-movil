import clases.International
import clases.National
import clases.NationalLowSeason as NationalLowSeason1

fun main() {

    val viajeNacional = National("Guadalajara")
    viajeNacional.quotePrice(7)

    val viajeInternacional = International("Alemania", "Berlín")
    viajeInternacional.quotePrice(7)


}

