package bookmanager02;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xuchao.bookmanager02.pojo.BookType;
import com.xuchao.bookmanager02.service.BookTypeSessionService;

public class TestBookTypeSevic {

	@Test
	public void test() {
		//初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获得bean
        BookTypeSessionService bTDImpl=ctx.getBean("bookTypeSessionService",BookTypeSessionService.class);
        //访问数据库
        List<BookType> booktypes=bTDImpl.getAllBookTypes();
        for (BookType bookType : booktypes) {
            System.out.println(bookType);
        }
        assertNotNull(booktypes);
	}

}
