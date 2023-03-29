

// User function Template for Java

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here.
	    
	    List<List<Pair>> list = new ArrayList<>();
	    
	    for (int i =0;i<V;i++){
	        list.add(new ArrayList<>());
	    }
	    
	    for (int i =0;i<E;i++){
	        list.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
	        list.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
	    }
	    
	    PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)-> a.weight-b.weight);
	    
	    // i can start from any node as it is undirected graph 
	    // otherwise i need to put all nodes which have indegree as 0 
	    
	    pq.add(new Pair(0,0));
	    int sum = 0;
	    int vis[] = new int[V];
	    
	    while(pq.size()>0){
	        //System.out.println(pq);
	        Pair t = pq.poll();
	        
	        if (vis[t.to]==1){
	            continue;
	        }
	        vis[t.to] = 1;
	        sum+= t.weight;
	        
	        for (Pair child : list.get(t.to)){
	            if (vis[child.to]==0){
	                pq.add(child);
	            }
	        }
	    }
	    
	    return sum;
	    
	    
	    
	}
	
	static class Pair{
	    int to ;
	    int weight;
	    
	    public Pair( int to, int weight){
	        this.to = to ;
	        this.weight = weight;
	    }
	    
	    @Override
	    public String toString(){
	        return this.to+" "+this.weight;
	    }
	}
}
