package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程实体类
 * 
 * @author tanzibiao
 * @date 2021/12/14
 *
 * @mbg.generated 2021/12/14
 */
public class KechengCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * KechengCriteria
     * @return 
     */
    public KechengCriteria() {
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

        public Criteria andKechengIdIsNull() {
            addCriterion("kecheng_id is null");
            return (Criteria) this;
        }

        public Criteria andKechengIdIsNotNull() {
            addCriterion("kecheng_id is not null");
            return (Criteria) this;
        }

        public Criteria andKechengIdEqualTo(Integer value) {
            addCriterion("kecheng_id =", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdNotEqualTo(Integer value) {
            addCriterion("kecheng_id <>", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdGreaterThan(Integer value) {
            addCriterion("kecheng_id >", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kecheng_id >=", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdLessThan(Integer value) {
            addCriterion("kecheng_id <", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdLessThanOrEqualTo(Integer value) {
            addCriterion("kecheng_id <=", value, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdIn(List<Integer> values) {
            addCriterion("kecheng_id in", values, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdNotIn(List<Integer> values) {
            addCriterion("kecheng_id not in", values, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdBetween(Integer value1, Integer value2) {
            addCriterion("kecheng_id between", value1, value2, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kecheng_id not between", value1, value2, "kechengId");
            return (Criteria) this;
        }

        public Criteria andKechengNameIsNull() {
            addCriterion("kecheng_name is null");
            return (Criteria) this;
        }

        public Criteria andKechengNameIsNotNull() {
            addCriterion("kecheng_name is not null");
            return (Criteria) this;
        }

        public Criteria andKechengNameEqualTo(String value) {
            addCriterion("kecheng_name =", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameNotEqualTo(String value) {
            addCriterion("kecheng_name <>", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameGreaterThan(String value) {
            addCriterion("kecheng_name >", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameGreaterThanOrEqualTo(String value) {
            addCriterion("kecheng_name >=", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameLessThan(String value) {
            addCriterion("kecheng_name <", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameLessThanOrEqualTo(String value) {
            addCriterion("kecheng_name <=", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameLike(String value) {
            addCriterion("kecheng_name like", "%"+value+"%", "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameNotLike(String value) {
            addCriterion("kecheng_name not like", value, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameIn(List<String> values) {
            addCriterion("kecheng_name in", values, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameNotIn(List<String> values) {
            addCriterion("kecheng_name not in", values, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameBetween(String value1, String value2) {
            addCriterion("kecheng_name between", value1, value2, "kechengName");
            return (Criteria) this;
        }

        public Criteria andKechengNameNotBetween(String value1, String value2) {
            addCriterion("kecheng_name not between", value1, value2, "kechengName");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdIsNull() {
            addCriterion("laoshi_id is null");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdIsNotNull() {
            addCriterion("laoshi_id is not null");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdEqualTo(Integer value) {
            addCriterion("laoshi_id =", value, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdNotEqualTo(Integer value) {
            addCriterion("laoshi_id <>", value, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdGreaterThan(Integer value) {
            addCriterion("laoshi_id >", value, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("laoshi_id >=", value, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdLessThan(Integer value) {
            addCriterion("laoshi_id <", value, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdLessThanOrEqualTo(Integer value) {
            addCriterion("laoshi_id <=", value, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdIn(List<Integer> values) {
            addCriterion("laoshi_id in", values, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdNotIn(List<Integer> values) {
            addCriterion("laoshi_id not in", values, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdBetween(Integer value1, Integer value2) {
            addCriterion("laoshi_id between", value1, value2, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("laoshi_id not between", value1, value2, "laoshiId");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameIsNull() {
            addCriterion("laoshi_name is null");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameIsNotNull() {
            addCriterion("laoshi_name is not null");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameEqualTo(String value) {
            addCriterion("laoshi_name =", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameNotEqualTo(String value) {
            addCriterion("laoshi_name <>", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameGreaterThan(String value) {
            addCriterion("laoshi_name >", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameGreaterThanOrEqualTo(String value) {
            addCriterion("laoshi_name >=", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameLessThan(String value) {
            addCriterion("laoshi_name <", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameLessThanOrEqualTo(String value) {
            addCriterion("laoshi_name <=", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameLike(String value) {
            addCriterion("laoshi_name like", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameNotLike(String value) {
            addCriterion("laoshi_name not like", value, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameIn(List<String> values) {
            addCriterion("laoshi_name in", values, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameNotIn(List<String> values) {
            addCriterion("laoshi_name not in", values, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameBetween(String value1, String value2) {
            addCriterion("laoshi_name between", value1, value2, "laoshiName");
            return (Criteria) this;
        }

        public Criteria andLaoshiNameNotBetween(String value1, String value2) {
            addCriterion("laoshi_name not between", value1, value2, "laoshiName");
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