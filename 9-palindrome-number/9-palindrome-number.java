class Solution {
    public boolean isPalindrome(int x) {
   
        int num=x;
int res=0;
if(x<0)
return false;
else
{
while(x!=0)
{
res=(res*10)+(x%10);
x/=10;
}
if(res==num)
return true;
else
return false;
}
}
}