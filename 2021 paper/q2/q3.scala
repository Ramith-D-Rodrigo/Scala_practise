object q3 extends App{
    val listLen = (x:List[Int]) => (x.map(_ => 1).reduce((x,y) => x +y))
    val listMax = (x: List[Int]) => x.reduce((x,y) => if(x>y) x else y)
    val listMin = (x: List[Int]) => x.reduce((x,y) => if(x<y) x else y)

    val question = List(10,20,30, 5, 11,23, 2)

    val questionLength = listLen(question)
    val questionMax = listMax(question)
    val questionMin = listMin(question)
    println(questionLength)
    println(questionMax)
    println(questionMin)
}