object sign extends App{
    import scala.io.StdIn._;

    def sign(x: Int): Int = {
        x match{
            case x if x > 0 => 1;
            case x if x == 0 => 0;
            case x if x < 0 => -1; 
        }
    }
    var m = readInt();
    println(sign(m));
}