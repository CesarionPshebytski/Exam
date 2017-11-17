public enum MailTypes {
    NEWYEAR("0"), BIRTH("1"), ANGEL("1");

    private String sex;

    MailTypes(String sex){
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
