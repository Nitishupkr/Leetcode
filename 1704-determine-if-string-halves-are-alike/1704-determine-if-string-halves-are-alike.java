class Solution {
    public boolean halvesAreAlike(String s) {
     int n=s.length()/2;
        int count1=0;
        int count2=0;
        for(int i =0;i<n;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                count1++;
        }
    
             for(int i=n;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                count2++;
            
        
}
return count1==count2;
        
    }
}