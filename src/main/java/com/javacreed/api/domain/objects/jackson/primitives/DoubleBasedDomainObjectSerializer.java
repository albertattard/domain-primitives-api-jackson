package com.javacreed.api.domain.objects.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.objects.primitives.DoubleBasedDomainObject;

public class DoubleBasedDomainObjectSerializer extends StdSerializer<DoubleBasedDomainObject> {

  private static final long serialVersionUID = 1752413436923309240L;

  public DoubleBasedDomainObjectSerializer() {
    super(DoubleBasedDomainObject.class);
  }

  @Override
  public void serialize(final DoubleBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
