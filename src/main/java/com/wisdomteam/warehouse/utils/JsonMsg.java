package com.wisdomteam.warehouse.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * ͨ�õķ��ص���
 * 
 * @author lfy
 * 
 */
public class JsonMsg {
	//״̬��   100-�ɹ�    200-ʧ��
	private int code;
	//��ʾ��Ϣ
	private String msg;
	
	//�û�Ҫ���ظ������������
	private Map<String, Object> extend = new HashMap<String, Object>();

	public static JsonMsg success(){
		JsonMsg result = new JsonMsg();
		result.setCode(100);
		result.setMsg("����ɹ���");
		return result;
	}
	
	public static JsonMsg fail(){
		JsonMsg result = new JsonMsg();
		result.setCode(200);
		result.setMsg("����ʧ�ܣ�");
		return result;
	}
	
	public JsonMsg add(String key,Object value){
		this.getExtend().put(key, value);
		return this;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
}
