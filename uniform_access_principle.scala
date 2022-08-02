object uniform_access_principle {
    def main(args: Array[String]): Unit = {
        var x = List.range(1,10);   //methods hold parentheses
        var y = "This is a field" //fields dont hold parentheses

        println(x.length);
        println(y.length);
    }
}