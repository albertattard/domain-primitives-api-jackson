package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.BooleanBasedDomainPrimitive;

public class BooleanBasedDomainPrimitiveSerializer extends StdSerializer<BooleanBasedDomainPrimitive> {

  private static final long serialVersionUID = 7506428357368285129L;

  public BooleanBasedDomainPrimitiveSerializer() {
    super(BooleanBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final BooleanBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeBoolean(object.getValue());
  }
}
