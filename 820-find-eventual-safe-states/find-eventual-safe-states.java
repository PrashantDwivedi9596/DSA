class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

     ArrayList<ArrayList<Integer>> adjRevL = new ArrayList<>();
     for(int i = 0 ; i< graph.length; i++){
        adjRevL.add(new ArrayList<Integer>());
     }
     int n = graph.length;
     int[] outDeg = new int[n]; 


     for(int i = 0; i< n; i++){
        for(int j = 0; j< graph[i].length; j++){
            adjRevL.get(graph[i][j]).add(i);
            outDeg[i]++;
        }
     }

     Queue<Integer> q = new ArrayDeque<>();
     for(int i = 0; i<n ;i++){
        if(outDeg[i]==0){
            q.add(i);
        }
     }

     List<Integer> res = new ArrayList<>();

     while(!q.isEmpty()){
        int curr = q.remove();
        for(int start: adjRevL.get(curr)){
            // outDeg[start]--;
            if(--outDeg[start]==0){
                q.add(start);
            }
        }
        res.add(curr);
     }
     Collections.sort(res);
     return res;

    }
}