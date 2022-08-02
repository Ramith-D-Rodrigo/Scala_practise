object closure{

    val idle = 10;
    val dummy = (x: Int) => x + idle;

    def main(args: Array[String]): Unit = {
        println(dummy(20));
    }
}