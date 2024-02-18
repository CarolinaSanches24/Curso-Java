import java.util.Date;
import java.sql.Timestamp;

public class StringComparePerformance {
    public static void main(String[] args) {
        Date sData = new Date();
        long sTime = sData.getTime();
        System.out.println("Hora de início do StringBuffer: " + new Timestamp(sTime));
        StringBuffer s = new StringBuffer("AA");
        for (int i = 0; i < 1000; i++) {
            s.append(i);
        }

        Date eData = new Date();

        long eTime = eData.getTime();
        System.out.println("Fim do tempo do StringBuffer: " + new Timestamp(eTime));

        System.out.println("Tempo gasto para executar StringBuffer process: " + (eTime - sTime) + "ms");

        System.out.println("=====================================================================");

        Date strData = new Date();

        long strTime = strData.getTime();

        System.out.println("Hora de início para String: " + new Timestamp(strTime));

        String str = new String("AA");

        for (int i = 0; i < 10000; i++) {

            str += i;

        }

        Date eStrDate = new Date();

        long eStrTime = eStrDate.getTime();

        System.out.println("Fim do tempo para String: " + new Timestamp(eStrTime));

        System.out.println("Tempo gasto para executar String process: " + (eStrTime - strTime) + "ms");

    }
}