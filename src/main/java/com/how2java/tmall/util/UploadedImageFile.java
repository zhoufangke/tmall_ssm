package com.how2java.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhoufk
 * @date 2019/10/11 14:27
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
