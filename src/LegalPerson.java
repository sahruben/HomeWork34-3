public class LegalPerson implements Client {
    private String name;
    private String inn;
    private String kpp;
    private String ogrn;

    public LegalPerson(String name, String inn, String kpp, String ogrn) {
        this.name = name;
        this.inn = inn;
        this.kpp = kpp;
        this.ogrn = ogrn;
    }

    @Override
    public void showInfo() {
        System.out.println("Юридическое лицо:");
        System.out.println("Название: " + name);
        System.out.println("ИНН: " + inn);
        System.out.println("КПП: " + kpp);
        System.out.println("ОГРН: " + ogrn);
    }
}
