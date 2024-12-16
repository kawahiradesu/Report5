public class Report5 {
    public static void main(String[] args) {
        try {
            String srt = null;
            System.out.println(srt.length());
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("nullでエラー吐いてる");
            System.out.println(e.getMessage());
        }
    }
}