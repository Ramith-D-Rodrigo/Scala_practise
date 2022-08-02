class person(name: String, age: Int){
    def details(): Unit = {
        println(name + " " + age.toString);
    }
}

object primary_constructors{
    def main(args: Array[String]): Unit = {
        val pbj = new person("Goku", 45);
        pbj.details();
    }
}