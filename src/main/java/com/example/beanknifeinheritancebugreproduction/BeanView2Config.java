package com.example.beanknifeinheritancebugreproduction;

import io.github.vipcxj.beanknife.runtime.annotations.ViewOf;

@ViewOf(value = Bean.class,
        genName = "BeanView2",
        includePattern = ".*")
public class BeanView2Config extends BaseConfig {
}
