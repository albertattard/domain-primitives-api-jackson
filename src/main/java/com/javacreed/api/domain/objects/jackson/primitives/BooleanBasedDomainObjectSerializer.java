package com.javacreed.api.domain.objects.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.objects.primitives.BooleanBasedDomainObject;

public class BooleanBasedDomainObjectSerializer extends StdSerializer<BooleanBasedDomainObject> {

  private static final long serialVersionUID = 7506428357368285129L;

  public BooleanBasedDomainObjectSerializer() {
    super(BooleanBasedDomainObject.class);
  }

  @Override
  public void serialize(final BooleanBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeBoolean(object.getValue());
  }
}
