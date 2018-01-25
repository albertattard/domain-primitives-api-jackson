package com.javacreed.api.domain.primitives.jackson.optional;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.optional.StringBasedDomainPrimitive;

public class StringBasedDomainPrimitiveSerializer extends StdSerializer<StringBasedDomainPrimitive> {

  private static final long serialVersionUID = -4177941765070689788L;

  public StringBasedDomainPrimitiveSerializer() {
    super(StringBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final StringBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    if (object.isValuePresent()) {
      generator.writeString(object.getValue().get());
    } else {
      generator.writeNull();
    }
  }
}
