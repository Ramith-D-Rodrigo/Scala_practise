object reduce_method extends App{

    val mylist = List.range(1,20);

    val total = mylist.reduce((a,b) => a+b);
    println(total);

    val add_numbers = (x:Int, y:Int) => x + y;

    val total2 = mylist.reduce(add_numbers);
    println(total2);

}