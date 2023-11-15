package tugas;
import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex ; i++){
            list[i] = new LinkedList();
        }
    }

    public void addEdge (int source, int destination) {
        //add edge
        list[source].addFirst(destination);

        //add back edge for undirected
        list[destination].addFirst(source);
    }

    public void degree(int source)throws Exception{
        //degree directed graph
        System.out.println("Degree vertex "+source +" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k, totalIn =0, totalOut = 0;
        for(int i=0; i<vertex; i++){
            for(int j=0; j<list[i].size(); j++){
                if(list[i].get(j)==source)
                    ++totalIn;
            }
            //outDegree
            for(k=0; k<list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+source+" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source+" : "+totalOut);
        System.out.println("degree vertex "+source+" : "+(totalIn+totalOut));
    }

        public void removeEdge(int source, int destination)throws Exception{
            for(int i=0; i<vertex; i++){
                if(i==destination){
                    list[source].remove(destination);
                }
            }
        }

        public void removeAllEdges(){
            for(int i=0; i<vertex; i++){
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan");
        }
    

        public void printGraph() throws Exception{
            for(int i=0; i<vertex; i++){
                if(list[i].size()>0){
                    System.out.print("Vertex "+ i+ "terhubung dengan : ");
                    for(int j=0; j<list[i].size(); j++){
                        System.out.print(list[i].get(j)+" ");
                    }
                    System.out.println("");
                }
            }
            System.out.println(" ");
        }

    //tugas 2
    public boolean graphType(int source, int destination) throws Exception{
        list[source].addFirst(destination);
        return true;
    }
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int vertex, edge, source, destination;
    Graph graph = new Graph(6);

    System.out.print("Masukkan Vertex: ");
    vertex = sc.nextInt();

    System.out.print("Masukkan Edge: ");
    edge = sc.nextInt();

    int menu;
    do{
        System.out.println("Pilih menu dibawah ini");
        System.out.println("1. Directed");//tugas 1
        System.out.println("2. Undirected");//tugas 2
        System.out.print("Masukkan Menu : ");
        menu = sc.nextInt();
    
        if(menu == 1){
            
            for(int i=0; i<edge; i++){
                System.out.print("Masukkan Source\t\t: ");
                source = sc.nextInt();
                System.out.print("Masukkan Destination\t: ");
                destination = sc.nextInt();
    
                graph.addEdge(source, destination);
            }
            System.out.println("");
            graph.printGraph();
        }else if(menu == 2){
        
            for(int i=0; i<edge; i++){
                System.out.print("Masukkan Source\t\t: ");
                source = sc.nextInt();
                System.out.print("Masukkan Destination\t: ");
                destination = sc.nextInt();
    
                graph.graphType(source, destination);
            }
            System.out.println("");
            graph.printGraph();
        }
    }while (menu != 1 && menu != 2);
}
}
