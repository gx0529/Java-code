package com.core.interceptor;

import java.io.File;

//专门用来处理结果集，可以称为处理器
@FunctionalInterface
public interface FileInterceptor {
    void apply(File file);
}
