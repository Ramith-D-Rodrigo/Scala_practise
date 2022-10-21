object q8 extends App{
    def fx(n:Int):Boolean = n match{
        case 0 => true
        case _ => fy(n-1)
    }
    
    def fy(n:Int):Boolean = !(fx(n))

    val l = List(1,2,3,4,5,6,7)
    println(l.filter(fy).reduce((x,y)=>x+y))
}