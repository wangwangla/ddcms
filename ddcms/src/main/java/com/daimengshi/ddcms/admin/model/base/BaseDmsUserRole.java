package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsUserRole<M extends BaseDmsUserRole<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsUserRole:add";
    public static final String ACTION_DELETE = "DmsUserRole:delete";
    public static final String ACTION_UPDATE = "DmsUserRole:update";


    @Override
    protected String addAction() {
        return ACTION_ADD;
    }

    @Override
    protected String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    protected String updateAction() {
        return ACTION_UPDATE;
    }


	public void setUid(java.lang.String uid) {
		set("uid", uid);
	}
	
	public java.lang.String getUid() {
		return getStr("uid");
	}

	public void setRid(java.lang.String rid) {
		set("rid", rid);
	}
	
	public java.lang.String getRid() {
		return getStr("rid");
	}

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}