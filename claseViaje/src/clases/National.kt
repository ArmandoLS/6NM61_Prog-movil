package clases

class National(override val city: String) : Travel() {
    override val country = "Mexico"
    private val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristobal de las Casas" to 240,
        "San Miguel de Allende" to 320
    )

    private val taxesByCountry = mapOf(
        "Mexico" to 0.1,  // Impuesto del 10% en México
        "Francia" to 0.15 // Impuesto del 15% en Francia
        // Agrega más países con sus impuestos aquí...
    )
    private val citiesByCountry = mapOf(
        "Mexico" to listOf("Monterrey", "Guadalajara", "CDMX", "San Cristobal de las Casas", "San Miguel de Allende"),
        "Francia" to listOf("París", "Marsella", "Niza", "Lyon"),
        "Alemania" to listOf("Munich", "Berlín", "Francfort"),
        "Chile" to listOf("Santiago", "Valparaíso"),
        "Canadá" to listOf("Vancouver", "Ottawa", "Montreal")
    )

    // Método para obtener el impuesto del país actual
    override fun getTax(): Double {
        return taxesByCountry[country] ?: 0.0
    }
    override fun getAvailableCities(): List<String> {
        return citiesByCountry[country] ?: emptyList()
    }

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city]
        return fee ?: 0
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        val taxAmount = price * getTax()
        val totalPrice = price + taxAmount

        if (price == 0) {
            println("Lo sentimos, no hacemos viajes a esta ciudad en este país")
        } else {
            println("Tu viaje a $city, $country cuesta \$$price")
            println("Impuesto aplicado: ${getTax() * 100}%")
            println("Monto del impuesto: \$$taxAmount")
            println("Total a pagar: \$$totalPrice")
        }
    }

}
