package com.javacreed.api.domain.objects.jackson.primitives;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.objects.primitives.CharBasedDomainObject;

public class CharBasedDomainObjectSerializer extends StdSerializer<CharBasedDomainObject> {

  private static final long serialVersionUID = 6571567505961524327L;

  public CharBasedDomainObjectSerializer() {
    super(CharBasedDomainObject.class);
  }

  @Override
  public void serialize(final CharBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeString(String.valueOf(object.getValue()));
  }
}
