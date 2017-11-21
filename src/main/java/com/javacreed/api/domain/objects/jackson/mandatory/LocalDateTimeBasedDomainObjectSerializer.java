package com.javacreed.api.domain.objects.jackson.mandatory;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.base.Preconditions;
import com.javacreed.api.domain.objects.mandatory.LocalDateTimeBasedDomainObject;

public class LocalDateTimeBasedDomainObjectSerializer extends StdSerializer<LocalDateTimeBasedDomainObject> {

  private static final long serialVersionUID = 8554163143068267829L;

  private final DateTimeFormatter formatter;

  public LocalDateTimeBasedDomainObjectSerializer() {
    this(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
  }

  public LocalDateTimeBasedDomainObjectSerializer(final DateTimeFormatter formatter) {
    super(LocalDateTimeBasedDomainObject.class);
    this.formatter = Preconditions.checkNotNull(formatter);
  }

  @Override
  public void serialize(final LocalDateTimeBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeString(object.format(formatter));
  }
}
