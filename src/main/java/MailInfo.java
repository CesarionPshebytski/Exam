public class MailInfo {
    private static int mailCodeCounter = 0;

    private Client client;
    private final int mailCode;

    MailInfo(Client client){
        this.client = client;
        this.mailCode = mailCodeCounter;
        mailCodeCounter++;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMailCode() {
        MailType x = new MailType();
        return x.getCode();
    }
}