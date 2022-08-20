object anonymous_distinct_char_string extends App{
    val file = scala.io.Source.fromFile("readFile.txt").getLines().mkString;

    val count_char = (c: Char, s: String) => (c, s.count(_ == c));

    val distinct_char = file.distinct.toCharArray().map(count_char(_, file));
    println(distinct_char.toList);
}