public class Application {
    private final InputDevice inputDevice;

    public Application(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
    }

    public void run() {
        rungame();

    }

    public void rungame(){
        Integer x,y,p1,p2;
        p1=0;
        p2=0;
        while(p1<10&&p2<10){
        x=inputDevice.nextInt();
        y=inputDevice.nextInt();
        System.out.println(x+","+y);
        if(x>y) {
            if(x%y!=0){
            System.out.println("First player wins");
            p1=p1+2;}
        }
        else{
            if(x<y) {
                if (y % x != 0) {
                    System.out.println("Second player wins");
                    p2=p2+2;
                }
                else{
                    if(x>9){
                        if(y%x==0){
                            System.out.println("First player wins");
                        p1=p1+2;}
                        else{
                            System.out.println("Second player wins");
                            p2=p2+2;
                        }
                    }}
            }
            else{
            if(y>9){
                if(x%y==0){
            System.out.println("Second player wins");
                p2=p2+2;}
                else{
                    System.out.println("First player wins");
                   p1=p1+2;
                }
        }}
    }}
        if(p1==10){
            System.out.println("Game over");
            System.out.println("First player wins");

        }
        else{
            System.out.println("Game over");
            System.out.println("Second player wins");

        }
}}