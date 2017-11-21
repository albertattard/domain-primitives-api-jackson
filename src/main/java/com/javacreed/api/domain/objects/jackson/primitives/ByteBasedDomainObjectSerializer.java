package com.javacreed.api.domain.objects.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.objects.primitives.ByteBasedDomainObject;

public class ByteBasedDomainObjectSerializer extends StdSerializer<ByteBasedDomainObject> {

  private static final long serialVersionUID = -3752940868866267272L;

  public ByteBasedDomainObjectSerializer() {
    super(ByteBasedDomainObject.class);
  }

  @Override
  public void serialize(final ByteBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
