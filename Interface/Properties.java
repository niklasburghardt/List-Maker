package Interface;

public class Properties{

    String firstName;
    String name;
    String phone;
    String email;
    String birth;

    public Properties(String firstName, String name, String phone, String email, String birth){
        changeProperties(firstName, name, phone, email, birth);
    }

    public void changeProperties(String firstName, String name, String phone, String email, String birth){
        this.firstName = firstName;
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.birth = birth;
    }
}