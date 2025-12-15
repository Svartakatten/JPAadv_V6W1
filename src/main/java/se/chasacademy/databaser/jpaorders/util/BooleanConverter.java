package se.chasacademy.databaser.jpaorders.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class BooleanConverter implements AttributeConverter<Boolean, Character> {

    @Override
    public Character convertToDatabaseColumn(Boolean attribute) {
        if ( attribute == null) {
            return null;
        }
        return attribute ? 'Y' : 'N';
    }
    @Override
    public Boolean convertToEntityAttribute(Character dbData) {
        if ( dbData == null) {
            return false;
        }
        return dbData.equals('Y') || dbData.equals('y');
    }
}
