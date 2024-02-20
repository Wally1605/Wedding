public class Wedding {
    public String date;
    public Couple couple;
    public String location;

    public Wedding(String date, Couple couple, String location){
        this.date = date;
        this.couple = couple;
        this.location = location;
    }

    public String getDate(){
        return date;
    }
    public String getNames(){
        return couple.getBride()+" <3 "+couple.getGroom();
    }
    public String getLocation(){
        return location;
    }
}
