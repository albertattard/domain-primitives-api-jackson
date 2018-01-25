package com.javacreed.api.domain.primitives.jackson.optional;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.base.Preconditions;
import com.javacreed.api.domain.primitives.optional.ZonedDateTimeBasedDomainPrimitive;

public class ZonedDateTimeBasedDomainPrimitiveSerializer extends StdSerializer<ZonedDateTimeBasedDomainPrimitive> {

  private static final long serialVersionUID = 8554163143068267829L;

  private final DateTimeFormatter formatter;

  public ZonedDateTimeBasedDomainPrimitiveSerializer() {
    this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  }

  public ZonedDateTimeBasedDomainPrimitiveSerializer(final DateTimeFormatter formatter) {
    super(ZonedDateTimeBasedDomainPrimitive.class);
    this.formatter = Preconditions.checkNotNull(formatter);
  }

  @Override
  public void serialize(final ZonedDateTimeBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    final String formatted = object.format(formatter).orElse(null);
    if (formatted != null) {
      generator.writeString(formatted);
    }
  }
}
