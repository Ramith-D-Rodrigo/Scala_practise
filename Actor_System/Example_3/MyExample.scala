import akka.actor.Actor 
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.ActorRef

case class MyTimer(n:Int, him: ActorRef);

class CommunicationSystem extends Actor{
    def receive = {
        case MyTimer(n, other) => {
            if(n > 0){
                println(n, self)
                other ! MyTimer(n-1, self)
            }
            else{
                println("Countdown stopped")
            }
        }
        case "Didn't understand" => println("Sorry")
        case _ => sender ! "Didn't understand"
    }
}

object MyExample extends App{
    val system = ActorSystem("myCommunicationSystem");
    val actor1 = system.actorOf(Props[CommunicationSystem], "actor1");
    val actor2 = system.actorOf(Props[CommunicationSystem], "actor2");

    actor1 ! MyTimer(10, actor2);
}