object high_order_multiple_function_para extends App{
    def produce(func1: (Int, Int) => Int, func2: (Int, Int) => Int, x:Int, y:Int): (Int, Int) ={
        (func1(x,y) , func2(x,y))
    }
    def sum(x:Int, y:Int): Int = {
        x+y
    }

    def mul(x:Int, y:Int): Int = {
        x*y;
    }

    println(produce(sum, mul, 25,8))
}