package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级实体类
 * 
 * @author tanzibiao
 * @date 2021/12/13
 *
 * @mbg.generated 2021/12/13
 */
public class BanjiCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * BanjiCriteria
     * @return 
     */
    public BanjiCriteria() {
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
            addCriterion("banji_name like", "%"+value+"%", "banjiName");
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

        public Criteria andBanzhurenIdIsNull() {
            addCriterion("banzhuren_id is null");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdIsNotNull() {
            addCriterion("banzhuren_id is not null");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdEqualTo(Integer value) {
            addCriterion("banzhuren_id =", value, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdNotEqualTo(Integer value) {
            addCriterion("banzhuren_id <>", value, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdGreaterThan(Integer value) {
            addCriterion("banzhuren_id >", value, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banzhuren_id >=", value, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdLessThan(Integer value) {
            addCriterion("banzhuren_id <", value, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdLessThanOrEqualTo(Integer value) {
            addCriterion("banzhuren_id <=", value, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdIn(List<Integer> values) {
            addCriterion("banzhuren_id in", values, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdNotIn(List<Integer> values) {
            addCriterion("banzhuren_id not in", values, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdBetween(Integer value1, Integer value2) {
            addCriterion("banzhuren_id between", value1, value2, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banzhuren_id not between", value1, value2, "banzhurenId");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameIsNull() {
            addCriterion("banzhuren_name is null");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameIsNotNull() {
            addCriterion("banzhuren_name is not null");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameEqualTo(String value) {
            addCriterion("banzhuren_name =", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameNotEqualTo(String value) {
            addCriterion("banzhuren_name <>", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameGreaterThan(String value) {
            addCriterion("banzhuren_name >", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameGreaterThanOrEqualTo(String value) {
            addCriterion("banzhuren_name >=", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameLessThan(String value) {
            addCriterion("banzhuren_name <", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameLessThanOrEqualTo(String value) {
            addCriterion("banzhuren_name <=", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameLike(String value) {
            addCriterion("banzhuren_name like", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameNotLike(String value) {
            addCriterion("banzhuren_name not like", value, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameIn(List<String> values) {
            addCriterion("banzhuren_name in", values, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameNotIn(List<String> values) {
            addCriterion("banzhuren_name not in", values, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameBetween(String value1, String value2) {
            addCriterion("banzhuren_name between", value1, value2, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andBanzhurenNameNotBetween(String value1, String value2) {
            addCriterion("banzhuren_name not between", value1, value2, "banzhurenName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdIsNull() {
            addCriterion("fudaoyuan_id is null");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdIsNotNull() {
            addCriterion("fudaoyuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdEqualTo(Integer value) {
            addCriterion("fudaoyuan_id =", value, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdNotEqualTo(Integer value) {
            addCriterion("fudaoyuan_id <>", value, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdGreaterThan(Integer value) {
            addCriterion("fudaoyuan_id >", value, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fudaoyuan_id >=", value, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdLessThan(Integer value) {
            addCriterion("fudaoyuan_id <", value, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("fudaoyuan_id <=", value, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdIn(List<Integer> values) {
            addCriterion("fudaoyuan_id in", values, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdNotIn(List<Integer> values) {
            addCriterion("fudaoyuan_id not in", values, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdBetween(Integer value1, Integer value2) {
            addCriterion("fudaoyuan_id between", value1, value2, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fudaoyuan_id not between", value1, value2, "fudaoyuanId");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameIsNull() {
            addCriterion("fudaoyuan_name is null");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameIsNotNull() {
            addCriterion("fudaoyuan_name is not null");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameEqualTo(String value) {
            addCriterion("fudaoyuan_name =", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameNotEqualTo(String value) {
            addCriterion("fudaoyuan_name <>", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameGreaterThan(String value) {
            addCriterion("fudaoyuan_name >", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameGreaterThanOrEqualTo(String value) {
            addCriterion("fudaoyuan_name >=", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameLessThan(String value) {
            addCriterion("fudaoyuan_name <", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameLessThanOrEqualTo(String value) {
            addCriterion("fudaoyuan_name <=", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameLike(String value) {
            addCriterion("fudaoyuan_name like", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameNotLike(String value) {
            addCriterion("fudaoyuan_name not like", value, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameIn(List<String> values) {
            addCriterion("fudaoyuan_name in", values, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameNotIn(List<String> values) {
            addCriterion("fudaoyuan_name not in", values, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameBetween(String value1, String value2) {
            addCriterion("fudaoyuan_name between", value1, value2, "fudaoyuanName");
            return (Criteria) this;
        }

        public Criteria andFudaoyuanNameNotBetween(String value1, String value2) {
            addCriterion("fudaoyuan_name not between", value1, value2, "fudaoyuanName");
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