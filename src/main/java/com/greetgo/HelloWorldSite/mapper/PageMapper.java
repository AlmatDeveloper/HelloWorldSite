package com.greetgo.HelloWorldSite.mapper;

import com.greetgo.HelloWorldSite.domain.PageDomain;
import org.apache.ibatis.annotations.Select;

public interface PageMapper {
    @Select("select * from mail")
    PageDomain getMessage();
}
