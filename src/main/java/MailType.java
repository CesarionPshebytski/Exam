import java.util.ArrayList;

public class MailType {
    private ArrayList<String> mailTypes;
    MailType(){
        mailTypes.add("usual");
        mailTypes.add("new year");
        mailTypes.add("birth");
    }

    public int getCode(String mailType) {
        return mailTypes.indexOf(mailType)>0?mailTypes.indexOf(mailType):mailTypes.indexOf("usual");
    }

    public String text(String mailType){
        switch (getCode(mailType)){
            case 1:
                return "вітаю з новим роком";
            case 2:
                return "вітаю з днем народження";
            default:
                return "слава Ісусу Христу, ";
        }
    }
}
