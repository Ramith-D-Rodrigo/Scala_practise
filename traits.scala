trait t1 {
    def showSentence(): Unit = {
        println("This is the first sentence");
    }
}

trait t2 {
    def showSentence2(): Unit = {
        println("This is the second sentence");
    }
}

class myclass extends t1 with t2 {
    def showAll(): Unit = {
        showSentence();
        showSentence2();
    }
}

object traits {
    def main(args: Array[String]): Unit = {
        var obj = new myclass();
        obj.showAll();
    }
}