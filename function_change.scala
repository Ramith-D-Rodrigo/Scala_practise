object function_change extends App{
    def func(x:Int): Unit = {
        x = x + 1;
        println(x);
    }
    var x = 10;
    println(x);
    func(x);
}