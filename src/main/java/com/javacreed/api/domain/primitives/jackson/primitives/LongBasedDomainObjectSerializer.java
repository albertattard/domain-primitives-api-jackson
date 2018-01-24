package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.LongBasedDomainObject;

public class LongBasedDomainObjectSerializer extends StdSerializer<LongBasedDomainObject> {

  private static final long serialVersionUID = -7489666553908321118L;

  public LongBasedDomainObjectSerializer() {
    super(LongBasedDomainObject.class);
  }

  @Override
  public void serialize(final LongBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
