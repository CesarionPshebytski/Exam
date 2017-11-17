public class MailInfo {
    private Client client;
    private int mailCode;
    private String mailType;
    private String mailText;

    MailInfo(Client client, String mailType){
        this.client = client;
        this.mailType = mailType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMailCode() {
        MailType x = new MailType();
        return x.getCode(mailType);
    }
}