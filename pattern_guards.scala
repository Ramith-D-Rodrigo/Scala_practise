object pattern_guards{
    def getSign(a: Int): Int = a match {
        case a if(a > 0) => return 1
        case a if(a == 0) => return 0
        case a if(a < 0) => return -1
    }
    def main(args: Array[String]): Unit = {
        println(getSign(10));
        println(getSign(0));
        println(getSign(-10));
    }
}