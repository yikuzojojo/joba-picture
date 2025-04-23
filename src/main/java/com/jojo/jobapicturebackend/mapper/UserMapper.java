package com.jojo.jobapicturebackend.mapper;

import com.jojo.jobapicturebackend.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
* @author 17240
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2025-04-20 19:48:51
* @Entity com.jojo.jobapicturebackend.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




