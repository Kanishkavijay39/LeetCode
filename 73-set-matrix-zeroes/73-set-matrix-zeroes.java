class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        //for row 0 col 0
        boolean row=false,col=false;
        
        //checking 0 is present or not in col 0
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                col=true;
            }
        }
        
        //checking 0 is present or not in row 0
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                row=true;
            }
        }
        
        //now working for rest of matrix that is from 1 row and 1 col and if found 0 then i will set it to then uske 0th row and 0th col pe 0 kr dungi
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        //jahan row0 mai 0 hai wahan 0 kr dete h
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
//j=1 se isliye kiya h kyuki 0th row m kr chuke 0 already starting m
                for(int j=1;j<m;j++){ 
                    matrix[i][j]=0;
                }
            }
        }
        
        //same col ke saath
        for(int j=1;j<m;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
        
        //actual mai kahin o ho row 0 me boolean liya tha
        if(row){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        
        if(col){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}