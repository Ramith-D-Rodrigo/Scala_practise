object case_class extends App{

    trait color{
        var color: Int = 0;
        def setColor(c: Int): Unit;
        def printColor(): Unit;
    }

    trait print_class{
        def printIt: Unit;
    }

    case class Point(x: Int, y: Int) extends color with print_class{
        def +(that: Point): Point = {
            Point(this.x + that.x, this.y + that.y);
        }

        val pType = () => this match{
            case Point(0,0) => "Origin";
            case Point(x,0) => "Point on x axis";
            case Point(0,y) => "Point on y axis";
            case Point(x,y) => if(x > y) "X > Y" else if(x < y) "X < Y" else "X = Y";
        }
        def setColor(color: Int): Unit = {
            this.color = color;
        } 

        def printIt: Unit = println("x=" +x+" y="+y+" color="+color);

        def printColor(): Unit = color match {
            case 0 => println("Red");
            case 1 => println("Blue");
            case 2 => println("Green");
            case _ => println("Other");
        }
    }

    var p1 = Point(2,3);
    var p2 = Point(0,5);
    println(p1.toString());
    println(p2.toString());
    println(p1 == p2);
    println((p1+p2).toString());
    println(p1.pType());
    println(p2.pType());
    p1.setColor(4);
    p1.printIt;
    p1.printColor();
    
}