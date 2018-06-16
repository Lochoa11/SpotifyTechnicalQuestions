class question1{
    public static void main(String[] args) {
        String t = "odg";
        String s = "good";

        

        System.out.println(sortByString(s, t));
    }

    public static String sortByString(String s, String t){
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
        return temp;
    }
}