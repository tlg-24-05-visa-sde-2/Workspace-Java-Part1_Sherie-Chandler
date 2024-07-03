import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("ByteBear", LocalDate.of(1987, 01, 01)); // NULL

        System.out.println(p1);

    }
}
