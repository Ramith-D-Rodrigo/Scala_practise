object anonymous_occurence_word extends App{
    val file = scala.io.Source.fromFile("readFile.txt").getLines().mkString;

    val seperate = (s : String) => s.split(" ").map(_.toLowerCase());

    //println(seperate(file).toList);


    val occ = (txt: Array[String], s : String) => txt.filter(_ == s).size;

    val occ_intermediate_func = (txt: Array[String], s : String) => txt.filter(_ == s);

    println(occ(seperate(file), "read"));


}