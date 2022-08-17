object map_anonymous extends App{
    val x = List.range(1,10);

    val mult = (x: Int) => x * 2;

    val double = (mylist: List[Int]) => mylist.map(mult);

    println(x)
    println(double(x));
}