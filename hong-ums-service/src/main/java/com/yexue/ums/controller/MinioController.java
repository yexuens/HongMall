package com.yexue.ums.controller;

import com.yexue.common.vo.ResultVo;
import com.yexue.ums.minio.utils.MinioUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@Slf4j
public class MinioController {
    @Autowired
    private MinioUtils minIoUtil;

    @Value("${minio.endpoint}")
    private String address;
    @Value("${minio.bucketName}")
    private String bucketName;

    @PostMapping("/upload")
    public ResultVo upload(MultipartFile file) {


        List<String> upload = minIoUtil.upload(new MultipartFile[]{file});
        return ResultVo.success(address+"/"+bucketName+"/"+upload.getFirst());
    }

}

