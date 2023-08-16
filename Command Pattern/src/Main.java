public class Main {
    public static void main(String[] args) {

        ElectronicDevice newDevice =TVRemote.getDevice();
        TurnTVon onCommand=new TurnTVon(newDevice);
        DeviceButton onPress=new DeviceButton(onCommand);

        onPress.press();

        TurnTvOff offcommand=new TurnTvOff(newDevice);
        onPress=new DeviceButton(offcommand);

        onPress.press();

        Television theTV=new Television();

        Radio theRadio =new Radio();




    }
}