package jobers;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logging {

    private static Logging instance;
    private Logging(){}

    private static Logging getInstance(){ //Implementarea functionalitatii de logging
        if(instance == null){
            synchronized (Logging.class) {
                if(instance == null){
                    instance = new Logging();
                }
            }
        }
        return instance;
    }

    public static void log(String message){
        try{
            FileWriter fw = new FileWriter("logs.txt",true);
            PrintWriter out = new PrintWriter(fw);
            out.write(message.toCharArray());
            out.close();
        }catch(IOException e){
            System.err.println("ERROR: Could not write to log file");
        }
    }
    public static void log(String mesaj, int counter){
        try{
            StringBuffer logMes = new StringBuffer();   //initializarea StringBuffer
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
            Calendar cal = Calendar.getInstance();
            logMes.append(mesaj);
            FileWriter fw = new FileWriter("logs.txt",true);
            PrintWriter out = new PrintWriter(fw);
            out.println("\n" + dateFormat.format(cal.getTime()) + logMes + "  " + counter);
            out.close();
        }catch(IOException e){
            System.err.println("ERROR: Could not write to log file");
        }
    }
    public static void main(String[] args) {

    }
}

