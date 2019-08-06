import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJSON {

    public static void main(String args[]) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Car car = new Car("Renault Duster", "SUV");
        Driver driver = new Driver("1", "Vivek", car);

        String jsonWriter = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(driver);
        System.out.println("The JSON after the conversion of java object is: " + jsonWriter);


    }
}
