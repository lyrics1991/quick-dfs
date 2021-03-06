package com.quick.dfs.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @项目名称: quick-dfs
 * @描述:
 * @作者: fansy
 * @日期: 2020/3/25 16:43
 **/
public class FileUtil {

    /**  
     * @方法名: closeOutputFile
     * @描述:   关闭文件输出IO
     * @param file
     * @param out
     * @param channel  
     * @return void  
     * @作者: fansy
     * @日期: 2020/3/25 16:46 
    */  
    public static void closeOutputFile(RandomAccessFile file, FileOutputStream out, FileChannel channel) throws IOException {
        if(channel != null){
            channel.close();
        }
        if(out != null){
            out.close();
        }
        if(file!=null){
            file.close();
        }
    }

    /**  
     * 方法名: closeInputFile
     * 描述:   关闭文件输入IO
     * @param in
     * @param channel  
     * @return void  
     * 作者: fansy 
     * 日期: 2020/3/29 14:09 
     */  
    public static void closeInputFile(FileInputStream in,FileChannel channel) throws IOException{
        if(channel != null){
            channel.close();
        }
        if(in != null){
            in.close();
        }
    }
}
