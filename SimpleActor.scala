import akka.actor.Actor 
import akka.actor.ActorSystem
import akka.actor.Props

object SimpleActor extends App{
    class myActor extends Actor{
        def receive = {
            case "Hello" => println("Hello, how are you?");
            case "Bye" => println("Good bye, I am going to miss you");
            case _ => println("I am sorry, I didn't understand");
        }
    }

    val actorSystem = ActorSystem("myActorSystem");
    val actor1 = actorSystem.actorOf(Props[myActor], "actor1");
    actor1 ! "Hello"

}