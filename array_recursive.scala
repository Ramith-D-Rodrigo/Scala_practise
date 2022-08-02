object array_recursive{
    import scala.io.StdIn._;

    def createArray(i: Int): Array[Int] = {
        if(i < 1){
            Array();
        }
        else{
            Array(readInt()):++createArray(i-1);
        }
    }
    
    def printArray(arr: Array[Int]): Unit = {
        if(!arr.isEmpty){   //not empty
            print(arr.head + " ");
            printArray(arr.tail);
        }
    }
    def main(args: Array[String]): Unit = {
        print("Enter size: ");
        var size = readInt();
        var arr = createArray(size);
        printArray(arr);
    }
}