package laboration4;

public class Program4h {

    public void country() {
        System.out.println("Land: Sverige");
    }

    public void residents() {
        System.out.println("Ca 9 miljoner invånare");
    }

    public void bigCities() {
        System.out.println("Tre stora städer:");
        System.out.println("Stockholm");
        System.out.println("Göteborg");
        System.out.println("Malmö");
    }

    private void message(){
    	country();
    	residents();
    	bigCities();
    }
    
    public static void main( String[] args ) {
    	Program4h p4h = new Program4h();
    	p4h.message();
    }
}
