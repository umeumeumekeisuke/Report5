public class Report5{
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerExceptionエラー発生");
            System.out.print(e.getMessage());
        }
    }
}
