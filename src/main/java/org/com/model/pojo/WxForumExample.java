package org.com.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxForumExample() {
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

        public Criteria andForumIdIsNull() {
            addCriterion("`forum_Id` is null");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("`forum_Id` is not null");
            return (Criteria) this;
        }

        public Criteria andForumIdEqualTo(String value) {
            addCriterion("`forum_Id` =", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotEqualTo(String value) {
            addCriterion("`forum_Id` <>", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThan(String value) {
            addCriterion("`forum_Id` >", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(String value) {
            addCriterion("`forum_Id` >=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThan(String value) {
            addCriterion("`forum_Id` <", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThanOrEqualTo(String value) {
            addCriterion("`forum_Id` <=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLike(String value) {
            addCriterion("`forum_Id` like", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotLike(String value) {
            addCriterion("`forum_Id` not like", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdIn(List<String> values) {
            addCriterion("`forum_Id` in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotIn(List<String> values) {
            addCriterion("`forum_Id` not in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdBetween(String value1, String value2) {
            addCriterion("`forum_Id` between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotBetween(String value1, String value2) {
            addCriterion("`forum_Id` not between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlIsNull() {
            addCriterion("`userAvatarUrl` is null");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlIsNotNull() {
            addCriterion("`userAvatarUrl` is not null");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlEqualTo(String value) {
            addCriterion("`userAvatarUrl` =", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlNotEqualTo(String value) {
            addCriterion("`userAvatarUrl` <>", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlGreaterThan(String value) {
            addCriterion("`userAvatarUrl` >", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlGreaterThanOrEqualTo(String value) {
            addCriterion("`userAvatarUrl` >=", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlLessThan(String value) {
            addCriterion("`userAvatarUrl` <", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlLessThanOrEqualTo(String value) {
            addCriterion("`userAvatarUrl` <=", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlLike(String value) {
            addCriterion("`userAvatarUrl` like", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlNotLike(String value) {
            addCriterion("`userAvatarUrl` not like", value, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlIn(List<String> values) {
            addCriterion("`userAvatarUrl` in", values, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlNotIn(List<String> values) {
            addCriterion("`userAvatarUrl` not in", values, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlBetween(String value1, String value2) {
            addCriterion("`userAvatarUrl` between", value1, value2, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andUseravatarurlNotBetween(String value1, String value2) {
            addCriterion("`userAvatarUrl` not between", value1, value2, "useravatarurl");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("`nickname` is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("`nickname` is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("`nickname` =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("`nickname` <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("`nickname` >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("`nickname` >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("`nickname` <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("`nickname` <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("`nickname` like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("`nickname` not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("`nickname` in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("`nickname` not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("`nickname` between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("`nickname` not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("`text` is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("`text` is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("`text` =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("`text` <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("`text` >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("`text` >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("`text` <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("`text` <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("`text` like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("`text` not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("`text` in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("`text` not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("`text` between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("`text` not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("`openId` is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("`openId` is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("`openId` =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("`openId` <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("`openId` >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("`openId` >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("`openId` <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("`openId` <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("`openId` like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("`openId` not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("`openId` in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("`openId` not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("`openId` between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("`openId` not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andEnjoynumIsNull() {
            addCriterion("`enjoyNum` is null");
            return (Criteria) this;
        }

        public Criteria andEnjoynumIsNotNull() {
            addCriterion("`enjoyNum` is not null");
            return (Criteria) this;
        }

        public Criteria andEnjoynumEqualTo(Integer value) {
            addCriterion("`enjoyNum` =", value, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumNotEqualTo(Integer value) {
            addCriterion("`enjoyNum` <>", value, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumGreaterThan(Integer value) {
            addCriterion("`enjoyNum` >", value, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("`enjoyNum` >=", value, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumLessThan(Integer value) {
            addCriterion("`enjoyNum` <", value, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumLessThanOrEqualTo(Integer value) {
            addCriterion("`enjoyNum` <=", value, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumIn(List<Integer> values) {
            addCriterion("`enjoyNum` in", values, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumNotIn(List<Integer> values) {
            addCriterion("`enjoyNum` not in", values, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumBetween(Integer value1, Integer value2) {
            addCriterion("`enjoyNum` between", value1, value2, "enjoynum");
            return (Criteria) this;
        }

        public Criteria andEnjoynumNotBetween(Integer value1, Integer value2) {
            addCriterion("`enjoyNum` not between", value1, value2, "enjoynum");
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