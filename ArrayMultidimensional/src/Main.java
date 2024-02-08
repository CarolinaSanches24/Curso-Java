public class Main {
    public static void main(String[] args) {
        String [][] agenda = {{"José","91234-1234","professorjose@gmail.com"},
                {"Bill","2222-2222","bill@outlook.com"},
                {"Linus","99999-9999","tux@linux.com"}};

        for(int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }

        }

    }
}