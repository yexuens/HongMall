package com.yexue.ums.minio.model;

import lombok.Data;

@Data
public class ObjectItem {
    private String objectName;
    private Long size;
}
