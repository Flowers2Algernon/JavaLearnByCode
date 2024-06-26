package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketAdmin;
import com.cskaoyan.market.db.domain.MarketAdminExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MarketAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    long countByExample(MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int deleteByExample(MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int insert(MarketAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int insertSelective(MarketAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    MarketAdmin selectOneByExample(MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    MarketAdmin selectOneByExampleSelective(@Param("example") MarketAdminExample example, @Param("selective") MarketAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    List<MarketAdmin> selectByExampleSelective(@Param("example") MarketAdminExample example, @Param("selective") MarketAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    List<MarketAdmin> selectByExample(MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    MarketAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    MarketAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    MarketAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketAdmin record, @Param("example") MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketAdmin record, @Param("example") MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}