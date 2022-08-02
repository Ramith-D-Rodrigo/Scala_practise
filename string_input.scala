object string_input{
    import scala.io.StdIn._;

    def main(args: Array[String]): Unit = {
        print("Enter your name: ");
        var name = readLine();
        print("Your name : " + name);
    }
}