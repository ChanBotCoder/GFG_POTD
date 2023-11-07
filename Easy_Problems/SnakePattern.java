class SnakePattern{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        int col = matrix.length;
        int row = matrix[0].length;
        for(int i=0;i<col;i++){
            if(i%2 == 0){
                for(int j=0;j<row;j++) ans.add(matrix[i][j]);
            }
            else{
                for(int k=row-1;k>=0;k--) ans.add(matrix[i][k]);
            }
        }
        return ans;
    }
}
https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
