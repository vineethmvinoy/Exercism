public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String Answer;
        switch (shirtNum) {
            case 1:
              Answer="goalie";
              break;
            case 2:
              Answer="left back";
              break;
            case 3:
            case 4:
                Answer="center back";
                break;
            case 5:
                Answer="right back";
                break;
            case 6:
            case 7:
            case 8:
                Answer="midfielder";
                break;
            case 9:
                Answer="left wing";
                break;
            case 10:
                Answer="striker";
                break;
            case 11:
                Answer="right wing" ;   
                break;
            default:
            throw new IllegalArgumentException();
                
        }
        return Answer;
    }
}
