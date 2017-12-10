package com.javacreed.api.domain.objects.jackson.optional;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.base.Preconditions;
import com.javacreed.api.domain.objects.optional.ZonedDateTimeBasedDomainObject;

public class ZonedDateTimeBasedDomainObjectSerializer extends StdSerializer<ZonedDateTimeBasedDomainObject> {

  private static final long serialVersionUID = 8554163143068267829L;

  private final DateTimeFormatter formatter;

  public ZonedDateTimeBasedDomainObjectSerializer() {
    this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  }

  public ZonedDateTimeBasedDomainObjectSerializer(final DateTimeFormatter formatter) {
    super(ZonedDateTimeBasedDomainObject.class);
    this.formatter = Preconditions.checkNotNull(formatter);
  }

  @Override
  public void serialize(final ZonedDateTimeBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    final String formatted = object.format(formatter).orElse(null);
    if (formatted != null) {
      generator.writeString(formatted);
    }
  }
}
