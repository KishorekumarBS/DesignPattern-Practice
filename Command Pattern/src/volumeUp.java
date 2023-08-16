public class volumeUp implements Command{

        ElectronicDevice theDevice;

        public volumeUp(ElectronicDevice newDevice)
        {
            theDevice=newDevice;
        }
        @Override
        public void execute() {
            theDevice.volumeUp();
        }


}
