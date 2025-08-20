class Basicphone {
    int phonenumber = 123456789;
    String message = "hi, hello";
    String photo = "jpg1.file";

    void makeCall() {
        System.out.println("Call phone number = " + phonenumber);
    }

    void sendMessage() {
        System.out.println("Sending a message = " + message);
    }
}

class Smartphone extends Basicphone {
    void takePhoto() {
        System.out.println("Taking a photo = " + photo);
    }
}

public class Singleinheritance {
    public static void main(String[] args) {
        Smartphone o1 = new Smartphone();

        o1.makeCall();
        o1.sendMessage();
        o1.takePhoto();
    }
}