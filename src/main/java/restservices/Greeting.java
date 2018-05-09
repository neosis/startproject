package restservices;

public class Greeting {
    private  final long id;
    private final String content;

    private final double age = 22.4;


    public Greeting (long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public double getAge() {
        return age;
    }

}
