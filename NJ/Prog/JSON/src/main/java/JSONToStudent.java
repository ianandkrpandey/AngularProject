import com.google.gson.Gson;

public class JSONToStudent {
    public static void main(String[] args) {
        String json = "{" +
                "'name' : 'Duke'," +
                "'address' : 'Menlo Park'," +
                "'dateOfBirth' : 'Feb 1, 2000 12:00:00 AM'" +
                "}";

        Gson gson = new Gson();
        Student student = gson.fromJson(json, Student.class);

        System.out.println("s.getName()        = " + student.getName());
        System.out.println("s.getAddress()     = " + student.getAddress());
        System.out.println("s.getDateOfBirth() = " + student.getDateOfBirth());
    }
}