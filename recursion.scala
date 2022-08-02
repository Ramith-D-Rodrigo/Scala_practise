object recursion {
    def rec(a: Int): Unit = {
        if(a == 0){
            println("Base case reached");
        }
        else{
            println(a);
            rec(a-1);
        }
    }
    def main(args: Array[String]): Unit = {
        rec(5);
    }
}