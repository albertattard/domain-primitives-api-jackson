package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.CharBasedDomainPrimitive;

public class CharBasedDomainPrimitiveSerializer extends StdSerializer<CharBasedDomainPrimitive> {

  private static final long serialVersionUID = 6571567505961524327L;

  public CharBasedDomainPrimitiveSerializer() {
    super(CharBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final CharBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeString(String.valueOf(object.getValue()));
  }
}
