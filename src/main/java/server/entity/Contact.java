package server.entity;

public class Contact {


    private final String name;
    private final String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() +
                ", email: " + this.getEmail() + "\n";
    }
}
