import akka.actor.Actor 
import akka.actor.ActorSystem
import akka.actor.Props

class MyAkka extends Actor{
    def receive = {
        case "Hello" => println("Hello Akka!!");

        case "Ramith" => println("Hello Ramith");

        case _ => println("Known?");
    }
}

object Main extends App{
    val system = ActorSystem("HelloSystem");
    val actor1 = system.actorOf(Props[MyAkka], name = "MyAkka");

    actor1 ! "Hello";
    actor1 ! "Ramith";
}