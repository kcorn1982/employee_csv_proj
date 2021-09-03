import com.sun.security.auth.login.ConfigFile;
import config_mgr.ConfigMgr;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordScanner {
    // variable below is simply our File reading object
    private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();


    public List<String[]> generateRawEmployeeData(){
        List<String[]> employeeRawData  = new ArrayList<>();

        // Scanner object below simply takes our file reader object and prepares a scanner object to work with our file
        Scanner scanner = new Scanner(employeeFileReader.empFileReader(ConfigMgr.employeeFileLocation()));
        scanner.nextLine();
        while (scanner.hasNext()){
            // looping and adding each item from our scanner into our raw employee data Arraylist
            employeeRawData.add(scanner.nextLine().split(","));
        }

        return employeeRawData;
    }

}
