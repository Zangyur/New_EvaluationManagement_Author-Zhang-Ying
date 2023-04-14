package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 活动类别实体类
 * 
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
public class HuodongLeibieCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * HuodongLeibieCriteria
     * @return 
     */
    public HuodongLeibieCriteria() {
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

        public Criteria andHuodongleibieIdIsNull() {
            addCriterion("huodongleibie_id is null");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdIsNotNull() {
            addCriterion("huodongleibie_id is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdEqualTo(Integer value) {
            addCriterion("huodongleibie_id =", value, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdNotEqualTo(Integer value) {
            addCriterion("huodongleibie_id <>", value, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdGreaterThan(Integer value) {
            addCriterion("huodongleibie_id >", value, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("huodongleibie_id >=", value, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdLessThan(Integer value) {
            addCriterion("huodongleibie_id <", value, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdLessThanOrEqualTo(Integer value) {
            addCriterion("huodongleibie_id <=", value, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdIn(List<Integer> values) {
            addCriterion("huodongleibie_id in", values, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdNotIn(List<Integer> values) {
            addCriterion("huodongleibie_id not in", values, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdBetween(Integer value1, Integer value2) {
            addCriterion("huodongleibie_id between", value1, value2, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("huodongleibie_id not between", value1, value2, "huodongleibieId");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameIsNull() {
            addCriterion("huodongleibie_name is null");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameIsNotNull() {
            addCriterion("huodongleibie_name is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameEqualTo(String value) {
            addCriterion("huodongleibie_name =", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameNotEqualTo(String value) {
            addCriterion("huodongleibie_name <>", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameGreaterThan(String value) {
            addCriterion("huodongleibie_name >", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameGreaterThanOrEqualTo(String value) {
            addCriterion("huodongleibie_name >=", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameLessThan(String value) {
            addCriterion("huodongleibie_name <", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameLessThanOrEqualTo(String value) {
            addCriterion("huodongleibie_name <=", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameLike(String value) {
            addCriterion("huodongleibie_name like", "%"+value+"%", "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameNotLike(String value) {
            addCriterion("huodongleibie_name not like", value, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameIn(List<String> values) {
            addCriterion("huodongleibie_name in", values, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameNotIn(List<String> values) {
            addCriterion("huodongleibie_name not in", values, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameBetween(String value1, String value2) {
            addCriterion("huodongleibie_name between", value1, value2, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieNameNotBetween(String value1, String value2) {
            addCriterion("huodongleibie_name not between", value1, value2, "huodongleibieName");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenIsNull() {
            addCriterion("huodongleibie_fen is null");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenIsNotNull() {
            addCriterion("huodongleibie_fen is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenEqualTo(Double value) {
            addCriterion("huodongleibie_fen =", value, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenNotEqualTo(Double value) {
            addCriterion("huodongleibie_fen <>", value, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenGreaterThan(Double value) {
            addCriterion("huodongleibie_fen >", value, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenGreaterThanOrEqualTo(Double value) {
            addCriterion("huodongleibie_fen >=", value, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenLessThan(Double value) {
            addCriterion("huodongleibie_fen <", value, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenLessThanOrEqualTo(Float value) {
            addCriterion("huodongleibie_fen <=", value, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenIn(List<Float> values) {
            addCriterion("huodongleibie_fen in", values, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenNotIn(List<Float> values) {
            addCriterion("huodongleibie_fen not in", values, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenBetween(Float value1, Float value2) {
            addCriterion("huodongleibie_fen between", value1, value2, "huodongleibieFen");
            return (Criteria) this;
        }

        public Criteria andHuodongleibieFenNotBetween(Float value1, Float value2) {
            addCriterion("huodongleibie_fen not between", value1, value2, "huodongleibieFen");
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