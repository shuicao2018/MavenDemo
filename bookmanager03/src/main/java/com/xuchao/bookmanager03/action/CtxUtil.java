package com.xuchao.bookmanager03.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class CtxUtil implements ApplicationContextAware {

	 public static ApplicationContext springCtx;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		springCtx=applicationContext;
	}

	
    //�������ƻ�������е�bean
    public static Object getBean(String name){
        return springCtx.getBean(name);
    }
    
    //�������ͻ�������е�bean
    public static <T> T getBean(Class<T> clazz){
        return springCtx.getBean(clazz);
    }
}
