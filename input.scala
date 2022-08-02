object input{
    //can import io as a package
    import scala.io.StdIn._;    //like iostream
    def main(args: Array[String]): Unit = {
        print("Enter a number: ");
        var a: Int = readInt();
        print("The number u entered: " + a);
    }
}