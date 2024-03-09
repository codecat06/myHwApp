package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;


/**
 * Hello world!
 *
 */
public class App 
{
    public static int performComputation(ArrayList<Integer> list1,ArrayList<Integer> array2, String param3, int param4) {
        // Perform a meaningful computation on the parameters
        int result = 0;

        for (Integer num : list1) {
            result += num;
        }

        for (Integer num : array2) {
            result -= num;
        }

        result *= param4;

        if (param3.equals("multiply")) {
            result *= 2;
        }

        return result;
    }
    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        post("/compute", (req, res) -> {
            // Parse input1 as a list of integers
            String input1 = req.queryParams("input1");
            java.util.Scanner sc1 = new java.util.Scanner(input1);
            sc1.useDelimiter("[;\r]+");
            java.util.ArrayList<Integer> inputList1 = new java.util.ArrayList<>();
            while (sc1.hasNext()) {
                int value = Integer.parseInt(sc1.next().replaceAll("\\s", ""));
                inputList1.add(value);
            }
        
            // Parse input2 as a list of integers
            String input2 = req.queryParams("input2");
            java.util.Scanner sc2 = new java.util.Scanner(input2);
            sc2.useDelimiter("[;\r\n]+");
            java.util.ArrayList<Integer> inputList2 = new java.util.ArrayList<>();
            while (sc2.hasNext()) {
                int value = Integer.parseInt(sc2.next().replaceAll("\\s", ""));
                inputList2.add(value);
            }
        
            // Parse input3 as a string
            String input3 = req.queryParams("input3");
        
            // Parse input4 as an integer
            int input4 = Integer.parseInt(req.queryParams("input4").replaceAll("\\s", ""));
        
            // Perform computation using the App.performComputation method
            int result = App.performComputation(inputList1, inputList2, input3, input4);
        
            // Prepare the result to be displayed in the template
            Map<String, Object> map = new HashMap<>();
            map.put("inputList1", inputList1);
            map.put("inputList2", inputList2);
            map.put("input3", input3);
            map.put("input4", input4);
            map.put("result", result);
        
            return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());

        get("/compute",
          (rq, rs) -> {
            Map map = new HashMap();
            map.put("result", "not computed yet!");
            return new ModelAndView(map, "compute.mustache");
          },
          new MustacheTemplateEngine());
    }
        
        

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}

