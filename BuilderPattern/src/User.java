public class User {
    private String userName; // required
    private String emailAddress; // required
    private String firstName; // optional
    private String lastName; // optional
    private int phoneNumber; // optional
    private String address; // optional

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    private User(Builder builder) {
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class Builder{
        private String userName; // required
        private String emailAddress; // required
        private String firstName; // optional
        private String lastName; // optional
        private int phoneNumber; // optional
        private String address; // optional

        public Builder firstName(String value ) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }

        public Builder phoneNumber(int value){
            this.phoneNumber = value;
            return this;
        }

        public Builder address(String value) {
            this.address = value;
            return this;
        }
        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public User build() {
            return new User(this);
        }
    }

}
