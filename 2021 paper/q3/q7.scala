object q7 extends App{
    val cube = (x:Int) => x*x*x;
    val square = (x:Int) => x* x;

    val print = (f1:Int=>Int, f2:Int=>Int, x:Int)=>println(f1(x) +f2(x))
    print(cube,square,2)
}