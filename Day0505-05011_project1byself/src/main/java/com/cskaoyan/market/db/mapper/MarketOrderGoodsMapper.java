package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketOrderGoods;
import com.cskaoyan.market.db.domain.MarketOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    long countByExample(MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int deleteByExample(MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int insert(MarketOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int insertSelective(MarketOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    MarketOrderGoods selectOneByExample(MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    MarketOrderGoods selectOneByExampleSelective(@Param("example") MarketOrderGoodsExample example, @Param("selective") MarketOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    List<MarketOrderGoods> selectByExampleSelective(@Param("example") MarketOrderGoodsExample example, @Param("selective") MarketOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    List<MarketOrderGoods> selectByExample(MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    MarketOrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    MarketOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    MarketOrderGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketOrderGoods record, @Param("example") MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketOrderGoods record, @Param("example") MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}