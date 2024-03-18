package clases
class International(override val country: String, override val city: String) : Travel() {
    init {
        if (country.isBlank() || city.isBlank()) {
            throw IllegalArgumentException("El nombre del país y la ciudad deben ser proporcionados")
        }
    }

    override val serviceType = "Viaje Internacional"

    private val fees = mapOf(
        Pair("Francia", "París") to 800,
        Pair("Italia", "Roma") to 750,
        Pair("Japón", "Tokio") to 900,
        Pair("Australia", "Sídney") to 1000,
        Pair("Alemania", "Berlín") to 850,
        Pair("Chile", "Santiago") to 850,
        Pair("Canadá", "Nueva York") to 850,
        Pair("Canada", "Vancouver") to 850
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees[Pair(country, city)]
        return fee ?: 0
    }
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

    private val citiesByCountry = mapOf(
        "Mexico" to listOf("Monterrey", "Guadalajara", "CDMX", "San Cristobal de las Casas", "San Miguel de Allende"),
        "Francia" to listOf("París", "Marsella", "Niza", "Lyon"),
        "Alemania" to listOf("Munich", "Berlín", "Francfort"),
        "Chile" to listOf("Santiago", "Valparaíso"),
        "Canadá" to listOf("Vancouver", "Ottawa", "Montreal")

        // Agrega más países y ciudades aquí...
    )
    override fun getTax(): Double {
        return taxesByCountry[country] ?: 0.0
    }
}
