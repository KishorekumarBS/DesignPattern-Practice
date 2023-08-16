public class TurnTvOff implements Command {

    ElectronicDevice theDevice;
    public TurnTvOff(ElectronicDevice theDevices)
    {
        theDevice=theDevices;
    }
    @Override
    public void execute() {
        theDevice.off();
    }
}
