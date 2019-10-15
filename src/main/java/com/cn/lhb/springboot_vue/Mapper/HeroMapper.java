package com.cn.lhb.springboot_vue.Mapper;

import com.cn.lhb.springboot_vue.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HeroMapper {

    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id );

    public int update(Hero hero);

    List<Hero> list();
}
