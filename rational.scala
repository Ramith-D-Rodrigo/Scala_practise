object rational extends App{
    class Rational(a: Int, b: Int){

        require(b > 0, "Denominator must be positive");

        def this(x: Int) = this(x, 1);  //auxilary constructor

        val numer = a / gcd(a, b);
        val denom = b / gcd(a, b);

        override def toString(): String = numer + "/" + denom;

        private def gcd(a: Int, b: Int): Int = b match{
            case x if(b == 0) => Math.abs(a);   //abs to ignore negative values when finding the gcd
            case _ => gcd(b, a%b);
        }

        def <(that: Rational): Boolean = {
            this.numer * that.denom < that.numer * this.denom;
        }

        def <=(that: Rational): Boolean = {
            this.numer * that.denom <= that.numer * this.denom;
        }
        def >=(that: Rational): Boolean = {
            !(this < that)
        }        
        def >(that: Rational): Boolean = {
            !(this <= that)
        }

        def +(r: Rational): Rational = {
            new Rational(this.numer * r.denom + this.denom * r.numer, r.denom * this.denom);
        }

        def -(r: Rational): Rational = {
            new Rational(this.numer * r.denom - this.denom * r.numer, r.denom * this.denom);
        }
    }

    val num1 = new Rational(3,4);
    val num2 = new Rational(4,5);
    val num3 = num1 + num2;
    val num4 = num1 - num2;
    //val num5 = new Rational(3,-7); //cannot run as it is required to have denominator as positive

    println(num3.toString());
    println(num4.toString());

    println(num1 < num2);
    println(num1 > num2);

    val num6 = new Rational(4);
    println(num6.toString());
    
    
}