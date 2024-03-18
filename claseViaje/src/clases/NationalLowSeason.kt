package clases

abstract class NationalLowSeason(override val city: String, override val country: String) : Travel(), CancelTravel {
    private val feesByCity = mapOf(
        "Santiago" to 643,
        "Valparaíso" to 721
        // Agrega más ciudades y tarifas aquí...
    )

    override fun getPrice(numDays: Int): Int {
        val fee = feesByCity[city]
        return fee ?: 0
    }

    override fun cancelTravel() {
        if (reserved) {
            reserved = false
            paidAmount = 0
            println("Viaje cancelado exitosamente.")
        } else {
            println("No se puede cancelar un viaje que no ha sido reservado.")
        }
    }
}

