import java.util.Random;

public class Animal {
    private String type;
    private String nickName;
    private String breed;
    public void setType(String type){
        this.type = type;
    }
    public void setnickName(String nickName){
        this.nickName = nickName;
    }
    public void setbreed(String breed){
        this.breed = breed;
    }
    public String getType() {
        return type;
    }
    public String getnickName(){
        return nickName;
    }
    public String getbreed(){
        return breed;
    }
    public Animal(String type, String nickName, String breed){
        setType(type);
        setnickName(nickName);
        setbreed(breed);
    }
    @Override
    public String toString(){
        return this.getType() + ", кличка - " + this.getnickName() + ", порода - " + getbreed();
    }
    public void animalAnswer(){
        if (type == "cat"){
            System.out.println(nickName + ": Мяу, уже несу!");
        } else if (type == "dog") {
            System.out.println(nickName + ": Гав, уже несу!");
        }else {
            System.out.println(nickName + ": Нет-нет, спасибо!");}
    }
}