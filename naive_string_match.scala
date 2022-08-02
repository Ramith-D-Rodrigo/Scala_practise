object naive_string_match{
    import scala.io.StdIn._;
    import scala.util.control.Breaks._;

    def main(args: Array[String]): Unit = {
        print("Enter text: ");
        var text = readLine();
        print("Enter pattern: ");
        var pattern = readLine();
        var n = text.length();
        var m = pattern.length();
        var i = 0;
        var j = 0;
        var flag = 0;
        while(i < (n - m)){
            j = 0;
            while((j < m) & text(i+j) == pattern(j)){
                println(text(i+j) + " and " + pattern(j));
                j = j + 1;
                if(j == m){
                    flag = 1;
                    break
                }
            }
            if(flag == 1){
                break
            }

            i = i + j + 1;
        }
        if(flag == 1){
            print("Pattern found in index "+ i);
        }
        else{
            print("No pattern found");
        }
    }
}