class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> omap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            omap.put(ch,omap.getOrDefault(ch,0)+1);
        }
        int oc=t.length();
        int i=0,j=0,si=0,li=0,count=0,ans=Integer.MAX_VALUE;
        boolean flag=true;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(flag){
            flag=false;
            if(oc!=count && j<s.length()){
                flag=true;
                char ch=s.charAt(j);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
				if(omap.containsKey(ch)){
					if(hm.get(ch)<=omap.get(ch)) count++;
				}
                j++;
            }
            if(count==oc && i<s.length()){
				flag=true;
				if(j-i<ans) {
					ans=j-i;
					si=i;
					li=j;
				}
				char ch=s.charAt(i);
				int f=hm.get(ch);
				if(f==1) hm.remove(ch);
				else hm.put(ch,f-1);
				if(omap.containsKey(ch)){
					if(f-1<omap.get(ch)) count--;
				}
				i++;
			}
        }
		return s.substring(si,li);
	}
}
   