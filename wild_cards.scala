//types of wild cards
//1 value binding
//2 wild card operator(_)

object wild_cards {
    def isEven(a: Int): Boolean = a % 2 match {
        case 0 => return true
        case _ => return false
    }

    def main(args: Array[String]): Unit = {
        println(isEven(22));
        println(isEven(13));
    }
}