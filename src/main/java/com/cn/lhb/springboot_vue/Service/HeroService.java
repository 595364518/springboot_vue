package com.cn.lhb.springboot_vue.Service;

import com.cn.lhb.springboot_vue.pojo.Hero;

import java.util.List;

public interface HeroService {

    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}
