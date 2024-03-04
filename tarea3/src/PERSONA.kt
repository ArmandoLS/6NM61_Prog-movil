class Person(
    val nombre: String,
    val apellidos: String,
    val sexo: String,
    val altura: Double
)

fun main() {
    // Crear un objeto de Person
    val persona = Person(
        nombre = "Armando",
        apellidos = "Silva",
        sexo = "Masculino",
        altura = 1.70
    )

    // Imprimir los datos de la persona
    println("Nombre: ${persona.nombre}")
    println("Apellidos: ${persona.apellidos}")
    println("Sexo: ${persona.sexo}")
    println("Altura: ${persona.altura} metros")
}
