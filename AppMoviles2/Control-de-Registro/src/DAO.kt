import org.junit.Test
import java.time.LocalDate
import java.time.LocalTime
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class DAO{
    private val repositoryCRUD: AbstractRespositoryCrud<Person> by lazy { PersonsCrud() }
    private val empleadosCRUD: AbstractRespositoryCrud<Personal> by lazy { EmpleadoCrud() }
    private val horariosCRUD: AbstractRespositoryCrud<Horario> by lazy { HorarioCrud() }
    private val inicistenciasCRUD: AbstractRespositoryCrud<Asistencias> by lazy { AsistenciasCRUD() }

@Test
fun inizialize_iscorrect() {
    empleadosCRUD.cleanAll()
    repositoryCRUD.cleanAll()
    horariosCRUD.cleanAll()
    val horarios= Horario(LocalTime.MIN,
        LocalTime.MAX,LocalDate.MIN, LocalDate.MAX)
    //val id=Personal(fulname =Person("Kevin"),3,"", LocalDate.MIN,"","",horarios)

    empleadosCRUD.insert(Personal(fulname = Person("Kevin Uziel"),1,"Ingenieria", LocalDate.parse("2014-09-04"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
    empleadosCRUD.insert(Personal(fulname = Person("Mario Jose"),2,"Bachillerato", LocalDate.parse("2021-09-05"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
    empleadosCRUD.insert(Personal(fulname = Person("Jose Carlos"),3,"Bachillerato", LocalDate.parse("2021-09-03"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
    empleadosCRUD.insert(Personal(fulname = Person("Alexis Sanchez"),4,"Licenciatura", LocalDate.parse("2021-09-02"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
    empleadosCRUD.insert(Personal(fulname = Person("Luis Garcia"),5,"Licenciatura", LocalDate.parse("2021-09-06"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))

    val id = Personal(fulname = Person(" "),4," ", LocalDate.MIN," ","",horarios)


    val listEntrada = arrayOf(LocalDate.parse("2021-09-07"), LocalDate.parse("2021-09-09"), LocalDate.parse("2021-09-10"))
    val listEntrada2 = arrayOf(LocalDate.parse("2021-09-04"), LocalDate.parse("2021-09-05"), LocalDate.parse("2021-09-06"),LocalDate.parse("2021-09-07"),LocalDate.parse("2021-09-08"),LocalDate.parse("2021-09-09"),LocalDate.parse("2021-09-27"))
    val horaRegis= arrayOf(LocalTime.parse("10:00:00"),LocalTime.parse("08:00:00"),LocalTime.parse("08:40:00"),LocalTime.parse("08:15:00"),LocalTime.parse("08:21:00"),LocalTime.parse("08:30:00"),LocalTime.parse("08:00:00"))
    val horaSalida= arrayOf(LocalTime.parse("17:00:00"),LocalTime.parse("16:59:59"),LocalTime.parse("17:00:00"),LocalTime.parse("16:00:00"),LocalTime.parse("17:00:00"),LocalTime.parse("17:00:00"),LocalTime.parse("16:30:00"))

    inicistenciasCRUD.insert(Asistencias( id,horaRegis, horaSalida, listEntrada2))

    horariosCRUD.insert(Horario(LocalTime.MIN, LocalTime.MAX, LocalDate.parse("2021-09-01"), LocalDate.parse("2021-10-01")))

    assertEquals(5, empleadosCRUD.dataList.size)
//    assertEquals(1, horariosCRUD.dataList.size)
    assertEquals(1, inicistenciasCRUD.dataList.size)
//    assertEquals(1, repositoryCRUD.dataList.size)


}


    @Test
fun getAll_isCorrect(){
    inizialize_iscorrect()
    val personas = repositoryCRUD.getAll()
    val empleados =empleadosCRUD.getAll()
    val horarios = horariosCRUD.getAll()
    val inicistencias = inicistenciasCRUD.getAll()
    //val person = empleados.first{person -> person.fulname.fulname.contains("Kevin Uziel") }
    val id = empleados.first{person -> person.id.toString().contains("4") }
    val idA = inicistencias.first {idA -> idA.id.id.toString().contains("4")  }
    val fInicio = horarios.first { inicio-> inicio.horaEntrada.toString().contains("00:00")}
        id.fulname()
        id.getIdentificador()
        idA.ide()
        //hora.dia()
    //hora.horario(person.getIdentificador())
     id.imprimirHorario()

    //hora.getEntrada()
   //ide.getInicistencias(hora.getEntrada(), hora.getSalida())
        val inicio= fInicio.fechaInicioFin()
        val final=fInicio.fechaFin()
        idA.diasTrabajados()
        idA.asistencias(id.FechaIngreso(),inicio,final)



    assertNotNull(id)
    //assertNotNull(empleado)
    //assertTrue { person is Empleado }
    //assertTrue { empleado is Empleado }
    assertTrue{ id is Personal }
}

}
/*    @Test
    fun getEmpleado(){
        inizialize_iscorrect()
        val personas = empleadosCRUD.getAll()
        val person = personas.first{empleado -> empleado.fulname.contains("Kevin") }
        //val d= List<Empleado()>
        assertNotNull(person)
        assertTrue { person is Empleado }
    }
    /val idHorario = horarios.first{horario -> horario.id.id.toString().contains("2") }
        //val ide = inicistencias.first{asistencia -> asistencia.id.id.toString().contains("2") }
        //val id2 = empleados.first{person -> person.id.toString().contains("2") }
//    val hora = horarios.first{hora -> hora.horarioEntrada().toString().contains("08:00") }
 */



//    val hora = horarios.first{hora -> hora.horaEntrada.toString().contains("00:00:00") }
//    val inisistencia = inicistencias.first{inicistencia -> inicistencia.horaREntrada.toString().contains("10:30:00") }
//val ide = inicistencias.first { inicistencias -> inicistencias.id.id.toString().contains("2") }
//        val dia2 = inicistencias.first { inicistencias -> inicistencias.dia.toString().contains("2021-09-07") }
//val empleado = empleados.first{empleado -> empleado.fulname.contains("Kevin") }
/*empleado.hashCode()
empleado*/
//person.Ingreso()
//val horaReg= Asistencias(,LocalTime.parse("00:00:00"),LocalTime.parse("00:00:00"))

   // val id = Personal(fulname = Person(" "), 2," ", LocalDate.MIN," ","",horarios)

   // val new: Unit

      //new =     empleadosCRUD.insert(Personal(fulname = Person("Kevin Hernandez"),1,"Informatica", LocalDate.parse("2021-09-04"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
  /*empleadosCRUD.insert(Personal(fulname = Person("Kevin"),1,"Informatica", LocalDate.parse("2021-09-04"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
    empleadosCRUD.insert(Personal(fulname = Person("Kevin"),1,"Informatica", LocalDate.parse("2021-09-04"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
*/ //val id =
    /*horariosCRUD.insert(Horario( LocalTime.MIN, LocalTime.parse("15:45:12")))*/
    //val id = Personal(fulname = Person("Kevin"),1,"Informatica", LocalDate.parse("2021-09-04"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios)
    //empleadosCRUD.insert(Personal(fulname = Person("Kevin Uziel"),2,"Informatica", LocalDate.parse("2021-09-05"),"HEMK9900CVVR","1040-060-0414-MO1004-1245",horarios))
    //val id2 = Personal(fulname = Person(" "),0," ", LocalDate.parse(" ")," "," ",horarios)

    //horariosCRUD.insert(Horario(id=Personal(fulname =Person(""),2,"", LocalDate.MIN,"","",horarios), LocalTime.MIN, LocalTime.MAX,LocalDate.parse("2021-09-07"),LocalDate.parse("2021-10--07")))
    //val listEntrada = arrayOf<LocalDate>()
    //val horaEntrada: LocalDate
    //horaEntrada = LocalDate.parse("12021-09-05")
//inicistenciasCRUD.insert(Asistencias( horaRegis, horaSalida, listEntrada2))

    //inicistenciasCRUD.insert(Asistencias(1,horaRegis, horaSalida, listEntrada))
    //inicistenciasCRUD.insert(Asistencias(id,LocalTime.MIN, LocalTime.parse("15:45:12"), LocalDate.parse("2021-09-08")))
    //inicistenciasCRUD.insert(Asistencias(id, LocalTime.MIN, LocalTime.parse("17:00:00"), LocalDate.parse("2021-09-06")))
    //assertEquals(1,)

//repositoryCRUD.insert(Empleado("Kevin ","M",1,"Informatica", LocalDate.parse("2019-01-02"),"HEMK9900CVVR","1040-060-0414-MO1004-1245"))
//assertEquals(1, repositoryCRUD.dataList.size)
//assertEquals(0, empleadosCRUD.dataList.size)

