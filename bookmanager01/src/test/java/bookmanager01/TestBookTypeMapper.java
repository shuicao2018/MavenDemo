package bookmanager01;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xuchao.bookmanager01.dao.MyBatisUtil;
import com.xuchao.bookmanager01.mapper.BookTypeMapper;
import com.xuchao.bookmanager01.pojo.BookType;
import com.xuchao.bookmanager01.service.*;

public class TestBookTypeMapper {

//	@Test
//	public void test() {
//		
//		//��ûỰ����
//        SqlSession session=MyBatisUtil.getSession();
//        
//        BookTypeMapper mapper=  session.getMapper(BookTypeMapper.class);
//        List<BookType> list= mapper.getAllBookTypes();
//        
//        for (BookType bookType : list) {
//            System.out.println(bookType);
//        }
//
//	}
	
	@Test
	public void TestBookTypeService()
	{
        //��ʼ������
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
        BookTypeService sr= (BookTypeService) ctx.getBean("bookTypeSer");
        
        List<BookType> list=sr.GetBookTypes();
		
		for(BookType booktype : list)
		{
			 System.out.println(booktype);
			
		}
	}

}
