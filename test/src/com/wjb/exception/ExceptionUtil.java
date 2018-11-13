package com.wjb.exception;

public class ExceptionUtil {
	public static ExceptionInfo processExcepiton(Exception ex) {
		ExceptionInfo info = new ExceptionInfo();
		info.setText(ex.getClass().getName()+">>>>>"+ex.getMessage());
		String detailInfo = "";
		StackTraceElement[] sea = ex.getStackTrace();
		for(int i =0;i<sea.length;i++) {
			if(i==0) {
				detailInfo += ex.getClass().getName()+": "+ex.getMessage() + "\n";
			}
			detailInfo += "\t at "+ex.toString() + "\n";
		}
		info.setDetailInfo(detailInfo);
		return info;
	}
}
