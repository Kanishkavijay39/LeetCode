class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        char[][] board=new char[n][n];
        //let's fill this board with .
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,ans,ds,0);
        return ans;
    }
    
    //backtracking
    public void nQueens(char[][] chess,List<List<String>> ansList,List<String> ds,int row){
        //base condition aakhiri row m pauch gya
        if(row==chess.length){
            ansList.add(new ArrayList<>(ds));
            return;
        }
        //columns pe rakh rakh ke dekhte h
        for(int col=0;col<chess[0].length;col++){
            if(isSafe(chess,row,col)){
                chess[row][col]='Q';  //mark
                //maine abhi ds mai kuch add nhi kiya h abhi tak
            char[] r = new char[chess.length];
            Arrays.fill(r, '.');
            r[col] = 'Q';
            ds.add(new String(r));
                nQueens(chess,ansList,ds,row+1);
                chess[row][col]='.';  //unplace
            ds.remove(ds.size()-1);
            }
        }
    }
    
    public static boolean isSafe(char[][] chess,int row,int col){
        //vertical up check
        for(int tmp=row-1;tmp>=0;tmp--){
            if(chess[tmp][col]=='Q') return false;
        }
        
        //diagonal left check
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='Q') return false;
        }
        
        //diagonal right check
        for(int i=row-1,j=col+1;i>=0 && j<chess[0].length;i--,j++){
            if(chess[i][j]=='Q') return false;
        }
        return true;
    }
    
}