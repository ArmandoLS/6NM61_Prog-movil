package clases
abstract class Travel {
    abstract protected val country: String
    abstract protected val city: String
    protected open val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    // Mapa que asocia cada país con sus impuestos
    private val taxesByCountry = mapOf(
        "Mexico" to 0.1,  // Impuesto del 10% en México
        "Francia" to 0.15, // Impuesto del 15% en Francia
        "Estados Unidos" to 0.20,  // Impuesto del 10% en México
        "Japón" to 0.13, // Impuesto del 15% en Francia
        "Australia" to 0.11,  // Impuesto del 10% en México
        "Italia" to 0.09, // Impuesto del 15% en Francia
        "Alemania" to 0.16,   // Impuesto del 16% en Alemania
        "Chile" to 0.05,      // Impuesto del 5% en Chile
        "Canadá" to 0.1
    )

    // Mapa que asocia cada país con las ciudades disponibles para viajar
    private val citiesByCountry = mapOf(
        "Mexico" to listOf("Monterrey", "Guadalajara", "CDMX", "San Cristobal de las Casas", "San Miguel de Allende"),
        "Francia" to listOf("París", "Marsella", "Niza", "Lyon"),
        "Alemania" to listOf("Munich", "Berlín", "Francfort"),
        "Chile" to listOf("Santiago", "Valparaíso"),
        "Canadá" to listOf("Vancouver", "Ottawa", "Montreal")
        // Agrega más países y ciudades aquí...
    )

    // Método para obtener el impuesto del país actual
    protected open fun getTax(): Double {
        return taxesByCountry[country] ?: 0.0
    }

    // Método para obtener las ciudades disponibles para viajar en el país actual
    protected open fun getAvailableCities(): List<String> {
        return citiesByCountry[country] ?: emptyList()
    }

    abstract fun getPrice(numDays: Int): Int

    open fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        val taxAmount = price * getTax()
        val totalPrice = price + taxAmount

        if (price == 0) {
            println("Lo sentimos, no hacemos viajes a esta ciudad en este país")
        } else {
            println("Tu viaje a $city, $country cuesta \$$price")
            println("Impuesto aplicado: ${getTax() * 100}%")
            println("Total a pagar: \$$totalPrice")
        }
    }

}
