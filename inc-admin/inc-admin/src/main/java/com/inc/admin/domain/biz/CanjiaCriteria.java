package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 活动参与实体类
 * 
 * @author tanzibiao
 * @date 2022/01/21
 *
 * @mbg.generated 2022/01/21
 */
public class CanjiaCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * CanjiaCriteria
     * @return 
     */
    public CanjiaCriteria() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdIsNull() {
            addCriterion("huodong_id is null");
            return (Criteria) this;
        }

        public Criteria andHuodongIdIsNotNull() {
            addCriterion("huodong_id is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongIdEqualTo(Integer value) {
            addCriterion("canjia.huodong_id =", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdNotEqualTo(Integer value) {
            addCriterion("huodong_id <>", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdGreaterThan(Integer value) {
            addCriterion("huodong_id >", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("huodong_id >=", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdLessThan(Integer value) {
            addCriterion("huodong_id <", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdLessThanOrEqualTo(Integer value) {
            addCriterion("huodong_id <=", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdIn(List<Integer> values) {
            addCriterion("huodong_id in", values, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdNotIn(List<Integer> values) {
            addCriterion("huodong_id not in", values, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdBetween(Integer value1, Integer value2) {
            addCriterion("huodong_id between", value1, value2, "huodongId");
            return (Criteria) this;
        }

        public Criteria andHuodongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("huodong_id not between", value1, value2, "huodongId");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingIsNull() {
            addCriterion("canjia_zhengming is null");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingIsNotNull() {
            addCriterion("canjia_zhengming is not null");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingEqualTo(String value) {
            addCriterion("canjia_zhengming =", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingNotEqualTo(String value) {
            addCriterion("canjia_zhengming <>", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingGreaterThan(String value) {
            addCriterion("canjia_zhengming >", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingGreaterThanOrEqualTo(String value) {
            addCriterion("canjia_zhengming >=", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingLessThan(String value) {
            addCriterion("canjia_zhengming <", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingLessThanOrEqualTo(String value) {
            addCriterion("canjia_zhengming <=", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingLike(String value) {
            addCriterion("canjia_zhengming like", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingNotLike(String value) {
            addCriterion("canjia_zhengming not like", value, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingIn(List<String> values) {
            addCriterion("canjia_zhengming in", values, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingNotIn(List<String> values) {
            addCriterion("canjia_zhengming not in", values, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingBetween(String value1, String value2) {
            addCriterion("canjia_zhengming between", value1, value2, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaZhengmingNotBetween(String value1, String value2) {
            addCriterion("canjia_zhengming not between", value1, value2, "canjiaZhengming");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusIsNull() {
            addCriterion("canjia_status is null");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusIsNotNull() {
            addCriterion("canjia_status is not null");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusEqualTo(Integer value) {
            addCriterion("canjia_status =", value, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusNotEqualTo(Integer value) {
            addCriterion("canjia_status <>", value, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusGreaterThan(Integer value) {
            addCriterion("canjia_status >", value, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("canjia_status >=", value, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusLessThan(Integer value) {
            addCriterion("canjia_status <", value, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("canjia_status <=", value, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusIn(List<Integer> values) {
            addCriterion("canjia_status in", values, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusNotIn(List<Integer> values) {
            addCriterion("canjia_status not in", values, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusBetween(Integer value1, Integer value2) {
            addCriterion("canjia_status between", value1, value2, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andCanjiaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("canjia_status not between", value1, value2, "canjiaStatus");
            return (Criteria) this;
        }

        public Criteria andFenIsNull() {
            addCriterion("fen is null");
            return (Criteria) this;
        }

        public Criteria andFenIsNotNull() {
            addCriterion("fen is not null");
            return (Criteria) this;
        }

        public Criteria andFenEqualTo(Float value) {
            addCriterion("fen =", value, "fen");
            return (Criteria) this;
        }
        public Criteria andhuodongLeibieEqualTo(String value) {
            addCriterion("canjia.huodong_leibie =", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andFenNotEqualTo(Float value) {
            addCriterion("fen <>", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenGreaterThan(Float value) {
            addCriterion("fen >", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenGreaterThanOrEqualTo(Float value) {
            addCriterion("fen >=", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLessThan(Float value) {
            addCriterion("fen <", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLessThanOrEqualTo(Float value) {
            addCriterion("fen <=", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenIn(List<Float> values) {
            addCriterion("fen in", values, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotIn(List<Float> values) {
            addCriterion("fen not in", values, "fen");
            return (Criteria) this;
        }

        public Criteria andFenBetween(Float value1, Float value2) {
            addCriterion("fen between", value1, value2, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotBetween(Float value1, Float value2) {
            addCriterion("fen not between", value1, value2, "fen");
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