package com.ly.mall.common.exception.file;


import com.ly.mall.common.exception.BaseException;

/**
 *  文件异常
 * @author mds
 */
public class FileException extends BaseException {
    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }
}
