object anonymous_no_of_words_in_file extends App{
    val file = scala.io.Source.fromFile("readFile.txt").getLines();

    //seperating words
    val words = file.flatMap((x => x.split(" ")));

    val numbered_word = words.map(x => (x, 1));
    val count = numbered_word.reduce((x,y) => ("Count", x._2+y._2));

    println(count);
}