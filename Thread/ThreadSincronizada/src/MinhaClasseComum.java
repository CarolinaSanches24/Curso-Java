public class MinhaClasseComum {
    public void exibir(String msg){
        System.out.println("[" + msg+"]");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
