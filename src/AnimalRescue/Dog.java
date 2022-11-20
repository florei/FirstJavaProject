package AnimalRescue;

public class Dog extends Animal {

    private String drool;
    private String snore;
    private String bark;
    private String dig;

    public void setDrool (String drool){
        this.drool= drool;
    }
    public String getDrool(){
        return drool;
    }
    public void setSnore(String snore){
        this.snore = snore;
    }
    public String getSnore(){
        return snore;
    }
    public void setBark (String bark){
        this.bark = bark;
    }
    public String getBark (){
        return bark;
    }
    public void setDig (String dig){
        this.dig = dig;
    }
    public String getDig(){
        return dig;
    }

    public void animalsound (){
        System.out.println("Dog's sound: ham, ham");
    }
    public void activities (){
        System.out.println("Dogs activity: digging");
    }

}
