public class FahrenheitConverter implements Converter{
    @Override
    public double getConvertedValue(double BaseValue) {
        return ((BaseValue * 1.8) + 32);
    }
}
