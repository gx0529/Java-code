package com.core.index;

import com.core.interceptor.FileInterceptor;

public interface FileScan {
    /**
     * 遍历Path
     * @param path
     */
    void index(String path);

    /**
     * 遍历的拦截器
     * @param interceptor
     */
    void interceptor(FileInterceptor interceptor);

}
