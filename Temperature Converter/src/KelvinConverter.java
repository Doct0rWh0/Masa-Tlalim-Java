public class KelvinConverter implements Converter{
    @Override
    public double getConvertedValue(double BaseValue) {
        return (BaseValue + 273.15);
    }
}
