package laboration24;

/**
 * Klassen Commodity representerar en vara i en butik.
 * @author Prince
 * @version 1.0
 */
public class Commodity {
    private String name;
    private String category;
    private int quantity;
    private double price;
    
    /**
     * Konstruerar och initialiserar en vara med name="", category="", 
     * quantity=0 och price=0.0.
     */
    public Commodity() {
    	this.name = "";
    	this.category = "";
    }
    
    /**
    * Konstruerar och initialiserar en vara med angivna värden.
    * @param name varans namn
    * @param category varans kategori
    * @param quantity antal varor på lagret
    * @param price varans pris
    */
    public Commodity(String name, String category, int quantity, double price) {
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}

    /**
    * Returnerar varans namn.
    * @return varans namn
    */
	public String getName() {
		return this.name;
	}

	/**
	* Sätter namnet på varan.
	* @param name namnet på varan
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returnerar varans kategori.
	 * @return varans kategori
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * Sätter namnet på varans kategori.
	 * @param category varans kategori
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Returnerar varans pris.
	 * @return price varans pris
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sätter varans pris.
	 * @param price varans pris
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Tar emot växeln lagrar i totala mängden,
	 * sedan returnerar den totala mängden.
	 * @param change växeln
	 * @return mängden
	 */
	public int changeQuantity(int change) {
		quantity += change;
		return this.quantity;
	}

	/**
	 * Skriver ut namnet, kategorin, kvantiteten och priset.
	 */
	public void info() {
        System.out.println(this.name + ", " + this.category + "\n" +
                           "Antal i lager: " + this.quantity + "\n" +
                           "Pris: " + this.price + " kr");
    }
}
