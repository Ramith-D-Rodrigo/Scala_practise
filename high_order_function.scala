object high_order_function extends App{

    val msg = (callback: () => Unit) => callback();

    val sayHello = () => println("Hello world")

    msg(sayHello);
}