package prac_14;

public class Client {
    public Chair chair;

    public void sit()
    {
        System.out.println("client is sitting on the chair");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();

        FunctionalChair functionalChair = factory.createFunctionalChair();
        functionalChair.action();

        MagicChair magicChair = factory.createMagicChair();
        magicChair.action();

        VictorianChair victorianChair = factory.createVictorianChair();
        victorianChair.action();

        Client client = new Client();
        client.setChair(victorianChair);
        client.sit();
    }
}
