object class_ob {
    class person(id: Int, name: String) {
        def details(): Unit = {
            println(id.toString+ " "+ name);
        }
    }
    def main(args: Array[String]): Unit = {
        var a = new person(1, "Ramith");
        var b = new person(2, "Goku");
        a.details();
        b.details();
    }
}