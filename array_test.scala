object array_test{
    import scala.io.StdIn._;
    def main(args: Array[String]): Unit = {
        var arr_size = readInt();
        var arr = new Array[Int](arr_size);
        var i = 0;
        while( i < arr_size){
            print("enter a number: ");
            var temp = readInt();
            arr(i) = temp;
            i = i+ 1;
        }

        i = 0;
        while( i < arr_size){
            print(arr(i)+ ", ");
            i = i+ 1;
        }
    }
}