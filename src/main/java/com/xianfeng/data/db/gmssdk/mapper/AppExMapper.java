package com.xianfeng.data.db.gmssdk.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface AppExMapper {

    @Select("select count(*) from sdk_app_ex")
    int findOne(Integer id);

}
