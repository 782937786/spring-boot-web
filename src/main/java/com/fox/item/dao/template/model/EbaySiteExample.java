package com.fox.item.dao.template.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbaySiteExample {
    /**
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    private Integer pageNo = 1;

    /**
     *
     * @mbg.generated
     */
    private Integer pageSize = 10;

    /**
     *
     * @mbg.generated
     */
    private Integer offset;

    /**
     *
     * @mbg.generated
     */
    public EbaySiteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     *
     * @mbg.generated
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     *
     * @mbg.generated
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getOffset() {
        this.offset = (pageNo - 1) * pageSize;
        return offset;
    }

    /**
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNamecnIsNull() {
            addCriterion("nameCN is null");
            return (Criteria) this;
        }

        public Criteria andNamecnIsNotNull() {
            addCriterion("nameCN is not null");
            return (Criteria) this;
        }

        public Criteria andNamecnEqualTo(String value) {
            addCriterion("nameCN =", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotEqualTo(String value) {
            addCriterion("nameCN <>", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnGreaterThan(String value) {
            addCriterion("nameCN >", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnGreaterThanOrEqualTo(String value) {
            addCriterion("nameCN >=", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLessThan(String value) {
            addCriterion("nameCN <", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLessThanOrEqualTo(String value) {
            addCriterion("nameCN <=", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLike(String value) {
            addCriterion("nameCN like", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotLike(String value) {
            addCriterion("nameCN not like", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnIn(List<String> values) {
            addCriterion("nameCN in", values, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotIn(List<String> values) {
            addCriterion("nameCN not in", values, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnBetween(String value1, String value2) {
            addCriterion("nameCN between", value1, value2, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotBetween(String value1, String value2) {
            addCriterion("nameCN not between", value1, value2, "namecn");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andStartpriceIsNull() {
            addCriterion("startPrice is null");
            return (Criteria) this;
        }

        public Criteria andStartpriceIsNotNull() {
            addCriterion("startPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStartpriceEqualTo(Double value) {
            addCriterion("startPrice =", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotEqualTo(Double value) {
            addCriterion("startPrice <>", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceGreaterThan(Double value) {
            addCriterion("startPrice >", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("startPrice >=", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceLessThan(Double value) {
            addCriterion("startPrice <", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceLessThanOrEqualTo(Double value) {
            addCriterion("startPrice <=", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceIn(List<Double> values) {
            addCriterion("startPrice in", values, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotIn(List<Double> values) {
            addCriterion("startPrice not in", values, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceBetween(Double value1, Double value2) {
            addCriterion("startPrice between", value1, value2, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotBetween(Double value1, Double value2) {
            addCriterion("startPrice not between", value1, value2, "startprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceIsNull() {
            addCriterion("buyItNowPrice is null");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceIsNotNull() {
            addCriterion("buyItNowPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceEqualTo(Double value) {
            addCriterion("buyItNowPrice =", value, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceNotEqualTo(Double value) {
            addCriterion("buyItNowPrice <>", value, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceGreaterThan(Double value) {
            addCriterion("buyItNowPrice >", value, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("buyItNowPrice >=", value, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceLessThan(Double value) {
            addCriterion("buyItNowPrice <", value, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceLessThanOrEqualTo(Double value) {
            addCriterion("buyItNowPrice <=", value, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceIn(List<Double> values) {
            addCriterion("buyItNowPrice in", values, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceNotIn(List<Double> values) {
            addCriterion("buyItNowPrice not in", values, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceBetween(Double value1, Double value2) {
            addCriterion("buyItNowPrice between", value1, value2, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andBuyitnowpriceNotBetween(Double value1, Double value2) {
            addCriterion("buyItNowPrice not between", value1, value2, "buyitnowprice");
            return (Criteria) this;
        }

        public Criteria andUnitdetailIsNull() {
            addCriterion("unitDetail is null");
            return (Criteria) this;
        }

        public Criteria andUnitdetailIsNotNull() {
            addCriterion("unitDetail is not null");
            return (Criteria) this;
        }

        public Criteria andUnitdetailEqualTo(String value) {
            addCriterion("unitDetail =", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailNotEqualTo(String value) {
            addCriterion("unitDetail <>", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailGreaterThan(String value) {
            addCriterion("unitDetail >", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailGreaterThanOrEqualTo(String value) {
            addCriterion("unitDetail >=", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailLessThan(String value) {
            addCriterion("unitDetail <", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailLessThanOrEqualTo(String value) {
            addCriterion("unitDetail <=", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailLike(String value) {
            addCriterion("unitDetail like", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailNotLike(String value) {
            addCriterion("unitDetail not like", value, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailIn(List<String> values) {
            addCriterion("unitDetail in", values, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailNotIn(List<String> values) {
            addCriterion("unitDetail not in", values, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailBetween(String value1, String value2) {
            addCriterion("unitDetail between", value1, value2, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUnitdetailNotBetween(String value1, String value2) {
            addCriterion("unitDetail not between", value1, value2, "unitdetail");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeIsNull() {
            addCriterion("updateCategoryTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeIsNotNull() {
            addCriterion("updateCategoryTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeEqualTo(Date value) {
            addCriterion("updateCategoryTime =", value, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeNotEqualTo(Date value) {
            addCriterion("updateCategoryTime <>", value, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeGreaterThan(Date value) {
            addCriterion("updateCategoryTime >", value, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateCategoryTime >=", value, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeLessThan(Date value) {
            addCriterion("updateCategoryTime <", value, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeLessThanOrEqualTo(Date value) {
            addCriterion("updateCategoryTime <=", value, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeIn(List<Date> values) {
            addCriterion("updateCategoryTime in", values, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeNotIn(List<Date> values) {
            addCriterion("updateCategoryTime not in", values, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeBetween(Date value1, Date value2) {
            addCriterion("updateCategoryTime between", value1, value2, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andUpdatecategorytimeNotBetween(Date value1, Date value2) {
            addCriterion("updateCategoryTime not between", value1, value2, "updatecategorytime");
            return (Criteria) this;
        }

        public Criteria andShippinglocationIsNull() {
            addCriterion("shippingLocation is null");
            return (Criteria) this;
        }

        public Criteria andShippinglocationIsNotNull() {
            addCriterion("shippingLocation is not null");
            return (Criteria) this;
        }

        public Criteria andShippinglocationEqualTo(String value) {
            addCriterion("shippingLocation =", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationNotEqualTo(String value) {
            addCriterion("shippingLocation <>", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationGreaterThan(String value) {
            addCriterion("shippingLocation >", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationGreaterThanOrEqualTo(String value) {
            addCriterion("shippingLocation >=", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationLessThan(String value) {
            addCriterion("shippingLocation <", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationLessThanOrEqualTo(String value) {
            addCriterion("shippingLocation <=", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationLike(String value) {
            addCriterion("shippingLocation like", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationNotLike(String value) {
            addCriterion("shippingLocation not like", value, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationIn(List<String> values) {
            addCriterion("shippingLocation in", values, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationNotIn(List<String> values) {
            addCriterion("shippingLocation not in", values, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationBetween(String value1, String value2) {
            addCriterion("shippingLocation between", value1, value2, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andShippinglocationNotBetween(String value1, String value2) {
            addCriterion("shippingLocation not between", value1, value2, "shippinglocation");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andNamecnLikeInsensitive(String value) {
            addCriterion("upper(nameCN) like", value.toUpperCase(), "namecn");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLikeInsensitive(String value) {
            addCriterion("upper(abbreviation) like", value.toUpperCase(), "abbreviation");
            return (Criteria) this;
        }

        public Criteria andCurrencyLikeInsensitive(String value) {
            addCriterion("upper(currency) like", value.toUpperCase(), "currency");
            return (Criteria) this;
        }

        public Criteria andUnitdetailLikeInsensitive(String value) {
            addCriterion("upper(unitDetail) like", value.toUpperCase(), "unitdetail");
            return (Criteria) this;
        }

        public Criteria andShippinglocationLikeInsensitive(String value) {
            addCriterion("upper(shippingLocation) like", value.toUpperCase(), "shippinglocation");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}