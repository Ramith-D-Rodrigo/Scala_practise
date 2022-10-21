object b extends App{
    def binary(n: Int): Int = {
        if(n==0) 0
        else (binary(n/2).toString + (n%2).toString).toInt
    }
    println(binary(400))
}