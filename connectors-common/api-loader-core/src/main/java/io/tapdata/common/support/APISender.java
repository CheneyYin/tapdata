package io.tapdata.common.support;

import java.util.List;

public interface APISender {
    public boolean send(List<Object> data, boolean hasNext, Object offsetState);
    public default boolean send(List<Object> data, boolean hasNext, Object offsetState,boolean cacheAgoRecord){
        return this.send(data, hasNext, offsetState);
    }
}
