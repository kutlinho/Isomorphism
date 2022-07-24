public class Operations {
    public boolean checkIsomorphism(Graph a, Graph b) {
        int[] firstGraphDegrees = findDegrees(a); // Getting degree array of first graph
        int[] secondGraphDegrees = findDegrees(b); // Getting degree array of second graph

        int fstTotalEdges=0;
        int sndTotalEdges=0;


        for(int i=0;i<a.getVerticeNumber();i++){
          fstTotalEdges+=degreeOfVertice(a.getMatrix()[i]); // Finding total edges of first graph
        }
        for(int i=0;i<b.getVerticeNumber();i++){
            sndTotalEdges+=degreeOfVertice(b.getMatrix()[i]); // Same for second
        }


        if(a.getVerticeNumber()==b.getVerticeNumber()){ // Checking whether two graphs have same amount of vertices
          if(fstTotalEdges==sndTotalEdges){//Checking whether two graphs have same amount of edges
              boolean isEqualed= false;
            for(int i=0;i<a.getVerticeNumber();i++){ // This loop checks if every vertice's degree is equaled by other graph.
                for(int j=0;j<b.getVerticeNumber();j++){
                    isEqualed=false;
                    if(firstGraphDegrees[i]==secondGraphDegrees[j]){
                        firstGraphDegrees[i]=secondGraphDegrees[j]=0;
                        isEqualed=true;
                    }
                }
            }
            if (isEqualed==true){
                return true;
            }
            return false;
          }
          return false;
        }
     return false;
    }
    public int degreeOfVertice(boolean[] vertice){
        int degree =0;
        for(boolean edge:vertice){
            if(edge ==true){
                degree++;
            }
        }
        return degree;
    }
    public int[] findDegrees(Graph a){
        int len = a.getMatrix()[0].length;
        int[] degreeArray= new int[len];
        for(int i=0;i<len;i++){
            int counter =0;
           counter+=degreeOfVertice(a.getMatrix()[i]);
            degreeArray[i]=counter;
        }
        return degreeArray;
    }
}
