package com.quick.dfs.util;

/**
 * @项目名称: quick-dfs
 * @描述: 配置常量 通用
 * @作者: fansy
 * @日期: 2020/03/25 21:51
 **/
public interface ConfigConstant {

    /**
     * editLog 文件存放路径
     */
    String FS_IMAGE_PATH = "/home/quick-dfs/fsimage/";

    /**
     * fsimage前缀
     */
    String FS_IMAGE_PREFIX = "fsiamge-";

    /**
     * fsimage后缀
     */
    String FS_IMAGE_SUFFIX = ".meta";

    /**
     * checkpoint操作的时间间隔
     */
    Long CHECKPOINT_INTERVAL = 60 * 60 * 1000L;

    /**
     * 上报fsimage的端口号
     */
    Integer FS_IMAGE_UPLOAD_PORT = 9000;

    /**
     * namenode 主机名
     */
    String NAME_NODE_HOST_NAME = "localhost";

    /**
     * namenode 默认通信端口
     */
    Integer NAME_NODE_DEFAULT_PORT = 50070;

    /**
     * namenode清理editlog 时间间隔
     */
    Long NAME_NODE_EDIT_LOG_CLEAN_INTERVAL = 30 *1000l;

    /**
     * namenode editLog 文件存放路径
     */
    String NAME_NODE_EDIT_LOG_PATH = "/home/quick-dfs/editlog/";

    /**
     * namenode editLog 文件后缀名
     */
    String NAME_NODE_EDIT_LOG_SUFFIX = ".log";

    /**
     * checkpont 元数据文件
     */
    String CHECKPOINT_META = "checkpoint.meta";
}
