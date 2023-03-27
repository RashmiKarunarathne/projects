
public class Passenger extends Ship{
    //initialise instanse veriable

    private int noCabin;
    private String cusFname;
    private String cusSname;
    private long expense;

    //initialise set & get methods

    public Passenger(){}

    public void setnoCabin(int noCabin){
        this.noCabin = noCabin;
    }
    public int getnoCabin(){
        return noCabin;
    }

    public void setcusFname(String cusFname){
        this.cusFname = cusFname;
    }
    public String getcusFname(){
        return cusFname;
    }

    public void setcusSname(String cusSname){this.cusSname = cusSname;}
    public String getcusSname() {return cusSname;}

    public void setExpenses(long expense){this.expense = expense;}
    public long getExpenses(){return expense;}

}

