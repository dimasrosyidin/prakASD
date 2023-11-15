package tugas;
import java.util.Scanner;

public class Graph3  <T>{
    T [] vertex;
    LinkedList list[];

    public Graph3(String vertex2){
        this.vertex = vertex;
        list = new LinkedList[vertex.length];
        for (int i = 0; i < vertex.length ; i++){
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
        for(int i=0; i<vertex.length; i++){
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
            for(int i=0; i<vertex.length; i++){
                if(i==destination){
                    list[source].remove(destination);
                }
            }
        }

        public void removeAllEdges(){
            for(int i=0; i<vertex.length; i++){
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan");
        }
    

        public void printGraph() throws Exception{
            for(int i=0; i<vertex.length; i++){
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
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
    
        GraphArray <String> graph;
    
        try {
            System.out.print("Masukkan Jumlah Vertices\t: ");
            v = sc.nextInt();
            System.out.print("Masukkan Jumlah Edges\t\t: ");
            e = sc.nextInt();
        
            String[] vertexs = new String[v + 1]; 
            sc.nextLine();
            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertexs[i] = sc.nextLine();
            }
            graph = new GraphArray<String>(vertexs);
        
            System.out.println("Masukkan Edge: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(vertexs[i] + "\t");
            }
            System.out.println();
        
            for (int i = 1; i <= v; i++) {
                System.out.print(vertexs[i] + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error, Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close(); 
    }
}