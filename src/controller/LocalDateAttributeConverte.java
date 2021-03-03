package controller;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Abutalib Hasan - amhasan 202101 CIS171 12928 Mar 1, 2021
 */
@Converter(autoApply = true)
public class LocalDateAttributeConverte implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		// TODO Auto-generated method stub
		return (attribute == null ? null : Date.valueOf(attribute));

	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		// TODO Auto-generated method stub
		return (dbData == null ? null : dbData.toLocalDate());
	}

}
