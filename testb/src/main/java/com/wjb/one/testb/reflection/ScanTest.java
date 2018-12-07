package com.wjb.one.testb.reflection;

import java.io.IOException;

import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

public class ScanTest {
    /**
     * Spring容器注入
     */
    private ResourceLoader resourceLoader = new FileSystemResourceLoader(); 

    public void test() throws IOException {
    	
        ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
        MetadataReaderFactory metaReader = new CachingMetadataReaderFactory(resourceLoader);
        Resource[] resources = resolver.getResources("classpath*:your/package/name/**/*.class");

        for (Resource r : resources) {
            MetadataReader reader = metaReader.getMetadataReader(r);
            System.out.println(reader.getClassMetadata().getClassName());
        }

    }

}
