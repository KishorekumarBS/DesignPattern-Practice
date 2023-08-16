public class DeviceButton {
    Command theCommand;
    public DeviceButton(Command theCmmand)
    {
        theCommand=theCmmand;
    }
    public void press()
    {
        theCommand.execute();
    }

}
