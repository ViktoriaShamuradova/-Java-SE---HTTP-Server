package by.введениеВ_ООП.параметризация;

public class ObjectToStringConverter implements Converter<Object, String> {
    @Override
    public String convert(Object source) {
        return String.valueOf(source);
    }
}
