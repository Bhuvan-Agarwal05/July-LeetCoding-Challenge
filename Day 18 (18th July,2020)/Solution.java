class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new LinkedList[numCourses];
        for(int i=0;i<numCourses;i++)
            adj[i] = new LinkedList<>();
        
        for(int[] courses:prerequisites)
            adj[courses[1]].add(courses[0]);
        
        List<Integer> s = new LinkedList<>();
        int[] visited = new int[numCourses];
        
        for(int i=0;i<numCourses;i++)
            if(visited[i]==0 && DFS(i,adj,s,visited)) 
                return new int[0];
        
        Collections.reverse(s);
        int[] result = s.stream().mapToInt(Integer::intValue).toArray();
        
        return result;
        
            
    }
    
    private boolean DFS(int u,List<Integer>[] adj , List<Integer> s , int[] visited)
    {
        visited[u] = 1;
        for(int v:adj[u])
        {
            if(visited[v] == 1) return true;
            if( visited[v] == 0 && DFS(v,adj,s,visited) ) 
                return true;
        }
        
        visited[u]  = 2;
        s.add(u);
        return false;
    }
    
}