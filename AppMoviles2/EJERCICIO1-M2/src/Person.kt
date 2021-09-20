import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month
import java.time.Year
import java.time.format.DateTimeFormatter

data class Person(
    val fulname: String,
    val fechaNacimiento: LocalDate, //fecha nacimiento+metodo
    val madresoltera: Boolean, //cambiar a tipo boolean
    val genero: String
    ) {


    fun getNombre(): String {

        println("Nombre: " + fulname)
        return fulname

    }

    fun getMadreSoltera(): Boolean {

        if (genero == "Femenino" && madresoltera == true) {
            println("Es madre Soltera: " + " Si")
        } else {
           // println("Es madre Soltera: " + "No")

        }
        return madresoltera
    }

        fun getEdades(): Int {
        var edad: Int

        val fActual = LocalDate.now()
        edad = fActual.year - fechaNacimiento.year

        println("Edad: " + edad)

        return edad

    }
}

