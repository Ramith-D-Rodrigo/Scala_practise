object Case{
    import scala.io.StdIn._;
    def main(args: Array[String]): Unit = {
        var x = readInt();
        x match {
            case 1 => println("number 1");
            case 2 => println("number 2");
            case _ => println("default");
        }
    }
}