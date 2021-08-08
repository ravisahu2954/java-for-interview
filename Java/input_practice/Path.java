package input_practice;

import java.io.*;
import java.util.*;

public class Path {
    static class Edge {
        int src;
        int nbr;
        int wt;
        
        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of node");
        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }
        System.out.println("enter number of edges");
        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
             String[] parts = br.readLine().split(" ");
             int v1 = Integer.parseInt(parts[0]);
             int v2 = Integer.parseInt(parts[1]);
             int wt = Integer.parseInt(parts[2]);
             graph[v1].add(new Edge(v1, v2, wt));
             graph[v2].add(new Edge(v2, v1, wt));
        }
        System.out.println("enter CITYA");
        int src = Integer.parseInt(br.readLine());
        System.out.println("enter CITYB");
        int des = Integer.parseInt(br.readLine());
      
        boolean[] visited = new boolean[vtces];
        
 
        dijkstra(graph, src, visited ,des);
    }
    
    static class Pair implements Comparable<Pair>{
        int vt;
        String psf;
        int wt;
        public Pair(int vt, String psf, int wt){
            this.vt = vt;
            this.psf = psf;
            this.wt = wt;
        }
        
        public int compareTo(Pair pair){
            return this.wt - pair.wt;
        }
    }
    
    public static void dijkstra(ArrayList<Edge>[] graph, int src, boolean[] visited ,int des){
        
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(src, src + "", 0));
        
        while(queue.size() > 0){
            Pair peek = queue.remove();
            
            if(visited[peek.vt] == true)
                continue;
                
            visited[peek.vt] = true;
            if(peek.vt==des) {
            System.out.println("path from "+ src+" to "+peek.vt+" " + peek.psf + " weight is " + peek.wt);
            break;
            }
            for(Edge e : graph[peek.vt]){
                if(visited[e.nbr] == false)
                    queue.add(new Pair(e.nbr, peek.psf + e.nbr, peek.wt + e.wt));
            }
        }
    }
}