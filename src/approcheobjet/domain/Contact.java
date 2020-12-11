package approcheobjet.domain;

public class Contact {

    private String name;
    private String email;
    private String tel;

    public Contact() {
        tel = "02.41.74.74.74";
    }

    public Contact (String name, String email){
        this();
        this.name = name;
        this.email = email;
    }

    public Contact (String name, String email, String tel){
        this(name, email);
        this.tel = tel;
    }
}
