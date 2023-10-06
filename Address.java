public class Address {

    private String number;
    private String street;
    private String city;
    private String country;

    public Address(String number, String street, String city, String country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.country = country;
    }

        // Getter
        public String getNumber() {
            return this.number;
        }
        
        public String getStreet() {
            return this.street;
        }
    
        public String getCity() {
            return this.city;
        }
    
        public String getCountry() {
            return this.country;
        }
    
        // Setter
        public void setNumber(String number) {
            this.number = number;
        }
    
        public void setStreet(String street) {
            this.street = street;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
    
        public void setCountry(String country) {
            this.country = country;
        }
    
}