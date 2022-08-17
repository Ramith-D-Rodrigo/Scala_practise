object filter_method extends App{
    val x = List.range(1,10);

    val even = x.filter(_%2 == 0);

    val even_func = (x:Int) => x % 2 == 0;

    val even2 = x.filter(even_func);

    println(x);
    println(even);
    println(even2);
}