public class Main {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOfBounsExceptionCustom();
        }catch (ArrayIndexOfBounsExceptionCustom e){
            System.out.println(e.getMessage());
        }

    }
}