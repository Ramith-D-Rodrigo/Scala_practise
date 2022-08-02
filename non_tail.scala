object non_tail extends App{
    def reverseInRange(a: Int, b: Int): Unit = {
        if(a < b)
            reverseInRange(a+1, b)
        print(a.toString() + " ")
    }

    reverseInRange(1, 10);
}