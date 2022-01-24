package com.sean.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "chat_msg")
public class ChatMsg {
    @Id
    private String id;

    /**
     * 发送时间
     */
    @Column(name = "send_user_id")
    private String sendUserId;

    /**
     * 接收时间
     */
    @Column(name = "accept_user_id")
    private String acceptUserId;

    /**
     * 聊天记录
     */
    private String msg;

    /**
     * 签收的状态1.未读2.已读
     */
    @Column(name = "sign_flag")
    private Integer signFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取发送时间
     *
     * @return send_user_id - 发送时间
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     * 设置发送时间
     *
     * @param sendUserId 发送时间
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 获取接收时间
     *
     * @return accept_user_id - 接收时间
     */
    public String getAcceptUserId() {
        return acceptUserId;
    }

    /**
     * 设置接收时间
     *
     * @param acceptUserId 接收时间
     */
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    /**
     * 获取聊天记录
     *
     * @return msg - 聊天记录
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置聊天记录
     *
     * @param msg 聊天记录
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取签收的状态1.未读2.已读
     *
     * @return sign_flag - 签收的状态1.未读2.已读
     */
    public Integer getSignFlag() {
        return signFlag;
    }

    /**
     * 设置签收的状态1.未读2.已读
     *
     * @param signFlag 签收的状态1.未读2.已读
     */
    public void setSignFlag(Integer signFlag) {
        this.signFlag = signFlag;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}