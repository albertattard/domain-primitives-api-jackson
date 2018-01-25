package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.LongBasedDomainPrimitive;

public class LongBasedDomainPrimitiveSerializer extends StdSerializer<LongBasedDomainPrimitive> {

  private static final long serialVersionUID = -7489666553908321118L;

  public LongBasedDomainPrimitiveSerializer() {
    super(LongBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final LongBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
