package com.wuyi.bigworld.core.model.common;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created  by songjh on 2018-10-17 23:04.
 */
public class ToString implements Serializable {

    private static final long serialVersionUID = -1175336411664261069L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
