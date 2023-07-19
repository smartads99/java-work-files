public class loop {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            String ans="";
            for (int j = i; j < 26; j++) {
                char ch=(char)('a'+j);
                if(ch=='z'){
                    ch=(char)('a'+j);
                }
                ans=ans+ch;
            }
            System.out.print(ans);
            System.out.println();
        }
    }
}
