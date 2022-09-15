class Solution {
    public String sortSentence(String s) {
        String arr[] =s.split(" ");
        // it remove the spaces between the word
        String temp[]= new String[arr.length];
        // used to store the string in the temp variable
        String res ="";
        for(int i=0;i<arr.length;i++){
            // we hav to find the index for storing into the index
            int index=arr[i].charAt(arr[i].length()-1)-'0'; 
             temp[index-1] =arr[i].substring(0,arr[i].length()-1);
            //substring is used here to eliminate the number
            // in the array we take the length via arr.length 
            // and in the string we take the length via arr[i].length();
        }
        for(int i =0;i<temp.length;i++){
res+=temp[i];
            res+=" ";
        }
        return res.trim();
        
    }
}
//     String arr[] = s.split(" ");
//         String temp[] = new String[arr.length];
//         String res="";
        
//         for(int i=0;i<arr.length;i++)
//         {
//             int index = arr[i].charAt(arr[i].length()-1)-'0';
//             temp[index-1] = arr[i].substring(0,arr[i].length()-1);
//         }
//         for(int i=0;i<temp.length;i++)
//         {
//             res+=temp[i];
//             res+=" ";
//         }
//         return res.trim();
//     }
// }
