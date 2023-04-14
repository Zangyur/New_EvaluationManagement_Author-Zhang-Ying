package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户设置实体类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
public class UserSettingCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * UserSettingCriteria
     * @return 
     */
    public UserSettingCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLeibieIsNull() {
            addCriterion("leibie is null");
            return (Criteria) this;
        }

        public Criteria andLeibieIsNotNull() {
            addCriterion("leibie is not null");
            return (Criteria) this;
        }

        public Criteria andLeibieEqualTo(String value) {
            addCriterion("leibie =", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotEqualTo(String value) {
            addCriterion("leibie <>", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieGreaterThan(String value) {
            addCriterion("leibie >", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieGreaterThanOrEqualTo(String value) {
            addCriterion("leibie >=", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLessThan(String value) {
            addCriterion("leibie <", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLessThanOrEqualTo(String value) {
            addCriterion("leibie <=", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLike(String value) {
            addCriterion("leibie like", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotLike(String value) {
            addCriterion("leibie not like", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieIn(List<String> values) {
            addCriterion("leibie in", values, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotIn(List<String> values) {
            addCriterion("leibie not in", values, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieBetween(String value1, String value2) {
            addCriterion("leibie between", value1, value2, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotBetween(String value1, String value2) {
            addCriterion("leibie not between", value1, value2, "leibie");
            return (Criteria) this;
        }

        public Criteria andIsMsgIsNull() {
            addCriterion("is_msg is null");
            return (Criteria) this;
        }

        public Criteria andIsMsgIsNotNull() {
            addCriterion("is_msg is not null");
            return (Criteria) this;
        }

        public Criteria andIsMsgEqualTo(Integer value) {
            addCriterion("is_msg =", value, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgNotEqualTo(Integer value) {
            addCriterion("is_msg <>", value, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgGreaterThan(Integer value) {
            addCriterion("is_msg >", value, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_msg >=", value, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgLessThan(Integer value) {
            addCriterion("is_msg <", value, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgLessThanOrEqualTo(Integer value) {
            addCriterion("is_msg <=", value, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgIn(List<Integer> values) {
            addCriterion("is_msg in", values, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgNotIn(List<Integer> values) {
            addCriterion("is_msg not in", values, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgBetween(Integer value1, Integer value2) {
            addCriterion("is_msg between", value1, value2, "isMsg");
            return (Criteria) this;
        }

        public Criteria andIsMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("is_msg not between", value1, value2, "isMsg");
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