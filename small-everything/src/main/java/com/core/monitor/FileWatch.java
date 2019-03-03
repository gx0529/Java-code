package com.core.monitor;

import com.core.common.HandlePath;

public interface FileWatch {
    /**
     * 监听启动
     */
    void start();

    /**
     * 监听的目录
     */
    void monitor(HandlePath handlePath);
    /**
     * 监听停止
     */
    void stop();
}
