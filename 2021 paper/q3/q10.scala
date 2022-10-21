object q10 extends App{
    case class Student(name:String, age:Int){
        def fx = (s:Student) => if(s.age > age) true else false

        def print = (s:Student) =>
            if(fx(s)) printf(name + " is younger")
            else printf(s.name + " younger")
    }
    val s1= Student("Kasun", 49)
    val s2 = Student("chamath", 50)
    s1.print(s2)
}