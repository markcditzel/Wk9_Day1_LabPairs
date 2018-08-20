import models.Cohort;
import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.route.HttpMethod.get;

public class Controller {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/random", (req, res) -> {
            Cohort cohort = new Cohort("E23");
            String result = cohort.getRandomStudent().getName();
            Map<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "resultRandomStudent.vtl");
        }, velocityTemplateEngine);

        get("/pair", (req, res) -> {
            Cohort cohort = new Cohort("E23");
            String result = cohort.generateTwoNonIdenticalStudentsArrayListAndReturnNames();
            Map<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "resultRandomPair.vtl");
        }, velocityTemplateEngine);
    }


}