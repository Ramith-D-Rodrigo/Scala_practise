class player(name: String){
    def showPlayerName(): Unit = {
        println(name);
    }
}

class enemy(name: String, weaponName: String) extends player(name) {
    def showEnemyName(): Unit = {
        showPlayerName();
        println("With weapon "+ weaponName);
    }
}

object class_extends {
    def main(args: Array[String]): Unit = {
        var x = new player("Goku");
        var y = new enemy("Gintoki", "Lake Toya");
        x.showPlayerName();
        y.showEnemyName();
    }
}