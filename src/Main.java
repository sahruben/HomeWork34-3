public class Main {
    public static void main(String[] args) {
        PhysicalPerson physicalPerson = new PhysicalPerson("Степа", "Петор", "Сергеич", "2233 445566");
        physicalPerson.showInfo();

        LegalPerson legalPerson = new LegalPerson("ООО \"Юупитер\"", "223344556677", "334455667788", "11223344556677");
        legalPerson.showInfo();
    }

}
