class Solution {
  public String[] findWords(String[] words) {
  String s1 = "qwertyuiop";
  String s2 = "asdfghjkl";
  String s3 = "zxcvbnm";
  ArrayList<String> list = new ArrayList<>();
  for (int i = 0; i < words.length; i++) {
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int length = words[i].length();
    for (int j = 0; j < length; j++) {
      if (s1.indexOf(Character.toLowerCase(words[i].charAt(j))) >= 0) {
        count1++;
      } else if (s2.indexOf(Character.toLowerCase(words[i].charAt(j))) >= 0) {
        count2++;
      } else if (s3.indexOf(Character.toLowerCase(words[i].charAt(j))) >= 0) {
        count3++;
      }
      if (count1 == length || count2 == length || count3 == length) {
        list.add(words[i]);
        break;
      }
    }
  }

  String[] str = new String[list.size()];
  list.toArray(str);
  return str;
}
}
