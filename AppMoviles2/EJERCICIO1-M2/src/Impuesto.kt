import java.time.LocalDate
import java.time.Month

data class Impuesto (
    val mesPago: LocalDate,

    )
{
        fun importeTotal(edad: Int, madreSoltera: Boolean, costoTotal: Float): Float {
            var años: Int
            var madre: Boolean
            var total: Float
            //var total: Float = 0.0F
            años= edad.toInt()
            madre = madreSoltera
            total = costoTotal
            if(años >= 70 || madreSoltera == true){
               if(mesPago.month==Month.JANUARY || mesPago.month==Month.FEBRUARY) {
                   total = costoTotal * 0.70.toFloat()
                   println("Descuento del: 70%" + "Total a pagar: $"+total)
               }
                if(mesPago.monthValue>2){
                        total = costoTotal*0.50.toFloat()
                        println("Descuento del: 50% " + "Total a pagar: $"+total)
                    }
           }
            if(años <70 || madreSoltera==false){
                if (mesPago.month==Month.JANUARY || mesPago.month==Month.FEBRUARY){
                    total = costoTotal*0.40.toFloat()
                    println("Descuento del: 40% " + "Total a pagar: $"+total)
                }
            }
            return total

           }
            /*if(años <70 || madreSoltera == true.or(false)) {
                if (mesPago.monthValue<=2)
                total = costoTotal * 0.40.toFloat()
            }*/






    fun getMesPago(): Month? {
       println("Mes de Pago: "+mesPago.month)
     return mesPago.month
    }



}
