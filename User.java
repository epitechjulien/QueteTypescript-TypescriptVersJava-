import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class User  {
    public static void main(String[] args) {

        LocalDate birthdate;
        int size;

        Photo userPhotoData = new Photo("www.tototata.fr", "index.java", 200, 70);
        List<Object> userPhotosList = new ArrayList<>();
        userPhotosList.add(userPhotoData);

        Address userAddressData = new Address("5", "rue des montagnes", "Ouarzazate", "Maroc");
        List<Object> userAddressList = new ArrayList<>();
        userAddressList.add(userAddressData);

    }
}