package com.syfri.userservice.model;

import java.io.Serializable;
import java.util.List;

import com.syfri.baseapi.model.ValueObject;

public class UserVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String pkid;	//用户ID（主键）
	private String username;	//用户名
	private String password;	//密码
	private String realname;	//真实姓名
	private String birth;	//生日
	private String sex;	//性别([1]男，[2]女)
	private String deptid;	//部门ID
	private String position;	//职务
	private String phone;	//电话
	private String mobile;	//手机
	private String email;	//邮箱
	private String deleteFlag;	//删除标志
	private String salt;	//密码盐
	private String createId;	//创建人ID
	private String createName;	//创建人
	private String createTime;	//创建时间
	private String alterId;	//修改人ID
	private String alterName;	//修改人
	private String alterTime;	//修改时间
	private String reserve1;	//备用1
	private String reserve2;	//备用2
	private String reserve3;	//备用3
	private List<RoleVO> roles;    //角色


	public String getPkid(){
		return pkid;
	}
	public void setPkid(String pkid){
		this.pkid = pkid;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getRealname(){
		return realname;
	}
	public void setRealname(String realname){
		this.realname = realname;
	}
	public String getBirth(){
		return birth;
	}
	public void setBirth(String birth){
		this.birth = birth;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getDeptid(){
		return deptid;
	}
	public void setDeptid(String deptid){
		this.deptid = deptid;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getMobile(){
		return mobile;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getCreateId(){
		return createId;
	}
	public void setCreateId(String createId){
		this.createId = createId;
	}
	public String getCreateName(){
		return createName;
	}
	public void setCreateName(String createName){
		this.createName = createName;
	}
	public String getCreateTime(){
		return createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	public String getAlterId(){
		return alterId;
	}
	public void setAlterId(String alterId){
		this.alterId = alterId;
	}
	public String getAlterName(){
		return alterName;
	}
	public void setAlterName(String alterName){
		this.alterName = alterName;
	}
	public String getAlterTime(){
		return alterTime;
	}
	public void setAlterTime(String alterTime){
		this.alterTime = alterTime;
	}
	public String getReserve1(){
		return reserve1;
	}
	public void setReserve1(String reserve1){
		this.reserve1 = reserve1;
	}
	public String getReserve2(){
		return reserve2;
	}
	public void setReserve2(String reserve2){
		this.reserve2 = reserve2;
	}
	public String getReserve3(){
		return reserve3;
	}
	public void setReserve3(String reserve3){
		this.reserve3 = reserve3;
	}
	public String getDeleteFlag(){
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag){
		this.deleteFlag = deleteFlag;
	}
	public String getSalt(){
		return salt;
	}
	public void setSalt(String salt){
		this.salt = salt;
	}

	public List<RoleVO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleVO> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserVO{" +
				"pkid='" + pkid + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", realname='" + realname + '\'' +
				", birth='" + birth + '\'' +
				", sex='" + sex + '\'' +
				", deptid='" + deptid + '\'' +
				", position='" + position + '\'' +
				", phone='" + phone + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", deleteFlag='" + deleteFlag + '\'' +
				", salt='" + salt + '\'' +
				", createId='" + createId + '\'' +
				", createName='" + createName + '\'' +
				", createTime='" + createTime + '\'' +
				", alterId='" + alterId + '\'' +
				", alterName='" + alterName + '\'' +
				", alterTime='" + alterTime + '\'' +
				", reserve1='" + reserve1 + '\'' +
				", reserve2='" + reserve2 + '\'' +
				", reserve3='" + reserve3 + '\'' +
				", roles=" + roles +
				'}';
	}
}