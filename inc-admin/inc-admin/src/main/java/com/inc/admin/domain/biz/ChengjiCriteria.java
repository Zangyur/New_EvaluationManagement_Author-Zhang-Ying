package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 综测成绩实体类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public class ChengjiCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * ChengjiCriteria
     * @return 
     */
    public ChengjiCriteria() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * setOrderByClause
     * @param orderByClause
     * @return 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     * @return 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     * @param distinct
     * @return 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     * @return 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     * @return 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     * @param criteria
     * @return 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     * @return 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     * @return 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     * @return 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     * @return 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * setPageNo
     * @param pageNo
     * @return 
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     * getPageNo
     * @return 
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * setStartRow
     * @param startRow
     * @return 
     */
    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    /**
     * getStartRow
     * @return 
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * setPageSize
     * @param pageSize
     * @return 
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     * getPageSize
     * @return 
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * setFields
     * @param fields
     * @return 
     */
    public void setFields(String fields) {
        this.fields=fields;
    }

    /**
     * getFields
     * @return 
     */
    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andZongceIdIsNull() {
            addCriterion("zongce_id is null");
            return (Criteria) this;
        }

        public Criteria andZongceIdIsNotNull() {
            addCriterion("zongce_id is not null");
            return (Criteria) this;
        }

        public Criteria andZongceIdEqualTo(Integer value) {
            addCriterion("zongce_id =", value, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdNotEqualTo(Integer value) {
            addCriterion("zongce_id <>", value, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdGreaterThan(Integer value) {
            addCriterion("zongce_id >", value, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zongce_id >=", value, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdLessThan(Integer value) {
            addCriterion("zongce_id <", value, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdLessThanOrEqualTo(Integer value) {
            addCriterion("zongce_id <=", value, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdIn(List<Integer> values) {
            addCriterion("zongce_id in", values, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdNotIn(List<Integer> values) {
            addCriterion("zongce_id not in", values, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdBetween(Integer value1, Integer value2) {
            addCriterion("zongce_id between", value1, value2, "zongceId");
            return (Criteria) this;
        }

        public Criteria andZongceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zongce_id not between", value1, value2, "zongceId");
            return (Criteria) this;
        }

        public Criteria andXueqiIsNull() {
            addCriterion("xueqi is null");
            return (Criteria) this;
        }

        public Criteria andXueqiIsNotNull() {
            addCriterion("xueqi is not null");
            return (Criteria) this;
        }

        public Criteria andXueqiEqualTo(String value) {
            addCriterion("xueqi =", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiNotEqualTo(String value) {
            addCriterion("xueqi <>", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiGreaterThan(String value) {
            addCriterion("xueqi >", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiGreaterThanOrEqualTo(String value) {
            addCriterion("xueqi >=", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiLessThan(String value) {
            addCriterion("xueqi <", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiLessThanOrEqualTo(String value) {
            addCriterion("xueqi <=", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiLike(String value) {
            addCriterion("xueqi like", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiNotLike(String value) {
            addCriterion("xueqi not like", value, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiIn(List<String> values) {
            addCriterion("xueqi in", values, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiNotIn(List<String> values) {
            addCriterion("xueqi not in", values, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiBetween(String value1, String value2) {
            addCriterion("xueqi between", value1, value2, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueqiNotBetween(String value1, String value2) {
            addCriterion("xueqi not between", value1, value2, "xueqi");
            return (Criteria) this;
        }

        public Criteria andXueyuanIsNull() {
            addCriterion("xueyuan is null");
            return (Criteria) this;
        }

        public Criteria andXueyuanIsNotNull() {
            addCriterion("xueyuan is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuanEqualTo(String value) {
            addCriterion("xueyuan =", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanNotEqualTo(String value) {
            addCriterion("xueyuan <>", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanGreaterThan(String value) {
            addCriterion("xueyuan >", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanGreaterThanOrEqualTo(String value) {
            addCriterion("xueyuan >=", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanLessThan(String value) {
            addCriterion("xueyuan <", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanLessThanOrEqualTo(String value) {
            addCriterion("xueyuan <=", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanLike(String value) {
            addCriterion("xueyuan like", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanNotLike(String value) {
            addCriterion("xueyuan not like", value, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanIn(List<String> values) {
            addCriterion("xueyuan in", values, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanNotIn(List<String> values) {
            addCriterion("xueyuan not in", values, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanBetween(String value1, String value2) {
            addCriterion("xueyuan between", value1, value2, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andXueyuanNotBetween(String value1, String value2) {
            addCriterion("xueyuan not between", value1, value2, "xueyuan");
            return (Criteria) this;
        }

        public Criteria andBanjiIdIsNull() {
            addCriterion("banji_id is null");
            return (Criteria) this;
        }

        public Criteria andBanjiIdIsNotNull() {
            addCriterion("banji_id is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiIdEqualTo(Integer value) {
            addCriterion("banji_id =", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotEqualTo(Integer value) {
            addCriterion("banji_id <>", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdGreaterThan(Integer value) {
            addCriterion("banji_id >", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banji_id >=", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdLessThan(Integer value) {
            addCriterion("banji_id <", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdLessThanOrEqualTo(Integer value) {
            addCriterion("banji_id <=", value, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdIn(List<Integer> values) {
            addCriterion("banji_id in", values, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotIn(List<Integer> values) {
            addCriterion("banji_id not in", values, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdBetween(Integer value1, Integer value2) {
            addCriterion("banji_id between", value1, value2, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banji_id not between", value1, value2, "banjiId");
            return (Criteria) this;
        }

        public Criteria andBanjiNameIsNull() {
            addCriterion("banji_name is null");
            return (Criteria) this;
        }

        public Criteria andBanjiNameIsNotNull() {
            addCriterion("banji_name is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiNameEqualTo(String value) {
            addCriterion("banji_name =", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameNotEqualTo(String value) {
            addCriterion("banji_name <>", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameGreaterThan(String value) {
            addCriterion("banji_name >", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameGreaterThanOrEqualTo(String value) {
            addCriterion("banji_name >=", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameLessThan(String value) {
            addCriterion("banji_name <", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameLessThanOrEqualTo(String value) {
            addCriterion("banji_name <=", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameLike(String value) {
            addCriterion("banji_name like", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameNotLike(String value) {
            addCriterion("banji_name not like", value, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameIn(List<String> values) {
            addCriterion("banji_name in", values, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameNotIn(List<String> values) {
            addCriterion("banji_name not in", values, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameBetween(String value1, String value2) {
            addCriterion("banji_name between", value1, value2, "banjiName");
            return (Criteria) this;
        }

        public Criteria andBanjiNameNotBetween(String value1, String value2) {
            addCriterion("banji_name not between", value1, value2, "banjiName");
            return (Criteria) this;
        }

        public Criteria andXueshengIdIsNull() {
            addCriterion("xuesheng_id is null");
            return (Criteria) this;
        }

        public Criteria andXueshengIdIsNotNull() {
            addCriterion("xuesheng_id is not null");
            return (Criteria) this;
        }

        public Criteria andXueshengIdEqualTo(Integer value) {
            addCriterion("xuesheng_id =", value, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdNotEqualTo(Integer value) {
            addCriterion("xuesheng_id <>", value, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdGreaterThan(Integer value) {
            addCriterion("xuesheng_id >", value, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xuesheng_id >=", value, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdLessThan(Integer value) {
            addCriterion("xuesheng_id <", value, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdLessThanOrEqualTo(Integer value) {
            addCriterion("xuesheng_id <=", value, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdIn(List<Integer> values) {
            addCriterion("xuesheng_id in", values, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdNotIn(List<Integer> values) {
            addCriterion("xuesheng_id not in", values, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdBetween(Integer value1, Integer value2) {
            addCriterion("xuesheng_id between", value1, value2, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xuesheng_id not between", value1, value2, "xueshengId");
            return (Criteria) this;
        }

        public Criteria andXueshengNameIsNull() {
            addCriterion("xuesheng_name is null");
            return (Criteria) this;
        }

        public Criteria andXueshengNameIsNotNull() {
            addCriterion("xuesheng_name is not null");
            return (Criteria) this;
        }

        public Criteria andXueshengNameEqualTo(String value) {
            addCriterion("xuesheng_name =", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameNotEqualTo(String value) {
            addCriterion("xuesheng_name <>", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameGreaterThan(String value) {
            addCriterion("xuesheng_name >", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameGreaterThanOrEqualTo(String value) {
            addCriterion("xuesheng_name >=", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameLessThan(String value) {
            addCriterion("xuesheng_name <", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameLessThanOrEqualTo(String value) {
            addCriterion("xuesheng_name <=", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameLike(String value) {
            addCriterion("xuesheng_name like", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameNotLike(String value) {
            addCriterion("xuesheng_name not like", value, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameIn(List<String> values) {
            addCriterion("xuesheng_name in", values, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameNotIn(List<String> values) {
            addCriterion("xuesheng_name not in", values, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameBetween(String value1, String value2) {
            addCriterion("xuesheng_name between", value1, value2, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andXueshengNameNotBetween(String value1, String value2) {
            addCriterion("xuesheng_name not between", value1, value2, "xueshengName");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiIsNull() {
            addCriterion("deyu_chengji is null");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiIsNotNull() {
            addCriterion("deyu_chengji is not null");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiEqualTo(Double value) {
            addCriterion("deyu_chengji =", value, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiNotEqualTo(Double value) {
            addCriterion("deyu_chengji <>", value, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiGreaterThan(Double value) {
            addCriterion("deyu_chengji >", value, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiGreaterThanOrEqualTo(Double value) {
            addCriterion("deyu_chengji >=", value, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiLessThan(Double value) {
            addCriterion("deyu_chengji <", value, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiLessThanOrEqualTo(Double value) {
            addCriterion("deyu_chengji <=", value, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiIn(List<Double> values) {
            addCriterion("deyu_chengji in", values, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiNotIn(List<Double> values) {
            addCriterion("deyu_chengji not in", values, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiBetween(Double value1, Double value2) {
            addCriterion("deyu_chengji between", value1, value2, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andDeyuChengjiNotBetween(Double value1, Double value2) {
            addCriterion("deyu_chengji not between", value1, value2, "deyuChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiIsNull() {
            addCriterion("xueye_chengji is null");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiIsNotNull() {
            addCriterion("xueye_chengji is not null");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiEqualTo(Double value) {
            addCriterion("xueye_chengji =", value, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiNotEqualTo(Double value) {
            addCriterion("xueye_chengji <>", value, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiGreaterThan(Double value) {
            addCriterion("xueye_chengji >", value, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiGreaterThanOrEqualTo(Double value) {
            addCriterion("xueye_chengji >=", value, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiLessThan(Double value) {
            addCriterion("xueye_chengji <", value, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiLessThanOrEqualTo(Double value) {
            addCriterion("xueye_chengji <=", value, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiIn(List<Double> values) {
            addCriterion("xueye_chengji in", values, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiNotIn(List<Double> values) {
            addCriterion("xueye_chengji not in", values, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiBetween(Double value1, Double value2) {
            addCriterion("xueye_chengji between", value1, value2, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andXueyeChengjiNotBetween(Double value1, Double value2) {
            addCriterion("xueye_chengji not between", value1, value2, "xueyeChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiIsNull() {
            addCriterion("wenti_chengji is null");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiIsNotNull() {
            addCriterion("wenti_chengji is not null");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiEqualTo(Double value) {
            addCriterion("wenti_chengji =", value, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiNotEqualTo(Double value) {
            addCriterion("wenti_chengji <>", value, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiGreaterThan(Double value) {
            addCriterion("wenti_chengji >", value, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiGreaterThanOrEqualTo(Double value) {
            addCriterion("wenti_chengji >=", value, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiLessThan(Double value) {
            addCriterion("wenti_chengji <", value, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiLessThanOrEqualTo(Double value) {
            addCriterion("wenti_chengji <=", value, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiIn(List<Double> values) {
            addCriterion("wenti_chengji in", values, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiNotIn(List<Double> values) {
            addCriterion("wenti_chengji not in", values, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiBetween(Double value1, Double value2) {
            addCriterion("wenti_chengji between", value1, value2, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andWentiChengjiNotBetween(Double value1, Double value2) {
            addCriterion("wenti_chengji not between", value1, value2, "wentiChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiIsNull() {
            addCriterion("zongce_chengji is null");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiIsNotNull() {
            addCriterion("zongce_chengji is not null");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiEqualTo(Double value) {
            addCriterion("zongce_chengji =", value, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiNotEqualTo(Double value) {
            addCriterion("zongce_chengji <>", value, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiGreaterThan(Double value) {
            addCriterion("zongce_chengji >", value, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiGreaterThanOrEqualTo(Double value) {
            addCriterion("zongce_chengji >=", value, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiLessThan(Double value) {
            addCriterion("zongce_chengji <", value, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiLessThanOrEqualTo(Double value) {
            addCriterion("zongce_chengji <=", value, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiIn(List<Double> values) {
            addCriterion("zongce_chengji in", values, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiNotIn(List<Double> values) {
            addCriterion("zongce_chengji not in", values, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiBetween(Double value1, Double value2) {
            addCriterion("zongce_chengji between", value1, value2, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andZongceChengjiNotBetween(Double value1, Double value2) {
            addCriterion("zongce_chengji not between", value1, value2, "zongceChengji");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusIsNull() {
            addCriterion("yiyi_status is null");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusIsNotNull() {
            addCriterion("yiyi_status is not null");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusEqualTo(Byte value) {
            addCriterion("yiyi_status =", value, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusNotEqualTo(Byte value) {
            addCriterion("yiyi_status <>", value, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusGreaterThan(int value) {
            addCriterion("yiyi_status >", value, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("yiyi_status >=", value, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusLessThan(Byte value) {
            addCriterion("yiyi_status <", value, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusLessThanOrEqualTo(Byte value) {
            addCriterion("yiyi_status <=", value, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusIn(List<Byte> values) {
            addCriterion("yiyi_status in", values, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusNotIn(List<Byte> values) {
            addCriterion("yiyi_status not in", values, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusBetween(Byte value1, Byte value2) {
            addCriterion("yiyi_status between", value1, value2, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("yiyi_status not between", value1, value2, "yiyiStatus");
            return (Criteria) this;
        }

        public Criteria andYiyiDescIsNull() {
            addCriterion("yiyi_desc is null");
            return (Criteria) this;
        }

        public Criteria andYiyiDescIsNotNull() {
            addCriterion("yiyi_desc is not null");
            return (Criteria) this;
        }

        public Criteria andYiyiDescEqualTo(String value) {
            addCriterion("yiyi_desc =", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescNotEqualTo(String value) {
            addCriterion("yiyi_desc <>", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescGreaterThan(String value) {
            addCriterion("yiyi_desc >", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescGreaterThanOrEqualTo(String value) {
            addCriterion("yiyi_desc >=", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescLessThan(String value) {
            addCriterion("yiyi_desc <", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescLessThanOrEqualTo(String value) {
            addCriterion("yiyi_desc <=", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescLike(String value) {
            addCriterion("yiyi_desc like", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescNotLike(String value) {
            addCriterion("yiyi_desc not like", value, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescIn(List<String> values) {
            addCriterion("yiyi_desc in", values, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescNotIn(List<String> values) {
            addCriterion("yiyi_desc not in", values, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescBetween(String value1, String value2) {
            addCriterion("yiyi_desc between", value1, value2, "yiyiDesc");
            return (Criteria) this;
        }

        public Criteria andYiyiDescNotBetween(String value1, String value2) {
            addCriterion("yiyi_desc not between", value1, value2, "yiyiDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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