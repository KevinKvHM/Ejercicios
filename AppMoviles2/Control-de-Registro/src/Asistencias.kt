import java.time.LocalDate
import java.time.LocalTime
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities

data class Asistencias(
    val id: Personal,
    var horaREntrada: Array<LocalTime>,
    val horaRSalida: Array<LocalTime>,
    val dia: Array<LocalDate>
) {
    fun diasTrabajados(): Array<LocalDate> {
        //val list = arrayOf<LocalDate>(dia)
        /*dias.forEach {
            dias->dias.dayOfMonth
        }*/
        for (x in dia.indices) {
            println("Fecha: "+dia.get(x)+" Hora de entrada: "+horaREntrada.get(x)+" Salida: "+horaRSalida.get(x))
        }

        return dia

    }
    fun asistencias(fIngreso: LocalDate,feInicio: LocalDate, feFin: LocalDate) {
        val x = 0
        var faltas: Int
        faltas = 0
        var faltas2: Int
        faltas2=0
        var antiguedad: Int
        var fActual: LocalDate
        fActual=LocalDate.now()
        antiguedad = fActual.year-fIngreso.year

        val fechainicio=feInicio.plusDays(15)
        for (x in dia.indices) {
            // if (dia.get(x).dayOfMonth <= fechainicio.dayOfMonth){
            //quincena++
            if (dia.get(x).dayOfMonth <= fechainicio.dayOfMonth) {
                if (horaREntrada.get(x).hour == 8 ) {
                    if (horaREntrada.get(x).minute >= 11) {
                        if (horaREntrada.get(x).minute <= 59) {
                            faltas++
                        }
                    }
                }
                if(horaREntrada.get(x).hour >8){
                    faltas++
                }
                //Salida
                if (horaRSalida.get(x).hour < 17) {
                    if (horaRSalida.get(x).minute <=59) {
                        if(horaRSalida.get(x).second ==0) {
                         if (horaRSalida.get(x).second <=59){   //if (horaREntrada.get(x).minute <= 20 || horaREntrada.get(x).minute > 20) {
                            faltas++
                        }
                            //}
                        }
                    }
                }
                /*if(antiguedad < 10){
                    if (faltas == 3 ) {


                    }
                    val faltasA: Int
                    faltasA = 1
                    faltas=faltasA
                }*/
            }

                //}
                if (dia.get(x).dayOfMonth > fechainicio.dayOfMonth) {
                    if (horaREntrada.get(x).hour == 8) {
                        if (horaREntrada.get(x).minute >= 11) {
                            if (horaREntrada.get(x).minute <= 20 || horaREntrada.get(x).minute > 20) {
                                faltas2++
                            }
                        }
                    }
                    if(horaREntrada.get(x).hour >8){
                        faltas2++
                    }
                    if (horaRSalida.get(x).hour < 17) {
                        if (horaRSalida.get(x).minute <=59) {
                            if(horaRSalida.get(x).second ==0) {
                                if (horaRSalida.get(x).second <=59){   //if (horaREntrada.get(x).minute <= 20 || horaREntrada.get(x).minute > 20) {
                                    faltas2++
                                }
                                //}
                            }
                        }
                    }

                }

        }

        println("Faltas Totales de la quincena 1: "+faltas)
        println("Faltas totales de la quincena 2: " + faltas2)
        println("Antiguedad: " + antiguedad+" años")
    }


            /*for( x in horaREntrada.indices){
                if(horaREntrada.get(x).hour==0){
                    println("Tienes falta o permiso justificado")
                    //println(horaREntrada.get(x).hour)
                }
                /*if(horaREntrada.get(x).hour>8){
                    faltas++
                    println("Numero de faltas despues de las 8: "+faltas+" S"+ horaRSalida.get(x))

                }*/
                if(horaREntrada.get(x).hour==8 || horaREntrada.get(x).hour>8 && horaREntrada.get(x).minute>=11){
                    if (horaREntrada.get(x).minute<=20){

                        faltas++


                    }
                }

                /*if(horaREntrada.get(x).hour==8 && horaREntrada.get(x).minute>=11){
                    if (horaREntrada.get(x).minute<=20){

                        faltas= horaREntrada.get(x).hour
                        println("Numero de faltas: "+faltas+horaREntrada.get(x).minute+" S"+ horaRSalida.get(x))

                    }
                }*/


            }
            println("Numero de faltas: "+faltas)*/
//        }

 //   }



    fun ide():Personal{
        //println("Id desde asistencia: "+id.id)
        return id
    }
}
    /*fun getInicistencias(entrada: LocalTime, salida: LocalTime): LocalTime {
        //val hEntrada: LocalTime
        horaREntrada = entrada
        val hSalida: LocalTime
        hSalida = salida
        //if(dia)
        /*val dias = dia.plusDays(6)
        if(dia.dayOfMonth<=6) {
            val dias: Calendar
            dias = Calendar.getInstance()
            val inacistenciastotales: Int
            inacistenciastotales = dia.dayOfMonth
            println("Faltas: "+ )

        }*/
        val dias = dia
        if (horaREntrada.hour == 0 && horaREntrada.minute == 0) {
            val hora: String
            hora = "Sin registro"
            println("Hora: $hora "+dia.dayOfMonth)

            var retaro = +1
            println("Tienes $retaro falta o permiso")
        }
        //rintln("Hora registrada de entrada: $total"+"Hora de salida registrada: "+e)
        return entrada
        /*fun getInicistencias(entrada: LocalTime, salida: LocalTime): LocalTime {
        val hEntrada: LocalTime
        hEntrada= entrada
        val hSalida: LocalTime
        hSalida = salida

        if(hEntrada.hour == 0 && hEntrada.minute == 0){
            var retaro= retardos+1
            println("Tienes $retaro falta o permiso")
        }
        //rintln("Hora registrada de entrada: $total"+"Hora de salida registrada: "+e)
        return entrada
    }
    }*/