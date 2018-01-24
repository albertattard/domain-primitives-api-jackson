package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.IntBasedDomainObject;

public class IntBasedDomainObjectSerializer extends StdSerializer<IntBasedDomainObject> {

  private static final long serialVersionUID = 8728547463522813973L;

  public IntBasedDomainObjectSerializer() {
    super(IntBasedDomainObject.class);
  }

  @Override
  public void serialize(final IntBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
