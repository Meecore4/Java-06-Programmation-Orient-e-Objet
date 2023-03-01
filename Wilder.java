public class Wilder {

    //attributes
    private String firstname;
    private boolean aware;

    //constructors
    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;

    }

    //getters
    public String getFirstname(){

        return this.firstname;
    }

    public boolean isAware(){

        return this.aware;
    }


    //setters
     public void setFirstname(String firstname){

        this.firstname = firstname;
    }

    public void setAware(boolean aware){

        this.aware = aware;
    }

    //methode
    public String whoAmI() {
	    
	    if(aware){
	    return "Je m'apelle " + this.getFirstname() + " et je suis aware";
	    
	    }else{
	     return "Je m'apelle " + this.getFirstname() + " et je ne suis pas aware";
	    }
    }
}
