import akka.actor.Actor 
import akka.actor.ActorSystem
import akka.actor.Props
import akka.pattern.ask 
import scala.concurrent.duration._
import akka.util.Timeout
import scala.concurrent.Await
import scala.language.postfixOps

case class Message(op:String, x:Int, y:Int)

class MsgSystem extends Actor {
    def receive = {
        case Message("+", x:Int, y:Int) => {println(self); sender ! x + y}
        case Message("*", x:Int, y:Int) => {println(self); sender ! x * y}
        case Message("-", x:Int, y:Int) => sender ! x - y
        case Message("/", x:Int, y:Int) => sender ! x / y
        case _ => println("Known Message?")
    }
}

object Main extends App{
    val system = ActorSystem("MsgSystem");

    val actor1 = system.actorOf(Props[MsgSystem], name = "MsgSystem1")
    val actor2 = system.actorOf(Props[MsgSystem], name = "MsgSystem2")

    implicit  val timeout = Timeout(5 seconds);
    val result1 = actor1 ? Message("+", 4,5);
    val result2 = actor2 ? Message("*", 42,5);
    val answer1 = Await.result(result1, timeout.duration);
    val answer2 = Await.result(result2, timeout.duration);
    println(answer1);
    println(answer2);

}