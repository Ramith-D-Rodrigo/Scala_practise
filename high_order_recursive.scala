object high_order_recursive extends App{
    def sum(func: (Int) => Int, x: Int, y: Int): Int = x match{
        case x if(x > y) => 0
        case _ => (func(x) + sum(func,x+1,y))
    }

    def single(x: Int) : Int =  x;
    def square(x: Int) : Int = x * x;
    def cube(x: Int): Int = x * x * x;

    print(sum(cube, 1, 10));
}