package org.com.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class ForumImgUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumImgUrlExample() {
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

        public Criteria andForumImgidIsNull() {
            addCriterion("`forum_imgId` is null");
            return (Criteria) this;
        }

        public Criteria andForumImgidIsNotNull() {
            addCriterion("`forum_imgId` is not null");
            return (Criteria) this;
        }

        public Criteria andForumImgidEqualTo(String value) {
            addCriterion("`forum_imgId` =", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidNotEqualTo(String value) {
            addCriterion("`forum_imgId` <>", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidGreaterThan(String value) {
            addCriterion("`forum_imgId` >", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidGreaterThanOrEqualTo(String value) {
            addCriterion("`forum_imgId` >=", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidLessThan(String value) {
            addCriterion("`forum_imgId` <", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidLessThanOrEqualTo(String value) {
            addCriterion("`forum_imgId` <=", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidLike(String value) {
            addCriterion("`forum_imgId` like", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidNotLike(String value) {
            addCriterion("`forum_imgId` not like", value, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidIn(List<String> values) {
            addCriterion("`forum_imgId` in", values, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidNotIn(List<String> values) {
            addCriterion("`forum_imgId` not in", values, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidBetween(String value1, String value2) {
            addCriterion("`forum_imgId` between", value1, value2, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andForumImgidNotBetween(String value1, String value2) {
            addCriterion("`forum_imgId` not between", value1, value2, "forumImgid");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNull() {
            addCriterion("`imgUrl1` is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("`imgUrl1` is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("`imgUrl1` =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("`imgUrl1` <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("`imgUrl1` >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("`imgUrl1` >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("`imgUrl1` <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("`imgUrl1` <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("`imgUrl1` like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("`imgUrl1` not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("`imgUrl1` in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("`imgUrl1` not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("`imgUrl1` between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("`imgUrl1` not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("`imgUrl2` is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("`imgUrl2` is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("`imgUrl2` =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("`imgUrl2` <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("`imgUrl2` >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("`imgUrl2` >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("`imgUrl2` <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("`imgUrl2` <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("`imgUrl2` like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("`imgUrl2` not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("`imgUrl2` in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("`imgUrl2` not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("`imgUrl2` between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("`imgUrl2` not between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNull() {
            addCriterion("`imgUrl3` is null");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNotNull() {
            addCriterion("`imgUrl3` is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl3EqualTo(String value) {
            addCriterion("`imgUrl3` =", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotEqualTo(String value) {
            addCriterion("`imgUrl3` <>", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThan(String value) {
            addCriterion("`imgUrl3` >", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThanOrEqualTo(String value) {
            addCriterion("`imgUrl3` >=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThan(String value) {
            addCriterion("`imgUrl3` <", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThanOrEqualTo(String value) {
            addCriterion("`imgUrl3` <=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Like(String value) {
            addCriterion("`imgUrl3` like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotLike(String value) {
            addCriterion("`imgUrl3` not like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3In(List<String> values) {
            addCriterion("`imgUrl3` in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotIn(List<String> values) {
            addCriterion("`imgUrl3` not in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Between(String value1, String value2) {
            addCriterion("`imgUrl3` between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotBetween(String value1, String value2) {
            addCriterion("`imgUrl3` not between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andForumnumIsNull() {
            addCriterion("`forumNum` is null");
            return (Criteria) this;
        }

        public Criteria andForumnumIsNotNull() {
            addCriterion("`forumNum` is not null");
            return (Criteria) this;
        }

        public Criteria andForumnumEqualTo(String value) {
            addCriterion("`forumNum` =", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumNotEqualTo(String value) {
            addCriterion("`forumNum` <>", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumGreaterThan(String value) {
            addCriterion("`forumNum` >", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumGreaterThanOrEqualTo(String value) {
            addCriterion("`forumNum` >=", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumLessThan(String value) {
            addCriterion("`forumNum` <", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumLessThanOrEqualTo(String value) {
            addCriterion("`forumNum` <=", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumLike(String value) {
            addCriterion("`forumNum` like", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumNotLike(String value) {
            addCriterion("`forumNum` not like", value, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumIn(List<String> values) {
            addCriterion("`forumNum` in", values, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumNotIn(List<String> values) {
            addCriterion("`forumNum` not in", values, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumBetween(String value1, String value2) {
            addCriterion("`forumNum` between", value1, value2, "forumnum");
            return (Criteria) this;
        }

        public Criteria andForumnumNotBetween(String value1, String value2) {
            addCriterion("`forumNum` not between", value1, value2, "forumnum");
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