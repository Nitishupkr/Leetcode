class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            // we cannot sort the string directly so we will convert it into the array
            char charArray[]= s.toCharArray();
            Arrays.sort(charArray);
            // now we will change the sorted array into the string 
            String sorted=new String(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<String>());
            }
            // then we will get the sorted and put the new String in it
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}