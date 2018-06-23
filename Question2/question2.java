import java.util.Scanner;

class question2{
    public static void main(String[] args) {
        String s = "4[b3[a]]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s){
        int counter = 0;
        int positionInString = 0;
        String temp = "";
        String n = "";
        int numberOfOuterBracket = 0;
        while(s.charAt(positionInString) >= '0' && s.charAt(positionInString) <= '9'){
            n = n + s.charAt(positionInString);
            positionInString++;
        }
        numberOfOuterBracket++;
        counter = Integer.parseInt(n);
        positionInString++;
        while(counter > 0){
            String newTemp = "";
            int numberOfInnerBrackets = 0;
            while(numberOfOuterBracket != 0){
                if(s.charAt(positionInString) < '0' || s.charAt(positionInString) > '9'){
                    temp = temp + s.charAt(positionInString);
                    positionInString++;
                    continue;
                }
                else{
                    String newS = "";
                    while(s.charAt(positionInString) >= '0' && s.charAt(positionInString) <= '9'){
                        newS = newS + s.charAt(positionInString);
                        positionInString++;
                    }
                    newS = newS + s.charAt(positionInString);
                    numberOfInnerBrackets++;
                    while(numberOfInnerBrackets > 0){
                        if(s.charAt(positionInString) == ']'){
                            numberOfInnerBrackets--;
                        }
                        else if(s.charAt(positionInString) == '['){
                            numberOfInnerBrackets++;
                        }
                    }
                }
            }
        }
        return temp;
    }
}