package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Excercise_05_Collection {
    public static void employeeInformation(String employeeName, String employeeAddress, String EmployeeDepartment) {
        //Tao ham de them thong tin co ban cua 1 nhan vien vao Collection
        Map<String, String> employeeMappingInfo = new HashMap<>();
        employeeMappingInfo.put("Employee Name", employeeName);
        employeeMappingInfo.put("Employee Address", employeeAddress);
        employeeMappingInfo.put("Employee Department", EmployeeDepartment);

//        System.out.println(employeeMappingInfo.get("Employee Name"));
//        System.out.println(employeeMappingInfo.get("Employee Address"));
//        System.out.println(employeeMappingInfo.get("Employee Department"));
//
//        Set<String> keySet = employeeMappingInfo.keySet();
//        System.out.println(keySet);
//
//        for (int i = 0; i < 5; i++) {
//            String key = "Employee Name";
//            System.out.println(employeeMappingInfo.get(key));
//        }
        System.out.println();
        System.out.println(employeeMappingInfo.entrySet());
        for (String key : employeeMappingInfo.keySet())
        {
            String value = employeeMappingInfo.get(key);
            System.out.println(key + " : " + value);
        }
    }

    public static void main(String[] args) {
        employeeInformation("Truc Dao", "Can Tho", "Development");
        employeeInformation("BiBi", "Bac Lieu","Financial");
    }
}
