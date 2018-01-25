package com.javacreed.api.domain.primitives.jackson.mandatory;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.mandatory.StringBasedDomainPrimitive;

public class StringBasedDomainPrimitiveSerializer extends StdSerializer<StringBasedDomainPrimitive> {

  private static final long serialVersionUID = 3110972721910678159L;

  public StringBasedDomainPrimitiveSerializer() {
    super(StringBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final StringBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeString(object.getValue());
  }
}
