class Solution {
    private void dfs(int r,int c,int orig_color,int color,int image[][],int n,int m){
        image[r][c]=color;
      int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
      for(int k=0;k<4;k++){
        int newr=r+dir[k][0];
        int newc=c+dir[k][1];
        if(isSafe(newr,newc,n,m)&&image[newr][newc]==orig_color)
        dfs(newr,newc,image[newr][newc],color,image,n,m);
      }
    }
    private boolean isSafe(int r,int c,int n,int m){
        return(r>=0&&r<n&&c>=0&&c<m);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orig_color=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
        if(orig_color==color)
        return image;
        dfs(sr,sc,orig_color,color,image,n,m);
        return image;
    }
}
