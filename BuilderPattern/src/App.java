public class App {
    public static void main(String[] args) {
        User prem = new User.Builder("prem", "pamanchi@asu.edu")
                        .firstName("Prem Kumar")
                        .lastName("Amanchi")
                        .address("1260 E University Dr").build();
        System.out.println(prem.toString());
    }
}
