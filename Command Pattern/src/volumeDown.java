public class volumeDown implements Command{

        ElectronicDevice theDevice;

        public volumeDown(ElectronicDevice newDevice)
        {
            theDevice=newDevice;
        }
        @Override
        public void execute() {
            theDevice.volumeDown();
        }


}
