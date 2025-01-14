package com.wangshanhai.examples.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangshanhai.examples.domain.TUser;
import com.wangshanhai.examples.mapper.TUserMapper;
import com.wangshanhai.examples.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * User
 *
 * @author Fly.Sky
 * @since 2023/7/23 16:29
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {
}
