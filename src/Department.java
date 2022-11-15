public class Department {

    int id;
    String name;
    String numerOfEmployees;
    Location location;

    private class Location {
        String city, street;

        public Location(String city, String street) {
            this.city = city;
            this.street = street;
        }
    }



    public Department(int id, String name, String numerOfEmployees, String city, String street) {
        this.id = id;
        this.name = name;
        this.numerOfEmployees = numerOfEmployees;
        this.location = new Location(city, street);
    }

    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Number of employees: " + numerOfEmployees);
        System.out.println("Location: " + location.city + ", " + location.street);
    }

    public void modify() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Number of employees: " + numerOfEmployees);
        System.out.println("Location: " + location.city + ", " + location.street );
    }

    public void delete() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Number of employees: " + numerOfEmployees);
        System.out.println("Location: " + location.city + ", " + location.street );
    }

    public void export() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Number of employees: " + numerOfEmployees);
        System.out.println("Location: " + location.city + ", " + location.street );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumerOfEmployees() {
        return numerOfEmployees;
    }

    public void setNumerOfEmployees(String numerOfEmployees) {
        this.numerOfEmployees = numerOfEmployees;
    }

    public String getCity() {
        return location.city;
    }

    public void setCity(String city) {
        this.location.city = city;
    }

    public String getStreet() {
        return location.street;
    }

    public void setStreet(String street) {
        this.location.street = street;
    }






}