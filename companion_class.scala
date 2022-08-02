class companion_class {
    private val a = "My name is Ramith";
    val b = "Welcome to my program";

    def show(): Unit = {
        println(a);
        println(b);
    }
}

object companion_class{
    def main(args: Array[String]): Unit = {
        val obj = new companion_class();
        obj.show();
        println(obj.a);
    }
}