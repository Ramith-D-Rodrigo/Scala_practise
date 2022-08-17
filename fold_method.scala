object fold_method extends App{
    //add with initial value

    val mylist = List.range(1,20);

    val total_with_20 = mylist.fold(20)((a,b) => a+b);

    println(total_with_20);
    val add_num = (x:Int, y:Int) => x + y;

    val total_with_20_anonymous = mylist.fold(20)(add_num);
    print(total_with_20_anonymous);
}