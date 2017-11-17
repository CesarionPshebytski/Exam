import java.util.ArrayList;
import java.util.Arrays;

public class MailType {
    private ArrayList<String> mailTypes;
    private int mailCode;

    MailType(){
        mailTypes.addAll(Arrays.asList("birth", "angel day"));
    }

    private void setMailTypes() {
        mailTypes.addAll(Arrays.asList("birth", "angel day"));
    }

    public int getCode() {
        return mailCode;
    }
}
