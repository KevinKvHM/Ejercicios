import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test
import java.time.LocalDate

class DAOtest {
    private val repositoryCRUD: AbstractRepo<Person> by lazy { RepositoryCRUD() }
    private val predialCRUD: AbstractRepo<Predial> by lazy { PredialCrud() }
    private val impuestosCrud: AbstractRepo<Impuesto> by lazy { ImpuestoCrud() }
  //  var zona = Zona("","",0.0.toFloat())
    //var clave = Zona("","",0.0.toFloat())
    //var costo = Zona("","",0.0.toFloat())

@Test
fun initialize_isCorrect(){
    repositoryCRUD.cleanAll()
    predialCRUD.cleanAll()
    impuestosCrud.cleanAll()

    repositoryCRUD.insert(Person("Kevin", LocalDate.parse("1999-02-23"),false,"Masculino"))
    repositoryCRUD.insert(Person("Yobany",LocalDate.parse("1999-05-27"),false,"Masculino"))
    repositoryCRUD.insert(Person("Jose",LocalDate.parse("1944-12-17"),false,"Masculino"))
    repositoryCRUD.insert(Person("Brenda", LocalDate.parse("1998-10-17"), false,"Femenino"))
    repositoryCRUD.insert(Person("Sandra",LocalDate.parse("1945-07-23"),false,"Femenino"))
    repositoryCRUD.insert(Person("Lupe",LocalDate.parse("2000-08-14"),true,"Femenino"))
    repositoryCRUD.insert(Person("Karla",LocalDate.parse("2001-01-15"),true,"Femenino"))

    predialCRUD.insert(Predial(clave = Zona("Marginado","MAR"), 3))
    predialCRUD.insert(Predial(clave = Zona("Rural","RUR"),1))
    predialCRUD.insert(Predial(clave = Zona("Urbana","URB"),2))
    predialCRUD.insert(Predial(clave = Zona("Residencial","RES"),6))

    impuestosCrud.insert(Impuesto(LocalDate.parse("2021-09-17")))


    assertEquals(7, repositoryCRUD.dataList.size)
    assertEquals(4, predialCRUD.dataList.size)
    assertEquals(1, impuestosCrud.dataList.size)
    //assertEquals(0, clientesCRUD.dataList.size)
}
    @Test
    fun getAll_isCorrect(){
        initialize_isCorrect()
        val persons = repositoryCRUD.getAll()
        val impuestos = impuestosCrud.getAll()
        val prediales = predialCRUD.getAll()

        val person = persons.first{person -> person.fulname.contains("Jose") }

        val predial = prediales.first{predial -> predial.clave.clave.contains( "MAR")}

        val impuesto = impuestos.first { impuesto -> impuesto.mesPago.toString().contains("") }

        person.getNombre()
        /*person.getEdades()
        person.getMadreSoltera()
        predial.calcularCosto()*/
        //impuesto.getImpuestp()
        //impuesto.getMesPago()

        impuesto.importeTotal(person.getEdades(), person.getMadreSoltera(),predial.calcularCosto())


        assertNotNull(person)
        //assertNotNull(predial)
        //assertNotNull(fecha)
        //assertNotNull(cliente)
        //assertNotNull(nombre)

        assertTrue { person is Person}
        //assertTrue { predial is Predial}
        //assertTrue { fecha is Client}
    }

}





