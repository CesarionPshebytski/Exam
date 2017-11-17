public enum MailTypes {
    NEWYEAR("Happy new year,"), BIRTH("Wish u luck, "), USUAL("Hello, ");

    private String mail;

    MailTypes(String mail){
        this.mail = mail;
    }

    @Override
    public String toString() {
        return mail;
    }
}
