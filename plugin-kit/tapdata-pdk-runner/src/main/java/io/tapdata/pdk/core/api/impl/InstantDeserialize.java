package io.tapdata.pdk.core.api.impl;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.lang.reflect.Type;
import java.time.Instant;
import java.util.List;

public class InstantDeserialize implements ObjectDeserializer {

  @Override
  @SuppressWarnings("unchecked")
  public Instant deserialze(DefaultJSONParser parser, Type type, Object name) {
    // 参数在parser里面, name是参数名字(虽然用object接收, 其实是字符串)
    Object value = parser.parse(name);
    // 通过'.'分割, 然后拿到list
    String str = String.valueOf(value);

    String[] strs = str.split("\\.");
    Long seconds = null;
    Double nanoSeconds = null;
    if(strs.length == 2) {
      try {
        seconds = Long.valueOf(strs[0]);
      } catch (Throwable ignored) {}
      try {
        double aDouble = Double.parseDouble("0." + strs[1]);
        nanoSeconds = aDouble * 1000000000;
      } catch (Throwable ignored) {}
    } else if(strs.length == 1) {
      try {
        seconds = Long.valueOf(strs[0]);
      } catch (Throwable ignored) {}
    }
    if(seconds != null) {
      return Instant.ofEpochSecond(seconds, nanoSeconds != null ? nanoSeconds.longValue() : 0);
    }
    return null;
  }

  @Override
  public int getFastMatchToken() {
    return 0;
  }
}