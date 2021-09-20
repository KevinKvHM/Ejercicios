class PredialCrud : AbstractRepo<Predial>(){
    override fun filter(param: String): ArrayList<Predial> {
    dataList.filter { predial -> predial.clave.clave.contains(param) /*or predial.costo.costo.toString().contains(param)*/}
    return dataList
}
}
