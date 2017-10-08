package com.javacreed.api.domain.objects.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.objects.StringBasedDomainObject;

public class StringBasedDomainObjectSerializer extends StdSerializer<StringBasedDomainObject> {

  private static final long serialVersionUID = -4177941765070689788L;

  public StringBasedDomainObjectSerializer() {
    super(StringBasedDomainObject.class);
  }

  @Override
  public void serialize(final StringBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    if (object.isValuePresent()) {
      generator.writeString(object.getValue().get());
    } else {
      generator.writeNull();
    }
  }
}
