package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.FloatBasedDomainPrimitive;

public class FloatBasedDomainPrimitiveSerializer extends StdSerializer<FloatBasedDomainPrimitive> {

  private static final long serialVersionUID = -4081543777587194482L;

  public FloatBasedDomainPrimitiveSerializer() {
    super(FloatBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final FloatBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
