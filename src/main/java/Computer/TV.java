package Computer;

public class TV implements HDMI{

    @Override
    public void view(byte[] data) {
        System.out.println("???????tv???????");
        String message=new String(data);
        System.out.println(message);
        System.out.println("???????tv???????");
    }
}
