package com.example.beanknifeinheritancebugreproduction;

import io.github.vipcxj.beanknife.runtime.annotations.*;

@ViewOf(value = Bean.class,
    includePattern = ".*")
public class BeanViewConfig extends BaseConfig {
}
