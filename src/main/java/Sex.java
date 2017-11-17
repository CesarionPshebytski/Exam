public enum Sex {
    MALE("male"), FEMALE("female"), TRANSGENDER("transgender/gender fluid");

    private String sex;

    Sex(String sex){
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}