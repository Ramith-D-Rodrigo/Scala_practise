//a way of looping through elements without using traditional loops 
//follows functional programming concept 

object map_methods extends App{
    val x = List.range(1, 10);

    val data = x.map(_*2);
    val data2 = x.map(i => i * 2);
    println(data);
    println(data2);

}