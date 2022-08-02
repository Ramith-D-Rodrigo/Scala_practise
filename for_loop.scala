object for_loop{
    def main(args: Array[String]): Unit = {
        for(i <- 0 to 10) {
            print(i.toString() + " ");
        }
        println("");

        for(i <- List("Ramith", "Dulsara", "Rodrigo")){
            println(i);
        }

    }
}