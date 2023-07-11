#User function Template for python3
class Solution:
    def findK(self, a, n, m, k):
        traversed=[]
        top,bottom,left,right=0,n-1,0,m-1
        while top<=bottom and left<=right:
            for i in range(left,right+1):
                traversed.append(a[top][i])
            top+=1
            
            for i in range(top,bottom+1):
                traversed.append(a[i][right])
            right-=1
            
            for i in range(right,left-1,-1):
                traversed.append(a[bottom][i])
            bottom-=1
            
            for i in range(bottom,top-1,-1):
                traversed.append(a[i][left])
            left+=1
        return traversed[k-1]
#{ 
 # Driver Code Starts

#Initial Template for Python 3

for _ in range(int(input())):
    n, m, k = map(int,input().split())
    a = [
            list(map(int,input().split()))
            for _ in range(n)
        ]
    
    ob = Solution()
    print(ob.findK(a,n,m,k))
    
# } Driver Code Ends