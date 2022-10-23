public class LogicalOp {

    public int checkBiggerNumber(int first, int second){
        if (first > second){
            return first;
        }else {
            return second;
        }
    }
    String first = "FastTrackIT";
    String second = "FastTrackIT";
public String comparison (String first){
        if (first.equals(second)){
            System.out.println("Learning text comparison");
}else if (!first.equals(second)){
            System.out.println("Got to try some more");
    }
    return first;
}


public String comparison1 (String textInput, int numberInput) {
    if (textInput.equals("FastTrackIT") && numberInput <= 3) {
        return textInput + numberInput;
    } else if (!textInput.equals("FastTrackIT") && numberInput >= 4) {
        return numberInput + textInput;
    }
    return "No condition was met";
}



 public String snowFallAnalysisI (int snownumber) {
    if (snownumber > 8 ){
        return "The amount of snow this winter was(cm):" + snownumber;
    } else if (!(snownumber > 8)){
        return "The forecast snow is(cm):" + snownumber;
    } return "No condition was met ";
    }

    public String snowFallAnalysisII (int snownumber) {
        if (snownumber == 6 ){
            return "The amount of snow this winter was(cm):" + snownumber;
        } else if (!(snownumber == 6)){
            return "The forecast snow is(cm):" + snownumber;
        } return "No condition was met ";
    }

public String number (float num){
    if (num >3 && num != 4){
        return "The number is greater than 3 and not equal to 4";
    } else if (num == 4){
        return "The number is equal to 4";
    } else if (num < 3){
        return "The number is lower than 3";

    }return "No condition was met";
}

public String isNumberEven (int number2) {
    if (number2 % 2 == 0) {
        return "True";
    }
    else {
        return "False";
    }
}

    public String isEligibleToVote (int varsta) {
        if (varsta > 18) {
            return "True";
        } else {
            return "False";
        }
    }

        public int biggestOfThree(int xI, int yI, int zI){
            if (xI >= yI && xI >= zI){
                return xI;
            } else if (yI >= xI && yI >= zI)
                return yI;
             else if (zI >= xI && zI >= yI ) {
                return zI;
        } return (0);
}
    }



