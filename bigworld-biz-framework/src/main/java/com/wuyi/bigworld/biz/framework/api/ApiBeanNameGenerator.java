package com.wuyi.bigworld.biz.framework.api;

import com.wuyi.bigworld.biz.framework.api.annotation.Api;
import com.wuyi.bigworld.biz.framework.api.utils.ApiUtils;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created  by songjh on 2018-10-18 00:01.
 */
public class ApiBeanNameGenerator extends AnnotationBeanNameGenerator {


    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String beanName = null;
        if (definition instanceof AnnotatedBeanDefinition) {
            AnnotationMetadata metaData = ((AnnotatedBeanDefinition) definition).getMetadata();
            if (metaData.getAnnotationTypes().contains(Api.class.getName())) {
                try {
                    beanName = ApiUtils.getApiName(Class.forName(definition.getBeanClassName()));
//                    beanName = beanName + API_POSTFIX;
                } catch (ClassNotFoundException e) {
                   // LoggerUtil.error(e, LOGGER, "error api name get:", definition.getBeanClassName());
                    System.out.println(String.format("error api name get %s:", definition.getBeanClassName()));

                }
            }
        }
        if (beanName == null) {
            beanName = super.generateBeanName(definition, registry);
        }
        if (registry.isBeanNameInUse(beanName)) {
//            LoggerUtil.error(LOGGER, "bean name has bean used:", "[" + beanName + "]",
//                    definition.getBeanClassName());
        }
//        LoggerUtil.info(LOGGER, "use bean name {0},{1}", String.format("%1$-45s", beanName),
//                definition.getBeanClassName());
        String log = String.format("use bean name %s %s", String.format("%1$-45s", beanName), definition.getBeanClassName());
        System.out.println(log);
        return beanName;
    }
}
