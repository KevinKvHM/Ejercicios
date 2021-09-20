data class Predial(
    //var zona: Zona,
    val clave: Zona,
    val numeroPredios: Int
    ){
    fun getCostos(): Float {
        var zonas: Zona
        var costo: Float= 0.0F
        when (clave.clave){
            "MAR" -> {
                zonas = Zona("Marginado",clave.clave)
                costo = 2.00F
                println("Zona: " + zonas.zona + " Clave: " + clave.clave + " Costo: " + costo)
            }

            "RUR" -> {
                zonas = Zona("Rural",clave.clave)
                costo = 8.00F
                println("Zona: "+zonas.zona+" Clave: "+clave.clave+" Costo: "+costo)
            }
            "UBR" ->{
                zonas = Zona("Urbana",clave.clave)
                costo = 10.00F
                println("Zona: "+zonas.zona+" Clave: "+clave.clave+" Costo: "+costo)
            }
            "RES" ->{
                zonas = Zona("Residencial",clave.clave)
                costo = 25.00F
                println("Zona: "+zonas.zona+" Clave: "+clave.clave+" Costo: "+costo)
            }
            else -> println("No se encotro regsitro de la zona o clave")

        }
        return costo
    }
    fun calcularCosto(): Float{
        var importeTotal: Float = 0.00F
        importeTotal= getCostos()*numeroPredios
        println("Numero de predios: $numeroPredios "+" Importe total: $importeTotal")
    return importeTotal
    }
}