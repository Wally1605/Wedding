
public class Couple{
    Person Bride = new Person("","");
    Person Groom = new Person("","");

    public Couple(Person Bride, Person Groom){
        this.Bride = Bride;
        this.Groom = Groom;
    }
    public String getBride(){
        return Bride.getFirst()+" "+Bride.getLast();
    }
    public String getGroom(){
        return Groom.getFirst()+" "+Groom.getLast();
    }
}
