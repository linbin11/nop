package zo.zookeeper.demo.pojo;

/***********************************************************************
 * Module:  PostInfo.java
 * Author:  Administrator
 * Purpose: Defines the Class PostInfo
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/** 职务信息 */
@Entity
@Table(name = "_POST_INFO")
public class PostInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final String TABLE_NAME = "_POST_INFO";
	/** 职务ID */
	@Id
	@Column(name = "POST_ID", length = 60)
	private String postID;
	/** 父职务ID */
	@Column(name = "PARENT_ID", length = 60)
	private String parentID;
	/** 职务名称 */
	@Column(name = "POST_NAME", length = 90)
	private String postName;
	/** 职务创建日期 */
	@Column(name = "CREATE_DATE")
	private Date createDate;
	/** 职务审核日期 */
	@Column(name = "AUDIT_DATE")
	private Date auditDate;
	/** 职务创建人ID */
	@Column(name = "CREATE_ID", length = 60)
	private String createID;
	/** 职务审核人ID */
	@Column(name = "AUDIT_ID", length = 60)
	private String auditID;
	/** 职务说明 */
	@Column(name = "NOTES", length = 300)
	private String notes;

	private String iconCls;

	/** 职务ID . */
	public String getPostID() {
		return this.postID;
	}

	/** 职务ID . */
	public void setPostID(String postID) {
		this.postID = postID;
	}

	/** 父职务ID . */
	public String getParentID() {
		return this.parentID;
	}

	/** 父权限ID . */
	public String get_parentId() {
		return this.parentID;
	}

	/** 父职务ID . */
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	/** 职务名称 . */
	public String getPostName() {
		return this.postName;
	}

	/** 职务名称 . */
	public void setPostName(String postName) {
		this.postName = postName;
	}

	/** 职务创建日期 . */
	public Date getCreateDate() {
		return this.createDate;
	}

	/** 职务创建日期 . */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/** 职务审核日期 . */
	public Date getAuditDate() {
		return this.auditDate;
	}

	/** 职务审核日期 . */
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	/** 职务创建人ID . */
	public String getCreateID() {
		return this.createID;
	}

	/** 职务创建人ID . */
	public void setCreateID(String createID) {
		this.createID = createID;
	}

	/** 职务审核人ID . */
	public String getAuditID() {
		return this.auditID;
	}

	/** 职务审核人ID . */
	public void setAuditID(String auditID) {
		this.auditID = auditID;
	}

	/** 职务说明 . */
	public String getNotes() {
		return this.notes;
	}

	/** 职务说明 . */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	@Override
	public String toString() {
		return "\n"+ReflectionToStringBuilder.toString(this,ToStringStyle.MULTI_LINE_STYLE);
	}

}
