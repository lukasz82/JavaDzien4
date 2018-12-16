public class WashingMachine
{

    public static void main(String[] args)
    {
        A a = new A();

        WashingMachine mach = new WashingMachine();
        mach.modeForSensitiveClothes();
        mach.showSettings();
        mach.modeForTowelsAndBedLinen();
        mach.showSettings();
    }

    private int temperature;
    private int spinning; // obroty

    private int getTemperature() {
        return temperature;
    }

    private int getSpinning() {
        return spinning;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private void setSpinning(int spinning) {
        this.spinning = spinning;
    }

    void modeForSensitiveClothes ()
    {
        temperature = 30;
        spinning = 800;
    }

    void modeForTowelsAndBedLinen()
    {
        temperature = 90;
        spinning = 1200;
    }

    void showSettings()
    {
        System.out.println("temp: " + temperature);
        System.out.println("obroty: " + spinning);
    }


}
