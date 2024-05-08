package com.cskaoyan.market.service;

import com.cskaoyan.market.db.domain.MarketAdmin;
import com.cskaoyan.market.vo.MarketAdminListVo;
import com.cskaoyan.market.vo.MarketAdminUpdateVo;

import java.time.LocalDateTime;
import java.util.List;

public interface AdminAdminService {
    List<MarketAdminListVo> list(Integer limit, Integer page, String username, String sort, String order);
    MarketAdmin create(String username, String avatar, String password, Integer id, Integer[] roleIds, LocalDateTime updateTime, LocalDateTime addTime);
    void update(MarketAdminUpdateVo marketAdmin);
    void delete( MarketAdmin marketAdmin );
}
