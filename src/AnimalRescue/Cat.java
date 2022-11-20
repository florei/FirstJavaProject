package AnimalRescue;

public class Cat extends Animal {

    private String purring;
    private String meow;
    private String hissing;
    private String yowl;
    private String chattering;

    public void setPurring (String purring){
        this.purring=purring;
    }
    public String getPurring(){
        return purring;
    }
    public void setMeow (String meow){
        this.meow = meow;
    }
    public String getMeow (){
        return meow;
    }

    public void setHissing (String hissing){
        this.hissing = hissing;
    }
    public String getHissing(){
        return hissing;
    }

    public void setYowl (String yowl){
        this.yowl = yowl;
    }
    public String getYowl (){
        return yowl;
    }

    public void setChattering (String chattering){
        this.chattering = chattering;
    }
    public String getChattering(){
        return chattering;
    }

    public void animalsound (){
        System.out.println("Cat's sound: meow, meow");
    }

    @Override
    public void activities() {
        System.out.println("Cats activity: purring ");
    }
}
