class Solution {
    final int mod=1000000007;
    HashMap<String,Integer> map=new HashMap<>();
    
    
    
    public int numRollsToTarget(int d, int f, int target) {
        
         if(target<d || target>f*d)
        {
            return 0;
        }
        if(d==1)
        {
            if(target<=f)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
       String key=""+d+f+target;
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        int ans=0;
       
        for(int i=1;i<=f;i++)
        {
            
                 ans+=numRollsToTarget(d-1,f,target-i);
                 ans%=mod;
          
            
        }
        map.put(key,ans);
        return ans;
        
    }
}
