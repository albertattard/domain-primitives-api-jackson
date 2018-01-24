package com.javacreed.api.domain.primitives.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.lang.FloatBasedDomainObject;

public class FloatBasedDomainObjectSerializer extends StdSerializer<FloatBasedDomainObject> {

  private static final long serialVersionUID = -4081543777587194482L;

  public FloatBasedDomainObjectSerializer() {
    super(FloatBasedDomainObject.class);
  }

  @Override
  public void serialize(final FloatBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeNumber(object.getValue());
  }
}
