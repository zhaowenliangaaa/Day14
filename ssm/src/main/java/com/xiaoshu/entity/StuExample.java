package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSdIdIsNull() {
            addCriterion("sd_id is null");
            return (Criteria) this;
        }

        public Criteria andSdIdIsNotNull() {
            addCriterion("sd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdIdEqualTo(Integer value) {
            addCriterion("sd_id =", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotEqualTo(Integer value) {
            addCriterion("sd_id <>", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThan(Integer value) {
            addCriterion("sd_id >", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_id >=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThan(Integer value) {
            addCriterion("sd_id <", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThanOrEqualTo(Integer value) {
            addCriterion("sd_id <=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdIn(List<Integer> values) {
            addCriterion("sd_id in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotIn(List<Integer> values) {
            addCriterion("sd_id not in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdBetween(Integer value1, Integer value2) {
            addCriterion("sd_id between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_id not between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNull() {
            addCriterion("sd_name is null");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNotNull() {
            addCriterion("sd_name is not null");
            return (Criteria) this;
        }

        public Criteria andSdNameEqualTo(String value) {
            addCriterion("sd_name =", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotEqualTo(String value) {
            addCriterion("sd_name <>", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThan(String value) {
            addCriterion("sd_name >", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThanOrEqualTo(String value) {
            addCriterion("sd_name >=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThan(String value) {
            addCriterion("sd_name <", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThanOrEqualTo(String value) {
            addCriterion("sd_name <=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLike(String value) {
            addCriterion("sd_name like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotLike(String value) {
            addCriterion("sd_name not like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameIn(List<String> values) {
            addCriterion("sd_name in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotIn(List<String> values) {
            addCriterion("sd_name not in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameBetween(String value1, String value2) {
            addCriterion("sd_name between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotBetween(String value1, String value2) {
            addCriterion("sd_name not between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdsexIsNull() {
            addCriterion("sdsex is null");
            return (Criteria) this;
        }

        public Criteria andSdsexIsNotNull() {
            addCriterion("sdsex is not null");
            return (Criteria) this;
        }

        public Criteria andSdsexEqualTo(String value) {
            addCriterion("sdsex =", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexNotEqualTo(String value) {
            addCriterion("sdsex <>", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexGreaterThan(String value) {
            addCriterion("sdsex >", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexGreaterThanOrEqualTo(String value) {
            addCriterion("sdsex >=", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexLessThan(String value) {
            addCriterion("sdsex <", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexLessThanOrEqualTo(String value) {
            addCriterion("sdsex <=", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexLike(String value) {
            addCriterion("sdsex like", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexNotLike(String value) {
            addCriterion("sdsex not like", value, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexIn(List<String> values) {
            addCriterion("sdsex in", values, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexNotIn(List<String> values) {
            addCriterion("sdsex not in", values, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexBetween(String value1, String value2) {
            addCriterion("sdsex between", value1, value2, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdsexNotBetween(String value1, String value2) {
            addCriterion("sdsex not between", value1, value2, "sdsex");
            return (Criteria) this;
        }

        public Criteria andSdHobbyIsNull() {
            addCriterion("sd_hobby is null");
            return (Criteria) this;
        }

        public Criteria andSdHobbyIsNotNull() {
            addCriterion("sd_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andSdHobbyEqualTo(String value) {
            addCriterion("sd_hobby =", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyNotEqualTo(String value) {
            addCriterion("sd_hobby <>", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyGreaterThan(String value) {
            addCriterion("sd_hobby >", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("sd_hobby >=", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyLessThan(String value) {
            addCriterion("sd_hobby <", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyLessThanOrEqualTo(String value) {
            addCriterion("sd_hobby <=", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyLike(String value) {
            addCriterion("sd_hobby like", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyNotLike(String value) {
            addCriterion("sd_hobby not like", value, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyIn(List<String> values) {
            addCriterion("sd_hobby in", values, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyNotIn(List<String> values) {
            addCriterion("sd_hobby not in", values, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyBetween(String value1, String value2) {
            addCriterion("sd_hobby between", value1, value2, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdHobbyNotBetween(String value1, String value2) {
            addCriterion("sd_hobby not between", value1, value2, "sdHobby");
            return (Criteria) this;
        }

        public Criteria andSdbirthIsNull() {
            addCriterion("sdbirth is null");
            return (Criteria) this;
        }

        public Criteria andSdbirthIsNotNull() {
            addCriterion("sdbirth is not null");
            return (Criteria) this;
        }

        public Criteria andSdbirthEqualTo(Date value) {
            addCriterionForJDBCDate("sdbirth =", value, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("sdbirth <>", value, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("sdbirth >", value, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sdbirth >=", value, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthLessThan(Date value) {
            addCriterionForJDBCDate("sdbirth <", value, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sdbirth <=", value, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthIn(List<Date> values) {
            addCriterionForJDBCDate("sdbirth in", values, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("sdbirth not in", values, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sdbirth between", value1, value2, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andSdbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sdbirth not between", value1, value2, "sdbirth");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
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