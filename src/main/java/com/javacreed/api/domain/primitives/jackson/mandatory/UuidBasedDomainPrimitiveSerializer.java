package com.javacreed.api.domain.primitives.jackson.mandatory;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.mandatory.UuidBasedDomainPrimitive;

public class UuidBasedDomainPrimitiveSerializer extends StdSerializer<UuidBasedDomainPrimitive> {

  private static final long serialVersionUID = -4177941765070689788L;

  public UuidBasedDomainPrimitiveSerializer() {
    super(UuidBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final UuidBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeString(object.toString());
  }
}
