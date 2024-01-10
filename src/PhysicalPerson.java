public class PhysicalPerson implements Client{
    private String name;
    private String surname;
    private String patronymic;
    private String passportNumber;

    public PhysicalPerson(String name, String surname, String patronymic, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.passportNumber = passportNumber;
    }

    @Override
    public void showInfo() {
        System.out.println("Физическое лицо:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Отчество: " + patronymic);
        System.out.println("Номер паспорта: " + passportNumber);
    }
}
