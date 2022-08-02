object single{  //singleton declaration
    def getLines(x: String*): Unit = {
        for(i <- x){
            println(i);
        }
    }
}


object mytest{
    def main(args: Array[String]): Unit = {
        single.getLines("Bojji", "Onizuka", "Akari", "Light");
    }
}