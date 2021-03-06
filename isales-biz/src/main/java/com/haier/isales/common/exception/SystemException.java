/**
* @Company 青鸟软通   
* @Title: BusinessException.java 
* @Package com.jbinfo.common.exception 
* @author Liu Wenjie   
* @date 2013-11-8 下午12:26:36 
* @version V1.0   
*/ 
package com.haier.isales.common.exception;

import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/** 
 * @ClassName: BusinessException 
 * @Description: 系统异常 
 *  
 */
public class SystemException extends BaseException {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -7745154374032695042L;
	

	
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午5:27:31 
	* @param exceptionCode 
	*/ 
	public SystemException(BusinessExceptionCode exceptionCode) {
		super(exceptionCode.getContext());
		this.exceptionCode = exceptionCode;
	}

	
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午5:27:38 
	* @param exceptionCode
	* @param message 
	*/ 
	public SystemException(BusinessExceptionCode exceptionCode,String message) {
		super(message);
		this.exceptionCode = exceptionCode;
	}


	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-10 下午5:27:44 
	* @param exceptionCode
	* @param cause 
	*/ 
	public SystemException(BusinessExceptionCode exceptionCode,Throwable cause) {
		super(cause);
		this.exceptionCode = exceptionCode;
	}

	/** 
	 * <p>Description: </p> 
	 * @author Liu Wenjie   
	 * @date 2013-11-8 下午12:26:36 
	 * @param message
	 * @param cause 
	 */
	public SystemException(BusinessExceptionCode exceptionCode,String message, Throwable cause) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
	}

	/**
	 * @Description: 属性 exceptionCode 的get方法 
	 * @return exceptionCode
	 */
	public BusinessExceptionCode getExceptionCode() {
		return exceptionCode;
	}
	

}
