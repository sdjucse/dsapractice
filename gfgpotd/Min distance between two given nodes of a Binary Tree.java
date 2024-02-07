class GfG {
    int ans=0;
    private int lca(Node root, int a,int b){
        if(root==null){
            return 0;
        }
        int lh= lca(root.left,a,b);
        int rh=lca(root.right,a,b);
        if(root.data==a || root.data==b){
            if(lh>0){
                ans=lh;
            }
            else if(rh>0){
                ans=rh;
            }
            else{
                return 1;
            }
        }
        if(lh>0 && rh>0){
            ans=lh+rh;
        }
        else if(rh!=0){
            return rh+1;
        }
        else if(lh!=0){
            return lh+1;
        }
        return 0;
    }
    int findDist(Node root, int a, int b) {
        if(a==b){
            return 0;
        }
        ans=0;
        lca(root,a,b);
        return ans;
    }
}