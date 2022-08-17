//a way of accessing members one by one

object iterator extends App{
    val names = Iterator("Ramith", "2B", "Jackal");

    while(names.hasNext){
        println(names.next());
    }

}