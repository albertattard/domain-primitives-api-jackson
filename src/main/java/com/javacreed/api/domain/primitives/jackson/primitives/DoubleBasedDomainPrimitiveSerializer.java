package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.DoubleBasedDomainPrimitive;

public class DoubleBasedDomainPrimitiveSerializer extends StdSerializer<DoubleBasedDomainPrimitive> {

  private static final long serialVersionUID = 1752413436923309240L;

  public DoubleBasedDomainPrimitiveSerializer() {
    super(DoubleBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final DoubleBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
