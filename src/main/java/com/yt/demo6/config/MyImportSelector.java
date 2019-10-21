package com.yt.demo6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        //返回全类目的bean
        return new String[]{"com.yt.demo6.bean.Fish","com.yt.demo6.bean.Tigger"};
    }
}
