package com.fox.item.dao.template.mapper;

import com.fox.item.dao.template.model.EbaySite;
import com.fox.item.dao.template.model.EbaySiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EbaySiteMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(EbaySiteExample example);

    /**
     *
     * @mbg.generated
     */
    int insert(EbaySite record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(EbaySite record);

    /**
     *
     * @mbg.generated
     */
    List<EbaySite> selectByExampleWithBLOBs(EbaySiteExample example);

    /**
     *
     * @mbg.generated
     */
    List<EbaySite> selectByExample(EbaySiteExample example);

    /**
     *
     * @mbg.generated
     */
    EbaySite selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EbaySite record, @Param("example") EbaySiteExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EbaySite record, @Param("example") EbaySiteExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EbaySite record, @Param("example") EbaySiteExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EbaySite record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EbaySite record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbaySite record);
}