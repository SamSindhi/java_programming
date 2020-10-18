class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        } else if(firstName.equals("")) {
            return lastName;
        } else if (lastName.equals("")) {
            return firstName;
        }
        return firstName + " " +  lastName; // write your code here
    }
}
