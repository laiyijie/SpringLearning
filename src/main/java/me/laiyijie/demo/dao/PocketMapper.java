package me.laiyijie.demo.dao;

import java.util.List;
import me.laiyijie.demo.domain.Pocket;
import me.laiyijie.demo.domain.PocketExample;
import org.apache.ibatis.annotations.Param;

public interface PocketMapper {
    long countByExample(PocketExample example);

    int deleteByExample(PocketExample example);

    int deleteByPrimaryKey(String username);

    int insert(Pocket record);

    int insertSelective(Pocket record);

    List<Pocket> selectByExample(PocketExample example);

    Pocket selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") Pocket record, @Param("example") PocketExample example);

    int updateByExample(@Param("record") Pocket record, @Param("example") PocketExample example);

    int updateByPrimaryKeySelective(Pocket record);

    int updateByPrimaryKey(Pocket record);
}