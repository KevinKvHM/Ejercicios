class PersonsCrud :  AbstractRespositoryCrud<Person>() {
    override fun filter(param: String): ArrayList<Person> {
        dataList.filter { person -> person.fulname.contains(param) /*or person.genero.contains(param)*/}
        return dataList
    }
}