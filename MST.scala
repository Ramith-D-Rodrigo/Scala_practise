import scala.collection.mutable.Set as SET

case class Point(val vertex: Int, val x: Double, val y: Double);

class Graph(n: Int, p: List[Point]){
    var vertices = n;
    var edgeList = SET[(Point, Point, Double)]();

    for(i <- 0 until n){
        for(j <- i+1 until n){
            addEdge(p(i), p(j));
        }
    }

    private def addEdge(src: Point, dest: Point): Unit = {
        edgeList.add((src, dest, edgeWeight(src, dest)));
    }
    private def edgeWeight(src: Point, dest: Point) : Double = {
        Math.sqrt(Math.pow((src.x - dest.x), 2) + Math.pow((src.y - dest.y), 2)); //Euclidean Distance
    }
}

def Kruskal_MST(g: Graph): Array[(Point, Point, Double)] = {
    var minEdgeList = g.edgeList.toList.sortWith((x,y) => x(2) < y(2)); //Sorting the edges according to their weights

    var vertexSet = SET[SET[Int]]();
    for(i <- 1 to g.vertices){
        vertexSet.add(SET(i));
    }
    //var vertexSet = SET(vertices.map(x => SET(x)).toArray);
    var MST_vertices = Array[Int]();
    println(vertexSet);
    var MST_edges = Array[(Point, Point, Double)]();
    MST_edges = MST_edges :+ minEdgeList(0); //Adding the smallest edge
    MST_vertices = MST_vertices :+ minEdgeList(0)._1.vertex :+ minEdgeList(0)._2.vertex;
    for(i <- Range(1, minEdgeList.length)){
        var setIterator = vertexSet.iterator;
        while(setIterator.hasNext){
            var curr = setIterator.next();
            if(curr.contains(minEdgeList(i)._1.vertex) && curr.contains(minEdgeList(i)._2.vertex)){
                println("cycle");
            }
        }
        if(vertexSet.contains(SET(minEdgeList(i)._1.vertex).intersect(SET(minEdgeList(i)._2.vertex)))){
            println("cycle");
        }
        else{
            println("Helo");
            vertexSet.remove(SET(minEdgeList(i)._1.vertex));
            vertexSet.remove(SET(minEdgeList(i)._2.vertex));
            vertexSet.add(SET(minEdgeList(i)._1.vertex).union(SET(minEdgeList(i)._2.vertex)));
            println(vertexSet);
            MST_edges = MST_edges :+ minEdgeList(i); //Adding the new found minimum edge
            MST_vertices = MST_vertices :+ minEdgeList(i)._1.vertex :+ minEdgeList(i)._2.vertex;
        }
    }
    return MST_edges;
}


object MST extends App{
    var p1 = Point(1,2,3);
    var p2 = Point(2,6,7);
    var p3 = Point(3,4,5);
    var p4 = Point(4,1,1);
    var p5 = Point(5,7,8);

    var graphVertices = List(p1, p2, p3, p4, p5);
    var graph = new Graph(5, graphVertices);
    println(graph.edgeList.toString());
    var finallist = Kruskal_MST(graph);
    for(i <- 0 until finallist.length){
        println(finallist(i));
    }
    
}