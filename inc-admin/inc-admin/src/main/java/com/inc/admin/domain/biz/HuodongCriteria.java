package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 活动实体类
 * 
 * @author inc
 * @date 2022/01/17
 *
 * @mbg.generated 2022/01/17
 */
public class HuodongCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * HuodongCriteria
     * @return 
     */
    public HuodongCriteria() {
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

        public Criteria andHuodongIdIsNull() {
            addCriterion("huodong_id is null");
            return (Criteria) this;
        }

        public Criteria andHuodongIdIsNotNull() {
            addCriterion("huodong_id is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongIdEqualTo(Integer value) {
            addCriterion("huodong_id =", value, "huodongId");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("canjia.student_id =", value, "huodongId");
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

        public Criteria andHuodongNameIsNull() {
            addCriterion("huodong_name is null");
            return (Criteria) this;
        }

        public Criteria andHuodongNameIsNotNull() {
            addCriterion("huodong_name is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongNameEqualTo(String value) {
            addCriterion("huodong_name =", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameNotEqualTo(String value) {
            addCriterion("huodong_name <>", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameGreaterThan(String value) {
            addCriterion("huodong_name >", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameGreaterThanOrEqualTo(String value) {
            addCriterion("huodong_name >=", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameLessThan(String value) {
            addCriterion("huodong_name <", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameLessThanOrEqualTo(String value) {
            addCriterion("huodong_name <=", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameLike(String value) {
            addCriterion("huodong_name like", "%"+value+"%", "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameNotLike(String value) {
            addCriterion("huodong_name not like", value, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameIn(List<String> values) {
            addCriterion("huodong_name in", values, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameNotIn(List<String> values) {
            addCriterion("huodong_name not in", values, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameBetween(String value1, String value2) {
            addCriterion("huodong_name between", value1, value2, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongNameNotBetween(String value1, String value2) {
            addCriterion("huodong_name not between", value1, value2, "huodongName");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieIsNull() {
            addCriterion("huodong_leibie is null");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieIsNotNull() {
            addCriterion("huodong_leibie is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieEqualTo(Integer value) {
            addCriterion("huodong_leibie =", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieNotEqualTo(Integer value) {
            addCriterion("huodong_leibie <>", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieGreaterThan(Integer value) {
            addCriterion("huodong_leibie >", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("huodong_leibie >=", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieLessThan(Integer value) {
            addCriterion("huodong_leibie <", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieLessThanOrEqualTo(Integer value) {
            addCriterion("huodong_leibie <=", value, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieIn(List<Integer> values) {
            addCriterion("huodong_leibie in", values, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieNotIn(List<Integer> values) {
            addCriterion("huodong_leibie not in", values, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieBetween(Integer value1, Integer value2) {
            addCriterion("huodong_leibie between", value1, value2, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongLeibieNotBetween(Integer value1, Integer value2) {
            addCriterion("huodong_leibie not between", value1, value2, "huodongLeibie");
            return (Criteria) this;
        }

        public Criteria andHuodongDescIsNull() {
            addCriterion("huodong_desc is null");
            return (Criteria) this;
        }

        public Criteria andHuodongDescIsNotNull() {
            addCriterion("huodong_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongDescEqualTo(String value) {
            addCriterion("huodong_desc =", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescNotEqualTo(String value) {
            addCriterion("huodong_desc <>", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescGreaterThan(String value) {
            addCriterion("huodong_desc >", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescGreaterThanOrEqualTo(String value) {
            addCriterion("huodong_desc >=", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescLessThan(String value) {
            addCriterion("huodong_desc <", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescLessThanOrEqualTo(String value) {
            addCriterion("huodong_desc <=", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescLike(String value) {
            addCriterion("huodong_desc like", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescNotLike(String value) {
            addCriterion("huodong_desc not like", value, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescIn(List<String> values) {
            addCriterion("huodong_desc in", values, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescNotIn(List<String> values) {
            addCriterion("huodong_desc not in", values, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescBetween(String value1, String value2) {
            addCriterion("huodong_desc between", value1, value2, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongDescNotBetween(String value1, String value2) {
            addCriterion("huodong_desc not between", value1, value2, "huodongDesc");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceIsNull() {
            addCriterion("huodong_place is null");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceIsNotNull() {
            addCriterion("huodong_place is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceEqualTo(String value) {
            addCriterion("huodong_place =", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceNotEqualTo(String value) {
            addCriterion("huodong_place <>", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceGreaterThan(String value) {
            addCriterion("huodong_place >", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("huodong_place >=", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceLessThan(String value) {
            addCriterion("huodong_place <", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceLessThanOrEqualTo(String value) {
            addCriterion("huodong_place <=", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceLike(String value) {
            addCriterion("huodong_place like", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceNotLike(String value) {
            addCriterion("huodong_place not like", value, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceIn(List<String> values) {
            addCriterion("huodong_place in", values, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceNotIn(List<String> values) {
            addCriterion("huodong_place not in", values, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceBetween(String value1, String value2) {
            addCriterion("huodong_place between", value1, value2, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongPlaceNotBetween(String value1, String value2) {
            addCriterion("huodong_place not between", value1, value2, "huodongPlace");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerIsNull() {
            addCriterion("huodong_producer is null");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerIsNotNull() {
            addCriterion("huodong_producer is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerEqualTo(String value) {
            addCriterion("huodong_producer =", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerNotEqualTo(String value) {
            addCriterion("huodong_producer <>", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerGreaterThan(String value) {
            addCriterion("huodong_producer >", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerGreaterThanOrEqualTo(String value) {
            addCriterion("huodong_producer >=", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerLessThan(String value) {
            addCriterion("huodong_producer <", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerLessThanOrEqualTo(String value) {
            addCriterion("huodong_producer <=", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerLike(String value) {
            addCriterion("huodong_producer like", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerNotLike(String value) {
            addCriterion("huodong_producer not like", value, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerIn(List<String> values) {
            addCriterion("huodong_producer in", values, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerNotIn(List<String> values) {
            addCriterion("huodong_producer not in", values, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerBetween(String value1, String value2) {
            addCriterion("huodong_producer between", value1, value2, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongProducerNotBetween(String value1, String value2) {
            addCriterion("huodong_producer not between", value1, value2, "huodongProducer");
            return (Criteria) this;
        }

        public Criteria andHuodongFenIsNull() {
            addCriterion("huodong_fen is null");
            return (Criteria) this;
        }

        public Criteria andHuodongFenIsNotNull() {
            addCriterion("huodong_fen is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongFenEqualTo(Double value) {
            addCriterion("huodong_fen =", value, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenNotEqualTo(Double value) {
            addCriterion("huodong_fen <>", value, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenGreaterThan(Double value) {
            addCriterion("huodong_fen >", value, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenGreaterThanOrEqualTo(Double value) {
            addCriterion("huodong_fen >=", value, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenLessThan(Double value) {
            addCriterion("huodong_fen <", value, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenLessThanOrEqualTo(Double value) {
            addCriterion("huodong_fen <=", value, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenIn(List<Double> values) {
            addCriterion("huodong_fen in", values, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenNotIn(List<Double> values) {
            addCriterion("huodong_fen not in", values, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenBetween(Double value1, Double value2) {
            addCriterion("huodong_fen between", value1, value2, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongFenNotBetween(Double value1, Double value2) {
            addCriterion("huodong_fen not between", value1, value2, "huodongFen");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingIsNull() {
            addCriterion("huodong_zhengming is null");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingIsNotNull() {
            addCriterion("huodong_zhengming is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingEqualTo(String value) {
            addCriterion("huodong_zhengming =", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingNotEqualTo(String value) {
            addCriterion("huodong_zhengming <>", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingGreaterThan(String value) {
            addCriterion("huodong_zhengming >", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingGreaterThanOrEqualTo(String value) {
            addCriterion("huodong_zhengming >=", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingLessThan(String value) {
            addCriterion("huodong_zhengming <", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingLessThanOrEqualTo(String value) {
            addCriterion("huodong_zhengming <=", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingLike(String value) {
            addCriterion("huodong_zhengming like", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingNotLike(String value) {
            addCriterion("huodong_zhengming not like", value, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingIn(List<String> values) {
            addCriterion("huodong_zhengming in", values, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingNotIn(List<String> values) {
            addCriterion("huodong_zhengming not in", values, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingBetween(String value1, String value2) {
            addCriterion("huodong_zhengming between", value1, value2, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongZhengmingNotBetween(String value1, String value2) {
            addCriterion("huodong_zhengming not between", value1, value2, "huodongZhengming");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeIsNull() {
            addCriterion("huodong_time is null");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeIsNotNull() {
            addCriterion("huodong_time is not null");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeEqualTo(String value) {
            addCriterion("huodong_time =", value, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeNotEqualTo(String value) {
            addCriterion("huodong_time <>", value, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeGreaterThan(String value) {
            addCriterion("huodong_time >", value, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeGreaterThanOrEqualTo(String value) {
            addCriterion("huodong_time >=", value, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeLessThan(String value) {
            addCriterion("huodong_time <", value, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeLessThanOrEqualTo(String value) {
            addCriterion("huodong_time <=", value, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeIn(List<String> values) {
            addCriterion("huodong_time in", values, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeNotIn(List<String> values) {
            addCriterion("huodong_time not in", values, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeBetween(String value1, String value2) {
            addCriterion("huodong_time between", value1, value2, "huodongTime");
            return (Criteria) this;
        }

        public Criteria andHuodongTimeNotBetween(String value1, String value2) {
            addCriterion("huodong_time not between", value1, value2, "huodongTime");
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