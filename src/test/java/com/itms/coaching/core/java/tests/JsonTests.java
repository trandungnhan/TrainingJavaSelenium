package com.itms.coaching.core.java.tests;

import aggregation.Address;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import inheriance.Employee1;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonTests {
    @Test
    public void simpleJsonTests(){
        String employeeJsons="{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"tester\"\n" +
                "}";
        JSONObject jsonObject = new JSONObject(employeeJsons);
        System.out.println(jsonObject.getInt("id"));
        System.out.println(jsonObject.getString("name"));
        System.out.println(jsonObject.toString());

    }
    @Test
    public void jsonObjectTests(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        jsonObject.put("name", "dev");
        jsonObject.put("active",true);

        System.out.println(jsonObject);
    }

    @Test
    public void jsonJavaObjectTests(){
        Address address = new Address("99","HCM","LA","VN");
        Employee1 emp1 = new Employee1(1,"Tester", address);

        JSONObject jsonEmployee = new JSONObject(emp1);

        System.out.println(emp1.toString());
        System.out.println(jsonEmployee);

        System.out.println(emp1.getName());
        System.out.println(jsonEmployee.getString("name"));

        System.out.println(emp1.getAddress().getCity());

        System.out.println(jsonEmployee.getJSONObject("address").getString("city"));
    }
    @Test
    public void jsonToJavaObjectTests() throws JsonProcessingException {
        String strEmpl = "{\"address\":{\"number\":\"40\",\"country\":\"VN\",\"city\":\"HCM\",\"state\":\"LA\"},\"name\":\"Tester\",\"id\":1}";

        ObjectMapper objectMapper = new ObjectMapper();
        Employee1 employee = objectMapper.readValue(strEmpl, Employee1.class);
        System.out.println(employee.toString());
    }

    @Test
    public void jsonJavaObjectToJSONArrayTests() {
        Address address1 = new Address("99", "HCM", "LA", "VN");
        Address address2 = new Address("99", "HCM", "LA", "VN");
        Employee1 emp1 = new Employee1(1, "Tester", address1);
        Employee1 emp2 = new Employee1(1, "Tester", address2);

        List<Employee1> employee = new ArrayList<>();
        employee.add(emp1);
        employee.add(emp2);

        JSONArray jsonArray = new JSONArray();
        JSONObject jsonEmp1 = new JSONObject(emp1);
        JSONObject jsonEmp2 = new JSONObject(emp2);
        jsonArray.put(jsonEmp1);
        jsonArray.put(jsonEmp2);

        System.out.println(jsonArray.toString());
    }

    @Test
    public void jsonArrayToListJavaObjectTest() throws IOException {
        File file = new File("src/main/resources/data/EmployeeListData.json");

        ObjectMapper objectMapper = new ObjectMapper();

        List<Employee1> employees = objectMapper.readValue(file, new TypeReference<List<Employee1>>() {});

        for (Employee1 employee: employees){
            System.out.println(employee.toString());

        }
    }
}
