object high_order_parameter extends App{
    val add = (x: Int, y: Int) => x + y;
    val mul = (x: Int, y: Int) => x * y;

    val operator = (func:(Int, Int) => Int, x: Int, y: Int) => func(x,y)

    println(operator(add, 5,7));
    println(operator(mul, 6,9));

}