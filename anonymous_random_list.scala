object anonymous_random_list extends App{
    val random_num = (x : Int) => scala.util.Random.nextInt(x);
    val random_list = (x : Int, y: Int) => List.fill(x)(random_num(y));

    println(random_list(10, 88));

}