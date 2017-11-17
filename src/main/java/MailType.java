public class MailType {
    protected MailTypes mailType;
    MailType(){}

    public int getCode() {
        return Integer.parseInt(getMailType());
    }

    private String getMailType() {
        return mailType.toString();
    }
}
