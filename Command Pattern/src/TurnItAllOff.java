import java.util.List;

public class TurnItAllOff implements Command {
    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevives)
    {
        theDevices=newDevives;
    }
    @Override
    public void execute() {
        for(ElectronicDevice device:theDevices)
        {
            device.off();
        }
    }
}
