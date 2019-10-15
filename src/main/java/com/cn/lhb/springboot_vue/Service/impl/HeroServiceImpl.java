package com.cn.lhb.springboot_vue.Service.impl;

import com.cn.lhb.springboot_vue.Mapper.HeroMapper;
import com.cn.lhb.springboot_vue.Service.HeroService;
import com.cn.lhb.springboot_vue.pojo.Hero;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HeroServiceImpl implements HeroService {
   @Autowired
   HeroMapper heroMapper;

    @Override
    public int add(Hero hero) {
        return heroMapper.add(hero);
    }

    @Override
    public void delete(int id) {
        heroMapper.delete(id);
    }

    @Override
    public Hero get(int id) {
        return heroMapper.get(id);
    }

    @Override
    public int update(Hero hero) {
        return heroMapper.update(hero);
    }

    @Override
    public List<Hero> list() {
        return heroMapper.list();
    }
}
