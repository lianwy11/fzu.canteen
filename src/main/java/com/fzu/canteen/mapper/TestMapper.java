package com.fzu.canteen.mapper;

import com.fzu.canteen.model.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}