package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院实体类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
public class XueyuanCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * XueyuanCriteria
     * @return 
     */
    public XueyuanCriteria() {
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

        public Criteria andXueyuanIdIsNull() {
            addCriterion("xueyuan_id is null");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdIsNotNull() {
            addCriterion("xueyuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdEqualTo(Integer value) {
            addCriterion("xueyuan_id =", value, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdNotEqualTo(Integer value) {
            addCriterion("xueyuan_id <>", value, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdGreaterThan(Integer value) {
            addCriterion("xueyuan_id >", value, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyuan_id >=", value, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdLessThan(Integer value) {
            addCriterion("xueyuan_id <", value, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("xueyuan_id <=", value, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdIn(List<Integer> values) {
            addCriterion("xueyuan_id in", values, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdNotIn(List<Integer> values) {
            addCriterion("xueyuan_id not in", values, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdBetween(Integer value1, Integer value2) {
            addCriterion("xueyuan_id between", value1, value2, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xueyuan_id not between", value1, value2, "xueyuanId");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameIsNull() {
            addCriterion("xueyuan_name is null");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameIsNotNull() {
            addCriterion("xueyuan_name is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameEqualTo(String value) {
            addCriterion("xueyuan_name =", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameNotEqualTo(String value) {
            addCriterion("xueyuan_name <>", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameGreaterThan(String value) {
            addCriterion("xueyuan_name >", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameGreaterThanOrEqualTo(String value) {
            addCriterion("xueyuan_name >=", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameLessThan(String value) {
            addCriterion("xueyuan_name <", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameLessThanOrEqualTo(String value) {
            addCriterion("xueyuan_name <=", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameLike(String value) {
            addCriterion("xueyuan_name like", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameNotLike(String value) {
            addCriterion("xueyuan_name not like", value, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameIn(List<String> values) {
            addCriterion("xueyuan_name in", values, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameNotIn(List<String> values) {
            addCriterion("xueyuan_name not in", values, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameBetween(String value1, String value2) {
            addCriterion("xueyuan_name between", value1, value2, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanNameNotBetween(String value1, String value2) {
            addCriterion("xueyuan_name not between", value1, value2, "xueyuanName");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIsNull() {
            addCriterion("xueyuan_lingdao is null");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIsNotNull() {
            addCriterion("xueyuan_lingdao is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoEqualTo(String value) {
            addCriterion("xueyuan_lingdao =", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoNotEqualTo(String value) {
            addCriterion("xueyuan_lingdao <>", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoGreaterThan(String value) {
            addCriterion("xueyuan_lingdao >", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoGreaterThanOrEqualTo(String value) {
            addCriterion("xueyuan_lingdao >=", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoLessThan(String value) {
            addCriterion("xueyuan_lingdao <", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoLessThanOrEqualTo(String value) {
            addCriterion("xueyuan_lingdao <=", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoLike(String value) {
            addCriterion("xueyuan_lingdao like", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoNotLike(String value) {
            addCriterion("xueyuan_lingdao not like", value, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIn(List<String> values) {
            addCriterion("xueyuan_lingdao in", values, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoNotIn(List<String> values) {
            addCriterion("xueyuan_lingdao not in", values, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoBetween(String value1, String value2) {
            addCriterion("xueyuan_lingdao between", value1, value2, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoNotBetween(String value1, String value2) {
            addCriterion("xueyuan_lingdao not between", value1, value2, "xueyuanLingdao");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdIsNull() {
            addCriterion("xueyuan_lingdao_id is null");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdIsNotNull() {
            addCriterion("xueyuan_lingdao_id is not null");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdEqualTo(Integer value) {
            addCriterion("xueyuan_lingdao_id =", value, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdNotEqualTo(Integer value) {
            addCriterion("xueyuan_lingdao_id <>", value, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdGreaterThan(Integer value) {
            addCriterion("xueyuan_lingdao_id >", value, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueyuan_lingdao_id >=", value, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdLessThan(Integer value) {
            addCriterion("xueyuan_lingdao_id <", value, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("xueyuan_lingdao_id <=", value, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdIn(List<Integer> values) {
            addCriterion("xueyuan_lingdao_id in", values, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdNotIn(List<Integer> values) {
            addCriterion("xueyuan_lingdao_id not in", values, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdBetween(Integer value1, Integer value2) {
            addCriterion("xueyuan_lingdao_id between", value1, value2, "xueyuanLingdaoId");
            return (Criteria) this;
        }

        public Criteria andXueyuanLingdaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xueyuan_lingdao_id not between", value1, value2, "xueyuanLingdaoId");
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