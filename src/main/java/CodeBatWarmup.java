public class CodeBatWarmup {

    public int diff21(int n) {
        if(n>21) {
            int c = 21-n;
            return c*-2;
        } else {
            return 21-n;
        }
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public String notString(String str) {
        if(str.equals("not") || str.equals("not bad")){
            return str;
        }
        return "not "+str;
    }
}
