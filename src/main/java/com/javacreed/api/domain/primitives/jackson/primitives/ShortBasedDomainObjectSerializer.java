package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.ShortBasedDomainObject;

public class ShortBasedDomainObjectSerializer extends StdSerializer<ShortBasedDomainObject> {

  private static final long serialVersionUID = 8891937760663822768L;

  public ShortBasedDomainObjectSerializer() {
    super(ShortBasedDomainObject.class);
  }

  @Override
  public void serialize(final ShortBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
