public class Solution {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        String[] str = path.split("/+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str) {
            if ((!s.equals("")) && (!s.equals(".."))) {
                stringBuilder.append("/").append(s);
            }
            if (s.equals("..")){
                stringBuilder.append("/");
            }
        }
        return stringBuilder.toString();
    }
}
