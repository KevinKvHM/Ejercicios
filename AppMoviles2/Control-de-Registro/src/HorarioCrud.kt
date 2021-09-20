class HorarioCrud :  AbstractRespositoryCrud<Horario>() {
    override fun filter(param: String): ArrayList<Horario> {
        dataList.filter { person -> person.horaEntrada.toString().contains(param) /*or person.genero.contains(param)*/}
        return dataList
    }
}