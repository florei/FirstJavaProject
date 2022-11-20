package AnimalRescue;

public class Animal {

    private String gender;
    private String name;
    private int age;
    private int healthLevel;
    private int hungryLevel;
    private String favoriteFood;
    private String favoriteActivity;

    public void setGender (String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHealthLevel(int healthLevel){
        this.healthLevel = healthLevel;
    }
    public int getHealthLevel(){
        return healthLevel;
    }
    public void setHungryLevel (int hungryLevel){
        this.hungryLevel = hungryLevel;
    }
    public int getHungryLevel(){
        return hungryLevel;
    }
    public void setFavoriteFood( String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteActivity(String favoriteActivity){
        this.favoriteActivity = favoriteActivity;
    }
    public String getFavoriteActivity(){
        return favoriteActivity;
    }


}
