object anonymous_avg_list extends App{
    val sum_of_list = (my_list : List[Int]) => my_list.reduce((a,b) => a + b);
    val avg_of_list = (my_list : List[Int]) => sum_of_list(my_list)/my_list.size.toDouble;

    println(avg_of_list(List.range(1,20)));
}