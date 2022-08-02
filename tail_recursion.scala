object tail_recursion extends App{
    def gcd(x: Int, y: Int): Int = {
        if(y == 0){
            return x;
        }
        else if(y > x){
            gcd(y, x);
        }
        else{
            gcd(y, x % y);
        }
    }
    println(gcd(10,20));

    def checkPrime(x: Int, y: Int = 2): Boolean = {
        if(x == y){
            return true;
        }
        else if(x % y == 0){
            return false;
        }
        else{
            checkPrime(x, y+1);
        }
    }

    println(checkPrime(7));
}