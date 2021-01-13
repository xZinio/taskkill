import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowsProcessKiller {
    private static final String TASKLIST = "tasklist";
    private static final String KILL = "taskkill /IM ";

    public boolean isProcessRunning(String serviceName) {

        try {
            java.lang.Process pro = Runtime.getRuntime().exec(TASKLIST);
            BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {

                if (line.startsWith(serviceName)) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void killProcess(String serviceName) {

        try {
            Runtime.getRuntime().exec(KILL + serviceName);
            System.out.println(serviceName + " killed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
