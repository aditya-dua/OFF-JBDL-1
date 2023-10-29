public class TestWithoutTry{
    public static void main(String [] args) throws Exception{
        int num=10;
        File f = new File();
        System.out.println(num/0);
        System.out.println("After Try");
    }
}