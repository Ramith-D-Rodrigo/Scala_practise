object breaks {
    import scala.util.control._;

    def main(args: Array[String]): Unit = {
        var x = List.range(1, 10);
        var loop = new Breaks;
        loop.breakable {
            for(i <- x){
                if(i == 5){
                    loop.break
                }
                print(i.toString()+ " ");
            }
        }
    }
}