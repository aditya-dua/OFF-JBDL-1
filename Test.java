public class Test{
    public static void main(String [] args) {
        int num=10;
        try{
            System.out.println(num/0);
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }
        
        System.out.println("After Try");
    }
}