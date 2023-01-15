class Solution {
    public int minimumCardPickup(int[] cards) {
       int min=Integer.MAX_VALUE;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(!map.containsKey(cards[i])){
                map.put(cards[i],i);
                
            }else{
                int val=i-map.get(cards[i])+1;
                if(val<min){
                    min=val;
                }
                map.put(cards[i],i);
                
            }
        }
        if(min==Integer.MAX_VALUE){
          return -1;  
        }
        return min;
    }
}