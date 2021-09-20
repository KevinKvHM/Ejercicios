import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities

class Horario(
    val horaEntrada: LocalTime,
    val horaSalida: LocalTime,
    var fechaInicio: LocalDate,
    var fechaFin: LocalDate
    ){
    fun fechaInicioFin(): LocalDate{
        //fechaInicio.plusDays(1)


        println("Fecha de inicio: "+fechaInicio)
        //println("Fecha de Fin: "+fechaFin)
        return fechaInicio
    }
    fun fechaFin(): LocalDate{
        //println("Fecha de inicio: "+fechaInicio)
        println("Fecha de Fin: "+fechaFin)
        return fechaFin
    }

    fun horarioEntrada(): LocalTime{
        //var fechaInicio: LocalDate
//        val fechaInicio= LocalDate.MAX.plusMonths(1)
        val horarioAm: LocalTime
        //fechaInicio = LocalDate.now()
        val horarioPm: LocalTime
        horarioAm = LocalTime.parse("08:00:00")
        //horarioPm = LocalTime.parse("17:00:00")
        val horaios: String


        //println("Fecha Inicio: "+horarioAm)

        return horarioAm
    }
    fun horarioSalida(): LocalTime{
        //val ide = id
        val horarioPm: LocalTime
        //horarioAm = LocalTime.parse("08:00:00")
        horarioPm = LocalTime.parse("17:00:00")
        //val horaios: String
        //horaios = horarioAm.toString()+horarioPm

        //println("$horarioPm pm")

        return horarioPm

    }

    fun getEntrada(): LocalTime{
        val hora: LocalTime
       //hora = LocalTime.now()
        //println("Entrada: "+horaSalida)
        return horaEntrada
    }
    fun getSalida(): LocalTime{
        return horaSalida
    }



}


/* val id: Personal,
    val dia: LocalDate,
    val fechaInicial: LocalDate,
    val fechaFinal: LocalDate,*/
/*fun dia(): LocalDate{
      val dia: LocalDate
      //dia = LocalDate.now()
      //val dias = dia.dayOfWeek


      //println("Dia: "+dia.dayOfWeek+""+dia.dayOfMonth)
      return dia
  }*/
/*fun Inicio(): LocalDate{
    var fechaInicio: LocalDate
    //fechaInicio = Asistencias(id.id,"","","")
    fechaInicio = dia

    return fechaInicio
}*/
