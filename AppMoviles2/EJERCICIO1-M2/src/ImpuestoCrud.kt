class ImpuestoCrud : AbstractRepo<Impuesto>(){
    override fun filter(param: String): ArrayList<Impuesto> {
        dataList.filter { impuestos -> impuestos.mesPago.toString().contentEquals(param)/*or predial.costo.costo.toString().contains(param)*/}
        return dataList
    }
}
