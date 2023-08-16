public class TurnTVon implements Command{
    ElectronicDevice theDevice;

    public TurnTVon(ElectronicDevice newDevice)
    {
        theDevice=newDevice;
    }
    @Override
    public void execute() {
        theDevice.on();
    }
}
