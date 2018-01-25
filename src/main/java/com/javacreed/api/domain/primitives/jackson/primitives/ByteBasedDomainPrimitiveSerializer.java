package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.ByteBasedDomainPrimitive;

public class ByteBasedDomainPrimitiveSerializer extends StdSerializer<ByteBasedDomainPrimitive> {

  private static final long serialVersionUID = -3752940868866267272L;

  public ByteBasedDomainPrimitiveSerializer() {
    super(ByteBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final ByteBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
