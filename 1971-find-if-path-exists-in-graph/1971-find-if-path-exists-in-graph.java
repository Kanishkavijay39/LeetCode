class Solution {
    class Edge{
        int src;
        int nbr;
        Edge(int src,int nbr){
            this.src=src;
            this.nbr=nbr;
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis=new boolean[n];
        ArrayList<Edge>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++) graph[i]=new ArrayList<Edge>();
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(new Edge(edges[i][0],edges[i][1]));
            graph[edges[i][1]].add(new Edge(edges[i][1],edges[i][0]));
        }
        
        return valid(graph,source,destination,vis);
    }
    public boolean valid(ArrayList<Edge>[] graph,int src,int dest,boolean[] vis){
        if(src==dest) return true;
        vis[src]=true;
        for(Edge e:graph[src]){
            if(!vis[e.nbr]){
                //unvisted+nbr
                boolean rres=valid(graph,e.nbr,dest,vis);
                if(rres) return true;
            }
        }
        return false;
    }
}