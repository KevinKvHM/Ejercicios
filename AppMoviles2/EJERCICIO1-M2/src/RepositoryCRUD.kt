class RepositoryCRUD : AbstractRepo<Person>() {
    override fun filter(param: String): ArrayList<Person> {
        dataList.filter { Person -> Person.fulname.contains(param) }
        return dataList
    }
}