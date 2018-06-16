class question1{
    public static void main(String[] args) {
        String t = "odg";
        String s = "good";

        int patternLocation = 0;
        String temp = "";
        while(patternLocation < t.length()){
            int currentChar = 0;
            while(currentChar < s.length()){
                if(s.charAt(currentChar) == t.charAt(patternLocation)){
                    temp = temp + s.charAt(currentChar);
                }
                currentChar++;
            }
            patternLocation++;
        }
        System.out.println(temp);
    }
}