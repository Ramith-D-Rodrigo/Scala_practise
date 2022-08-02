case class vehicle(name: String, price: Int) {
    def show(): Unit = {
        println(name+" "+price.toString);
    }
}

object case_class_ex{
    def main(args: Array[String]): Unit = {
        val obj1 = new vehicle("BMW", 40);
        val obj2 = new vehicle("Benz", 10);
        val avl = List(obj1, obj2);

        for(i <- avl){
            i match {
                case vehicle(x, y) if(y > 20) => println("Expensive")
                case _ => println("cheap")
            }
        }
    }
}