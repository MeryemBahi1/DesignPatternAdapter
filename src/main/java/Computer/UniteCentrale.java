package Computer;

public class UniteCentrale {
    private VGA vga;
    public  void print(String message){
        System.out.println("********UC**********");
        vga.print(message);
        System.out.println("**********UC********");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
