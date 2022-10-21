object q4 extends App{
    val vowel = List('a','e','i','o','u')
    val isVowel = (s:String) => vowel.contains(s.charAt(0).toLower)
    println(isVowel("Anya"))
    val vowelwords = (mylist:List[String]) => mylist.filter(isVowel(_))

    val l = List("hello", "egg", "okay", "yahoo","apple","yes")
    println(vowelwords(l))
}