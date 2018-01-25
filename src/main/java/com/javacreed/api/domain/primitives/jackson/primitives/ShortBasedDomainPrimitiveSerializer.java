package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.ShortBasedDomainPrimitive;

public class ShortBasedDomainPrimitiveSerializer extends StdSerializer<ShortBasedDomainPrimitive> {

  private static final long serialVersionUID = 8891937760663822768L;

  public ShortBasedDomainPrimitiveSerializer() {
    super(ShortBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final ShortBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
