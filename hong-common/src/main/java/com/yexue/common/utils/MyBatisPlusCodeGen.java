package com.yexue.common.utils;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.IFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyBatisPlusCodeGen {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/hongmall_ums?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true", "root", "")
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author("yexue"))
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("请输入包名？")))
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                        .entityBuilder()
                        .enableChainModel()
                        .enableFileOverride()
                        .idType(IdType.ASSIGN_ID)
                        .addTableFills(new Column("created_time", FieldFill.INSERT)) // 表字段填充
                        .addTableFills(new Column("updated_time", FieldFill.INSERT_UPDATE)) // 表字段填充
                        .enableLombok()
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()
                        .serviceBuilder().disableService()
                        .mapperBuilder().enableBaseResultMap().enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}

