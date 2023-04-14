package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 成绩比例实体类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public class BiliCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * BiliCriteria
     * @return 
     */
    public BiliCriteria() {
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

        public Criteria andDeyuIsNull() {
            addCriterion("deyu is null");
            return (Criteria) this;
        }

        public Criteria andDeyuIsNotNull() {
            addCriterion("deyu is not null");
            return (Criteria) this;
        }

        public Criteria andDeyuEqualTo(Float value) {
            addCriterion("deyu =", value, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuNotEqualTo(Float value) {
            addCriterion("deyu <>", value, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuGreaterThan(Float value) {
            addCriterion("deyu >", value, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuGreaterThanOrEqualTo(Float value) {
            addCriterion("deyu >=", value, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuLessThan(Float value) {
            addCriterion("deyu <", value, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuLessThanOrEqualTo(Float value) {
            addCriterion("deyu <=", value, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuIn(List<Float> values) {
            addCriterion("deyu in", values, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuNotIn(List<Float> values) {
            addCriterion("deyu not in", values, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuBetween(Float value1, Float value2) {
            addCriterion("deyu between", value1, value2, "deyu");
            return (Criteria) this;
        }

        public Criteria andDeyuNotBetween(Float value1, Float value2) {
            addCriterion("deyu not between", value1, value2, "deyu");
            return (Criteria) this;
        }

        public Criteria andXueyeIsNull() {
            addCriterion("xueye is null");
            return (Criteria) this;
        }

        public Criteria andXueyeIsNotNull() {
            addCriterion("xueye is not null");
            return (Criteria) this;
        }

        public Criteria andXueyeEqualTo(Float value) {
            addCriterion("xueye =", value, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeNotEqualTo(Float value) {
            addCriterion("xueye <>", value, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeGreaterThan(Float value) {
            addCriterion("xueye >", value, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeGreaterThanOrEqualTo(Float value) {
            addCriterion("xueye >=", value, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeLessThan(Float value) {
            addCriterion("xueye <", value, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeLessThanOrEqualTo(Float value) {
            addCriterion("xueye <=", value, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeIn(List<Float> values) {
            addCriterion("xueye in", values, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeNotIn(List<Float> values) {
            addCriterion("xueye not in", values, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeBetween(Float value1, Float value2) {
            addCriterion("xueye between", value1, value2, "xueye");
            return (Criteria) this;
        }

        public Criteria andXueyeNotBetween(Float value1, Float value2) {
            addCriterion("xueye not between", value1, value2, "xueye");
            return (Criteria) this;
        }

        public Criteria andWentiIsNull() {
            addCriterion("wenti is null");
            return (Criteria) this;
        }

        public Criteria andWentiIsNotNull() {
            addCriterion("wenti is not null");
            return (Criteria) this;
        }

        public Criteria andWentiEqualTo(Float value) {
            addCriterion("wenti =", value, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiNotEqualTo(Float value) {
            addCriterion("wenti <>", value, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiGreaterThan(Float value) {
            addCriterion("wenti >", value, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiGreaterThanOrEqualTo(Float value) {
            addCriterion("wenti >=", value, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiLessThan(Float value) {
            addCriterion("wenti <", value, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiLessThanOrEqualTo(Float value) {
            addCriterion("wenti <=", value, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiIn(List<Float> values) {
            addCriterion("wenti in", values, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiNotIn(List<Float> values) {
            addCriterion("wenti not in", values, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiBetween(Float value1, Float value2) {
            addCriterion("wenti between", value1, value2, "wenti");
            return (Criteria) this;
        }

        public Criteria andWentiNotBetween(Float value1, Float value2) {
            addCriterion("wenti not between", value1, value2, "wenti");
            return (Criteria) this;
        }

        public Criteria andQitaIsNull() {
            addCriterion("qita is null");
            return (Criteria) this;
        }

        public Criteria andQitaIsNotNull() {
            addCriterion("qita is not null");
            return (Criteria) this;
        }

        public Criteria andQitaEqualTo(Float value) {
            addCriterion("qita =", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotEqualTo(Float value) {
            addCriterion("qita <>", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaGreaterThan(Float value) {
            addCriterion("qita >", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaGreaterThanOrEqualTo(Float value) {
            addCriterion("qita >=", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLessThan(Float value) {
            addCriterion("qita <", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaLessThanOrEqualTo(Float value) {
            addCriterion("qita <=", value, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaIn(List<Float> values) {
            addCriterion("qita in", values, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotIn(List<Float> values) {
            addCriterion("qita not in", values, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaBetween(Float value1, Float value2) {
            addCriterion("qita between", value1, value2, "qita");
            return (Criteria) this;
        }

        public Criteria andQitaNotBetween(Float value1, Float value2) {
            addCriterion("qita not between", value1, value2, "qita");
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