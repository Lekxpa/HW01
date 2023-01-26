public class Human {
    private String name;
    private String memberOfFamily;
    private String typeAnimal;
    public void setname(String name){
        this.name = name;
    }
    public void setmemberOfFamily(String memberOfFamily){
        this.memberOfFamily = memberOfFamily;
    }
    public void settypeAnimal(String typeAnimal){
        this.typeAnimal = typeAnimal;
    }
    public String getname(){
        return name;
    }
    public String gettypeAnimal(){
        return typeAnimal;
    }
    public String getmemberOfFamily(){
        return memberOfFamily;
    }
    @Override
    public String toString() {
        return this.name + " - " + this.memberOfFamily + " - have a " + typeAnimal;
    }
    public Human(String Name, String memberOfFamily, String typeAnimal){
        setname(Name);
        setmemberOfFamily(memberOfFamily);
        settypeAnimal(typeAnimal);
    }
    public void humancall(){
        if(typeAnimal == "cat") {
            System.out.println(name + ": Кис-кис, принеси мне тапки!");
        } else if (typeAnimal == "dog") {
            System.out.println(name + ": Собака, принеси газету!");
        }
        else {
            System.out.println(name + ": Малыш, иди поглажу!");}
    }
}
