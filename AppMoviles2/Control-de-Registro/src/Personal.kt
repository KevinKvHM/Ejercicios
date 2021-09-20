import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Personal (

    val fulname: Person,
    val id: Int,
    val gradoAcademico: String,
    val fechaIngreso: LocalDate,
    val curp: String,
    val claveP: String,
    //val horaEntrada: Horario,
    val horario: Horario
    ){

    fun fulname(): Person{
        println("Nombre: "+fulname.fulname)
        return fulname
    }
    fun getIdentificador(): Int{
        println("Id del personal: "+id)
        return id
    }
    fun nivelEstudios(): String{
        return gradoAcademico
        }
    fun FechaIngreso(): LocalDate {

        return fechaIngreso
    }
    fun imprimirHorario(): Horario{
        //val horaEntrada: Horario
        //val horaEntrada = Horario(LocalTime.parse("00:00:00"), LocalTime.parse("00:00:00"))
        val entrada= horario.horarioEntrada()
        val salida= horario.horarioSalida()
        println("Horario: "+entrada+" am - "+salida+" pm")
        return horario
    }


}
    /*


    (
    val id: Int,
    val fulname: Person,
    val gradoAcademico: String,
    val curp: Person,
    val fechaIngreso: LocalDate,
    val genero: Person,
    val clavePresupestual: String
)
{
    fun datatime(): LocalDateTime{
        val fecha = LocalDateTime.now()
        println("fecha: $fecha")
        return fecha
    }
}

     */